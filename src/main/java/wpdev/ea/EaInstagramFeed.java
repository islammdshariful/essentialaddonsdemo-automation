package wpdev.ea;

import static org.testng.Assert.assertEquals;

//import static org.testng.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.function.Function;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;



import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaInstagramFeedUtils;

public class EaInstagramFeed {
	public static void snap(WebDriver driver) {
		try {
			WebElement logoImageElement_snap = driver
					.findElement(By.xpath(eaInstagramFeedUtils.Locator.first_ig_image_xpath));

			Screenshot first_ig_img_snap = new AShot().coordsProvider(new WebDriverCoordsProvider())
					.takeScreenshot(driver, logoImageElement_snap);
//			Screenshot first_ig_img_snap = new AShot().takeScreenshot(driver, logoImageElement_snap);
			ImageIO.write(first_ig_img_snap.getImage(), "png",
					new File(System.getProperty("user.dir") + "/forCompareImage/icon.png"));
			File file = new File(System.getProperty("user.dir") + "/forCompareImage/icon.png");

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
					.read(new File(System.getProperty("user.dir") + "/forCompareImage/instagram/input.png"));

			WebElement logoImageElement_com = driver
					.findElement(By.xpath(eaInstagramFeedUtils.Locator.first_ig_image_xpath));
			Screenshot first_ig_img_com = new AShot().coordsProvider(new WebDriverCoordsProvider())
					.takeScreenshot(driver, logoImageElement_com);
			
			ImageIO.write(first_ig_img_com.getImage(), "png",
					new File(System.getProperty("user.dir") + "/forCompareImage/instagram/output/output.png"));
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

	public static void eaInstagramFeed(WebDriver driver) {

		try {
			if(Config.go_doc_page == 1) {
				assertEquals(driver.getTitle(), eaInstagramFeedUtils.TEXT.instagram_page_title);
				System.out.println("Page title passed !!");

				driver.findElement(By.xpath(eaInstagramFeedUtils.Locator.documentation_link_path)).click();

				ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs2.get(1));

				assertEquals(driver.findElement(By.id(eaInstagramFeedUtils.Locator.documentation_title_id)).getText(),
						eaInstagramFeedUtils.TEXT.documentation_page);
				System.out.println("Documentation link passed !!");
				driver.close();

				driver.switchTo().window(tabs2.get(0));		
			}
	
//			Thread.sleep(5000);
			//------------------------------------------------------
			// Java code
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript(
//			"var headID = document.getElementsByTagName(\"head\")[0];" +
//			"var newScript = document.createElement('script');" +
//			"newScript.type = 'text/javascript';" +
//			"newScript.src = 'https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js';" +
//			"headID.appendChild(newScript);");
//
//			WebDriverWait wait = new WebDriverWait(driver, 30);
//			Function<WebDriver, Boolean> jQueryAvailable = WebDriver -> (
//			(Boolean) js.executeScript("return (typeof jQuery != \"undefined\")"));
//			wait.until(jQueryAvailable);
			
			
			//-------------------------------------------------------
			JavascriptExecutor js = (JavascriptExecutor) driver;
//			Thread.sleep(5000);
			driver.findElement(By.className("cc-86w0")).click();
			driver.findElement(By.className("nx-close")).click();
			
//			WebElement nx = driver.findElement(By.xpath("/html/body/div[6]/div/span"));
//			WebDriverWait wait = new WebDriverWait(driver, 30);
//			wait.until(ExpectedConditions.or(
//			    ExpectedConditions.visibilityOfElementLocated((By.xpath("/html/body/div[6]/div/span")))));
//			nx.click();
//			driver.findElement(By.xpath("/html/body/div[5]/div/span")).click();
			
			WebElement element = driver.findElement(By.xpath("/html/body/div[5]/div/span"));

			Actions actions = new Actions(driver);

			actions.moveToElement(element).click().perform();
			
			js.executeScript("window.scrollBy(0,1068)", "");

			Thread.sleep(1000);
//			snap(driver);
			comparison(driver);
			Thread.sleep(3000);
			
			WebElement profile_image = driver.findElement(By.xpath(eaInstagramFeedUtils.Locator.profile_pic_xpath));
			if(profile_image.isDisplayed()) {
				System.out.println("Profile picture passed");
			}
			WebElement ig_logo = driver.findElement(By.xpath(eaInstagramFeedUtils.Locator.first_instagram_logo_xpath));
			if(ig_logo.isDisplayed()) {
				System.out.println("Instagram Logo passed");
			}
			assertEquals(driver.findElement(By.xpath(eaInstagramFeedUtils.Locator.profile_name_xpath)).getText(),
					eaInstagramFeedUtils.TEXT.profile_name_text);
			WebElement first_image = driver.findElement(By.xpath(eaInstagramFeedUtils.Locator.first_ig_image_xpath));
			if(first_image.isDisplayed()) {
				System.out.println("First Image passed");
			}
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
