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

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaTestimonialsUtils;

public class EaTestimonials {
	public static void comparison(WebDriver driver) {
		try {

			WebElement logoImageElement_snap = driver
					.findElement(By.xpath(eaTestimonialsUtils.Locator.first_emp_image_xpath));
			Screenshot logoImageScreenshot_snap = new AShot().coordsProvider(new WebDriverCoordsProvider())
					.takeScreenshot(driver, logoImageElement_snap);
			ImageIO.write(logoImageScreenshot_snap.getImage(), "png",
					new File(System.getProperty("user.dir") + "/forCompareImage/icon.png"));
			File file = new File(System.getProperty("user.dir") + "/forCompareImage/icon.png");

			if (file.exists()) {
				System.out.println("Image File Captured");
			} else {
				System.out.println("Image File NOT exist");
			}

			BufferedImage expectedImage = ImageIO
					.read(new File(System.getProperty("user.dir") + "/forCompareImage/icon.png"));

			WebElement logoImageElement_com = driver
					.findElement(By.xpath(eaTestimonialsUtils.Locator.first_emp_image_xpath));
			Screenshot logoImageScreenshot_com = new AShot().coordsProvider(new WebDriverCoordsProvider())
					.takeScreenshot(driver, logoImageElement_com);
			BufferedImage actualImage = logoImageScreenshot_com.getImage();

			ImageDiffer imgDiff = new ImageDiffer(); // A special class to compare images
			ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);
			if (diff.hasDiff() == true) {
				System.out.println("Images are NOT Same");
			} else {
				System.out.println("Images are Same");
			}

//			Thread.sleep(5000);
//			driver.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void eaTestimonials(WebDriver driver) {

		try {
//				assertEquals(driver.getTitle(), eaTestimonialsUtils.TEXT.testimonial_page_title);
//				System.out.println("Page title passed !!");
//				
//				driver.findElement(By.xpath(eaTestimonialsUtils.Locator.documentation_link_path)).click();
//				
//				ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//				driver.switchTo().window(tabs2.get(1));
//				
//				assertEquals(driver.findElement(By.id(eaTestimonialsUtils.Locator.documentation_title_id)).getText(), eaTestimonialsUtils.TEXT.documentation_page);
//				System.out.println("Documentation link passed !!");
//				driver.close();
//				
//				driver.switchTo().window(tabs2.get(0));
//				
//				Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1166)", "");

			Thread.sleep(3000);

			assertEquals(driver.findElement(By.xpath(eaTestimonialsUtils.Locator.first_emp_details_xpath)).getText(),
					eaTestimonialsUtils.TEXT.first_emp_details_text);
			assertEquals(driver.findElement(By.xpath(eaTestimonialsUtils.Locator.first_emp_name_xpath)).getText(),
					eaTestimonialsUtils.TEXT.first_emp_name_text);
			assertEquals(driver.findElement(By.xpath(eaTestimonialsUtils.Locator.first_emp_company_xpath)).getText(),
					eaTestimonialsUtils.TEXT.first_emp_company_text);
			System.out.println("User info passed !!");

			WebElement emp_ratings = driver.findElement(By.xpath(eaTestimonialsUtils.Locator.first_emp_ratings_xpath));
			if (emp_ratings.isDisplayed()) {
				System.out.println("User ratings passed !!");
			} else {
				System.out.println("User ratings failed !!");
			}

			Thread.sleep(5000);

			comparison(driver);
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void eaTestimonials(WebDriver driver, String pageurl) {
		driver.get(Config.url + pageurl);
		try {
//			assertEquals(driver.getTitle(), eaTestimonialsUtils.TEXT.testimonial_page_title);
//			System.out.println("Page title passed !!");
//			
//			driver.findElement(By.xpath(eaTestimonialsUtils.Locator.documentation_link_path)).click();
//			
//			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//			driver.switchTo().window(tabs2.get(1));
//			
//			assertEquals(driver.findElement(By.id(eaTestimonialsUtils.Locator.documentation_title_id)).getText(), eaTestimonialsUtils.TEXT.documentation_page);
//			System.out.println("Documentation link passed !!");
//			driver.close();
//			
//			driver.switchTo().window(tabs2.get(0));
//			
//			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1166)", "");

			Thread.sleep(3000);

			assertEquals(driver.findElement(By.xpath(eaTestimonialsUtils.Locator.first_emp_details_xpath)).getText(),
					eaTestimonialsUtils.TEXT.first_emp_details_text);
			assertEquals(driver.findElement(By.xpath(eaTestimonialsUtils.Locator.first_emp_name_xpath)).getText(),
					eaTestimonialsUtils.TEXT.first_emp_name_text);
			assertEquals(driver.findElement(By.xpath(eaTestimonialsUtils.Locator.first_emp_company_xpath)).getText(),
					eaTestimonialsUtils.TEXT.first_emp_company_text);
			System.out.println("User info passed !!");

			WebElement emp_ratings = driver.findElement(By.xpath(eaTestimonialsUtils.Locator.first_emp_ratings_xpath));
			if (emp_ratings.isDisplayed()) {
				System.out.println("User ratings passed !!");
			} else {
				System.out.println("User ratings failed !!");
			}

//			Thread.sleep(5000);

//			comparison(driver);
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
