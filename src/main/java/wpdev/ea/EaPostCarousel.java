package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaPostCarouselUtils;

public class EaPostCarousel {
	public static void eaPostCarousel(WebDriver driver, String url) {
		driver.get(Config.url + url);
		try {
			if(Config.go_doc_page == 1) {
				assertEquals(driver.getTitle(), eaPostCarouselUtils.TEXT.postcarousel_page_title);
				System.out.println("Page title passed !!");

				driver.findElement(By.xpath(eaPostCarouselUtils.Locator.documentation_link_path)).click();

				ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs2.get(1));

				assertEquals(driver.findElement(By.id(eaPostCarouselUtils.Locator.documentation_title_id)).getText(),
						eaPostCarouselUtils.TEXT.documentation_page);
				System.out.println("Documentation link passed !!");
				driver.close();

				driver.switchTo().window(tabs2.get(0));

				Thread.sleep(1000);
			}

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1031)", "");
			Thread.sleep(1000);
			driver.findElement(By.xpath(eaPostCarouselUtils.Locator.dot_xpath)).click();
			Thread.sleep(1000);
			String post_name = driver.findElement(By.xpath(eaPostCarouselUtils.Locator.post_header_xpath))
					.getText();
			System.out.println("Post name is: " + post_name);
			driver.findElement(By.xpath(eaPostCarouselUtils.Locator.dot_xpath)).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath(eaPostCarouselUtils.Locator.post_header_xpath)).click();
			assertEquals(driver.findElement(By.xpath(eaPostCarouselUtils.Locator.post_page_xpath)).getText(),
					post_name);
			System.out.println("Post Carousel Passed !!");
			driver.navigate().back();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
