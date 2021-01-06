package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.SnapComImg;
import wpdev.ea.utils.eaDividerUtils;
import wpdev.ea.utils.eaImageScrollerUtils;

public class EaImageScroller {
	public static void eaImageScroller(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);

		try {

			Config.checkdocandheadtitle.checkdoc(driver, eaImageScrollerUtils.TEXT.imagescroll_title,
					eaImageScrollerUtils.Locator.documentation_link_path, eaImageScrollerUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,957); behavior:'smooth';", "");

			WebElement first_image = driver.findElement(By.xpath(eaImageScrollerUtils.Locator.first_image_xpath));
			WebElement second_image = driver.findElement(By.xpath(eaImageScrollerUtils.Locator.second_image_xpath));

			Thread.sleep(1000);
//			SnapComImg.snap(driver, eaImageScrollerUtils.Locator.first_image_xpath, "ImageScroll/Normal/input.png");
			SnapComImg.comparison(driver, eaImageScrollerUtils.Locator.first_image_xpath,
					"ImageScroll/Normal/input.png", "ImageScroll/Normal/output/output.png");
			assertEquals(driver.findElement(By.xpath(eaImageScrollerUtils.Locator.scroll_header_xpath)).getText(),
					eaImageScrollerUtils.TEXT.scroll_header_text);
			System.out.println("Header text passed !!");

			assertEquals(driver.findElement(By.xpath(eaImageScrollerUtils.Locator.scroll_des_xpath)).getText(),
					eaImageScrollerUtils.TEXT.scroll_des_text);
			System.out.println("Description text passed !!");

			Actions cursor = new Actions(driver);

			cursor.moveToElement(first_image).build().perform();
			Thread.sleep(2000);
//			SnapComImg.snap(driver, eaImageScrollerUtils.Locator.first_image_xpath, "ImageScroll/MoveFirst/input.png");
			SnapComImg.comparison(driver, eaImageScrollerUtils.Locator.first_image_xpath,
					"ImageScroll/MoveFirst/input.png", "ImageScroll/MoveFirst/output/output.png");
			Thread.sleep(1000);

			cursor.moveToElement(second_image).build().perform();
			Thread.sleep(2000);
//			SnapComImg.snap(driver, eaImageScrollerUtils.Locator.first_image_xpath, "ImageScroll/MoveSecond/input.png");
			SnapComImg.comparison(driver, eaImageScrollerUtils.Locator.first_image_xpath,
					"ImageScroll/MoveSecond/input.png", "ImageScroll/MoveSecond/output/output.png");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
