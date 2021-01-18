package testcases;

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
import utils.eaDividerUtils;
import utils.eaTeamMemberUtils;

public class EaTeamMember {
	public static void eaTeamMember(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);

		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaTeamMemberUtils.TEXT.teammember_page_title,
					eaTeamMemberUtils.Locator.documentation_link_path, eaTeamMemberUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1092)", "");

			Thread.sleep(1000);
			WebElement firsttmimage = driver
					.findElement(By.xpath(eaTeamMemberUtils.Locator.first_temamember_image_xpath));
			if (firsttmimage.isDisplayed()) {
				System.out.println("First team memeber Image passed !!");
			} else {
				System.out.println("First team memeber Image failed !!");
			}
			softassert.assertEquals(driver.findElement(By.xpath(eaTeamMemberUtils.Locator.first_teammember_name_xpath)).getText(),
					eaTeamMemberUtils.TEXT.first_teammember_name_text);
			System.out.println("First team memeber name passed !!");

			softassert.assertEquals(driver.findElement(By.xpath(eaTeamMemberUtils.Locator.first_teammember_job_xpath)).getText(),
					eaTeamMemberUtils.TEXT.first_teammember_job_text);
			System.out.println("First team memeber job passed !!");

			WebElement twicon = driver.findElement(By.xpath(eaTeamMemberUtils.Locator.first_teammember_twicon_xpath));
			WebElement skyicon = driver.findElement(By.xpath(eaTeamMemberUtils.Locator.first_teammember_skyicon_xpath));
			WebElement linkicon = driver
					.findElement(By.xpath(eaTeamMemberUtils.Locator.first_teammember_linkicon_xpath));
			WebElement ficon = driver.findElement(By.xpath(eaTeamMemberUtils.Locator.first_teammember_ficon_xpath));

			if (twicon.isDisplayed()) {
				System.out.println("Twitter passed !!");

			} else {
				System.out.println("Twitter not passed !!");

			}
			if (skyicon.isDisplayed()) {
				System.out.println("Skype passed !!");

			} else {
				System.out.println("Skype not passed !!");

			}
			if (linkicon.isDisplayed()) {
				System.out.println("Linkedin passed !!");

			} else {
				System.out.println("Linkedin not passed !!");

			}
			if (ficon.isDisplayed()) {
				System.out.println("Facebook passed !!");

			} else {
				System.out.println("Facebook not passed !!");
			}

//			comparison(driver);
			softassert.assertAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
