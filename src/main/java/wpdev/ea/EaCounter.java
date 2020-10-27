package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaCounterUtils;

public class EaCounter {
	public static void eaCounter(WebDriver driver, String url) {
		driver.get(Config.url + url);

		try {
			if (Config.go_doc_page == 1) {
				assertEquals(driver.getTitle(), eaCounterUtils.TEXT.counter_title);
				System.out.println("Page title passed !!");

				driver.findElement(By.xpath(eaCounterUtils.Locator.documentation_link_path)).click();

				ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs2.get(1));

				assertEquals(driver.findElement(By.id(eaCounterUtils.Locator.documentation_title_id)).getText(),
						eaCounterUtils.TEXT.documentation_page);
				System.out.println("Documentation link passed !!");
				driver.close();

				driver.switchTo().window(tabs2.get(0));

				Thread.sleep(1000);
			}

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,903); behavior:'smooth';", "");

			// HEADER
			assertEquals(driver.findElement(By.xpath(eaCounterUtils.Locator.header_text_xpath)).getText(),
					eaCounterUtils.TEXT.header_text_text);
			assertEquals(driver.findElement(By.xpath(eaCounterUtils.Locator.header_des_xpath)).getText(),
					eaCounterUtils.TEXT.header_des_text);
			System.out.println("Header text passed !!");

			// ICON
			WebElement icon1 = driver.findElement(By.xpath(eaCounterUtils.Locator.first_icon_xpath));
			WebElement icon2 = driver.findElement(By.xpath(eaCounterUtils.Locator.second_icon_xpath));
			WebElement icon3 = driver.findElement(By.xpath(eaCounterUtils.Locator.third_icon_xpath));
			WebElement icon4 = driver.findElement(By.xpath(eaCounterUtils.Locator.fourth_icon_xpath));

			if(icon1.isDisplayed() && icon2.isDisplayed() && icon3.isDisplayed() && icon4.isDisplayed()) {
				System.out.println("Icon Passed !!");
			}else {
				System.out.println("Icon NOT Passed !!");
			}
			// INNER ICON
			WebElement icon1_in = driver.findElement(By.xpath(eaCounterUtils.Locator.first_icon_in_xpath));
			WebElement icon2_in = driver.findElement(By.xpath(eaCounterUtils.Locator.second_icon_in_xpath));
			WebElement icon3_in = driver.findElement(By.xpath(eaCounterUtils.Locator.third_icon_in_xpath));
			WebElement icon4_in = driver.findElement(By.xpath(eaCounterUtils.Locator.fourth_icon_in_xpath));

			if(icon1_in.isDisplayed() && icon2_in.isDisplayed() && icon3_in.isDisplayed() && icon4_in.isDisplayed()) {
				System.out.println("Inner Icon Passed !!");
			}else {
				System.out.println("Inner Icon NOT Passed !!");
			}
			
			Thread.sleep(3000);
			
			// COUNT
			assertEquals(driver.findElement(By.xpath(eaCounterUtils.Locator.first_count_xpath)).getText(),
					eaCounterUtils.TEXT.first_count_text);
			assertEquals(driver.findElement(By.xpath(eaCounterUtils.Locator.second_count_xpath)).getText(),
					eaCounterUtils.TEXT.second_count_text);
			assertEquals(driver.findElement(By.xpath(eaCounterUtils.Locator.third_count_xpath)).getText(),
					eaCounterUtils.TEXT.third_count_text);
			assertEquals(driver.findElement(By.xpath(eaCounterUtils.Locator.fourth_count_xpath)).getText(),
					eaCounterUtils.TEXT.fourth_count_text);

			// TEXT
			assertEquals(driver.findElement(By.xpath(eaCounterUtils.Locator.first_count_xpath)).getText(),
					eaCounterUtils.TEXT.first_count_text);
			assertEquals(driver.findElement(By.xpath(eaCounterUtils.Locator.second_count_xpath)).getText(),
					eaCounterUtils.TEXT.second_count_text);
			assertEquals(driver.findElement(By.xpath(eaCounterUtils.Locator.third_count_xpath)).getText(),
					eaCounterUtils.TEXT.third_count_text);
			assertEquals(driver.findElement(By.xpath(eaCounterUtils.Locator.fourth_count_xpath)).getText(),
					eaCounterUtils.TEXT.fourth_count_text);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
