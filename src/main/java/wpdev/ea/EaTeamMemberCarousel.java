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
import wpdev.ea.utils.eaTeamMemberCarouselUtils;

public class EaTeamMemberCarousel {
	public static void eaTeamMemberCarousel(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);

		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaTeamMemberCarouselUtils.TEXT.teammembercarousel_page_title,
					eaTeamMemberCarouselUtils.Locator.documentation_link_path, eaTeamMemberCarouselUtils.TEXT.documentation_page);

			Config.closeNotifications.floatNotification(driver);
//			Config.closeNotifications.betterdocs(driver);
			Config.closeNotifications.notificationBar(driver);
			
			Thread.sleep(1000);

			Actions mousehover = new Actions(driver);

			// MEMBER 1
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1044); behavior:'smooth';", "");
			Thread.sleep(2000);
			WebElement member1 = driver.findElement(By.xpath(eaTeamMemberCarouselUtils.Locator.member_image_xpath));
			mousehover.moveToElement(member1).build().perform();
			WebElement member_1_fb_icon = driver
					.findElement(By.xpath(eaTeamMemberCarouselUtils.Locator.member_social_fb_xpath));
			if (member_1_fb_icon.isDisplayed()) {
				System.out.println("Facebook link passed !!");
			}
			WebElement member_1_tw_icon = driver
					.findElement(By.xpath(eaTeamMemberCarouselUtils.Locator.member_social_tw_xpath));
			if (member_1_tw_icon.isDisplayed()) {
				System.out.println("Twitter link passed !!");
			}
			WebElement member_1_in_icon = driver
					.findElement(By.xpath(eaTeamMemberCarouselUtils.Locator.member_social_in_xpath));
			if (member_1_in_icon.isDisplayed()) {
				System.out.println("LinkedIn link passed !!");
			}
			softassert.assertEquals(driver.findElement(By.xpath(eaTeamMemberCarouselUtils.Locator.member_name_xpath)).getText(),
					eaTeamMemberCarouselUtils.TEXT.memeber_name_text);
			softassert.assertEquals(
					driver.findElement(By.xpath(eaTeamMemberCarouselUtils.Locator.memeber_position_xpath)).getText(),
					eaTeamMemberCarouselUtils.TEXT.memeber_position_text);
			softassert.assertAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
