package testcases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import utils.eaAdvancedMenuUtils;

public class EaAdvancedMenu {
	public static void eaAdvancedMenu(WebDriver driver, String pageurl) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + pageurl);
		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaAdvancedMenuUtils.TEXT.advancemenu_page_title,
					eaAdvancedMenuUtils.Locator.documentation_link_path, eaAdvancedMenuUtils.TEXT.documentation_page);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1058)", "");
			Actions mousehover = new Actions(driver);

			Thread.sleep(3000);
			// NORMAL MENU
			// HOME
//			softassert.assertEquals(driver.findElement(By.id(eaAdvancedMenuUtils.Locator.n_menu_home_id)).getText(),
//					eaAdvancedMenuUtils.TEXT.n_menu_home_text);
			driver.findElement(By.id(eaAdvancedMenuUtils.Locator.n_menu_home_id)).click();
			Thread.sleep(2000);
			if (driver.getTitle() == eaAdvancedMenuUtils.TEXT.menu_home_page_title) {
				System.out.println("Home page title passed !!");
			}
			driver.navigate().back();
			Thread.sleep(2000);

			// ELEMENT
//			softassert.assertEquals(driver.findElement(By.id(eaAdvancedMenuUtils.Locator.n_menu_element_id)).getText(),
//					eaAdvancedMenuUtils.TEXT.n_menu_element_text);
			WebElement element_menu = driver.findElement(By.id(eaAdvancedMenuUtils.Locator.n_menu_element_id));
			mousehover.moveToElement(element_menu).build().perform();

			// ELEMENT - ADVANCE ACCORDION
			WebElement element_menu_advance_accordion = driver
					.findElement(By.id(eaAdvancedMenuUtils.Locator.n_menu_element_advance_accordion_id));
//			softassert.assertEquals(driver.findElement(By.id(eaAdvancedMenuUtils.Locator.n_menu_element_advance_accordion_id))
//					.getText(), eaAdvancedMenuUtils.TEXT.n_menu_element_advance_accordion_text);
			mousehover.moveToElement(element_menu_advance_accordion).build().perform();
			element_menu_advance_accordion.click();
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			if (driver.getTitle().toString() == eaAdvancedMenuUtils.TEXT.menu_advance_accordion_page_title) {
				System.out.println("Advance Accordion page title passed !!");
			}
			driver.navigate().back();
			Thread.sleep(2000);

			// ELEMENT - GOOGLE MAP
			WebElement element_menu1 = driver.findElement(By.id(eaAdvancedMenuUtils.Locator.n_menu_element_id));
			mousehover.moveToElement(element_menu1).build().perform();
			WebElement element_menu_google_map = driver
					.findElement(By.id(eaAdvancedMenuUtils.Locator.n_menu_element_google_map_id));
//			softassert.assertEquals(driver.findElement(By.id(eaAdvancedMenuUtils.Locator.n_menu_element_google_map_id)).getText(),
//					eaAdvancedMenuUtils.TEXT.n_menu_element_google_map_text);
			mousehover.moveToElement(element_menu_google_map).build().perform();
			element_menu_google_map.click();
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			if (driver.getTitle().toString() == eaAdvancedMenuUtils.TEXT.menu_google_map_page_title) {
				System.out.println("Google Map page title passed !!");
			}
			driver.navigate().back();
			Thread.sleep(2000);

			// SUPPORT
			softassert.assertEquals(driver.findElement(By.id(eaAdvancedMenuUtils.Locator.n_menu_support_id)).getText(),
					eaAdvancedMenuUtils.TEXT.n_menu_support_text);
			WebElement support_menu = driver.findElement(By.id(eaAdvancedMenuUtils.Locator.n_menu_support_id));
			mousehover.moveToElement(support_menu).build().perform();
			support_menu.click();
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			if (driver.getTitle().toString() == eaAdvancedMenuUtils.TEXT.menu_support_page_title) {
				System.out.println("Support page title passed !!");
			}
			driver.navigate().back();
			Thread.sleep(2000);

			// BLOG
			softassert.assertEquals(driver.findElement(By.id(eaAdvancedMenuUtils.Locator.n_menu_blog_id)).getText(),
					eaAdvancedMenuUtils.TEXT.n_menu_blog_text);
			WebElement blog_menu = driver.findElement(By.id(eaAdvancedMenuUtils.Locator.n_menu_blog_id));
			mousehover.moveToElement(blog_menu).build().perform();
			Thread.sleep(1000);

			// CONTACT US
			softassert.assertEquals(driver.findElement(By.id(eaAdvancedMenuUtils.Locator.n_menu_contact_id)).getText(),
					eaAdvancedMenuUtils.TEXT.n_menu_contact_text);
			WebElement contact_us_menu = driver.findElement(By.id(eaAdvancedMenuUtils.Locator.n_menu_contact_id));
			mousehover.moveToElement(contact_us_menu).build().perform();
			softassert.assertAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
