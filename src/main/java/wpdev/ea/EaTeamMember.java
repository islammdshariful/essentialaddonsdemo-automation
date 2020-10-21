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
import wpdev.ea.utils.eaTeamMemberUtils;

public class EaTeamMember {
	public static void comparison(WebDriver driver) {
		try {

			WebElement logoImageElement_snap = driver
					.findElement(By.xpath(eaTeamMemberUtils.Locator.first_temamember_image_xpath));
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
					.findElement(By.xpath(eaTeamMemberUtils.Locator.first_temamember_image_xpath));
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

			Thread.sleep(5000);
			driver.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void eaTeamMember(WebDriver driver) {
		try {
//			assertEquals(driver.getTitle(), eaTeamMemberUtils.TEXT.teammember_page_title);
//			System.out.println("Page title passed !!");
//
//			driver.findElement(By.xpath(eaTeamMemberUtils.Locator.documentation_link_path)).click();
//
//			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
//			driver.switchTo().window(tabs2.get(1));
//
//			assertEquals(driver.findElement(By.id(eaTeamMemberUtils.Locator.documentation_title_id)).getText(),
//					eaTeamMemberUtils.TEXT.documentation_page);
//			System.out.println("Documentation link passed !!");
//			driver.close();
//
//			driver.switchTo().window(tabs2.get(0));

			Thread.sleep(1000);

//			JavascriptExecutor js = (JavascriptExecutor) driver;
//
//			js.executeScript("window.scrollBy(0,1045)", "");

//			comparison(driver);

			WebElement firsttmimage = driver
					.findElement(By.xpath(eaTeamMemberUtils.Locator.first_temamember_image_xpath));
			if (firsttmimage.isDisplayed()) {
				System.out.println("First team memeber Image passed !!");
			} else {
				System.out.println("First team memeber Image failed !!");
			}
			assertEquals(driver.findElement(By.xpath(eaTeamMemberUtils.Locator.first_teammember_name_xpath)).getText(),
					eaTeamMemberUtils.TEXT.first_teammember_name_text);
			System.out.println("First team memeber name passed !!");

			assertEquals(driver.findElement(By.xpath(eaTeamMemberUtils.Locator.first_teammember_job_xpath)).getText(),
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

			comparison(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void eaTeamMember(WebDriver driver, String pageurl) {
		driver.get(Config.url + pageurl);
		try {
//			assertEquals(driver.getTitle(), eaTeamMemberUtils.TEXT.teammember_page_title);
//			System.out.println("Page title passed !!");
//
//			driver.findElement(By.xpath(eaTeamMemberUtils.Locator.documentation_link_path)).click();
//
//			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
//			driver.switchTo().window(tabs2.get(1));
//
//			assertEquals(driver.findElement(By.id(eaTeamMemberUtils.Locator.documentation_title_id)).getText(),
//					eaTeamMemberUtils.TEXT.documentation_page);
//			System.out.println("Documentation link passed !!");
//			driver.close();
//
//			driver.switchTo().window(tabs2.get(0));

			Thread.sleep(1000);

//			JavascriptExecutor js = (JavascriptExecutor) driver;
//
//			js.executeScript("window.scrollBy(0,1045)", "");

//			comparison(driver);
			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1092)", "");

			WebElement firsttmimage = driver
					.findElement(By.xpath(eaTeamMemberUtils.Locator.first_temamember_image_xpath));
			if (firsttmimage.isDisplayed()) {
				System.out.println("First team memeber Image passed !!");
			} else {
				System.out.println("First team memeber Image failed !!");
			}
			assertEquals(driver.findElement(By.xpath(eaTeamMemberUtils.Locator.first_teammember_name_xpath)).getText(),
					eaTeamMemberUtils.TEXT.first_teammember_name_text);
			System.out.println("First team memeber name passed !!");

			assertEquals(driver.findElement(By.xpath(eaTeamMemberUtils.Locator.first_teammember_job_xpath)).getText(),
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

			comparison(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
