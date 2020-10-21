package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaFlipBoxUtils;

import org.openqa.selenium.interactions.Actions;

public class EaFlipBox {

	public static void eaFlipBox(WebDriver driver) {

		try {
			assertEquals(driver.getTitle(), eaFlipBoxUtils.TEXT.flipbox_page_title);
			System.out.println("Page title passed !!");

			driver.findElement(By.xpath(eaFlipBoxUtils.Locator.documentation_link_path)).click();

			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));

			assertEquals(driver.findElement(By.id(eaFlipBoxUtils.Locator.documentation_title_id)).getText(),
					eaFlipBoxUtils.TEXT.documentation_page);
			System.out.println("Documentation link passed !!");
			driver.close();

			driver.switchTo().window(tabs2.get(0));

			Thread.sleep(1000);
			Actions mousehover = new Actions(driver);

			// FLIP BOX 1
			assertEquals(driver.findElement(By.xpath(eaFlipBoxUtils.Locator.flip1_front_text_xpath)).getText(),
					eaFlipBoxUtils.TEXT.flip1_front_text);
			System.out.println("Flip1 front passed !!");
			WebElement flipbox_1 = driver.findElement(By.xpath(eaFlipBoxUtils.Locator.flip1_box_xpath));
			mousehover.moveToElement(flipbox_1).build().perform();
			Thread.sleep(3000);
			assertEquals(driver.findElement(By.xpath(eaFlipBoxUtils.Locator.flip1_back_text_xpath)).getText(),
					eaFlipBoxUtils.TEXT.flip1_back_text);
			System.out.println("Flip1 back passed !!");

			Thread.sleep(1000);
			assertEquals(driver.findElement(By.xpath(eaFlipBoxUtils.Locator.flip2_front_text_xpath)).getText(),
					eaFlipBoxUtils.TEXT.flip2_front_text);
			System.out.println("Flip2 front passed !!");
			WebElement flipbox_2 = driver.findElement(By.xpath(eaFlipBoxUtils.Locator.flip2_box_xpath));
			mousehover.moveToElement(flipbox_2).build().perform();
			Thread.sleep(3000);
			assertEquals(driver.findElement(By.xpath(eaFlipBoxUtils.Locator.flip2_back_text_xpath)).getText(),
					eaFlipBoxUtils.TEXT.flip2_back_text);

			System.out.println("Flip2 back passed !!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void eaFlipBox(WebDriver driver, String pageurl) {
		driver.get(Config.url + pageurl);
		try {
//			assertEquals(driver.getTitle(), eaFlipBoxUtils.TEXT.flipbox_page_title);
//			System.out.println("Page title passed !!");
//			
//			driver.findElement(By.xpath(eaFlipBoxUtils.Locator.documentation_link_path)).click();
//			
//			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//			driver.switchTo().window(tabs2.get(1));
//			
//			assertEquals(driver.findElement(By.id(eaFlipBoxUtils.Locator.documentation_title_id)).getText(), eaFlipBoxUtils.TEXT.documentation_page);
//			System.out.println("Documentation link passed !!");
//			driver.close();
//			
//			driver.switchTo().window(tabs2.get(0));
//			
//			Thread.sleep(1000);
			Actions mousehover = new Actions(driver);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1109)", "");
			Thread.sleep(3000);
			// FLIP BOX 1
			assertEquals(driver.findElement(By.xpath(eaFlipBoxUtils.Locator.flip1_front_text_xpath)).getText(),
					eaFlipBoxUtils.TEXT.flip1_front_text);
			System.out.println("Flip1 front passed !!");
			WebElement flipbox_1 = driver.findElement(By.xpath(eaFlipBoxUtils.Locator.flip1_box_xpath));
			mousehover.moveToElement(flipbox_1).build().perform();
			Thread.sleep(3000);
			assertEquals(driver.findElement(By.xpath(eaFlipBoxUtils.Locator.flip1_back_text_xpath)).getText(),
					eaFlipBoxUtils.TEXT.flip1_back_text);
			System.out.println("Flip1 back passed !!");

			// FLIP BOX 2
			Thread.sleep(1000);
			assertEquals(driver.findElement(By.xpath(eaFlipBoxUtils.Locator.flip2_front_text_xpath)).getText(),
					eaFlipBoxUtils.TEXT.flip2_front_text);
			System.out.println("Flip2 front passed !!");
			WebElement flipbox_2 = driver.findElement(By.xpath(eaFlipBoxUtils.Locator.flip2_box_xpath));
			mousehover.moveToElement(flipbox_2).build().perform();
			Thread.sleep(3000);
			assertEquals(driver.findElement(By.xpath(eaFlipBoxUtils.Locator.flip2_back_text_xpath)).getText(),
					eaFlipBoxUtils.TEXT.flip2_back_text);

			System.out.println("Flip2 back passed !!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
