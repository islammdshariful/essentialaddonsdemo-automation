package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import wpdev.ea.utils.eaStickyVideoUtils;

public class EaStickyVideo {
	public static void eaStickyVideo(WebDriver driver) {

			try {
				assertEquals(driver.getTitle(), eaStickyVideoUtils.TEXT.stickyvideo_page_title);
				System.out.println("Page title passed !!");

				driver.findElement(By.xpath(eaStickyVideoUtils.Locator.documentation_link_path)).click();

				ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs2.get(1));

				assertEquals(driver.findElement(By.id(eaStickyVideoUtils.Locator.documentation_title_id)).getText(),
						eaStickyVideoUtils.TEXT.documentation_page);
				System.out.println("Documentation link passed !!");
				driver.close();

				driver.switchTo().window(tabs2.get(0));
//			
				Thread.sleep(1000);

				JavascriptExecutor js = (JavascriptExecutor) driver;

				js.executeScript("window.scrollBy(0,983)", "");
				
				driver.findElement(By.xpath(eaStickyVideoUtils.Locator.close_button_xpath)).click();
				System.out.println("Sticky video closed");
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
