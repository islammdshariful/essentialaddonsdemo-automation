package wpdev.ea;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.SnapComImg;
import wpdev.ea.utils.eaPriceMenuUtils;

public class EaPriceMenu {
	public static void eaPriceMenu(WebDriver driver, String url) {
		driver.get(Config.url + url);

		SoftAssert softassert = new SoftAssert();
		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaPriceMenuUtils.TEXT.pricemenu_page_title,
					eaPriceMenuUtils.Locator.documentation_link_path, eaPriceMenuUtils.TEXT.documentation_page);
			
			Config.closeNotifications.floatNotification(driver);
//			Config.closeNotifications.betterdocs(driver);
			Config.closeNotifications.notificationBar(driver);
//			
			
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1057)", "");

			Thread.sleep(1000);

			softassert.assertEquals(driver.findElement(By.xpath(eaPriceMenuUtils.Locator.menu_type_xpath)).getText(),
					eaPriceMenuUtils.TEXT.menu_type_text);

//			SnapComImg.snap(driver, eaPriceMenuUtils.Locator.food_image_xpath, "priceMenu/input.png");
			SnapComImg.comparison(driver, eaPriceMenuUtils.Locator.food_image_xpath,
					"priceMenu/input.png", "priceMenu/output/output.png");
			
			
			//NAME
			softassert.assertEquals(driver.findElement(By.xpath(eaPriceMenuUtils.Locator.item_1_xpath)).getText(),
					eaPriceMenuUtils.TEXT.item_1_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaPriceMenuUtils.Locator.item_2_xpath)).getText(),
					eaPriceMenuUtils.TEXT.item_2_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaPriceMenuUtils.Locator.item_3_xpath)).getText(),
					eaPriceMenuUtils.TEXT.item_3_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaPriceMenuUtils.Locator.item_4_xpath)).getText(),
					eaPriceMenuUtils.TEXT.item_4_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaPriceMenuUtils.Locator.item_5_xpath)).getText(),
					eaPriceMenuUtils.TEXT.item_5_text);
			
			//PRICE
			softassert.assertEquals(driver.findElement(By.xpath(eaPriceMenuUtils.Locator.item_1_price_xpath)).getText(),
					eaPriceMenuUtils.TEXT.item_1_price_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaPriceMenuUtils.Locator.item_2_price_xpath)).getText(),
					eaPriceMenuUtils.TEXT.item_2_price_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaPriceMenuUtils.Locator.item_3_price_xpath)).getText(),
					eaPriceMenuUtils.TEXT.item_3_price_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaPriceMenuUtils.Locator.item_4_price_xpath)).getText(),
					eaPriceMenuUtils.TEXT.item_4_price_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaPriceMenuUtils.Locator.item_5_price_xpath)).getText(),
					eaPriceMenuUtils.TEXT.item_5_price_text);
			

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
