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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import wpdev.ea.utils.Config;
import utils.SnapComImg;
import utils.eaDividerUtils;
import utils.eaInteractiveCardsUtils;
import utils.eaInteractivePromoUtils;

public class EaInteractivePromo {
	public static void eaInteractivePromo(WebDriver driver, String url) {
		driver.get(Config.url + url);

		try {
			
			Config.checkdocandheadtitle.checkdoc(driver, eaInteractivePromoUtils.TEXT.interationpromo_page_title,
					eaInteractivePromoUtils.Locator.documentation_link_path, eaInteractivePromoUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1091)", "");
			Thread.sleep(1000);

			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.or(
			    ExpectedConditions.visibilityOfElementLocated((By.xpath(eaInteractivePromoUtils.Locator.second_promo_header_xpath)))));

//			SnapComImg.snap(driver, eaInteractivePromoUtils.Locator.first_promo_image_xpath, "InteractivePromo/input.png");
			SnapComImg.comparison(driver, eaInteractivePromoUtils.Locator.first_promo_image_xpath,
					"InteractivePromo/input.png", "InteractivePromo/output/output.png");

			
			Actions mousehover = new Actions(driver);
			// FIRST
			WebElement first_promo = driver.findElement(By.xpath(eaInteractivePromoUtils.Locator.first_promo_xpath));
			mousehover.moveToElement(first_promo).build().perform();
			assertEquals(
					driver.findElement(By.xpath(eaInteractivePromoUtils.Locator.first_promo_header_xpath)).getText(),
					eaInteractivePromoUtils.TEXT.first_promo_header_text);
			WebElement des = driver
					.findElement(By.xpath(eaInteractivePromoUtils.Locator.first_promo_description_xpath));
			if (des.isDisplayed()) {
				assertEquals(driver.findElement(By.xpath(eaInteractivePromoUtils.Locator.first_promo_description_xpath))
						.getText(), eaInteractivePromoUtils.TEXT.first_promo_description_text);
				System.out.println("First Description Text Passed !!");
			}

			// SECOND
			WebElement second_promo = driver.findElement(By.xpath(eaInteractivePromoUtils.Locator.second_promo_xpath));
			mousehover.moveToElement(second_promo).build().perform();
			assertEquals(
					driver.findElement(By.xpath(eaInteractivePromoUtils.Locator.second_promo_header_xpath)).getText(),
					eaInteractivePromoUtils.TEXT.second_promo_header_text);
			WebElement des_2 = driver
					.findElement(By.xpath(eaInteractivePromoUtils.Locator.second_promo_description_xpath));
			if (des_2.isDisplayed()) {
				assertEquals(
						driver.findElement(By.xpath(eaInteractivePromoUtils.Locator.second_promo_description_xpath))
								.getText(),
						eaInteractivePromoUtils.TEXT.second_promo_description_text);
				System.out.println("Second Description Text Passed !!");
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
