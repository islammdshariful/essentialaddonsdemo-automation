package testcases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.JavascriptExecutor;

import wpdev.ea.utils.Config;
import utils.eaDividerUtils;
import utils.eaInfoBoxUtils;

public class EaInfoBox {
	public static void eaInfoBox(WebDriver driver, String pageurl) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + pageurl);
		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaInfoBoxUtils.TEXT.flipbox_page_title,
					eaInfoBoxUtils.Locator.documentation_link_path, eaInfoBoxUtils.TEXT.documentation_page);
			
//			Config.closeNotifications.floatNotification(driver);
//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
			
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1100)", "");

			// FIRST INFO BOX
			softassert.assertEquals(driver.findElement(By.xpath(eaInfoBoxUtils.Locator.firstinfobox_text_xpath)).getText(),
					eaInfoBoxUtils.TEXT.first_infobox_text);

			js.executeScript("window.scrollBy(0,1300)", "");

			// 2ND INFO BOX
			softassert.assertEquals(driver.findElement(By.xpath(eaInfoBoxUtils.Locator.secondinfobox_header_text_xpath)).getText(),
					eaInfoBoxUtils.TEXT.second_infobox_title_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaInfoBoxUtils.Locator.secondinfobox_description_xpath)).getText(),
					eaInfoBoxUtils.TEXT.second_infobox_description_text);
			softassert.assertAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
