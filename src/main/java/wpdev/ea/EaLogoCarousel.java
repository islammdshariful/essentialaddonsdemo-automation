package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaDividerUtils;
import wpdev.ea.utils.eaLogoCarouselUtils;

public class EaLogoCarousel {
	public static void eaLogoCarousel(WebDriver driver, String url) {
		driver.get(Config.url + url);
		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaLogoCarouselUtils.TEXT.logocarousel_page_title,
					eaLogoCarouselUtils.Locator.documentation_link_path, eaLogoCarouselUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
			Thread.sleep(1000);


			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,960)", "");
			
			Thread.sleep(2000);
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
			e.printStackTrace();
		}
	}
}
