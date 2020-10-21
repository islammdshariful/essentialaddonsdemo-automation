package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import wpdev.ea.utils.eaLogoCarouselUtils;

public class EaLogoCarousel {
	public static void eaLogoCarousel(WebDriver driver) {

		try {
//				assertEquals(driver.getTitle(), eaLogoCarouselUtils.TEXT.logocarousel_page_title);
//				System.out.println("Page title passed !!");
//				
//				driver.findElement(By.xpath(eaLogoCarouselUtils.Locator.documentation_link_path)).click();
//				
//				ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//				driver.switchTo().window(tabs2.get(1));
//				
//				assertEquals(driver.findElement(By.id(eaLogoCarouselUtils.Locator.documentation_title_id)).getText(), eaLogoCarouselUtils.TEXT.documentation_page);
//				System.out.println("Documentation link passed !!");
//				driver.close();
//				
//				driver.switchTo().window(tabs2.get(0));
//			
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,996)", "");

			driver.findElement(By.xpath(eaLogoCarouselUtils.Locator.dot_button_xpath)).click();
			Thread.sleep(1000);
			WebElement first_logo = driver.findElement(By.xpath(eaLogoCarouselUtils.Locator.first_logo_xpath));
			if (first_logo.isDisplayed()) {
				System.out.println("First logo passed !!");
			}

			driver.findElement(By.xpath(eaLogoCarouselUtils.Locator.dot_button_last_xpath)).click();
			Thread.sleep(1000);
			WebElement last_logo = driver.findElement(By.xpath(eaLogoCarouselUtils.Locator.last_logo_xpath));
			if (last_logo.isDisplayed()) {
				System.out.println("Last logo passed !!");
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
