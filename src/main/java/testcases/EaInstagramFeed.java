package testcases;

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
import org.testng.asserts.SoftAssert;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import wpdev.ea.utils.Config;
import utils.SnapComImg;
import utils.eaImageScrollerUtils;
import utils.eaInstagramFeedUtils;

public class EaInstagramFeed {
	public static void eaInstagramFeed(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);
		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaInstagramFeedUtils.TEXT.instagram_page_title,
					eaInstagramFeedUtils.Locator.documentation_link_path, eaInstagramFeedUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
			Config.closeNotifications.notificationBar(driver);
			Config.closeNotifications.floatNotification(driver);
			Thread.sleep(1000);

	
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1156)", "");

			Thread.sleep(1000);

//			SnapComImg.snap(driver, eaInstagramFeedUtils.Locator.first_ig_image_xpath, "instagram/input.png");
			SnapComImg.comparison(driver, eaInstagramFeedUtils.Locator.first_ig_image_xpath,
					"instagram/input.png", "instagram/output/output.png");
			
			WebElement profile_image = driver.findElement(By.xpath(eaInstagramFeedUtils.Locator.profile_pic_xpath));
			if(profile_image.isDisplayed()) {
				System.out.println("Profile picture passed");
			}
			WebElement ig_logo = driver.findElement(By.xpath(eaInstagramFeedUtils.Locator.first_instagram_logo_xpath));
			if(ig_logo.isDisplayed()) {
				System.out.println("Instagram Logo passed");
			}
			softassert.assertEquals(driver.findElement(By.xpath(eaInstagramFeedUtils.Locator.profile_name_xpath)).getText(),
					eaInstagramFeedUtils.TEXT.profile_name_text);
			WebElement first_image = driver.findElement(By.xpath(eaInstagramFeedUtils.Locator.first_ig_image_xpath));
			if(first_image.isDisplayed()) {
				System.out.println("First Image passed");
			}
			
			softassert.assertAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
