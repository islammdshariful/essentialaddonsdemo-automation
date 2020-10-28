package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaContentTickerUtils;

public class EaContentTicker {
	public static void eaContentTicker(WebDriver driver, String pageurl) {
		driver.get(Config.url + pageurl);
		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaContentTickerUtils.TEXT.contentticker_page_title, eaContentTickerUtils.Locator.documentation_link_path, eaContentTickerUtils.TEXT.documentation_page);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1043)", "");
			
			Actions mousehover = new Actions(driver);

			Thread.sleep(3000);

			assertEquals(driver.findElement(By.xpath(eaContentTickerUtils.Locator.trending_today_xpath)).getText(),
					eaContentTickerUtils.TEXT.trendin_today_text);
			WebElement element = driver.findElement(By.xpath(eaContentTickerUtils.Locator.template_text_xpath));
			mousehover.moveToElement(element).build().perform();
			Thread.sleep(1000);

			assertEquals(driver.findElement(By.xpath(eaContentTickerUtils.Locator.template_text_xpath)).getText(),
					eaContentTickerUtils.TEXT.template_text);
			System.out.println("Template text passed !!");
			driver.findElement(By.xpath(eaContentTickerUtils.Locator.navigation_button_xpath)).click();

			assertEquals(driver.findElement(By.xpath(eaContentTickerUtils.Locator.template_using_shortcode_text_xpath))
					.getText(), eaContentTickerUtils.TEXT.template_using_shortcode_text);
			System.out.println("Template using shortcut text passed !!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
