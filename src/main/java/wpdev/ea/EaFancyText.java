package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaFancyTextUtils;

public class EaFancyText {
	public static void eaFancyText(WebDriver driver, String url) {
		driver.get(Config.url + url);
		try {
			if (Config.go_doc_page == 1) {
				assertEquals(driver.getTitle(), eaFancyTextUtils.TEXT.fancytext_title);
				System.out.println("Page title passed !!");

				driver.findElement(By.xpath(eaFancyTextUtils.Locator.documentation_link_path)).click();

				ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs2.get(1));

				assertEquals(driver.findElement(By.id(eaFancyTextUtils.Locator.documentation_title_id)).getText(),
						eaFancyTextUtils.TEXT.documentation_page);
				System.out.println("Documentation link passed !!");
				driver.close();

				driver.switchTo().window(tabs2.get(0));

				Thread.sleep(1000);
			}

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,989); behavior:'smooth';", "");

			// HEADER
			assertEquals(driver.findElement(By.xpath(eaFancyTextUtils.Locator.header_text_xpath)).getText(),
					eaFancyTextUtils.TEXT.header_text_text);
			assertEquals(driver.findElement(By.xpath(eaFancyTextUtils.Locator.header_des_xpath)).getText(),
					eaFancyTextUtils.TEXT.header_des_text);
			System.out.println("Header text passed !!");

			assertEquals(driver.findElement(By.xpath(eaFancyTextUtils.Locator.fancytext_normal_xpath)).getText(),
					eaFancyTextUtils.TEXT.fancytext_normal_text);
			System.out.println("Normal text Passed !!");
			
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.textToBePresentInElementLocated(
					By.xpath(eaFancyTextUtils.Locator.fancytext_moving_xpath),
					eaFancyTextUtils.TEXT.fancytext_moving_1_text));
			System.out.println("Typography text Passed !!");
			
			wait.until(ExpectedConditions.textToBePresentInElementLocated(
					By.xpath(eaFancyTextUtils.Locator.fancytext_moving_xpath),
					eaFancyTextUtils.TEXT.fancytext_moving_2_text));
			System.out.println("Color text Passed !!");
			
			wait.until(ExpectedConditions.textToBePresentInElementLocated(
					By.xpath(eaFancyTextUtils.Locator.fancytext_moving_xpath),
					eaFancyTextUtils.TEXT.fancytext_moving_3_text));
			System.out.println("Background text Passed !!");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
