package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaDividerUtils;
import wpdev.ea.utils.eaTestimonialsUtils;

public class EaTestimonials {

	public static void eaTestimonials(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);

		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaTestimonialsUtils.TEXT.testimonial_page_title,
					eaTestimonialsUtils.Locator.documentation_link_path, eaTestimonialsUtils.TEXT.documentation_page);

//			Config.closeNotifications.floatNotification(driver);
//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
			
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1166)", "");

			Thread.sleep(3000);

			softassert.assertEquals(driver.findElement(By.xpath(eaTestimonialsUtils.Locator.first_emp_details_xpath)).getText(),
					eaTestimonialsUtils.TEXT.first_emp_details_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaTestimonialsUtils.Locator.first_emp_name_xpath)).getText(),
					eaTestimonialsUtils.TEXT.first_emp_name_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaTestimonialsUtils.Locator.first_emp_company_xpath)).getText(),
					eaTestimonialsUtils.TEXT.first_emp_company_text);
			System.out.println("User info passed !!");

			WebElement emp_ratings = driver.findElement(By.xpath(eaTestimonialsUtils.Locator.first_emp_ratings_xpath));
			if (emp_ratings.isDisplayed()) {
				System.out.println("User ratings passed !!");
			} else {
				System.out.println("User ratings failed !!");
			}

			Thread.sleep(2000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
