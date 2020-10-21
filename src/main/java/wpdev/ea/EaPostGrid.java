package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wpdev.ea.utils.eaPostGridUtils;

public class EaPostGrid {
	public static void eaPostGrid(WebDriver driver) {

		try {
			assertEquals(driver.getTitle(), eaPostGridUtils.TEXT.postgird_page_title);
			System.out.println("Page title passed !!");

			driver.findElement(By.xpath(eaPostGridUtils.Locator.documentation_link_path)).click();

			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));

			assertEquals(driver.findElement(By.id(eaPostGridUtils.Locator.documentation_title_id)).getText(),
					eaPostGridUtils.TEXT.documentation_page);
			System.out.println("Documentation link passed !!");
			driver.close();

			driver.switchTo().window(tabs2.get(0));

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1053)", "");

			Thread.sleep(1000);
			Actions mousehover = new Actions(driver);

			// POST GRID
			WebElement post = driver.findElement(By.xpath(eaPostGridUtils.Locator.first_post_hover_xpath));
			mousehover.moveToElement(post).build().perform();
			WebElement icon = driver.findElement(By.xpath(eaPostGridUtils.Locator.first_post_icon_xpath));
			if (icon.isDisplayed()) {
				System.out.println("Post grid icon passed !!");
			}

			String post_header = driver.findElement(By.xpath(eaPostGridUtils.Locator.first_post_header_xpath))
					.getText();
			driver.findElement(By.xpath(eaPostGridUtils.Locator.first_post_header_xpath)).click();
			assertEquals(driver.findElement(By.xpath(eaPostGridUtils.Locator.first_post_page_title_xpath)).getText(),
					post_header);
			System.out.println("Post grid First post passed !!");
			driver.navigate().back();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
