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
import wpdev.ea.utils.eaCallToActionUtils;
import wpdev.ea.utils.eaInstagramFeedUtils;

public class EaCallToAction {
	public static void snap(WebDriver driver) {
		try {
			WebElement logoImageElement_snap = driver
					.findElement(By.xpath(eaCallToActionUtils.Locator.image_xpath));

			Screenshot first_ig_img_snap = new AShot().coordsProvider(new WebDriverCoordsProvider())
					.takeScreenshot(driver, logoImageElement_snap);
//			Screenshot first_ig_img_snap = new AShot().takeScreenshot(driver, logoImageElement_snap);
			ImageIO.write(first_ig_img_snap.getImage(), "png",
					new File(System.getProperty("user.dir") + "/forCompareImage/callToAction/input.png"));
			File file = new File(System.getProperty("user.dir") + "/forCompareImage/callToAction/input.png");

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
					.read(new File(System.getProperty("user.dir") + "/forCompareImage/callToAction/input.png"));

			WebElement logoImageElement_com = driver
					.findElement(By.xpath(eaCallToActionUtils.Locator.image_xpath));
			Screenshot first_ig_img_com = new AShot().coordsProvider(new WebDriverCoordsProvider())
					.takeScreenshot(driver, logoImageElement_com);
			
			ImageIO.write(first_ig_img_com.getImage(), "png",
					new File(System.getProperty("user.dir") + "/forCompareImage/callToAction/output/output.png"));
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
	public static void eaCallToAction(WebDriver driver, String url) {
		driver.get(Config.url + url);

			try {
				if(Config.go_doc_page == 1) {
					assertEquals(driver.getTitle(), eaCallToActionUtils.TEXT.calltoaction_page_title);
					System.out.println("Page title passed !!");

					driver.findElement(By.xpath(eaCallToActionUtils.Locator.documentation_link_path)).click();

					ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
					driver.switchTo().window(tabs2.get(1));

					assertEquals(driver.findElement(By.id(eaCallToActionUtils.Locator.documentation_title_id)).getText(),
							eaCallToActionUtils.TEXT.documentation_page);
					System.out.println("Documentation link passed !!");
					driver.close();

					driver.switchTo().window(tabs2.get(0));
//				
					Thread.sleep(1000);
				}


				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,1061)", "");
				
				Thread.sleep(1000);
				
				assertEquals(driver.findElement(By.xpath(eaCallToActionUtils.Locator.header_text_xpath)).getText(), eaCallToActionUtils.TEXT.header_text);
				assertEquals(driver.findElement(By.xpath(eaCallToActionUtils.Locator.description_text_xpath)).getText(), eaCallToActionUtils.TEXT.description_text);
//				snap(driver);
				comparison(driver);
				WebElement image = driver.findElement(By.xpath(eaCallToActionUtils.Locator.image_xpath));
				if(image.isDisplayed()) {
					System.out.println("Image Passed !!");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}
