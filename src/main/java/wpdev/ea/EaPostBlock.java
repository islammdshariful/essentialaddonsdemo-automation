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
import wpdev.ea.utils.eaPostBlockUtils;

public class EaPostBlock {
	public static void eaPostBlock(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);
		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaPostBlockUtils.TEXT.postblock_page_title,
					eaPostBlockUtils.Locator.documentation_link_path, eaPostBlockUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement element = driver.findElement(By.xpath("//*[@id=\"post-1347\"]/div/div/div/div/section[2]/div/div/div/div/div/section/div/div/div[2]/div/div/div[2]/div/div"));
//			js.executeScript("window.scrollBy(0,1089)", "");
			js.executeScript("arguments[0].scrollIntoView();", element);

			Thread.sleep(1000);
			Actions mousehover = new Actions(driver);
			WebElement post = driver.findElement(By.xpath(eaPostBlockUtils.Locator.first_post_hover_xpath));
			mousehover.moveToElement(post).build().perform();
			WebElement icon = driver.findElement(By.xpath(eaPostBlockUtils.Locator.first_post_icon_xpath));
			if (icon.isDisplayed()) {
				System.out.println("Post Icon passed !!");
			}else {
				System.out.println("Post Icon NOT passed !!");
			}

			String post_title = driver.findElement(By.xpath(eaPostBlockUtils.Locator.first_post_header_xpath))
					.getText();
			driver.findElement(By.xpath(eaPostBlockUtils.Locator.first_post_header_xpath)).click();
			softassert.assertEquals(driver.findElement(By.xpath(eaPostBlockUtils.Locator.first_post_page_title_xpath)).getText(),
					post_title);
			System.out.println("Post Block Header Title Passed !!");
			driver.navigate().back();
			WebElement aurthor_img = driver
					.findElement(By.xpath(eaPostBlockUtils.Locator.first_post_author_image_xpath));
			if (aurthor_img.isDisplayed()) {
				System.out.println("Aurthor Image Passed !!");
			}else {
				System.out.println("Aurthor Image NOT Passed !!");
			}
			
			String aurthor_name = driver.findElement(By.xpath(eaPostBlockUtils.Locator.first_post_author_name_xpath))
					.getText();
			driver.findElement(By.xpath(eaPostBlockUtils.Locator.first_post_author_name_xpath)).click();
			softassert.assertEquals(driver.findElement(By.xpath(eaPostBlockUtils.Locator.first_post_aurthor_profile_name_xpath))
					.getText(), aurthor_name);
			System.out.println("Aurthor name Passed !!");
			driver.navigate().back();
			Thread.sleep(1000);
			softassert.assertAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
