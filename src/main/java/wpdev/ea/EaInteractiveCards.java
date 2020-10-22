package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.SnapComImg;
import wpdev.ea.utils.eaInteractiveCardsUtils;

public class EaInteractiveCards {
	public static void eaInteractiveCards(WebDriver driver, String url) {
		driver.get(Config.url + url);
		try {
//			if (Config.go_doc_page == 0) {
			assertEquals(driver.getTitle(), eaInteractiveCardsUtils.TEXT.interationcardpage_title);
			System.out.println("Page title passed !!");

			driver.findElement(By.xpath(eaInteractiveCardsUtils.Locator.documentation_link_path)).click();

			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));

			assertEquals(driver.findElement(By.id(eaInteractiveCardsUtils.Locator.documentation_title_id)).getText(),
					eaInteractiveCardsUtils.TEXT.documentation_page);
			System.out.println("Documentation link passed !!");
			driver.close();

			driver.switchTo().window(tabs2.get(0));
//				
			Thread.sleep(1000);
//			}

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1026)", "");

			WebElement element = driver.findElement(By.xpath("/html/body/div[5]/div/span"));

			Actions actions = new Actions(driver);

			actions.moveToElement(element).click().perform();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath(eaInteractiveCardsUtils.Locator.first_card_xpath)).click();
			Thread.sleep(3000);
			// OPEN FIRST CARD
			assertEquals(driver.findElement(By.xpath(eaInteractiveCardsUtils.Locator.first_header_xpath)).getText(),
					eaInteractiveCardsUtils.TEXT.first_header_text);
			assertEquals(driver.findElement(By.xpath(eaInteractiveCardsUtils.Locator.first_des_xpath)).getText(),
					eaInteractiveCardsUtils.TEXT.first_des_text);
			assertEquals(driver.findElement(By.xpath(eaInteractiveCardsUtils.Locator.first_card_readmore_button_xpath))
					.getText(), eaInteractiveCardsUtils.TEXT.first_card_readmore_button_text);
			System.out.println("First Card passed !!");

			driver.findElement(By.xpath(eaInteractiveCardsUtils.Locator.second_card_xpath)).click();
			Thread.sleep(3000);
			// OPEN SECOND CARD
			assertEquals(driver.findElement(By.xpath(eaInteractiveCardsUtils.Locator.second_header_xpath)).getText(),
					eaInteractiveCardsUtils.TEXT.second_header_text);
			assertEquals(driver.findElement(By.xpath(eaInteractiveCardsUtils.Locator.second_des_xpath)).getText(),
					eaInteractiveCardsUtils.TEXT.second_des_text);
			assertEquals(driver.findElement(By.xpath(eaInteractiveCardsUtils.Locator.second_card_readmore_button_xpath))
					.getText(), eaInteractiveCardsUtils.TEXT.second_card_readmore_button_text);
			System.out.println("Second Card passed !!");

			driver.findElement(By.className("cc-86w0")).click();

			Thread.sleep(1000);
			
			SnapComImg.snap(driver, eaInteractiveCardsUtils.Locator.first_image_xpath, "InteractiveCard/input.png");
			SnapComImg.comparison(driver, eaInteractiveCardsUtils.Locator.first_image_xpath, "InteractiveCard/input.png", "InteractiveCard/output/output.png");
			Thread.sleep(1000);
			// CLOSE CARDS
			driver.findElement(By.xpath(eaInteractiveCardsUtils.Locator.first_close_button_xpath)).click();
			System.out.println("First Card Closed !!");

			driver.findElement(By.xpath(eaInteractiveCardsUtils.Locator.second_close_button_xpath)).click();
			System.out.println("Second Card Closed !!");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
