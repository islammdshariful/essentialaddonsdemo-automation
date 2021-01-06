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
import wpdev.ea.utils.eaTooltipUtils;

public class EaTooltip {
	public static void eaTooltip(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);

		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaTooltipUtils.TEXT.tooltip_page_title,
					eaTooltipUtils.Locator.documentation_link_path, eaTooltipUtils.TEXT.documentation_page);

//			Config.closeNotifications.floatNotification(driver);
//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
			

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1068)", "");

			Thread.sleep(3000);

			Actions mousehover = new Actions(driver);

			// TOOLTIPS
			WebElement tt_1 = driver.findElement(By.xpath(eaTooltipUtils.Locator.first_tooltip_xpath));
			WebElement tt_2 = driver.findElement(By.xpath(eaTooltipUtils.Locator.second_tooltip_xpath));

			// TOOLTIP 1
//			WebElement tooltip_1_image = driver.findElement(By.xpath(eaTooltipUtils.Locator.first_tooltip_image_xpath));
//			if(tooltip_1_image.isDisplayed()) {
//				System.out.println("First tooltip Passed !!");
//			}
			WebElement tooltip_1 = driver.findElement(By.xpath(eaTooltipUtils.Locator.first_tooltip_image_xpath));
			mousehover.moveToElement(tooltip_1).build().perform();
			Thread.sleep(3000);
//			WebElement tt_1 = driver.findElement(By.xpath(eaTooltipUtils.Locator.first_tooltip_xpath));
//			WebElement tt_2 = driver.findElement(By.xpath(eaTooltipUtils.Locator.second_tooltip_xpath));
			if (tt_1.isDisplayed()) {
				softassert.assertEquals(driver.findElement(By.xpath(eaTooltipUtils.Locator.first_tooltip_xpath)).getText(),
						eaTooltipUtils.TEXT.first_tooltip_text);
				if (!tt_2.isDisplayed()) {
					System.out.println("First tooltip Passed !!");
				} else {
					System.out.println("second tooltip is NOT hinden !!");
				}
			} else {
				System.out.println("First tooltip failed !!");
			}

			// TOOLTIP 2
			WebElement tooltip_2 = driver.findElement(By.xpath(eaTooltipUtils.Locator.second_tooltip_image_xpath));
			mousehover.moveToElement(tooltip_2).build().perform();
			Thread.sleep(3000);
//			WebElement tt_2 = driver.findElement(By.xpath(eaTooltipUtils.Locator.second_tooltip_xpath));
			if (tt_2.isDisplayed()) {
				softassert.assertEquals(driver.findElement(By.xpath(eaTooltipUtils.Locator.second_tooltip_xpath)).getText(),
						eaTooltipUtils.TEXT.second_tooltip_text);
				if (!tt_1.isDisplayed()) {
					System.out.println("Second tooltip Passed !!");
				} else {
					System.out.println("first tooltip is NOT hiden !!");
				}
			} else {
				System.out.println("Second tooltip failed !!");
			}
			softassert.assertAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
