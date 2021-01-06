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
import wpdev.ea.utils.SnapComImg;
import wpdev.ea.utils.eaCallToActionUtils;
import wpdev.ea.utils.eaInstagramFeedUtils;

public class EaCallToAction {
	public static void eaCallToAction(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);

		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaCallToActionUtils.TEXT.calltoaction_page_title,
					eaCallToActionUtils.Locator.documentation_link_path, eaCallToActionUtils.TEXT.documentation_page);

			
//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1061)", "");

			Thread.sleep(1000);

			softassert.assertEquals(driver.findElement(By.xpath(eaCallToActionUtils.Locator.header_text_xpath)).getText(),
					eaCallToActionUtils.TEXT.header_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaCallToActionUtils.Locator.description_text_xpath)).getText(),
					eaCallToActionUtils.TEXT.description_text);

//			SnapComImg.snap(driver, eaCallToActionUtils.Locator.image_xpath, "callToAction/input.png");
			SnapComImg.comparison(driver, eaCallToActionUtils.Locator.image_xpath, "callToAction/input.png",
					"callToAction/output/output.png");

			WebElement image = driver.findElement(By.xpath(eaCallToActionUtils.Locator.image_xpath));
			if (image.isDisplayed()) {
				System.out.println("Image Passed !!");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
