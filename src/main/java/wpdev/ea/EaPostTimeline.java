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
import wpdev.ea.utils.eaDividerUtils;
import wpdev.ea.utils.eaPostTimelineUtils;

public class EaPostTimeline {
	public static void post(String name, WebDriver driver, String post_name, String post_hover, String hover_text,
			String tooltip, String buttle) {
		try {
			Actions mousehover = new Actions(driver);
			WebElement post_box = driver.findElement(By.xpath(post_hover));
			Thread.sleep(1000);
			mousehover.moveToElement(post_box).build().perform();
			WebElement hover_post = driver.findElement(By.xpath(hover_text));
			WebElement tooltip_xpath = driver.findElement(By.xpath(tooltip));
			if (hover_post.isDisplayed()) {
				System.out.println(name + " hover text VISIBLE !!");
			} else {
				System.out.println(name + " hover text NOT VISIBLE !!");
			}
			if (tooltip_xpath.isDisplayed()) {
				System.out.println(name + " hover Tooltip VISIBLE !!");
			} else {
				System.out.println(name + " hover Tooltip NOT VISIBLE !!");
			}

			WebElement bullet_1 = driver.findElement(By.xpath(buttle));
			mousehover.moveToElement(bullet_1).build().perform();
			if (tooltip_xpath.isDisplayed()) {
				System.out.println(name + " hover Tooltip VISIBLE !!");
			} else {
				System.out.println(name + " hover Tooltip NOT VISIBLE !!");
			}

			WebElement post = driver.findElement(By.xpath(post_name));
//			String p_name = post.getText().toLowerCase();
			post.click();
//			Thread.sleep(1000);
//			SoftAssert softassert = new SoftAssert();
//
//			softassert.assertEquals(
//					driver.findElement(By.xpath(eaPostTimelineUtils.Locator.post_name_on_page_xpath)).getText(),
//					p_name);
			driver.navigate().back();

			Thread.sleep(1000);
//			softassert.assertAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void eaPostTimeline(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);
		try {

			Config.checkdocandheadtitle.checkdoc(driver, eaPostTimelineUtils.TEXT.posttimeline_page_title,
					eaPostTimelineUtils.Locator.documentation_link_path, eaPostTimelineUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1057)", "");

			Thread.sleep(1000);

			post("First", driver, eaPostTimelineUtils.Locator.first_post_text_xpath,
					eaPostTimelineUtils.Locator.first_post_xpath,
					eaPostTimelineUtils.Locator.first_post_hover_text_xpath,
					eaPostTimelineUtils.Locator.first_bullet_tooltip_xpath,
					eaPostTimelineUtils.Locator.first_bullet_xpath);

			post("Second", driver, eaPostTimelineUtils.Locator.second_post_text_xpath,
					eaPostTimelineUtils.Locator.second_post_xpath,
					eaPostTimelineUtils.Locator.second_post_hover_text_xpath,
					eaPostTimelineUtils.Locator.second_bullet_tooltip_xpath,
					eaPostTimelineUtils.Locator.second_bullet_xpath);

			WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/main/article/div/div/div/div/section[2]/div/div/div/div/div/div[3]/div/div[1]/div/article[6]/div[2]"));
			js.executeScript("arguments[0].scrollIntoView();", element);
//			js.executeScript("window.scrollBy(0,1761)", "");
			

			driver.findElement(By.id(eaPostTimelineUtils.Locator.loadmore_button_id)).click();

			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
