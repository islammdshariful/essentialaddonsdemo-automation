package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaDividerUtils;
import wpdev.ea.utils.eaTestimonialSliderUtils;

public class EaTestimonialSlider {
	public static void eaTestimonialSlider(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);

		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaTestimonialSliderUtils.TEXT.testimonialslider_page_title,
					eaTestimonialSliderUtils.Locator.documentation_link_path, eaTestimonialSliderUtils.TEXT.documentation_page);

//			Config.closeNotifications.floatNotification(driver);
//			Config.closeNotifications.betterdocs(driver);
			Config.closeNotifications.notificationBar(driver);
			
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,998)", "");

			WebElement first_quote_icon = driver
					.findElement(By.xpath(eaTestimonialSliderUtils.Locator.first_testimonial_quote_icon_xpath));
			if (first_quote_icon.isDisplayed()) {
				System.out.println("Quote icon passed !!");
			}
			Thread.sleep(1000);
			softassert.assertEquals(driver.findElement(By.xpath(eaTestimonialSliderUtils.Locator.first_testimonial_des_xpath))
					.getText(), eaTestimonialSliderUtils.TEXT.first_testimonial_des_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaTestimonialSliderUtils.Locator.first_testimonial_name_xpath))
					.getText(), eaTestimonialSliderUtils.TEXT.first_testimonial_name_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaTestimonialSliderUtils.Locator.first_testimonial_company_xpath))
					.getText(), eaTestimonialSliderUtils.TEXT.first_testimonial_company_text);
			WebElement first_ratings_icon = driver
					.findElement(By.xpath(eaTestimonialSliderUtils.Locator.first_testimonial_ratings_xpath));
			if (first_ratings_icon.isDisplayed()) {
				System.out.println("Ratings icon passed !!");
			}
			driver.findElement(By.xpath(eaTestimonialSliderUtils.Locator.navigation_right_xpath)).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(eaTestimonialSliderUtils.Locator.navigation_right_xpath)).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(eaTestimonialSliderUtils.Locator.navigation_left_xpath)).click();
			Thread.sleep(1000); 
			driver.findElement(By.xpath(eaTestimonialSliderUtils.Locator.navigation_left_xpath)).click();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
