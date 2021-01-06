 package wpdev.ea;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaCreativeButtonUtils;
import wpdev.ea.utils.eaFlipBoxUtils;

public class EaCreativeButton {
	public static void eaCreativeButton(WebDriver driver, String pageurl) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + pageurl);
		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaCreativeButtonUtils.TEXT.creativebutton_page_title,
					eaCreativeButtonUtils.Locator.documentation_link_path,
					eaCreativeButtonUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,1118)", "");
			js.executeScript("window.scrollBy(0,1050)", "");

			Thread.sleep(1000);

			softassert.assertEquals(driver.findElement(By.xpath(eaCreativeButtonUtils.Locator.firstbutton_text_xpath)).getText(),
					eaCreativeButtonUtils.TEXT.firstbutton_text);
			System.out.println("First button text passed !!");

			String color = driver.findElement(By.xpath(eaCreativeButtonUtils.Locator.fistbutton_xpath))
					.getCssValue("background-color");
			System.out.println(color);
			String[] hexValue = color.replace("rgba(", "").replace(")", "").split(",");
			hexValue[0] = hexValue[0].trim();
			int hexValue1 = Integer.parseInt(hexValue[0]);
			hexValue[1] = hexValue[1].trim();
			int hexValue2 = Integer.parseInt(hexValue[1]);
			hexValue[2] = hexValue[2].trim();
			int hexValue3 = Integer.parseInt(hexValue[2]);
			String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
			String value = actualColor.toUpperCase();
			System.out.println(value);
			softassert.assertTrue(value.equals(eaCreativeButtonUtils.TEXT.firstbutton_hoveroff_bgcolor));
			System.out.println("First button front color passed !!");

			Thread.sleep(1000);
			Actions mousehover = new Actions(driver);
			WebElement firstbutton = driver.findElement(By.xpath(eaCreativeButtonUtils.Locator.fistbutton_xpath));
			mousehover.moveToElement(firstbutton).build().perform();

			softassert.assertEquals(driver.findElement(By.xpath(eaCreativeButtonUtils.Locator.lastbutton_text_xpath)).getText(),
					eaCreativeButtonUtils.TEXT.lastbutton_hoveroff_text);
			System.out.println("last button hover off text passed !!");

			Actions mousehover_last = new Actions(driver);
			WebElement firstbutton_last = driver.findElement(By.xpath(eaCreativeButtonUtils.Locator.lastbutton_xpath));
			mousehover_last.moveToElement(firstbutton_last).build().perform();

			Thread.sleep(3000);

			String attribute_name = driver.findElement(By.xpath(eaCreativeButtonUtils.Locator.lastbutton_xpath))
					.getAttribute("data-text");

			softassert.assertEquals(attribute_name, eaCreativeButtonUtils.TEXT.lastbutton_hoveron_text);
			System.out.println("last button hover on text passed !!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
