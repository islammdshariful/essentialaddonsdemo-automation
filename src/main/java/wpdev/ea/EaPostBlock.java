package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wpdev.ea.utils.eaPostBlockUtils;

public class EaPostBlock {
	public static void eaPostBlock(WebDriver driver) {

		try {
			assertEquals(driver.getTitle(), eaPostBlockUtils.TEXT.postblock_page_title);
			System.out.println("Page title passed !!");

			driver.findElement(By.xpath(eaPostBlockUtils.Locator.documentation_link_path)).click();

			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));

			assertEquals(driver.findElement(By.id(eaPostBlockUtils.Locator.documentation_title_id)).getText(),
					eaPostBlockUtils.TEXT.documentation_page);
			System.out.println("Documentation link passed !!");
			driver.close();

			driver.switchTo().window(tabs2.get(0));

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1114)", "");

			Thread.sleep(1000);
			Actions mousehover = new Actions(driver);
			WebElement post = driver.findElement(By.xpath(eaPostBlockUtils.Locator.first_post_hover_xpath));
			mousehover.moveToElement(post).build().perform();
			WebElement icon = driver.findElement(By.xpath(eaPostBlockUtils.Locator.first_post_icon_xpath));
			if (icon.isDisplayed()) {
				System.out.println("Post Icon passed !!");
			}

			String post_title = driver.findElement(By.xpath(eaPostBlockUtils.Locator.first_post_header_xpath))
					.getText();
			driver.findElement(By.xpath(eaPostBlockUtils.Locator.first_post_header_xpath)).click();
			assertEquals(driver.findElement(By.xpath(eaPostBlockUtils.Locator.first_post_page_title_xpath)).getText(),
					post_title);
			System.out.println("Post Block Header Title Passed !!");
			driver.navigate().back();
			WebElement aurthor_img = driver
					.findElement(By.xpath(eaPostBlockUtils.Locator.first_post_author_image_xpath));
			if (aurthor_img.isDisplayed()) {
				System.out.println("Aurthor Image Passed !!");
			}
			String aurthor_name = driver.findElement(By.xpath(eaPostBlockUtils.Locator.first_post_author_name_xpath))
					.getText();
			driver.findElement(By.xpath(eaPostBlockUtils.Locator.first_post_author_name_xpath)).click();
			assertEquals(driver.findElement(By.xpath(eaPostBlockUtils.Locator.first_post_aurthor_profile_name_xpath))
					.getText(), aurthor_name);
			System.out.println("Aurthor name Passed !!");
			driver.navigate().back();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
