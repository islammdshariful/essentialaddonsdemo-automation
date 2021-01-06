package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaDividerUtils;
import wpdev.ea.utils.eaImageComparisonUtils;

public class EaImageComparison {

	public static int GetPixelsToMove(WebElement slider, float Amount, float SliderMax, float SliderMin) {
		int pixels = 0;
		float tempPixels = slider.getSize().width;
		tempPixels = tempPixels / (SliderMax - SliderMin);
		tempPixels = tempPixels * (Amount - SliderMin);
		pixels = (int) tempPixels;
		return pixels;
	}

	public static void eaImageComparison(WebDriver driver, String url) {
		driver.get(Config.url + url);

		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaImageComparisonUtils.TEXT.onepagenavigation_title,
					eaImageComparisonUtils.Locator.documentation_link_path, eaImageComparisonUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);

			JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1120)", "");
			WebElement element = driver.findElement(By.xpath("//*[@id=\"post-17\"]/div/div/div/div/section[2]/div/div/div/div/div/section/div/div/div/div/div/div[2]/div/div"));
			js.executeScript("arguments[0].scrollIntoView();", element);

			WebElement image = driver.findElement(By.xpath(eaImageComparisonUtils.Locator.image_comparison_box_xpath));
			WebElement before = driver.findElement(By.xpath(eaImageComparisonUtils.Locator.before_xpath));
			WebElement after = driver.findElement(By.xpath(eaImageComparisonUtils.Locator.after_xpath));

			WebElement slider = driver.findElement(By.xpath(eaImageComparisonUtils.Locator.slider_xpath));
			WebElement slider_left_arrow = driver
					.findElement(By.xpath(eaImageComparisonUtils.Locator.slider_left_arrow_xpath));
			WebElement slider_right_arrow = driver
					.findElement(By.xpath(eaImageComparisonUtils.Locator.slider_right_arrow_xpath));

			Thread.sleep(2000);
			Actions mousehover = new Actions(driver);
			mousehover.moveToElement(image).build().perform();

			if (before.isDisplayed() && after.isDisplayed()) {
				System.out.println("Before and After text passed !!");
			}

			if (slider_left_arrow.isDisplayed() && slider_right_arrow.isDisplayed()) {
				System.out.println("Slider icon passed !!");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
