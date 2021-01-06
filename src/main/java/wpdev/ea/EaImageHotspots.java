package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaDividerUtils;
import wpdev.ea.utils.eaImageHotspotsUtils;

public class EaImageHotspots {
	public static void eaEaImageHotspots(WebDriver driver, String url) {
		driver.get(Config.url + url);

			try {
				Config.checkdocandheadtitle.checkdoc(driver, eaImageHotspotsUtils.TEXT.imagehotspots_title,
						eaImageHotspotsUtils.Locator.documentation_link_path, eaImageHotspotsUtils.TEXT.documentation_page);

//				Config.closeNotifications.floatNotification(driver);
//				Config.closeNotifications.betterdocs(driver);
//				Config.closeNotifications.notificationBar(driver);
//				

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,1176)", "");
//				WebElement element = driver.findElement(By.xpath("//*[@id=\"post-2956\"]/div/div/div/div/section[3]/div/div/div/div/div/div/div/div/div/span[1]/span/span/span"));
//				js.executeScript("arguments[0].scrollIntoView();", element);
				
				Actions cursor = new Actions(driver);
				WebElement bag_hotspots = driver.findElement(By.xpath(eaImageHotspotsUtils.Locator.bag_hotspot_xpath));
				WebElement mug_hotspots = driver.findElement(By.xpath(eaImageHotspotsUtils.Locator.mug_hotspot_xpath));
				WebElement pad_hotspots = driver.findElement(By.xpath(eaImageHotspotsUtils.Locator.pad_hotspot_xpath));
				WebElement tshirt_hotspots = driver.findElement(By.xpath(eaImageHotspotsUtils.Locator.tshirt_hotspot_xpath));
				WebElement book_hotspots = driver.findElement(By.xpath(eaImageHotspotsUtils.Locator.book_hotspot_xpath));
				
				Thread.sleep(2000);
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
