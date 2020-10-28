package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaImageHotspotsUtils;

public class EaImageHotspots {
	public static void eaEaImageHotspots(WebDriver driver, String url) {
		driver.get(Config.url + url);

			try {
				if (Config.go_doc_page == 1) {
					assertEquals(driver.getTitle(), eaImageHotspotsUtils.TEXT.imagehotspots_title);
					System.out.println("Page title passed !!");

					driver.findElement(By.xpath(eaImageHotspotsUtils.Locator.documentation_link_path)).click();

					ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
					driver.switchTo().window(tabs2.get(1));

					assertEquals(driver.findElement(By.id(eaImageHotspotsUtils.Locator.documentation_title_id)).getText(),
							eaImageHotspotsUtils.TEXT.documentation_page);
					System.out.println("Documentation link passed !!");
					driver.close();

					driver.switchTo().window(tabs2.get(0));

					Thread.sleep(1000);
				}

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,1170); behavior:'smooth';", "");
				
				Actions cursor = new Actions(driver);
				WebElement bag_hotspots = driver.findElement(By.xpath(eaImageHotspotsUtils.Locator.bag_hotspot_xpath));
				WebElement mug_hotspots = driver.findElement(By.xpath(eaImageHotspotsUtils.Locator.mug_hotspot_xpath));
				WebElement pad_hotspots = driver.findElement(By.xpath(eaImageHotspotsUtils.Locator.pad_hotspot_xpath));
				WebElement tshirt_hotspots = driver.findElement(By.xpath(eaImageHotspotsUtils.Locator.tshirt_hotspot_xpath));
				WebElement book_hotspots = driver.findElement(By.xpath(eaImageHotspotsUtils.Locator.book_hotspot_xpath));
				

				cursor.moveToElement(bag_hotspots).build().perform();			
				Thread.sleep(2000);

				cursor.moveToElement(mug_hotspots).build().perform();			
				Thread.sleep(2000);
				
				cursor.moveToElement(pad_hotspots).build().perform();			
				Thread.sleep(2000);
				
				cursor.moveToElement(tshirt_hotspots).build().perform();			
				Thread.sleep(2000);
				
				cursor.moveToElement(book_hotspots).build().perform();			
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
