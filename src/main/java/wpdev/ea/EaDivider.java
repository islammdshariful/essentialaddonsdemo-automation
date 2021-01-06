package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaDividerUtils;

public class EaDivider {
	public static void eaDivider(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);

		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaDividerUtils.TEXT.divider_title,
					eaDividerUtils.Locator.documentation_link_path, eaDividerUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,921); behavior:'smooth';", "");
//			js.executeScript("arguments[0].scrollIntoView();", element);

			// HEADER
			softassert.assertEquals(driver.findElement(By.xpath(eaDividerUtils.Locator.header_text_xpath)).getText(),
					eaDividerUtils.TEXT.header_text_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaDividerUtils.Locator.header_des_xpath)).getText(),
					eaDividerUtils.TEXT.header_des_text);
			System.out.println("Header text passed !!");

			// ICON TEXT
			softassert.assertEquals(driver.findElement(By.xpath(eaDividerUtils.Locator.icon1_text_xpath)).getText(),
					eaDividerUtils.TEXT.icon1_text_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaDividerUtils.Locator.icon2_text_xpath)).getText(),
					eaDividerUtils.TEXT.icon2_text_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaDividerUtils.Locator.icon3_text_xpath)).getText(),
					eaDividerUtils.TEXT.icon3_text_text);

			// ICON IMAGE
			WebElement icon1 = driver.findElement(By.xpath(eaDividerUtils.Locator.icon1_image_xpath));
			WebElement icon2 = driver.findElement(By.xpath(eaDividerUtils.Locator.icon2_image_xpath));
			WebElement icon3 = driver.findElement(By.xpath(eaDividerUtils.Locator.icon3_image_xpath));

			if (icon1.isDisplayed() && icon2.isDisplayed() && icon3.isDisplayed()) {
				System.out.println("Icon Displayed !!");
			} else {
				System.out.println("Icon NOT Displayed !!");
			}
			// ICON DIVIDER
			WebElement icon1_l_border = driver.findElement(By.xpath(eaDividerUtils.Locator.icon1_divider_left_xpath));
			WebElement icon1_r_border = driver.findElement(By.xpath(eaDividerUtils.Locator.icon1_divider_right_xpath));

			WebElement icon2_l_border = driver.findElement(By.xpath(eaDividerUtils.Locator.icon2_divider_left_xpath));
			WebElement icon2_r_border = driver.findElement(By.xpath(eaDividerUtils.Locator.icon2_divider_right_xpath));

			WebElement icon3_l_border = driver.findElement(By.xpath(eaDividerUtils.Locator.icon3_divider_left_xpath));
			WebElement icon3_r_border = driver.findElement(By.xpath(eaDividerUtils.Locator.icon3_divider_right_xpath));

			if (icon1_l_border.isDisplayed() && icon1_r_border.isDisplayed() && icon2_l_border.isDisplayed()
					&& icon2_r_border.isDisplayed() && icon3_l_border.isDisplayed() && icon3_r_border.isDisplayed()) {
				System.out.println("ALL Divider Passed !!");
			} else {
				System.out.println("Divider NOT Passed !!");
			}
			softassert.assertAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
