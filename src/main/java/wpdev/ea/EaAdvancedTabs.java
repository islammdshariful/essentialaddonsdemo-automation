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
			Config.checkdocandheadtitle.checkdoc(driver, eaAdvancedTabsUtils.TEXT.advancetab_page_title,
					eaAdvancedTabsUtils.Locator.documentation_link_xpath, eaAdvancedTabsUtils.TEXT.documentation_page);
			Thread.sleep(3000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1071)", "");

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
