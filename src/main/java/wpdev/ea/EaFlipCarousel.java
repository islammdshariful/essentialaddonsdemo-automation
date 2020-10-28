package wpdev.ea;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.SnapComImg;
import wpdev.ea.utils.eaFlipCarouselUtils;

public class EaFlipCarousel {
	public static void eaFlipCarousel(WebDriver driver, String url) {
		
		driver.get(Config.url + url);
		
		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaFlipCarouselUtils.TEXT.lightbox_title, eaFlipCarouselUtils.Locator.documentation_link_path, eaFlipCarouselUtils.TEXT.documentation_page);
			Config.checkdocandheadtitle.headercheck(driver, eaFlipCarouselUtils.Locator.header_text_xpath, eaFlipCarouselUtils.TEXT.header_text_text, eaFlipCarouselUtils.Locator.header_des_xpath, eaFlipCarouselUtils.TEXT.header_des_text);
			
			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,999)", "");
			
			Thread.sleep(2000);
			
			
			
			//FIRST 
			driver.findElement(By.xpath(eaFlipCarouselUtils.Locator.first_image_xpath)).click();
			Thread.sleep(1500);
			
			SnapComImg.snap(driver, eaFlipCarouselUtils.Locator.first_image_xpath, "FlipCarousel/first/input.png");
			SnapComImg.comparison(driver, eaFlipCarouselUtils.Locator.first_image_xpath, "FlipCarousel/first/input.png", "FlipCarousel/first/output/output.png");
			
			//MIDDLE 
			driver.findElement(By.xpath(eaFlipCarouselUtils.Locator.second_image_xpath)).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(eaFlipCarouselUtils.Locator.third_image_xpath)).click();
			Thread.sleep(1500);
			
			SnapComImg.snap(driver, eaFlipCarouselUtils.Locator.third_image_xpath, "FlipCarousel/middle/input.png");
			SnapComImg.comparison(driver, eaFlipCarouselUtils.Locator.third_image_xpath, "FlipCarousel/middle/input.png", "FlipCarousel/middle/output/output.png");
			
			//LAST 
			driver.findElement(By.xpath(eaFlipCarouselUtils.Locator.fourth_image_xpath)).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath(eaFlipCarouselUtils.Locator.fifth_image_xpath)).click();
			Thread.sleep(1500);
			
			SnapComImg.snap(driver, eaFlipCarouselUtils.Locator.fifth_image_xpath, "FlipCarousel/last/input.png");
			SnapComImg.comparison(driver, eaFlipCarouselUtils.Locator.fifth_image_xpath, "FlipCarousel/last/input.png", "FlipCarousel/last/output/output.png");
			
			Thread.sleep(2000);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
