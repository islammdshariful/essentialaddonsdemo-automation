package testcases;

import static org.testng.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import wpdev.ea.utils.Config;
import utils.eaDividerUtils;
import utils.eaProtectedContentUtils;

public class EaProtectedContent {
	public static void eaProtectedContent(WebDriver driver, String url) {
		driver.get(Config.url + url);
		SoftAssert softassert = new SoftAssert();
		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaProtectedContentUtils.TEXT.protected_page_title,
					eaProtectedContentUtils.Locator.documentation_link_path, eaProtectedContentUtils.TEXT.documentation_page);

//			Config.closeNotifications.floatNotification(driver);
//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);

			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1077)", "");

			Thread.sleep(3000);
			// PASSWORD FIELD
			softassert.assertEquals(driver.findElement(By.xpath(eaProtectedContentUtils.Locator.password_text_xpath)).getText(),
					eaProtectedContentUtils.TEXT.password_text);
			driver.findElement(By.name(eaProtectedContentUtils.Locator.password_input_feild_name)).sendKeys("1234");

			Thread.sleep(3000);
			WebElement submitbutton = driver
					.findElement(By.xpath(eaProtectedContentUtils.Locator.password_submit_button_xpath));
//			JavascriptExecutor executor = (JavascriptExecutor) driver;
//			executor.executeScript("arguments[0].click();", submitbutton);
			submitbutton.click();

//			driver.findElement(By.xpath(eaProtectedContentUtils.Locator.password_submit_button_xpath)).click();

			Thread.sleep(5000);

			js.executeScript("window.scrollBy(0,1077)", "");

			Thread.sleep(2000);

			softassert.assertEquals(driver.findElement(By.xpath(eaProtectedContentUtils.Locator.content_header_xpath)).getText(),
					eaProtectedContentUtils.TEXT.content_header_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaProtectedContentUtils.Locator.content_des_xpath)).getText(),
					eaProtectedContentUtils.TEXT.content_des_text);
			softassert.assertAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
