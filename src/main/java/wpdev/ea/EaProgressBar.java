package wpdev.ea;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.SnapComImg;
import wpdev.ea.utils.eaProgressBarUtils;

public class EaProgressBar {
	public static void eaProgressBar(WebDriver driver, String url) {
		driver.get(Config.url + url);
		SoftAssert softassert = new SoftAssert();
		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaProgressBarUtils.TEXT.progressbar_title,
					eaProgressBarUtils.Locator.documentation_link_path, eaProgressBarUtils.TEXT.documentation_page);
			
			Config.checkdocandheadtitle.headercheck(driver, eaProgressBarUtils.Locator.header_text_xpath,
					eaProgressBarUtils.TEXT.header_text_text, eaProgressBarUtils.Locator.header_des_xpath,
					eaProgressBarUtils.TEXT.header_des_text);

//			Config.closeNotifications.betterdocs(driver);
			Config.closeNotifications.notificationBar(driver);
			Config.closeNotifications.floatNotification(driver);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,988)", "");

			Thread.sleep(2000);
			
			softassert.assertEquals(driver.findElement(By.xpath(eaProgressBarUtils.Locator.photoshop_progressbar_text_xpath)).getText(), eaProgressBarUtils.TEXT.photoshop_progressbar_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaProgressBarUtils.Locator.photoshop_progressbar_number_xpath)).getText(), eaProgressBarUtils.TEXT.photoshop_progressbar_number);
			
			softassert.assertEquals(driver.findElement(By.xpath(eaProgressBarUtils.Locator.contentwritinng_progressbar_text_xpath)).getText(), eaProgressBarUtils.TEXT.contentwritinng_progressbar_text);
			softassert.assertEquals(driver.findElement(By.xpath(eaProgressBarUtils.Locator.contentwritinng_progressbar_number_xpath)).getText(), eaProgressBarUtils.TEXT.contentwritinng_progressbar_number);
			
//			SnapComImg.snap(driver, eaProgressBarUtils.Locator.photoshop_progressbar_text_xpath, "ProgressBar/input.png");
			SnapComImg.comparison(driver, eaProgressBarUtils.Locator.photoshop_progressbar_text_xpath, "ProgressBar/input.png", "ProgressBar/output/input.png");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
