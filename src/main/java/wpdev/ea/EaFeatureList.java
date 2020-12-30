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
import wpdev.ea.utils.eaFeatureListUtils;

public class EaFeatureList {
	public static void eaFeatureList(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);
		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaFeatureListUtils.TEXT.featurelist_page_title,
					eaFeatureListUtils.Locator.documentation_link_path, eaFeatureListUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,953)", "");

			// FIRST LIST ITEM
			WebElement first_list = driver.findElement(By.xpath(eaFeatureListUtils.Locator.first_list_icon_xpath));
			if (first_list.isDisplayed()) {
				System.out.println("First icon  passed !!");
			} else {
				System.out.println("First icon  Failed !!");
			}
			softassert.assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.first_list_name_xpath)).getText(),
					eaFeatureListUtils.TEXT.first_list_name_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.first_list_des_xpath)).getText(),
					eaFeatureListUtils.TEXT.first_list_des_text);

			// SECOND LIST ITEM
			WebElement second_list = driver.findElement(By.xpath(eaFeatureListUtils.Locator.second_list_icon_xpath));
			if (second_list.isDisplayed()) {
				System.out.println("Second icon  passed !!");
			} else {
				System.out.println("Second icon  Failed !!");
			}
			softassert.assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.second_list_name_xpath)).getText(),
					eaFeatureListUtils.TEXT.second_list_name_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.second_list_des_xpath)).getText(),
					eaFeatureListUtils.TEXT.second_list_des_text);

			// THIRD LIST ITEM
			WebElement third_list = driver.findElement(By.xpath(eaFeatureListUtils.Locator.third_list_icon_xpath));
			if (third_list.isDisplayed()) {
				System.out.println("Third icon  passed !!");
			} else {
				System.out.println("Third icon  Failed !!");
			}
			softassert.assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.third_list_name_xpath)).getText(),
					eaFeatureListUtils.TEXT.third_list_name_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.third_list_des_xpath)).getText(),
					eaFeatureListUtils.TEXT.third_list_des_text);

			// FOURTH LIST ITEM
			WebElement fourth_list = driver.findElement(By.xpath(eaFeatureListUtils.Locator.fourth_list_icon_xpath));
			if (fourth_list.isDisplayed()) {
				System.out.println("Fourth icon  passed !!");
			} else {
				System.out.println("Fourth icon  Failed !!");
			}
			softassert.assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.fourth_list_name_xpath)).getText(),
					eaFeatureListUtils.TEXT.fourth_list_name_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.fourth_list_des_xpath)).getText(),
					eaFeatureListUtils.TEXT.fourth_list_des_text);

			softassert.assertAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
