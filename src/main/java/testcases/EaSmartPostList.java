package testcases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import utils.eaDividerUtils;
import utils.eaSmartPostListUtils;

public class EaSmartPostList {
	public static void post(WebDriver driver, String name, String post_header_xpth, String date_xpth) {
		SoftAssert softassert = new SoftAssert();
		WebElement post = driver.findElement(By.xpath(post_header_xpth));
		WebElement date = driver.findElement(By.xpath(date_xpth));
		if (date.isDisplayed()) {
			System.out.println(name + " Date Passed!");
		} else {
			System.out.println(name + " Date NOT Passed!");
		}

		String post_name = post.getText();
		post.click();
		softassert.assertEquals(driver.findElement(By.xpath(eaSmartPostListUtils.Locator.post_on_page_xpth)).getText(),
				post_name);
		softassert.assertAll();
		
		driver.navigate().back();
	}

	public static void eaSmartPostList(WebDriver driver, String url) {
		
		driver.get(Config.url + url);

		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaSmartPostListUtils.TEXT.smartpostlist_page_title,
					eaSmartPostListUtils.Locator.documentation_link_path, eaSmartPostListUtils.TEXT.documentation_page);

//			Config.closeNotifications.floatNotification(driver);
//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);

			Thread.sleep(1000);

			WebElement element = driver.findElement(By.xpath("//*[@id=\"post-2322\"]/div/div/div/div/section[2]/div/div/div/div/div/section/div/div/div[2]/div/div/div[2]/div/div"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,1106)", "");
			js.executeScript("arguments[0].scrollIntoView();", element);

			driver.findElement(By.xpath(eaSmartPostListUtils.Locator.all_tab_xpath)).click();
			Thread.sleep(3000);
			post(driver, "All Tab", eaSmartPostListUtils.Locator.all_tab_post_1_xpath,
					eaSmartPostListUtils.Locator.all_tab_date_xpth);

			driver.findElement(By.xpath(eaSmartPostListUtils.Locator.elementor_tab_xpath)).click();
			Thread.sleep(5000);
			post(driver, "Elementor Tab", eaSmartPostListUtils.Locator.elementor_tab_post_1_xpath,
					eaSmartPostListUtils.Locator.elementor_tab_date_xpth);

			driver.findElement(By.xpath(eaSmartPostListUtils.Locator.ea_tab_xpath)).click();
			Thread.sleep(3000);
			post(driver, "EA Tab", eaSmartPostListUtils.Locator.ea_tab_post_1_xpath,
					eaSmartPostListUtils.Locator.ea_tab_date_xpth);

			driver.findElement(By.xpath(eaSmartPostListUtils.Locator.wordpress_tab_xpath)).click();
			Thread.sleep(3000);
			post(driver, "Wordpress Tab", eaSmartPostListUtils.Locator.wordpress_tab_post_1_xpath,
					eaSmartPostListUtils.Locator.wordpress_tab_date_xpth);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
