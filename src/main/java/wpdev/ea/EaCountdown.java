package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaCountdownUtils;

public class EaCountdown {
	public static void eaCountdown(WebDriver driver, String url) {
		driver.get(Config.url + url);

			try {
				if (Config.go_doc_page == 1) {
					assertEquals(driver.getTitle(), eaCountdownUtils.TEXT.countdown_title);
					System.out.println("Page title passed !!");

					driver.findElement(By.xpath(eaCountdownUtils.Locator.documentation_link_path)).click();

					ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
					driver.switchTo().window(tabs2.get(1));

					assertEquals(driver.findElement(By.id(eaCountdownUtils.Locator.documentation_title_id)).getText(),
							eaCountdownUtils.TEXT.documentation_page);
					System.out.println("Documentation link passed !!");
					driver.close();

					driver.switchTo().window(tabs2.get(0));

					Thread.sleep(1000);
				}
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,984); behavior:'smooth';", "");
				
				//TEXT
				assertEquals(driver.findElement(By.xpath(eaCountdownUtils.Locator.countdown_header_xpath)).getText(), eaCountdownUtils.TEXT.countdown_header_text);
				assertEquals(driver.findElement(By.xpath(eaCountdownUtils.Locator.countdown_des_xpath)).getText(), eaCountdownUtils.TEXT.countdown_des_text);
				
				//TIME TEXT
				assertEquals(driver.findElement(By.xpath(eaCountdownUtils.Locator.day_text_xpath)).getText(), eaCountdownUtils.TEXT.day_text);
				assertEquals(driver.findElement(By.xpath(eaCountdownUtils.Locator.hour_text_xpath)).getText(), eaCountdownUtils.TEXT.hour_text);
				assertEquals(driver.findElement(By.xpath(eaCountdownUtils.Locator.min_text_xpath)).getText(), eaCountdownUtils.TEXT.min_text);
				assertEquals(driver.findElement(By.xpath(eaCountdownUtils.Locator.sec_text_xpath)).getText(), eaCountdownUtils.TEXT.sec_text);
				System.out.println("Time text Passed !!");
				
				//TIME VALUE
//				assertEquals(driver.findElement(By.xpath(eaCountdownUtils.Locator.day_value_xpath)).getText(), eaCountdownUtils.TEXT.day_value_text);
//				assertEquals(driver.findElement(By.xpath(eaCountdownUtils.Locator.hour_value_xpath)).getText(), eaCountdownUtils.TEXT.hour_value_text);
//				assertEquals(driver.findElement(By.xpath(eaCountdownUtils.Locator.hour_value_xpath)).getText(), eaCountdownUtils.TEXT.hour_value_text);
//				
				String time1 = driver.findElement(By.xpath(eaCountdownUtils.Locator.sec_value_xpath)).getText();
				Thread.sleep(1500);
				String time2 = driver.findElement(By.xpath(eaCountdownUtils.Locator.sec_value_xpath)).getText();
				
				if(time1 == time2) {
					System.out.println("Counter NOT Working !!");
				}else {
					System.out.println("Counter is Working !!");
				}
				
				assertEquals(driver.findElement(By.xpath(eaCountdownUtils.Locator.end_text_xpath)).getText(), eaCountdownUtils.TEXT.end_text_text);
				assertEquals(driver.findElement(By.xpath(eaCountdownUtils.Locator.end_des_xpath)).getText(), eaCountdownUtils.TEXT.end_des_text);

				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
