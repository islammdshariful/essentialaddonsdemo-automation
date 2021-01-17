package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaDividerUtils;
import wpdev.ea.utils.eaPostGridUtils;

public class EaPostGrid {
	public static void eaPostGrid(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);
		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaPostGridUtils.TEXT.postgird_page_title,
					eaPostGridUtils.Locator.documentation_link_path, eaPostGridUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
			
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1100)", "");

			Thread.sleep(1000);
			Actions mousehover = new Actions(driver);

			// POST GRID
			Thread.sleep(1000);
			WebElement post = driver.findElement(By.xpath(eaPostGridUtils.Locator.first_post_hover_xpath));
			mousehover.moveToElement(post).build().perform();
			WebElement icon = driver.findElement(By.xpath(eaPostGridUtils.Locator.first_post_icon_xpath));
			if (icon.isDisplayed()) {
				System.out.println("Post grid icon passed !!");
			}else {
				System.out.println("Post grid icon NOT passed !!");
			}

			String post_header = driver.findElement(By.xpath(eaPostGridUtils.Locator.first_post_header_xpath))
					.getText();
			driver.findElement(By.xpath(eaPostGridUtils.Locator.first_post_header_xpath)).click();
			Thread.sleep(1000);
			softassert.assertEquals(driver.findElement(By.xpath(eaPostGridUtils.Locator.first_post_page_title_xpath)).getText(),
					post_header);
			
			driver.navigate().back();

			js.executeScript("window.scrollBy(0,1725)", "");
	
			driver.findElement(By.id(eaPostGridUtils.Locator.loadmore_button_id)).click();
			
			Thread.sleep(1000);
			softassert.assertAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
