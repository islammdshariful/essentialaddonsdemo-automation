package wpdev.ea.utils;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Config {

	public static final String url = "https://essential-addons.com/elementor/";
//	public static final String url = "http://wpdemosite.local/";
	public static final int go_doc_page = 1;

	
	public static class checkdocandheadtitle {
		
		public static void checkdoc(WebDriver driver, String pagetitle, String doclink, String doctitle) {
			SoftAssert softassert = new SoftAssert();
			try {
				if (Config.go_doc_page == 1) {
//					if (pagetitle == driver.getTitle() || "?1 - "+pagetitle == driver.getTitle()) {
//						System.out.print("Page Title Passed!");
//					}
//					softassert.assertEquals(driver.getTitle(), pagetitle);

					driver.findElement(By.xpath(doclink)).click();

					ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
					driver.switchTo().window(tabs2.get(1));

					softassert.assertEquals(
							driver.findElement(By.id("betterdocs-entry-title")).getText(),
							doctitle);
					System.out.println("Documentation link passed !!");
					driver.close();

					driver.switchTo().window(tabs2.get(0));

					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			softassert.assertAll();
		}
		
		public static void headercheck(WebDriver driver, String headerxpath, String headertex, String desxpath, String destext) {
			assertEquals(driver.findElement(By.xpath(headerxpath)).getText(),
					headertex);
			assertEquals(driver.findElement(By.xpath(desxpath)).getText(),
					destext);
			System.out.println("Header text passed !!");
		}
	}

	public static void invokeBrowser(WebDriver driver) {
		driver = wpdev.ea.utils.DriverManager.driver;
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	public static class closeNotifications{
		public static void floatNotification(WebDriver driver) {
//			WebElement element = driver.findElement(By.xpath("/html/body/div[5]/div/span"));
//			if(element.isDisplayed()) {
//				Actions actions = new Actions(driver);
//				actions.moveToElement(element).click().perform();
//			}
		}
		
		public static void betterdocs(WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOfElementLocated((By.className("cc-86w0")))));
			driver.findElement(By.className("cc-86w0")).click();
		}
		
		public static void notificationBar(WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOfElementLocated((By.className("nx-close")))));
			driver.findElement(By.className("nx-close")).click();
		}
	}
}
