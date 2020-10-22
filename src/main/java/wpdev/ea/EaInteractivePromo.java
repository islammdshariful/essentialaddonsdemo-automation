package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaInteractivePromoUtils;

public class EaInteractivePromo {
	public static void snap(WebDriver driver) {
		try {
			WebElement logoImageElement_snap = driver
					.findElement(By.xpath(eaInteractivePromoUtils.Locator.first_promo_image_xpath));

			Screenshot first_ig_img_snap = new AShot().coordsProvider(new WebDriverCoordsProvider())
					.takeScreenshot(driver, logoImageElement_snap);
//			Screenshot first_ig_img_snap = new AShot().takeScreenshot(driver, logoImageElement_snap);
			ImageIO.write(first_ig_img_snap.getImage(), "png",
					new File(System.getProperty("user.dir") + "/forCompareImage/InteractivePromo/input.png"));
			File file = new File(System.getProperty("user.dir") + "/forCompareImage/InteractivePromo/input.png");

			if (file.exists()) {
				System.out.println("Image File Captured");
			} else {
				System.out.println("Image File NOT exist");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void comparison(WebDriver driver) {
		try {

			// COMPARE IMAGE
			BufferedImage expectedImage = ImageIO
					.read(new File(System.getProperty("user.dir") + "/forCompareImage/InteractivePromo/input.png"));

			WebElement logoImageElement_com = driver
					.findElement(By.xpath(eaInteractivePromoUtils.Locator.first_promo_image_xpath));
			Screenshot first_ig_img_com = new AShot().coordsProvider(new WebDriverCoordsProvider())
					.takeScreenshot(driver, logoImageElement_com);

			ImageIO.write(first_ig_img_com.getImage(), "png",
					new File(System.getProperty("user.dir") + "/forCompareImage/InteractivePromo/output/output.png"));
			BufferedImage actualImage = first_ig_img_com.getImage();

			ImageDiffer imgDiff = new ImageDiffer(); // A special class to compare images
			ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);
			if (diff.hasDiff() == true) {
				System.out.println("Images are NOT Same");
			} else {
				System.out.println("Images are Same");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void eaInteractivePromo(WebDriver driver, String url) {
		driver.get(Config.url + url);

		try {
			if (Config.go_doc_page == 1) {
				assertEquals(driver.getTitle(), eaInteractivePromoUtils.TEXT.interationpromo_page_title);
				System.out.println("Page title passed !!");

				driver.findElement(By.xpath(eaInteractivePromoUtils.Locator.documentation_link_path)).click();

				ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs2.get(1));

				assertEquals(
						driver.findElement(By.id(eaInteractivePromoUtils.Locator.documentation_title_id)).getText(),
						eaInteractivePromoUtils.TEXT.documentation_page);
				System.out.println("Documentation link passed !!");
				driver.close();

				driver.switchTo().window(tabs2.get(0));
//				
				Thread.sleep(1000);
			}

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,988)", "");
			Thread.sleep(8000);

			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.or(
			    ExpectedConditions.visibilityOfElementLocated((By.xpath(eaInteractivePromoUtils.Locator.second_promo_header_xpath)))));

			snap(driver);
			comparison(driver);

			
			Actions mousehover = new Actions(driver);
			// FIRST
			WebElement first_promo = driver.findElement(By.xpath(eaInteractivePromoUtils.Locator.first_promo_xpath));
			mousehover.moveToElement(first_promo).build().perform();
			assertEquals(
					driver.findElement(By.xpath(eaInteractivePromoUtils.Locator.first_promo_header_xpath)).getText(),
					eaInteractivePromoUtils.TEXT.first_promo_header_text);
			WebElement des = driver
					.findElement(By.xpath(eaInteractivePromoUtils.Locator.first_promo_description_xpath));
			if (des.isDisplayed()) {
				assertEquals(driver.findElement(By.xpath(eaInteractivePromoUtils.Locator.first_promo_description_xpath))
						.getText(), eaInteractivePromoUtils.TEXT.first_promo_description_text);
				System.out.println("First Description Text Passed !!");
			}

			// SECOND
			WebElement second_promo = driver.findElement(By.xpath(eaInteractivePromoUtils.Locator.second_promo_xpath));
			mousehover.moveToElement(second_promo).build().perform();
			assertEquals(
					driver.findElement(By.xpath(eaInteractivePromoUtils.Locator.second_promo_header_xpath)).getText(),
					eaInteractivePromoUtils.TEXT.second_promo_header_text);
			WebElement des_2 = driver
					.findElement(By.xpath(eaInteractivePromoUtils.Locator.second_promo_description_xpath));
			if (des_2.isDisplayed()) {
				assertEquals(
						driver.findElement(By.xpath(eaInteractivePromoUtils.Locator.second_promo_description_xpath))
								.getText(),
						eaInteractivePromoUtils.TEXT.second_promo_description_text);
				System.out.println("Second Description Text Passed !!");
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
