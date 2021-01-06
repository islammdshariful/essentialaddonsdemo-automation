package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaDividerUtils;
import wpdev.ea.utils.eaFancyTextUtils;

public class EaFancyText {
	public static void eaFancyText(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);
		Config.checkdocandheadtitle.checkdoc(driver, eaFancyTextUtils.TEXT.fancytext_title,
				eaFancyTextUtils.Locator.documentation_link_path, eaFancyTextUtils.TEXT.documentation_page);

//		Config.closeNotifications.betterdocs(driver);
//		Config.closeNotifications.notificationBar(driver);
//		Config.closeNotifications.floatNotification(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,949); behavior:'smooth';", "");

		// HEADER
		softassert.assertEquals(driver.findElement(By.xpath(eaFancyTextUtils.Locator.header_text_xpath)).getText(),
				eaFancyTextUtils.TEXT.header_text_text);
		softassert.assertEquals(driver.findElement(By.xpath(eaFancyTextUtils.Locator.header_des_xpath)).getText(),
				eaFancyTextUtils.TEXT.header_des_text);
		System.out.println("Header text passed !!");

		softassert.assertEquals(driver.findElement(By.xpath(eaFancyTextUtils.Locator.fancytext_normal_xpath)).getText(),
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
		softassert.assertAll();
	}
}
