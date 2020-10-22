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

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaPriceMenuUtils;

public class EaPriceMenu {
	public static void snap(WebDriver driver) {
		try {
			WebElement logoImageElement_snap = driver
					.findElement(By.xpath(eaPriceMenuUtils.Locator.food_image_xpath));

			Screenshot first_ig_img_snap = new AShot().coordsProvider(new WebDriverCoordsProvider())
					.takeScreenshot(driver, logoImageElement_snap);
//			Screenshot first_ig_img_snap = new AShot().takeScreenshot(driver, logoImageElement_snap);
			ImageIO.write(first_ig_img_snap.getImage(), "png",
					new File(System.getProperty("user.dir") + "/forCompareImage/priceMenu/input.png"));
			File file = new File(System.getProperty("user.dir") + "/forCompareImage/priceMenu/input.png");

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

			//COMPARE IMAGE
			BufferedImage expectedImage = ImageIO
					.read(new File(System.getProperty("user.dir") + "/forCompareImage/priceMenu/input.png"));

			WebElement logoImageElement_com = driver
					.findElement(By.xpath(eaPriceMenuUtils.Locator.food_image_xpath));
			Screenshot first_ig_img_com = new AShot().coordsProvider(new WebDriverCoordsProvider())
					.takeScreenshot(driver, logoImageElement_com);
			
			ImageIO.write(first_ig_img_com.getImage(), "png",
					new File(System.getProperty("user.dir") + "/forCompareImage/priceMenu/output/output.png"));
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
	public static void eaPriceMenu(WebDriver driver, String url) {
		driver.get(Config.url + url);

		try {
			if (Config.go_doc_page == 0) {
				assertEquals(driver.getTitle(), eaPriceMenuUtils.TEXT.pricemenu_page_title);
				System.out.println("Page title passed !!");

				driver.findElement(By.xpath(eaPriceMenuUtils.Locator.documentation_link_path)).click();

				ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs2.get(1));

				assertEquals(driver.findElement(By.id(eaPriceMenuUtils.Locator.documentation_title_id)).getText(),
						eaPriceMenuUtils.TEXT.documentation_page);
				System.out.println("Documentation link passed !!");
				driver.close();

				driver.switchTo().window(tabs2.get(0));
//				
				Thread.sleep(1000);
			}

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1057)", "");

			Thread.sleep(1000);

			assertEquals(driver.findElement(By.xpath(eaPriceMenuUtils.Locator.menu_type_xpath)).getText(),
					eaPriceMenuUtils.TEXT.menu_type_text);
			
			snap(driver);
			comparison(driver);
			
			
			//NAME
			assertEquals(driver.findElement(By.xpath(eaPriceMenuUtils.Locator.item_1_xpath)).getText(),
					eaPriceMenuUtils.TEXT.item_1_text);
			assertEquals(driver.findElement(By.xpath(eaPriceMenuUtils.Locator.item_2_xpath)).getText(),
					eaPriceMenuUtils.TEXT.item_2_text);
			assertEquals(driver.findElement(By.xpath(eaPriceMenuUtils.Locator.item_3_xpath)).getText(),
					eaPriceMenuUtils.TEXT.item_3_text);
			assertEquals(driver.findElement(By.xpath(eaPriceMenuUtils.Locator.item_4_xpath)).getText(),
					eaPriceMenuUtils.TEXT.item_4_text);
			assertEquals(driver.findElement(By.xpath(eaPriceMenuUtils.Locator.item_5_xpath)).getText(),
					eaPriceMenuUtils.TEXT.item_5_text);
			
			//PRICE
			assertEquals(driver.findElement(By.xpath(eaPriceMenuUtils.Locator.item_1_price_xpath)).getText(),
					eaPriceMenuUtils.TEXT.item_1_price_text);
			assertEquals(driver.findElement(By.xpath(eaPriceMenuUtils.Locator.item_2_price_xpath)).getText(),
					eaPriceMenuUtils.TEXT.item_2_price_text);
			assertEquals(driver.findElement(By.xpath(eaPriceMenuUtils.Locator.item_3_price_xpath)).getText(),
					eaPriceMenuUtils.TEXT.item_3_price_text);
			assertEquals(driver.findElement(By.xpath(eaPriceMenuUtils.Locator.item_4_price_xpath)).getText(),
					eaPriceMenuUtils.TEXT.item_4_price_text);
			assertEquals(driver.findElement(By.xpath(eaPriceMenuUtils.Locator.item_5_price_xpath)).getText(),
					eaPriceMenuUtils.TEXT.item_5_price_text);
			

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
