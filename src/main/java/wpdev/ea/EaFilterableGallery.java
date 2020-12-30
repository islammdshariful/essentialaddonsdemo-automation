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
import wpdev.ea.utils.eaFilterableGalleryUtils;

public class EaFilterableGallery {

	public static void gallery(WebDriver driver, WebElement photo, WebElement header, WebElement icon, String tab,
			String number, SoftAssert softassert) {
		try {
			Actions cursor = new Actions(driver);
			cursor.moveToElement(photo).build().perform();
			Thread.sleep(1000);
			if (header.isDisplayed()) {
				softassert.assertEquals(header.getText(), eaFilterableGalleryUtils.TEXT.hover_text);
				System.out.println(tab + " Tab " + number + " First Photo Header Passed !!");
				if (icon.isDisplayed()) {
					System.out.println(tab + " Tab " + number + " Photo Icon Passed !!");
					icon.click();
					Thread.sleep(1000);

					// NAVIGATION
					WebElement left_arrow = driver
							.findElement(By.xpath(eaFilterableGalleryUtils.Locator.zoom_photo_left_arrow_xpath));
					WebElement right_arrow = driver
							.findElement(By.xpath(eaFilterableGalleryUtils.Locator.zoom_photo_right_arrow_xpath));
					WebElement cross_button = driver
							.findElement(By.xpath(eaFilterableGalleryUtils.Locator.zoom_photo_cross_button_xpath));

					right_arrow.click();
					Thread.sleep(1000);
					left_arrow.click();
					Thread.sleep(1000);
					cross_button.click();
					System.out.println(tab + " Tab " + number + " Photo Zoom Gallery Passed !!");
				}
			}
			softassert.assertAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void eaFilterableGallery(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);

		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaFilterableGalleryUtils.TEXT.filterable_title,
					eaFilterableGalleryUtils.Locator.documentation_link_path, eaFilterableGalleryUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
			Config.closeNotifications.notificationBar(driver);
			Config.closeNotifications.floatNotification(driver);
			Thread.sleep(1000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1062)", "");

			// HEADER
			assertEquals(driver.findElement(By.xpath(eaFilterableGalleryUtils.Locator.header_text_xpath)).getText(),
					eaFilterableGalleryUtils.TEXT.header_text_text);
			assertEquals(driver.findElement(By.xpath(eaFilterableGalleryUtils.Locator.header_des_xpath)).getText(),
					eaFilterableGalleryUtils.TEXT.header_des_text);
			System.out.println("Header text passed !!");

			// PHOTO
			WebElement all_first_photo = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.all_tab_first_photo_xpath));
			WebElement all_second_photo = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.all_tab_second_photo_xpath));
			WebElement all_third_photo = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.all_tab_third_photo_xpath));

			WebElement news_first_photo = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.news_tab_first_photo_xpath));
			WebElement news_second_photo = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.news_tab_second_photo_xpath));

			WebElement updates_first_photo = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.updates_tab_first_photo_xpath));
			WebElement updates_second_photo = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.updates_tab_second_photo_xpath));

			WebElement events_first_photo = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.events_tab_first_photo_xpath));
			WebElement events_second_photo = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.events_tab_second_photo_xpath));

			WebElement masonry_first_photo = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.masonry_tab_first_photo_xpath));
			WebElement masonry_second_photo = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.masonry_tab_second_photo_xpath));

			// HEADER
			WebElement all_first_header = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.all_1_hover_text_xpath));
			WebElement all_second_header = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.all_2_hover_text_xpath));
			WebElement all_third_header = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.all_3_hover_text_xpath));

			WebElement news_first_header = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.news_1_hover_text_xpath));
			WebElement news_second_header = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.news_2_hover_text_xpath));

			WebElement updates_first_header = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.updates_1_hover_text_xpath));
			WebElement updates_second_header = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.updates_2_hover_text_xpath));

			WebElement events_first_header = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.events_1_hover_text_xpath));
			WebElement events_second_header = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.events_2_hover_text_xpath));

			WebElement masonry_first_header = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.masonry_1_hover_text_xpath));
			WebElement masonry_second_header = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.masonry_2_hover_text_xpath));

			// ICON
			WebElement all_1_icon = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.all_1_hover_zoom_button_xpath));
			WebElement all_2_icon = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.all_2_hover_zoom_button_xpath));
			WebElement all_3_icon = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.all_3_hover_zoom_button_xpath));

			WebElement news_1_icon = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.news_1_hover_zoom_button_xpath));
			WebElement news_2_icon = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.news_2_hover_zoom_button_xpath));

			WebElement updates_1_icon = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.updates_1_hover_zoom_button_xpath));
			WebElement updates_2_icon = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.updates_2_hover_zoom_button_xpath));

			WebElement events_1_icon = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.events_1_hover_zoom_button_xpath));
			WebElement events_2_icon = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.events_2_hover_zoom_button_xpath));

			WebElement masonry_1_icon = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.masonry_1_hover_zoom_button_xpath));
			WebElement masonry_2_icon = driver
					.findElement(By.xpath(eaFilterableGalleryUtils.Locator.masonry_2_hover_zoom_button_xpath));

			// ALL TAB
			driver.findElement(By.xpath(eaFilterableGalleryUtils.Locator.all_tab_xpath)).click();
			Thread.sleep(1000);
			gallery(driver, all_first_photo, all_first_header, all_1_icon, "All", "First", softassert);
			Thread.sleep(1000);
			gallery(driver, all_second_photo, all_second_header, all_2_icon, "All", "Second", softassert);
			Thread.sleep(1000);
			gallery(driver, all_third_photo, all_third_header, all_3_icon, "All", "Third", softassert);
			Thread.sleep(1000);

			// NEWS TAB
			driver.findElement(By.xpath(eaFilterableGalleryUtils.Locator.news_tab_xpath)).click();
			Thread.sleep(1000);
			gallery(driver, news_first_photo, news_first_header, news_1_icon, "News", "First", softassert);
			Thread.sleep(1000);
			gallery(driver, news_second_photo, news_second_header, news_2_icon, "News", "Second", softassert);
			Thread.sleep(1000);

			// UPDATES TAB
			driver.findElement(By.xpath(eaFilterableGalleryUtils.Locator.updates_tab_xpath)).click();
			Thread.sleep(1000);
			gallery(driver, updates_first_photo, updates_first_header, updates_1_icon, "Updates", "First", softassert);
			Thread.sleep(1000);
			gallery(driver, updates_second_photo, updates_second_header, updates_2_icon, "Updates", "Second", softassert);
			Thread.sleep(1000);

			// EVENTS TAB
			driver.findElement(By.xpath(eaFilterableGalleryUtils.Locator.events_tab_xpath)).click();
			Thread.sleep(1000);
			gallery(driver, events_first_photo, events_first_header, events_1_icon, "Events", "First", softassert);
			Thread.sleep(1000);
			gallery(driver, events_second_photo, events_second_header, events_2_icon, "Events", "Second", softassert);
			Thread.sleep(1000);

			// MASONRY TAB
			driver.findElement(By.xpath(eaFilterableGalleryUtils.Locator.masonry_tab_xpath)).click();
			Thread.sleep(1000);
			gallery(driver, masonry_first_photo, masonry_first_header, masonry_1_icon, "Masonry", "First", softassert);
			Thread.sleep(1000);
			gallery(driver, masonry_second_photo, masonry_second_header, masonry_2_icon, "Masonry", "Second", softassert);
			Thread.sleep(1000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
