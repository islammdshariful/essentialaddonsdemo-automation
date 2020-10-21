package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaAdvancedTabsUtils;

public class EaAdvancedTabs {
	public static void eaAdvanceTab(WebDriver driver, String pageurl) {
		driver.get(Config.url + pageurl);

		try {
//			assertEquals(driver.getTitle(), eaAdvancedTabsUtils.TEXT.advancetab_page_title);
//			System.out.println("Page title passed !!");
//			
//			driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.documentation_link_xpath)).click();
//			
//			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//			driver.switchTo().window(tabs2.get(1));
//			
//			assertEquals(driver.findElement(By.id(eaAdvancedTabsUtils.Locator.documentation_title_id)).getText(), eaAdvancedTabsUtils.TEXT.documentation_page);
//			System.out.println("Documentation link passed !!");
//			driver.close();
//			
//			driver.switchTo().window(tabs2.get(0));

			Thread.sleep(3000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1041)", "");

			// FIRST TAB
			WebElement first_icon = driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.first_tab_icon_xpath));
			if (first_icon.isDisplayed()) {
				System.out.println("First tab icon passed !!");
			} else {
				System.out.println("First tab icon Failed !!");
			}
			Thread.sleep(1000);
			driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.first_tab_text_xpath)).click();
			Thread.sleep(1000);
			assertEquals(driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.first_tab_text_xpath)).getText(),
					eaAdvancedTabsUtils.TEXT.first_tab_text);
			assertEquals(driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.first_tab_des_xpath)).getText(),
					eaAdvancedTabsUtils.TEXT.first_tab_des);
//			WebElement second_des = driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.second_tab_des_xpath));

			// SECOND TAB
			WebElement second_icon = driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.second_tab_icon_xpath));
			if (second_icon.isDisplayed()) {
				System.out.println("Second tab icon passed !!");
			} else {
				System.out.println("Second tab icon Failed !!");
			}
			driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.second_tab_text_xpath)).click();
			Thread.sleep(1000);
			assertEquals(driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.second_tab_text_xpath)).getText(),
					eaAdvancedTabsUtils.TEXT.second_tab_text);
			assertEquals(driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.second_tab_des_xpath)).getText(),
					eaAdvancedTabsUtils.TEXT.second_tab_des);

			// THIRD TAB
			WebElement third_icon = driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.third_tab_icon_xpath));
			if (third_icon.isDisplayed()) {
				System.out.println("Third tab icon passed !!");
			} else {
				System.out.println("Third tab icon Failed !!");
			}
			driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.third_tab_text_xpath)).click();
			Thread.sleep(1000);
			assertEquals(driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.third_tab_text_xpath)).getText(),
					eaAdvancedTabsUtils.TEXT.third_tab_text);
			assertEquals(driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.third_tab_des_xpath)).getText(),
					eaAdvancedTabsUtils.TEXT.third_tab_des);

			// FOURTH TAB
			WebElement fourth_icon = driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.fourth_tab_icon_xpath));
			if (fourth_icon.isDisplayed()) {
				System.out.println("First tab icon passed !!");
			} else {
				System.out.println("First tab icon Failed !!");
			}
			driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.fourth_tab_text_xpath)).click();
			assertEquals(driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.fourth_tab_text_xpath)).getText(),
					eaAdvancedTabsUtils.TEXT.fourth_tab_text);
			assertEquals(driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.fourth_tab_des_xpath)).getText(),
					eaAdvancedTabsUtils.TEXT.fourth_tab_des);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void eaAdvanceTab(WebDriver driver) {

		try {
//				assertEquals(driver.getTitle(), eaAdvancedTabsUtils.TEXT.advancetab_page_title);
//				System.out.println("Page title passed !!");
//				
//				driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.documentation_link_xpath)).click();
//				
//				ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//				driver.switchTo().window(tabs2.get(1));
//				
//				assertEquals(driver.findElement(By.id(eaAdvancedTabsUtils.Locator.documentation_title_id)).getText(), eaAdvancedTabsUtils.TEXT.documentation_page);
//				System.out.println("Documentation link passed !!");
//				driver.close();
//				
//				driver.switchTo().window(tabs2.get(0));

			Thread.sleep(3000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,900)", "");

			// FIRST TAB
			WebElement first_icon = driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.first_tab_icon_xpath));
			if (first_icon.isDisplayed()) {
				System.out.println("First tab icon passed !!");
			} else {
				System.out.println("First tab icon Failed !!");
			}
			driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.first_tab_text_xpath)).click();
			Thread.sleep(1000);
			assertEquals(driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.first_tab_text_xpath)).getText(),
					eaAdvancedTabsUtils.TEXT.first_tab_text);
			assertEquals(driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.first_tab_des_xpath)).getText(),
					eaAdvancedTabsUtils.TEXT.first_tab_des);
//				WebElement second_des = driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.second_tab_des_xpath));

			// SECOND TAB
			WebElement second_icon = driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.second_tab_icon_xpath));
			if (second_icon.isDisplayed()) {
				System.out.println("Second tab icon passed !!");
			} else {
				System.out.println("Second tab icon Failed !!");
			}
			driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.second_tab_text_xpath)).click();
			Thread.sleep(1000);
			assertEquals(driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.second_tab_text_xpath)).getText(),
					eaAdvancedTabsUtils.TEXT.second_tab_text);
			assertEquals(driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.second_tab_des_xpath)).getText(),
					eaAdvancedTabsUtils.TEXT.second_tab_des);

			// THIRD TAB
			WebElement third_icon = driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.third_tab_icon_xpath));
			if (third_icon.isDisplayed()) {
				System.out.println("Third tab icon passed !!");
			} else {
				System.out.println("Third tab icon Failed !!");
			}
			driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.third_tab_text_xpath)).click();
			Thread.sleep(1000);
			assertEquals(driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.third_tab_text_xpath)).getText(),
					eaAdvancedTabsUtils.TEXT.third_tab_text);
			assertEquals(driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.third_tab_des_xpath)).getText(),
					eaAdvancedTabsUtils.TEXT.third_tab_des);

			// FOURTH TAB
			WebElement fourth_icon = driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.fourth_tab_icon_xpath));
			if (fourth_icon.isDisplayed()) {
				System.out.println("First tab icon passed !!");
			} else {
				System.out.println("First tab icon Failed !!");
			}
			driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.fourth_tab_text_xpath)).click();
			assertEquals(driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.fourth_tab_text_xpath)).getText(),
					eaAdvancedTabsUtils.TEXT.fourth_tab_text);
			assertEquals(driver.findElement(By.xpath(eaAdvancedTabsUtils.Locator.fourth_tab_des_xpath)).getText(),
					eaAdvancedTabsUtils.TEXT.fourth_tab_des);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
