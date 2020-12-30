package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaDividerUtils;
import wpdev.ea.utils.eaFlipBoxUtils;

import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class EaFlipBox {
	public static void eaFlipBox(WebDriver driver, String pageurl) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + pageurl);
		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaFlipBoxUtils.TEXT.flipbox_page_title,
					eaFlipBoxUtils.Locator.documentation_link_path, eaFlipBoxUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
			Config.closeNotifications.notificationBar(driver);
			Config.closeNotifications.floatNotification(driver);
			Thread.sleep(1000);
			
			Actions mousehover = new Actions(driver);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1109)", "");
			Thread.sleep(1000);
			// FLIP BOX 1
			WebElement flip1_img = driver.findElement(By.xpath(eaFlipBoxUtils.Locator.flip1_front_img_xpth));
			WebElement flip2_img = driver.findElement(By.xpath(eaFlipBoxUtils.Locator.flip2_front_img_xpth));
			if(flip1_img.isDisplayed()) {
				if(!flip2_img.isDisplayed()) {
					System.out.println("Flip Box 1 Image is displayed");
				}
			}else {
				System.out.println("Flip Box 1 Image is NOT displayed");
			}
			softassert.assertEquals(driver.findElement(By.xpath(eaFlipBoxUtils.Locator.flip1_front_text_xpath)).getText(),
					eaFlipBoxUtils.TEXT.flip1_front_text);
			WebElement flipbox_1 = driver.findElement(By.xpath(eaFlipBoxUtils.Locator.flip1_box_xpath));
			mousehover.moveToElement(flipbox_1).build().perform();
			Thread.sleep(1000);
			softassert.assertEquals(driver.findElement(By.xpath(eaFlipBoxUtils.Locator.flip1_back_text_xpath)).getText(),
					eaFlipBoxUtils.TEXT.flip1_back_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaFlipBoxUtils.Locator.flip1_back_des_xpth)).getText(),
					eaFlipBoxUtils.TEXT.flip1_back_des_text);

			// FLIP BOX 2
			Thread.sleep(1000);
			
			if(flip2_img.isDisplayed()) {
				if(!flip1_img.isDisplayed()) {
					System.out.println("Flip Box 2 Image is displayed");
				}
			}else {
				System.out.println("Flip Box 2 Image is NOT displayed");
			}
			softassert.assertEquals(driver.findElement(By.xpath(eaFlipBoxUtils.Locator.flip2_front_text_xpath)).getText(),
					eaFlipBoxUtils.TEXT.flip2_front_text);
			WebElement flipbox_2 = driver.findElement(By.xpath(eaFlipBoxUtils.Locator.flip2_box_xpath));
			mousehover.moveToElement(flipbox_2).build().perform();
			Thread.sleep(1000);
			softassert.assertEquals(driver.findElement(By.xpath(eaFlipBoxUtils.Locator.flip2_back_text_xpath)).getText(),
					eaFlipBoxUtils.TEXT.flip2_back_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaFlipBoxUtils.Locator.flip2_back_des_xpth)).getText(),
					eaFlipBoxUtils.TEXT.flip2_back_des_text);
			Thread.sleep(1000);
			mousehover.moveToElement(flipbox_1).build().perform();
			softassert.assertAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
