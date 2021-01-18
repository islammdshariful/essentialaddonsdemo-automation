package testcases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import utils.eaCountdownUtils;

public class EaCountdown {
	public static void eaCountdown(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);

		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaCountdownUtils.TEXT.countdown_title,
					eaCountdownUtils.Locator.documentation_link_path, eaCountdownUtils.TEXT.documentation_page);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,984); behavior:'smooth';", "");

			// TEXT
			softassert.assertEquals(driver.findElement(By.xpath(eaCountdownUtils.Locator.countdown_header_xpath)).getText(),
					eaCountdownUtils.TEXT.countdown_header_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaCountdownUtils.Locator.countdown_des_xpath)).getText(),
					eaCountdownUtils.TEXT.countdown_des_text);

			// TIME TEXT
			softassert.assertEquals(driver.findElement(By.xpath(eaCountdownUtils.Locator.day_text_xpath)).getText(),
					eaCountdownUtils.TEXT.day_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaCountdownUtils.Locator.hour_text_xpath)).getText(),
					eaCountdownUtils.TEXT.hour_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaCountdownUtils.Locator.min_text_xpath)).getText(),
					eaCountdownUtils.TEXT.min_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaCountdownUtils.Locator.sec_text_xpath)).getText(),
					eaCountdownUtils.TEXT.sec_text);
			System.out.println("Time text Passed !!");

			String time1 = driver.findElement(By.xpath(eaCountdownUtils.Locator.sec_value_xpath)).getText();
			Thread.sleep(1500);
			System.out.println(time1);
			String time2 = driver.findElement(By.xpath(eaCountdownUtils.Locator.sec_value_xpath)).getText();
			System.out.println(time2);
			if (time1 == time2) {
				System.out.println("Counter NOT Working !!");
			} else {
				System.out.println("Counter is Working !!");
			}

			softassert.assertEquals(driver.findElement(By.xpath(eaCountdownUtils.Locator.end_text_xpath)).getText(),
					eaCountdownUtils.TEXT.end_text_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaCountdownUtils.Locator.end_des_xpath)).getText(),
					eaCountdownUtils.TEXT.end_des_text);
			softassert.assertAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
