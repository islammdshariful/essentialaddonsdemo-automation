package wpdev.ea.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Config {

	public static final String url = "https://essential-addons.com/elementor/";
//	public static final String url = "http://wpdemosite.local/";
	public static final int go_doc_page = 1;
	
	public static class closeNotifications{
		public static void floatNotification(WebDriver driver) {
			WebElement element = driver.findElement(By.xpath("/html/body/div[5]/div/span"));
			if(element.isDisplayed()) {
				Actions actions = new Actions(driver);
				actions.moveToElement(element).click().perform();
			}
		}
		
		public static void notificationBar(WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOfElementLocated((By.className("cc-86w0")))));
			driver.findElement(By.className("cc-86w0")).click();
		}
		
		public static void betterdocs(WebDriver driver) {
			driver.findElement(By.className("nx-close")).click();
		}
	}
}
