package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import wpdev.ea.utils.eaTestimonialSliderUtils;

public class EaTestimonialSlider {
	public static void eaTestimonialSlider(WebDriver driver) {

		try {
//			assertEquals(driver.getTitle(), eaTestimonialSliderUtils.TEXT.testimonialslider_page_title);
//			System.out.println("Page title passed !!");
//
//			driver.findElement(By.xpath(eaTestimonialSliderUtils.Locator.documentation_link_path)).click();
//
//			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
//			driver.switchTo().window(tabs2.get(1));
//
//			assertEquals(driver.findElement(By.id(eaTestimonialSliderUtils.Locator.documentation_title_id)).getText(),
//					eaTestimonialSliderUtils.TEXT.documentation_page);
//			System.out.println("Documentation link passed !!");
//			driver.close();
//
//			driver.switchTo().window(tabs2.get(0));
////			
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,998)", "");

			WebElement first_quote_icon = driver
					.findElement(By.xpath(eaTestimonialSliderUtils.Locator.first_testimonial_quote_icon_xpath));
			if (first_quote_icon.isDisplayed()) {
				System.out.println("Quote icon passed !!");
			}
			Thread.sleep(1000);
			assertEquals(driver.findElement(By.xpath(eaTestimonialSliderUtils.Locator.first_testimonial_des_xpath))
					.getText(), eaTestimonialSliderUtils.TEXT.first_testimonial_des_text);
			assertEquals(driver.findElement(By.xpath(eaTestimonialSliderUtils.Locator.first_testimonial_name_xpath))
					.getText(), eaTestimonialSliderUtils.TEXT.first_testimonial_name_text);
			assertEquals(driver.findElement(By.xpath(eaTestimonialSliderUtils.Locator.first_testimonial_company_xpath))
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
