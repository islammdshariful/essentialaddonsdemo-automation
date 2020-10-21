package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.JavascriptExecutor;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaInfoBoxUtils;

public class EaInfoBox {
	public static void eaInfoBox(WebDriver driver) {
		try {
			assertEquals(driver.getTitle(), eaInfoBoxUtils.TEXT.flipbox_page_title);
			System.out.println("Page title passed !!");

			driver.findElement(By.xpath(eaInfoBoxUtils.Locator.documentation_link_path)).click();

			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));

			assertEquals(driver.findElement(By.id(eaInfoBoxUtils.Locator.documentation_title_id)).getText(),
					eaInfoBoxUtils.TEXT.documentation_page);
			System.out.println("Documentation link passed !!");
			driver.close();

			driver.switchTo().window(tabs2.get(0));
//			
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1100)", "");

//			//Scroll by Element
//			WebElement flag = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[16]/td[1]/img"));
//			js.executeScript("arguments[0].scrollIntoView();", flag);

			// FIRST INFO BOX
			assertEquals(driver.findElement(By.xpath(eaInfoBoxUtils.Locator.firstinfobox_text_xpath)).getText(),
					eaInfoBoxUtils.TEXT.first_infobox_text);
			System.out.println("1st info box  passed !!");

			js.executeScript("window.scrollBy(0,1300)", "");

			// 2ND INFO BOX
			assertEquals(driver.findElement(By.xpath(eaInfoBoxUtils.Locator.secondinfobox_header_text_xpath)).getText(),
					eaInfoBoxUtils.TEXT.second_infobox_title_text);
			assertEquals(driver.findElement(By.xpath(eaInfoBoxUtils.Locator.secondinfobox_description_xpath)).getText(),
					eaInfoBoxUtils.TEXT.second_infobox_description_text);
			System.out.println("2nd info box  passed !!");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void eaInfoBox(WebDriver driver, String pageurl) {
		driver.get(Config.url + pageurl);
		try {
			assertEquals(driver.getTitle(), eaInfoBoxUtils.TEXT.flipbox_page_title);
			System.out.println("Page title passed !!");

			driver.findElement(By.xpath(eaInfoBoxUtils.Locator.documentation_link_path)).click();

			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));

			assertEquals(driver.findElement(By.id(eaInfoBoxUtils.Locator.documentation_title_id)).getText(),
					eaInfoBoxUtils.TEXT.documentation_page);
			System.out.println("Documentation link passed !!");
			driver.close();

			driver.switchTo().window(tabs2.get(0));
//			
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1100)", "");

//			//Scroll by Element
//			WebElement flag = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[16]/td[1]/img"));
//			js.executeScript("arguments[0].scrollIntoView();", flag);

			// FIRST INFO BOX
			assertEquals(driver.findElement(By.xpath(eaInfoBoxUtils.Locator.firstinfobox_text_xpath)).getText(),
					eaInfoBoxUtils.TEXT.first_infobox_text);
			System.out.println("1st info box  passed !!");

			js.executeScript("window.scrollBy(0,1300)", "");

			// 2ND INFO BOX
			assertEquals(driver.findElement(By.xpath(eaInfoBoxUtils.Locator.secondinfobox_header_text_xpath)).getText(),
					eaInfoBoxUtils.TEXT.second_infobox_title_text);
			assertEquals(driver.findElement(By.xpath(eaInfoBoxUtils.Locator.secondinfobox_description_xpath)).getText(),
					eaInfoBoxUtils.TEXT.second_infobox_description_text);
			System.out.println("2nd info box  passed !!");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
