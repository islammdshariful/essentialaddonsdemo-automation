package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaDividerUtils;
import wpdev.ea.utils.eaOnePageNavigationUtils;

public class EaOnePageNavigation {

	public static void eaOnePageNavigation(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);
		try {
			Config.checkdocandheadtitle.checkdoc(driver,eaOnePageNavigationUtils.TEXT.onepagenavigation_title,
					eaOnePageNavigationUtils.Locator.documentation_link_path, eaOnePageNavigationUtils.TEXT.documentation_page);
			
//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
			Thread.sleep(1000);

//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,1026)", "");

			// HOME NAVIGATION
			WebElement home_icon = driver.findElement(By.xpath(eaOnePageNavigationUtils.Locator.home_nav_icon_xpath));
			if (home_icon.isDisplayed()) {
				System.out.println("Home icon Passed !!");
			}
			WebElement home_button = driver
					.findElement(By.xpath(eaOnePageNavigationUtils.Locator.home_nav_button_xpath));
			Actions cursor = new Actions(driver);
			cursor.moveToElement(home_button).build().perform();
			Thread.sleep(1000);
			WebElement home_tooltip = driver
					.findElement(By.xpath(eaOnePageNavigationUtils.Locator.home_nav_tooltip_xpath));
			if (home_tooltip.isDisplayed()) {
				softassert.assertEquals(home_tooltip.getText(), eaOnePageNavigationUtils.TEXT.home_nav_tooltip_text);
				System.out.println("Home tooltip Passed !!");
			}
			home_button.click();
			Thread.sleep(1000);
			WebElement home_path = driver.findElement(By.xpath(eaOnePageNavigationUtils.Locator.home_nav_path_xpath));
			if (home_path.isDisplayed()) {
				softassert.assertEquals(home_path.getText(), eaOnePageNavigationUtils.TEXT.home_nav_path_xpath);
				System.out.println("Home Navigation Passed !!");
			}

			// FEATURE NAVIGATION
			WebElement feature_icon = driver.findElement(By.xpath(eaOnePageNavigationUtils.Locator.feature_nav_icon_xpath));
			if (feature_icon.isDisplayed()) {
				System.out.println("Feature icon Passed !!");
			}
			WebElement feature_button = driver
					.findElement(By.xpath(eaOnePageNavigationUtils.Locator.feature_nav_button_xpath));
			cursor.moveToElement(feature_button).build().perform();
			Thread.sleep(1000);
			WebElement feature_tooltip = driver
					.findElement(By.xpath(eaOnePageNavigationUtils.Locator.feature_nav_tooltip_xpath));
			if (feature_tooltip.isDisplayed()) {
				softassert.assertEquals(feature_tooltip.getText(), eaOnePageNavigationUtils.TEXT.feature_nav_tooltip_text);
				System.out.println("Feature tooltip Passed !!");
			}
			feature_button.click();
			Thread.sleep(1000);
			WebElement feature_path = driver.findElement(By.xpath(eaOnePageNavigationUtils.Locator.feature_nav_path_xpath));
			if (feature_path.isDisplayed()) {
				softassert.assertEquals(feature_path.getText(), eaOnePageNavigationUtils.TEXT.feature_nav_path_xpath);
				System.out.println("Feature Navigation Passed !!");
			}
			
			// SERVICE NAVIGATION
			WebElement service_icon = driver.findElement(By.xpath(eaOnePageNavigationUtils.Locator.services_nav_button_xpath));
			if (service_icon.isDisplayed()) {
				System.out.println("Service icon Passed !!");
			}
			WebElement service_button = driver
					.findElement(By.xpath(eaOnePageNavigationUtils.Locator.services_nav_button_xpath));
			cursor.moveToElement(service_button).build().perform();
			Thread.sleep(1000);
			WebElement service_tooltip = driver
					.findElement(By.xpath(eaOnePageNavigationUtils.Locator.services_nav_tooltip_xpath));
			if (service_tooltip.isDisplayed()) {
				softassert.assertEquals(service_tooltip.getText(), eaOnePageNavigationUtils.TEXT.services_nav_tooltip_text);
				System.out.println("Service tooltip Passed !!");
			}
			service_button.click();
			Thread.sleep(1000);
			WebElement service_path = driver.findElement(By.xpath(eaOnePageNavigationUtils.Locator.services_nav_path_xpath));
			if (service_path.isDisplayed()) {
				softassert.assertEquals(service_path.getText(), eaOnePageNavigationUtils.TEXT.services_nav_path_xpath);
				System.out.println("Service Navigation Passed !!");
			}
			
			// PRICING NAVIGATION
			WebElement pricing_icon = driver.findElement(By.xpath(eaOnePageNavigationUtils.Locator.pricing_nav_button_xpath));
			if (pricing_icon.isDisplayed()) {
				System.out.println("Pricing icon Passed !!");
			}
			WebElement pricing_button = driver
					.findElement(By.xpath(eaOnePageNavigationUtils.Locator.pricing_nav_button_xpath));
			cursor.moveToElement(pricing_button).build().perform();
			Thread.sleep(1000);
			WebElement pricing_tooltip = driver
					.findElement(By.xpath(eaOnePageNavigationUtils.Locator.pricing_nav_tooltip_xpath));
			if (pricing_tooltip.isDisplayed()) {
				softassert.assertEquals(pricing_tooltip.getText(), eaOnePageNavigationUtils.TEXT.pricing_nav_tooltip_text);
				System.out.println("Pricing tooltip Passed !!");
			}
			pricing_button.click();
			Thread.sleep(1000);
			WebElement pricing_path = driver.findElement(By.xpath(eaOnePageNavigationUtils.Locator.pricing_nav_path_xpath));
			if (pricing_path.isDisplayed()) {
				softassert.assertEquals(pricing_path.getText(), eaOnePageNavigationUtils.TEXT.pricing_nav_path_xpath);
				System.out.println("Pricing Navigation Passed !!");
			}

			// BLOG NAVIGATION
			WebElement blog_icon = driver.findElement(By.xpath(eaOnePageNavigationUtils.Locator.blog_nav_button_xpath));
			if (blog_icon.isDisplayed()) {
				System.out.println("Blog icon Passed !!");
			}
			WebElement blog_button = driver
					.findElement(By.xpath(eaOnePageNavigationUtils.Locator.blog_nav_button_xpath));
			cursor.moveToElement(blog_button).build().perform();
			Thread.sleep(1000);
			WebElement blog_tooltip = driver
					.findElement(By.xpath(eaOnePageNavigationUtils.Locator.blog_nav_tooltip_xpath));
			if (blog_tooltip.isDisplayed()) {
				softassert.assertEquals(blog_tooltip.getText(), eaOnePageNavigationUtils.TEXT.blog_nav_tooltip_text);
				System.out.println("Blog tooltip Passed !!");
			}
			blog_button.click();
			Thread.sleep(1000);
			WebElement blog_path = driver.findElement(By.xpath(eaOnePageNavigationUtils.Locator.blog_nav_path_xpath));
			if (blog_path.isDisplayed()) {
				softassert.assertEquals(blog_path.getText(), eaOnePageNavigationUtils.TEXT.blog_nav_path_xpath);
				System.out.println("Blog Navigation Passed !!");
			}

			softassert.assertAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
