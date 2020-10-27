package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.SnapComImg;
import wpdev.ea.utils.eaImageScrollerUtils;

public class EaImageScroller {
	public static void eaImageScroller(WebDriver driver, String url) {
		driver.get(Config.url + url);

		try {
			if (Config.go_doc_page == 1) {
				assertEquals(driver.getTitle(), eaImageScrollerUtils.TEXT.imagescroll_title);
				System.out.println("Page title passed !!");

				driver.findElement(By.xpath(eaImageScrollerUtils.Locator.documentation_link_path)).click();

				ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs2.get(1));

				assertEquals(driver.findElement(By.id(eaImageScrollerUtils.Locator.documentation_title_id)).getText(),
						eaImageScrollerUtils.TEXT.documentation_page);
				System.out.println("Documentation link passed !!");
				driver.close();

				driver.switchTo().window(tabs2.get(0));

				Thread.sleep(1000);
			}
			
			Config.closeNotifications.betterdocs(driver);
			Config.closeNotifications.notificationBar(driver);
			Config.closeNotifications.floatNotification(driver);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,910); behavior:'smooth';", "");
			
			WebElement first_image = driver.findElement(By.xpath(eaImageScrollerUtils.Locator.first_image_xpath));
			WebElement second_image = driver.findElement(By.xpath(eaImageScrollerUtils.Locator.second_image_xpath));
			
			Thread.sleep(1000);
//			SnapComImg.snap(driver, eaImageScrollerUtils.Locator.first_image_xpath, "ImageScroll/Normal/input.png");
			SnapComImg.comparison(driver, eaImageScrollerUtils.Locator.first_image_xpath, "ImageScroll/Normal/input.png", "ImageScroll/Normal/output/output.png");
			assertEquals(driver.findElement(By.xpath(eaImageScrollerUtils.Locator.scroll_header_xpath)).getText(), eaImageScrollerUtils.TEXT.scroll_header_text);
			System.out.println("Header text passed !!");

			assertEquals(driver.findElement(By.xpath(eaImageScrollerUtils.Locator.scroll_des_xpath)).getText(), eaImageScrollerUtils.TEXT.scroll_des_text);
			System.out.println("Description text passed !!");
			
			Actions cursor = new Actions(driver);
			

			
			cursor.moveToElement(first_image).build().perform();
			Thread.sleep(3000);
//			SnapComImg.snap(driver, eaImageScrollerUtils.Locator.first_image_xpath, "ImageScroll/MoveFirst/input.png");
			SnapComImg.comparison(driver, eaImageScrollerUtils.Locator.first_image_xpath, "ImageScroll/MoveFirst/input.png", "ImageScroll/MoveFirst/output/output.png");
			Thread.sleep(1000);
			
			cursor.moveToElement(second_image).build().perform();
			Thread.sleep(3000);
//			SnapComImg.snap(driver, eaImageScrollerUtils.Locator.first_image_xpath, "ImageScroll/MoveSecond/input.png");
			SnapComImg.comparison(driver, eaImageScrollerUtils.Locator.first_image_xpath, "ImageScroll/MoveSecond/input.png", "ImageScroll/MoveSecond/output/output.png");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
