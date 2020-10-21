package wpdev.ea;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaCreativeButtonUtils;
import wpdev.ea.utils.eaFlipBoxUtils;

public class EaCreativeButton {
	public static void eaCreativeButton(WebDriver driver, String pageurl) {
		driver.get(Config.url + pageurl);
		try {
//			assertEquals(driver.getTitle(), eaCreativeButtonUtils.TEXT.creativebutton_page_title);
//			System.out.println("Page title passed !!");
//			
//			driver.findElement(By.xpath(eaCreativeButtonUtils.Locator.documentation_link_path)).click();
//			
//			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//			driver.switchTo().window(tabs2.get(1));
//			
//			assertEquals(driver.findElement(By.id(eaCreativeButtonUtils.Locator.documentation_title_id)).getText(), eaCreativeButtonUtils.TEXT.documentation_page);
//			System.out.println("Documentation link passed !!");
//			driver.close();
//			
//			driver.switchTo().window(tabs2.get(0));

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1118)", "");
//			
			Thread.sleep(1000);

			assertEquals(driver.findElement(By.xpath(eaCreativeButtonUtils.Locator.firstbutton_text_xpath)).getText(),
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
			assertTrue(value.equals(eaCreativeButtonUtils.TEXT.firstbutton_hoveroff_bgcolor));
			System.out.println("First button front color passed !!");

			Thread.sleep(1000);
			Actions mousehover = new Actions(driver);
			WebElement firstbutton = driver.findElement(By.xpath(eaCreativeButtonUtils.Locator.fistbutton_xpath));
			mousehover.moveToElement(firstbutton).build().perform();

//			String color_back = driver.findElement(By.xpath(eaCreativeButtonUtils.Locator.fistbutton_xpath)).getCssValue("background-color");
//			System.out.println(color_back);
//			String[] hexValue_back = color_back.replace("rgba(", "").replace(")", "").split(",");     
//			hexValue_back[0] = hexValue_back[0].trim();
//			int hexValue1_back = Integer.parseInt(hexValue_back[0]);                   
//			hexValue_back[1] = hexValue_back[1].trim();
//			int hexValue2_back = Integer.parseInt(hexValue_back[1]);                   
//			hexValue_back[2] = hexValue_back[2].trim();
//			int hexValue3_back = Integer.parseInt(hexValue[2]);                   
//			String actualColor_back = String.format("#%02x%02x%02x", hexValue1_back, hexValue2_back, hexValue3_back);
//			String value_back = actualColor_back.toUpperCase();
//			System.out.println(value_back);
//			assertTrue(value_back.equals(eaCreativeButtonUtils.TEXT.firstbutton_hoveron_bgcolor));
//			System.out.println("First button back color passed !!");
////			

			assertEquals(driver.findElement(By.xpath(eaCreativeButtonUtils.Locator.lastbutton_text_xpath)).getText(),
					eaCreativeButtonUtils.TEXT.lastbutton_hoveroff_text);
			System.out.println("last button hover off text passed !!");

			Actions mousehover_last = new Actions(driver);
			WebElement firstbutton_last = driver.findElement(By.xpath(eaCreativeButtonUtils.Locator.lastbutton_xpath));
			mousehover_last.moveToElement(firstbutton_last).build().perform();

			Thread.sleep(3000);

			String attribute_name = driver.findElement(By.xpath(eaCreativeButtonUtils.Locator.lastbutton_xpath))
					.getAttribute("data-text");

			assertEquals(attribute_name, eaCreativeButtonUtils.TEXT.lastbutton_hoveron_text);
			System.out.println("last button hover on text passed !!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void eaCreativeButton(WebDriver driver) {
		try {
//			assertEquals(driver.getTitle(), eaCreativeButtonUtils.TEXT.creativebutton_page_title);
//			System.out.println("Page title passed !!");
//			
//			driver.findElement(By.xpath(eaCreativeButtonUtils.Locator.documentation_link_path)).click();
//			
//			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//			driver.switchTo().window(tabs2.get(1));
//			
//			assertEquals(driver.findElement(By.id(eaCreativeButtonUtils.Locator.documentation_title_id)).getText(), eaCreativeButtonUtils.TEXT.documentation_page);
//			System.out.println("Documentation link passed !!");
//			driver.close();
//			
//			driver.switchTo().window(tabs2.get(0));
//			
			Thread.sleep(1000);

			assertEquals(driver.findElement(By.xpath(eaCreativeButtonUtils.Locator.firstbutton_text_xpath)).getText(),
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
			assertTrue(value.equals(eaCreativeButtonUtils.TEXT.firstbutton_hoveroff_bgcolor));
			System.out.println("First button front color passed !!");

			Thread.sleep(1000);
			Actions mousehover = new Actions(driver);
			WebElement firstbutton = driver.findElement(By.xpath(eaCreativeButtonUtils.Locator.fistbutton_xpath));
			mousehover.moveToElement(firstbutton).build().perform();

//			String color_back = driver.findElement(By.xpath(eaCreativeButtonUtils.Locator.fistbutton_xpath)).getCssValue("background-color");
//			System.out.println(color_back);
//			String[] hexValue_back = color_back.replace("rgba(", "").replace(")", "").split(",");     
//			hexValue_back[0] = hexValue_back[0].trim();
//			int hexValue1_back = Integer.parseInt(hexValue_back[0]);                   
//			hexValue_back[1] = hexValue_back[1].trim();
//			int hexValue2_back = Integer.parseInt(hexValue_back[1]);                   
//			hexValue_back[2] = hexValue_back[2].trim();
//			int hexValue3_back = Integer.parseInt(hexValue[2]);                   
//			String actualColor_back = String.format("#%02x%02x%02x", hexValue1_back, hexValue2_back, hexValue3_back);
//			String value_back = actualColor_back.toUpperCase();
//			System.out.println(value_back);
//			assertTrue(value_back.equals(eaCreativeButtonUtils.TEXT.firstbutton_hoveron_bgcolor));
//			System.out.println("First button back color passed !!");
////			

			assertEquals(driver.findElement(By.xpath(eaCreativeButtonUtils.Locator.lastbutton_text_xpath)).getText(),
					eaCreativeButtonUtils.TEXT.lastbutton_hoveroff_text);
			System.out.println("last button hover off text passed !!");

			Actions mousehover_last = new Actions(driver);
			WebElement firstbutton_last = driver.findElement(By.xpath(eaCreativeButtonUtils.Locator.lastbutton_xpath));
			mousehover_last.moveToElement(firstbutton_last).build().perform();

			Thread.sleep(3000);

			String attribute_name = driver.findElement(By.xpath(eaCreativeButtonUtils.Locator.lastbutton_xpath))
					.getAttribute("data-text");

			assertEquals(attribute_name, eaCreativeButtonUtils.TEXT.lastbutton_hoveron_text);
			System.out.println("last button hover on text passed !!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
