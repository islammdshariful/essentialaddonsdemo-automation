package testcases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import utils.SnapComImg;
import utils.eaDividerUtils;
import utils.eaInteractiveCardsUtils;

public class EaInteractiveCards {
	public static void eaInteractiveCards(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);
		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaInteractiveCardsUtils.TEXT.interationcardpage_title,
					eaInteractiveCardsUtils.Locator.documentation_link_path,
					eaInteractiveCardsUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1042)", "");

			Thread.sleep(1000);
			driver.findElement(By.xpath(eaInteractiveCardsUtils.Locator.first_card_xpath)).click();
			Thread.sleep(1000);
			// OPEN FIRST CARD
			softassert.assertEquals(driver.findElement(By.xpath(eaInteractiveCardsUtils.Locator.first_header_xpath)).getText(),
					eaInteractiveCardsUtils.TEXT.first_header_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaInteractiveCardsUtils.Locator.first_des_xpath)).getText(),
					eaInteractiveCardsUtils.TEXT.first_des_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaInteractiveCardsUtils.Locator.first_card_readmore_button_xpath))
					.getText(), eaInteractiveCardsUtils.TEXT.first_card_readmore_button_text);

			driver.findElement(By.xpath(eaInteractiveCardsUtils.Locator.second_card_xpath)).click();
			Thread.sleep(1000);
			// OPEN SECOND CARD
			softassert.assertEquals(driver.findElement(By.xpath(eaInteractiveCardsUtils.Locator.second_header_xpath)).getText(),
					eaInteractiveCardsUtils.TEXT.second_header_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaInteractiveCardsUtils.Locator.second_des_xpath)).getText(),
					eaInteractiveCardsUtils.TEXT.second_des_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaInteractiveCardsUtils.Locator.second_card_readmore_button_xpath))
					.getText(), eaInteractiveCardsUtils.TEXT.second_card_readmore_button_text);

			Thread.sleep(1000);

//			SnapComImg.snap(driver, eaInteractiveCardsUtils.Locator.first_image_xpath, "InteractiveCard/input.png");
			SnapComImg.comparison(driver, eaInteractiveCardsUtils.Locator.first_image_xpath,
					"InteractiveCard/input.png", "InteractiveCard/output/output.png");
//			Thread.sleep(1000);
			// CLOSE CARDS
			driver.findElement(By.xpath(eaInteractiveCardsUtils.Locator.first_close_button_xpath)).click();
			System.out.println("First Card Closed !!");
			Thread.sleep(1000);
			driver.findElement(By.xpath(eaInteractiveCardsUtils.Locator.second_close_button_xpath)).click();
			System.out.println("Second Card Closed !!");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
