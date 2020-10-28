package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaLightboxModalUtils;

public class EaLightboxModal {
	public static void lightbox(WebDriver driver, String button, String buttontext, String image, String close) {
		try {
			WebElement btn = driver.findElement(By.xpath(button));
			assertEquals(btn.getText(), buttontext);
			System.out.println("Button text Passed !!");
			
			Actions cursor = new Actions(driver);
			cursor.moveToElement(btn).click().build().perform();
//			Thread.sleep(1000);
//			btn.click();
			Thread.sleep(1000);
			WebElement img = driver.findElement(By.xpath(image));
			if(img.isDisplayed()) {
				driver.findElement(By.xpath(close)).click();
				Thread.sleep(1000);
			}else {
				System.out.println("Image NOT displayed !!");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void eaLightboxModal(WebDriver driver, String url) {
		driver.get(Config.url + url);

			try {
				if (Config.go_doc_page == 1) {
					assertEquals(driver.getTitle(), eaLightboxModalUtils.TEXT.lightbox_title);
					System.out.println("Page title passed !!");

					driver.findElement(By.xpath(eaLightboxModalUtils.Locator.documentation_link_path)).click();

					ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
					driver.switchTo().window(tabs2.get(1));

					assertEquals(
							driver.findElement(By.id(eaLightboxModalUtils.Locator.documentation_title_id)).getText(),
							eaLightboxModalUtils.TEXT.documentation_page);
					System.out.println("Documentation link passed !!");
					driver.close();

					driver.switchTo().window(tabs2.get(0));

					Thread.sleep(1000);
				}

				Config.closeNotifications.betterdocs(driver);
				Config.closeNotifications.notificationBar(driver);
				Config.closeNotifications.floatNotification(driver);
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,906)", "");

				// HEADER
				assertEquals(driver.findElement(By.xpath(eaLightboxModalUtils.Locator.header_text_xpath)).getText(),
						eaLightboxModalUtils.TEXT.header_text_text);
				assertEquals(driver.findElement(By.xpath(eaLightboxModalUtils.Locator.header_des_xpath)).getText(),
						eaLightboxModalUtils.TEXT.header_des_text);
				System.out.println("Header text passed !!");
				
				//LIGHT BOX 
				lightbox(driver, eaLightboxModalUtils.Locator.lightbox_1_xpath, eaLightboxModalUtils.TEXT.lightbox_1_text, eaLightboxModalUtils.Locator.lightbox_1_image_xpath, eaLightboxModalUtils.Locator.lightbox_1_image_close_button);
				lightbox(driver, eaLightboxModalUtils.Locator.lightbox_2_xpath, eaLightboxModalUtils.TEXT.lightbox_2_text, eaLightboxModalUtils.Locator.lightbox_2_image_xpath, eaLightboxModalUtils.Locator.lightbox_2_image_close_button);
				lightbox(driver, eaLightboxModalUtils.Locator.lightbox_3_xpath, eaLightboxModalUtils.TEXT.lightbox_3_text, eaLightboxModalUtils.Locator.lightbox_3_image_xpath, eaLightboxModalUtils.Locator.lightbox_3_image_close_button);
				lightbox(driver, eaLightboxModalUtils.Locator.lightbox_4_xpath, eaLightboxModalUtils.TEXT.lightbox_4_text, eaLightboxModalUtils.Locator.lightbox_4_image_xpath, eaLightboxModalUtils.Locator.lightbox_4_image_close_button);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
