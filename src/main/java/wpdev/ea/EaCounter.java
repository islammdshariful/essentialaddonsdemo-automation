package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaCounterUtils;

public class EaCounter {
	public static void eaCounter(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);

		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaCounterUtils.TEXT.counter_title,
					eaCounterUtils.Locator.documentation_link_path, eaCounterUtils.TEXT.documentation_page);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,903); behavior:'smooth';", "");

			Config.checkdocandheadtitle.headercheck(driver, eaCounterUtils.Locator.header_text_xpath,
					eaCounterUtils.TEXT.header_text_text, eaCounterUtils.Locator.header_des_xpath,
					eaCounterUtils.TEXT.header_des_text);

			// ICON
			WebElement icon1 = driver.findElement(By.xpath(eaCounterUtils.Locator.first_icon_xpath));
			WebElement icon2 = driver.findElement(By.xpath(eaCounterUtils.Locator.second_icon_xpath));
			WebElement icon3 = driver.findElement(By.xpath(eaCounterUtils.Locator.third_icon_xpath));
			WebElement icon4 = driver.findElement(By.xpath(eaCounterUtils.Locator.fourth_icon_xpath));

			if (icon1.isDisplayed() && icon2.isDisplayed() && icon3.isDisplayed() && icon4.isDisplayed()) {
				System.out.println("Icon Passed !!");
			} else {
				System.out.println("Icon NOT Passed !!");
			}
			// INNER ICON
			WebElement icon1_in = driver.findElement(By.xpath(eaCounterUtils.Locator.first_icon_in_xpath));
			WebElement icon2_in = driver.findElement(By.xpath(eaCounterUtils.Locator.second_icon_in_xpath));
			WebElement icon3_in = driver.findElement(By.xpath(eaCounterUtils.Locator.third_icon_in_xpath));
			WebElement icon4_in = driver.findElement(By.xpath(eaCounterUtils.Locator.fourth_icon_in_xpath));

			if (icon1_in.isDisplayed() && icon2_in.isDisplayed() && icon3_in.isDisplayed() && icon4_in.isDisplayed()) {
				System.out.println("Inner Icon Passed !!");
			} else {
				System.out.println("Inner Icon NOT Passed !!");
			}

			Thread.sleep(3000);

			// COUNT
			softassert.assertEquals(driver.findElement(By.xpath(eaCounterUtils.Locator.first_count_xpath)).getText(),
					eaCounterUtils.TEXT.first_count_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaCounterUtils.Locator.second_count_xpath)).getText(),
					eaCounterUtils.TEXT.second_count_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaCounterUtils.Locator.third_count_xpath)).getText(),
					eaCounterUtils.TEXT.third_count_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaCounterUtils.Locator.fourth_count_xpath)).getText(),
					eaCounterUtils.TEXT.fourth_count_text);

			// TEXT
			softassert.assertEquals(driver.findElement(By.xpath(eaCounterUtils.Locator.first_text_xpath)).getText(),
					eaCounterUtils.TEXT.first_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaCounterUtils.Locator.second_text_xpath)).getText(),
					eaCounterUtils.TEXT.second_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaCounterUtils.Locator.third_text_xpath)).getText(),
					eaCounterUtils.TEXT.third_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaCounterUtils.Locator.fourth_text_xpath)).getText(),
					eaCounterUtils.TEXT.fourth_text);
			
			
			softassert.assertAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
