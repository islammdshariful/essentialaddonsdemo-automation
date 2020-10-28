package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaOnePageNavigationUtils;

public class EaOnePageNavigation {

	public static void eaOnePageNavigation(WebDriver driver, String url) {
		driver.get(Config.url + url);
		try {
			if (Config.go_doc_page == 1) {
				assertEquals(driver.getTitle(), eaOnePageNavigationUtils.TEXT.onepagenavigation_title);
				System.out.println("Page title passed !!");

				driver.findElement(By.xpath(eaOnePageNavigationUtils.Locator.documentation_link_path)).click();

				ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs2.get(1));

				assertEquals(
						driver.findElement(By.id(eaOnePageNavigationUtils.Locator.documentation_title_id)).getText(),
						eaOnePageNavigationUtils.TEXT.documentation_page);
				System.out.println("Documentation link passed !!");
				driver.close();

				driver.switchTo().window(tabs2.get(0));

				Thread.sleep(1000);
			}

//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,1026)", "");

			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOfElementLocated((By.className("cc-86w0")))));

			driver.findElement(By.className("cc-86w0")).click();
			driver.findElement(By.className("nx-close")).click();

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
				assertEquals(home_tooltip.getText(), eaOnePageNavigationUtils.TEXT.home_nav_tooltip_text);
				System.out.println("Home tooltip Passed !!");
			}
			home_button.click();
			Thread.sleep(1000);
			WebElement home_path = driver.findElement(By.xpath(eaOnePageNavigationUtils.Locator.home_nav_path_xpath));
			if (home_path.isDisplayed()) {
				assertEquals(home_path.getText(), eaOnePageNavigationUtils.TEXT.home_nav_path_xpath);
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
				assertEquals(feature_tooltip.getText(), eaOnePageNavigationUtils.TEXT.feature_nav_tooltip_text);
				System.out.println("Feature tooltip Passed !!");
			}
			feature_button.click();
			Thread.sleep(1000);
			WebElement feature_path = driver.findElement(By.xpath(eaOnePageNavigationUtils.Locator.feature_nav_path_xpath));
			if (feature_path.isDisplayed()) {
				assertEquals(feature_path.getText(), eaOnePageNavigationUtils.TEXT.feature_nav_path_xpath);
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
				assertEquals(service_tooltip.getText(), eaOnePageNavigationUtils.TEXT.services_nav_tooltip_text);
				System.out.println("Service tooltip Passed !!");
			}
			service_button.click();
			Thread.sleep(1000);
			WebElement service_path = driver.findElement(By.xpath(eaOnePageNavigationUtils.Locator.services_nav_path_xpath));
			if (service_path.isDisplayed()) {
				assertEquals(service_path.getText(), eaOnePageNavigationUtils.TEXT.services_nav_path_xpath);
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
				assertEquals(pricing_tooltip.getText(), eaOnePageNavigationUtils.TEXT.pricing_nav_tooltip_text);
				System.out.println("Pricing tooltip Passed !!");
			}
			pricing_button.click();
			Thread.sleep(1000);
			WebElement pricing_path = driver.findElement(By.xpath(eaOnePageNavigationUtils.Locator.pricing_nav_path_xpath));
			if (pricing_path.isDisplayed()) {
				assertEquals(pricing_path.getText(), eaOnePageNavigationUtils.TEXT.pricing_nav_path_xpath);
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
				assertEquals(blog_tooltip.getText(), eaOnePageNavigationUtils.TEXT.blog_nav_tooltip_text);
				System.out.println("Blog tooltip Passed !!");
			}
			blog_button.click();
			Thread.sleep(1000);
			WebElement blog_path = driver.findElement(By.xpath(eaOnePageNavigationUtils.Locator.blog_nav_path_xpath));
			if (blog_path.isDisplayed()) {
				assertEquals(blog_path.getText(), eaOnePageNavigationUtils.TEXT.blog_nav_path_xpath);
				System.out.println("Blog Navigation Passed !!");
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
