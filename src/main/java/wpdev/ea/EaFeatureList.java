package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaFeatureListUtils;

public class EaFeatureList {
	public static void eaFeatureList(WebDriver driver) {

		try {
			assertEquals(driver.getTitle(), eaFeatureListUtils.TEXT.featurelist_page_title);
			System.out.println("Page title passed !!");

			driver.findElement(By.xpath(eaFeatureListUtils.Locator.documentation_link_path)).click();

			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));

			assertEquals(driver.findElement(By.id(eaFeatureListUtils.Locator.documentation_title_id)).getText(),
					eaFeatureListUtils.TEXT.documentation_page);
			System.out.println("Documentation link passed !!");
			driver.close();

			driver.switchTo().window(tabs2.get(0));

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,953)", "");

			// FIRST LIST ITEM
			WebElement first_list = driver.findElement(By.xpath(eaFeatureListUtils.Locator.first_list_icon_xpath));
			if (first_list.isDisplayed()) {
				System.out.println("First icon  passed !!");
			} else {
				System.out.println("First icon  Failed !!");
			}
			assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.first_list_name_xpath)).getText(),
					eaFeatureListUtils.TEXT.first_list_name_text);
			assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.first_list_des_xpath)).getText(),
					eaFeatureListUtils.TEXT.first_list_des_text);

			// SECOND LIST ITEM
			WebElement second_list = driver.findElement(By.xpath(eaFeatureListUtils.Locator.second_list_icon_xpath));
			if (second_list.isDisplayed()) {
				System.out.println("Second icon  passed !!");
			} else {
				System.out.println("Second icon  Failed !!");
			}
			assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.second_list_name_xpath)).getText(),
					eaFeatureListUtils.TEXT.second_list_name_text);
			assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.second_list_des_xpath)).getText(),
					eaFeatureListUtils.TEXT.second_list_des_text);

			// THIRD LIST ITEM
			WebElement third_list = driver.findElement(By.xpath(eaFeatureListUtils.Locator.third_list_icon_xpath));
			if (third_list.isDisplayed()) {
				System.out.println("Third icon  passed !!");
			} else {
				System.out.println("Third icon  Failed !!");
			}
			assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.third_list_name_xpath)).getText(),
					eaFeatureListUtils.TEXT.third_list_name_text);
			assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.third_list_des_xpath)).getText(),
					eaFeatureListUtils.TEXT.third_list_des_text);

			// FOURTH LIST ITEM
			WebElement fourth_list = driver.findElement(By.xpath(eaFeatureListUtils.Locator.fourth_list_icon_xpath));
			if (fourth_list.isDisplayed()) {
				System.out.println("Fourth icon  passed !!");
			} else {
				System.out.println("Fourth icon  Failed !!");
			}
			assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.fourth_list_name_xpath)).getText(),
					eaFeatureListUtils.TEXT.fourth_list_name_text);
			assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.fourth_list_des_xpath)).getText(),
					eaFeatureListUtils.TEXT.fourth_list_des_text);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void eaFeatureList(WebDriver driver, String pageurl) {
		driver.get(Config.url + pageurl);
		try {
			assertEquals(driver.getTitle(), eaFeatureListUtils.TEXT.featurelist_page_title);
			System.out.println("Page title passed !!");

			driver.findElement(By.xpath(eaFeatureListUtils.Locator.documentation_link_path)).click();

			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));

			assertEquals(driver.findElement(By.id(eaFeatureListUtils.Locator.documentation_title_id)).getText(),
					eaFeatureListUtils.TEXT.documentation_page);
			System.out.println("Documentation link passed !!");
			driver.close();

			driver.switchTo().window(tabs2.get(0));

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,953)", "");

			// FIRST LIST ITEM
			WebElement first_list = driver.findElement(By.xpath(eaFeatureListUtils.Locator.first_list_icon_xpath));
			if (first_list.isDisplayed()) {
				System.out.println("First icon  passed !!");
			} else {
				System.out.println("First icon  Failed !!");
			}
			assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.first_list_name_xpath)).getText(),
					eaFeatureListUtils.TEXT.first_list_name_text);
			assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.first_list_des_xpath)).getText(),
					eaFeatureListUtils.TEXT.first_list_des_text);

			// SECOND LIST ITEM
			WebElement second_list = driver.findElement(By.xpath(eaFeatureListUtils.Locator.second_list_icon_xpath));
			if (second_list.isDisplayed()) {
				System.out.println("Second icon  passed !!");
			} else {
				System.out.println("Second icon  Failed !!");
			}
			assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.second_list_name_xpath)).getText(),
					eaFeatureListUtils.TEXT.second_list_name_text);
			assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.second_list_des_xpath)).getText(),
					eaFeatureListUtils.TEXT.second_list_des_text);

			// THIRD LIST ITEM
			WebElement third_list = driver.findElement(By.xpath(eaFeatureListUtils.Locator.third_list_icon_xpath));
			if (third_list.isDisplayed()) {
				System.out.println("Third icon  passed !!");
			} else {
				System.out.println("Third icon  Failed !!");
			}
			assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.third_list_name_xpath)).getText(),
					eaFeatureListUtils.TEXT.third_list_name_text);
			assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.third_list_des_xpath)).getText(),
					eaFeatureListUtils.TEXT.third_list_des_text);

			// FOURTH LIST ITEM
			WebElement fourth_list = driver.findElement(By.xpath(eaFeatureListUtils.Locator.fourth_list_icon_xpath));
			if (fourth_list.isDisplayed()) {
				System.out.println("Fourth icon  passed !!");
			} else {
				System.out.println("Fourth icon  Failed !!");
			}
			assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.fourth_list_name_xpath)).getText(),
					eaFeatureListUtils.TEXT.fourth_list_name_text);
			assertEquals(driver.findElement(By.xpath(eaFeatureListUtils.Locator.fourth_list_des_xpath)).getText(),
					eaFeatureListUtils.TEXT.fourth_list_des_text);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
