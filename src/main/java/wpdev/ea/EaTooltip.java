package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaTooltipUtils;

public class EaTooltip {
	public static void eaTooltip(WebDriver driver) {

		try {
//				assertEquals(driver.getTitle(), eaTooltipUtils.TEXT.tooltip_page_title);
//				System.out.println("Page title passed !!");
//				
//				driver.findElement(By.xpath(eaTooltipUtils.Locator.documentation_link_path)).click();
//				
//				ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//				driver.switchTo().window(tabs2.get(1));
//				
//				assertEquals(driver.findElement(By.id(eaTooltipUtils.Locator.documentation_title_id)).getText(), eaTooltipUtils.TEXT.documentation_page);
//				System.out.println("Documentation link passed !!");
//				driver.close();
//				
//				driver.switchTo().window(tabs2.get(0));

//				Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1119)", "");
			Thread.sleep(3000);

			Actions mousehover = new Actions(driver);

			// TOOLTIPS
			WebElement tt_1 = driver.findElement(By.xpath(eaTooltipUtils.Locator.first_tooltip_xpath));
			WebElement tt_2 = driver.findElement(By.xpath(eaTooltipUtils.Locator.second_tooltip_xpath));

			// TOOLTIP 1
//				WebElement tooltip_1_image = driver.findElement(By.xpath(eaTooltipUtils.Locator.first_tooltip_image_xpath));
//				if(tooltip_1_image.isDisplayed()) {
//					System.out.println("First tooltip Passed !!");
//				}
			WebElement tooltip_1 = driver.findElement(By.xpath(eaTooltipUtils.Locator.first_tooltip_image_xpath));
			mousehover.moveToElement(tooltip_1).build().perform();
			Thread.sleep(3000);
//				WebElement tt_1 = driver.findElement(By.xpath(eaTooltipUtils.Locator.first_tooltip_xpath));
//				WebElement tt_2 = driver.findElement(By.xpath(eaTooltipUtils.Locator.second_tooltip_xpath));
			if (tt_1.isDisplayed()) {
				assertEquals(driver.findElement(By.xpath(eaTooltipUtils.Locator.first_tooltip_xpath)).getText(),
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
//				WebElement tt_2 = driver.findElement(By.xpath(eaTooltipUtils.Locator.second_tooltip_xpath));
			if (tt_2.isDisplayed()) {
				assertEquals(driver.findElement(By.xpath(eaTooltipUtils.Locator.second_tooltip_xpath)).getText(),
						eaTooltipUtils.TEXT.second_tooltip_text);
				if (!tt_1.isDisplayed()) {
					System.out.println("Second tooltip Passed !!");
				} else {
					System.out.println("first tooltip is NOT hiden !!");
				}
			} else {
				System.out.println("Second tooltip failed !!");
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void eaTooltip(WebDriver driver, String pageurl) {
		driver.get(Config.url + pageurl);
		try {
//			assertEquals(driver.getTitle(), eaTooltipUtils.TEXT.tooltip_page_title);
//			System.out.println("Page title passed !!");
//			
//			driver.findElement(By.xpath(eaTooltipUtils.Locator.documentation_link_path)).click();
//			
//			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//			driver.switchTo().window(tabs2.get(1));
//			
//			assertEquals(driver.findElement(By.id(eaTooltipUtils.Locator.documentation_title_id)).getText(), eaTooltipUtils.TEXT.documentation_page);
//			System.out.println("Documentation link passed !!");
//			driver.close();
//			
//			driver.switchTo().window(tabs2.get(0));
//			
//			Thread.sleep(1000);

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
				assertEquals(driver.findElement(By.xpath(eaTooltipUtils.Locator.first_tooltip_xpath)).getText(),
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
				assertEquals(driver.findElement(By.xpath(eaTooltipUtils.Locator.second_tooltip_xpath)).getText(),
						eaTooltipUtils.TEXT.second_tooltip_text);
				if (!tt_1.isDisplayed()) {
					System.out.println("Second tooltip Passed !!");
				} else {
					System.out.println("first tooltip is NOT hiden !!");
				}
			} else {
				System.out.println("Second tooltip failed !!");
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
