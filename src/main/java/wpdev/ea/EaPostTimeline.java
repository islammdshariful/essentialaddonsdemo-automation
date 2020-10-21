package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wpdev.ea.utils.eaPostTimelineUtils;

public class EaPostTimeline {
	public static void eaPostTimeline(WebDriver driver) {
		try {
//			assertEquals(driver.getTitle(), eaPostTimelineUtils.TEXT.posttimeline_page_title);
//			System.out.println("Page title passed !!");
//
//			driver.findElement(By.xpath(eaPostTimelineUtils.Locator.documentation_link_path)).click();
//
//			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
//			driver.switchTo().window(tabs2.get(1));
//
//			assertEquals(driver.findElement(By.id(eaPostTimelineUtils.Locator.documentation_title_id)).getText(),
//					eaPostTimelineUtils.TEXT.documentation_page);
//			System.out.println("Documentation link passed !!");
//			driver.close();
//
//			driver.switchTo().window(tabs2.get(0));
////			
//			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,1057)", "");
			Thread.sleep(1000);

			Actions mousehover = new Actions(driver);
			WebElement post_box_1 = driver.findElement(By.xpath(eaPostTimelineUtils.Locator.first_post_xpath));
			mousehover.moveToElement(post_box_1).build().perform();
			WebElement post_1_hover = driver
					.findElement(By.xpath(eaPostTimelineUtils.Locator.first_post_hover_text_xpath));
			if (post_1_hover.isDisplayed()) {
				assertEquals(post_1_hover.getText(), eaPostTimelineUtils.TEXT.first_post_hover_text);
				System.out.println("First hover text passed !!");
			}
			assertEquals(driver.findElement(By.xpath(eaPostTimelineUtils.Locator.first_post_text_xpath)).getText(),
					eaPostTimelineUtils.TEXT.first_post_text);
			WebElement bullet_1 = driver.findElement(By.xpath(eaPostTimelineUtils.Locator.first_bullet_xpath));
			mousehover.moveToElement(bullet_1).build().perform();
//			Thread.sleep(2000);
			WebElement bullet_1_hover_text = driver
					.findElement(By.xpath(eaPostTimelineUtils.Locator.first_post_hover_text_xpath));
			if (bullet_1_hover_text.isDisplayed()) {
//					assertEquals(post_1_hover.getText(), eaPostTimelineUtils.TEXT.first_post_hover_text);
				System.out.println("First bullet hover text passed !!");
			}

			WebElement post_box_2 = driver.findElement(By.xpath(eaPostTimelineUtils.Locator.second_post_xpath));
			mousehover.moveToElement(post_box_2).build().perform();
			WebElement post_2_hover = driver
					.findElement(By.xpath(eaPostTimelineUtils.Locator.second_post_hover_text_xpath));
			if (post_2_hover.isDisplayed()) {
				assertEquals(post_2_hover.getText(), eaPostTimelineUtils.TEXT.second_post_hover_text);
				System.out.println("Second hover text passed !!");
			}
			assertEquals(driver.findElement(By.xpath(eaPostTimelineUtils.Locator.second_post_text_xpath)).getText(),
					eaPostTimelineUtils.TEXT.second_post_text);
			WebElement bullet_2 = driver.findElement(By.xpath(eaPostTimelineUtils.Locator.second_bullet_xpath));
			mousehover.moveToElement(bullet_2).build().perform();
//			Thread.sleep(2000);
			WebElement bullet_2_hover_text = driver
					.findElement(By.xpath(eaPostTimelineUtils.Locator.second_post_hover_text_xpath));
			if (bullet_2_hover_text.isDisplayed()) {
//					assertEquals(post_1_hover.getText(), eaPostTimelineUtils.TEXT.first_post_hover_text);
				System.out.println("Second bullet hover text passed !!");
			}

			driver.findElement(By.id(eaPostTimelineUtils.Locator.loadmore_button_id)).click();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
