package testcases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import utils.eaEventCalenderUtils;

public class EaEventCalendar {

	public static void eaEventCalender(WebDriver driver) {

		try {
//			assertEquals(driver.getTitle(), eaEventCalenderUtils.TEXT.eventcalender_page_title);
//			System.out.println("Page title passed !!");
//			
//			driver.findElement(By.xpath(eaEventCalenderUtils.Locator.documentation_link_xpath)).click();
//
//			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//			driver.switchTo().window(tabs2.get(1));
//			
//			assertEquals(driver.findElement(By.id(eaEventCalenderUtils.Locator.documentation_title_id)).getText(), eaEventCalenderUtils.TEXT.documentation_page);
//			System.out.println("Documentation link passed !!");
//			driver.close();
//			
//			driver.switchTo().window(tabs2.get(0));
//			
//			Thread.sleep(1000);
//			
//			driver.findElement(By.xpath(eaEventCalenderUtils.Locator.ea_event_calender_4_elementor_doc_link_xpath)).click();
//
//			ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
//			driver.switchTo().window(tabs3.get(1));
//			
//			assertEquals(driver.findElement(By.id(eaEventCalenderUtils.Locator.documentation_title_id)).getText(), eaEventCalenderUtils.TEXT.documentation_page);
//			System.out.println("EA Event calender 4 Elementor Documentation link passed !!");
//			driver.close();
//			
//			driver.switchTo().window(tabs3.get(0));
//			
//			Thread.sleep(1000);
//			
//			driver.findElement(By.xpath(eaEventCalenderUtils.Locator.google_calender_doc_link_xpath)).click();
//
//			ArrayList<String> tabs4 = new ArrayList<String> (driver.getWindowHandles());
//			driver.switchTo().window(tabs4.get(1));
//			
//			assertEquals(driver.findElement(By.id(eaEventCalenderUtils.Locator.documentation_title_id)).getText(), eaEventCalenderUtils.TEXT.documentation_page);
//			System.out.println(" Google Calender Documentation link passed !!");
//			driver.close();
//			
//			driver.switchTo().window(tabs4.get(0));
//			
//			Thread.sleep(1000);
//			
//			driver.findElement(By.xpath(eaEventCalenderUtils.Locator.event_on_doc_doc_link_xpath)).click();
//
//			ArrayList<String> tabs5 = new ArrayList<String> (driver.getWindowHandles());
//			driver.switchTo().window(tabs5.get(1));
//			
//			assertEquals(driver.findElement(By.id(eaEventCalenderUtils.Locator.documentation_title_id)).getText(), eaEventCalenderUtils.TEXT.event_on_doc_page);
//			System.out.println(" Event On Calender Documentation link passed !!");
//			driver.close();
//			
//			driver.switchTo().window(tabs5.get(0));
//			
//			Thread.sleep(1000);

//			driver.findElement(By.xpath(eaEventCalenderUtils.Locator.the_event_calender_doc_link_xpath)).click();
//
//			ArrayList<String> tabs6 = new ArrayList<String> (driver.getWindowHandles());
//			driver.switchTo().window(tabs6.get(1));
//			
//			assertEquals(driver.findElement(By.id(eaEventCalenderUtils.Locator.documentation_title_id)).getText(), eaEventCalenderUtils.TEXT.the_event_doc_page);
//			
//			System.out.println(" The Event Calender Documentation link passed !!");
//			driver.close();
//			
//			driver.switchTo().window(tabs6.get(0));
//			Thread.sleep(1000);

			// ----- MONTH -----
			driver.findElement(By.xpath(eaEventCalenderUtils.Locator.manual_month_button_xpath)).click();

//			for(int i = 0 ; i < 2; i++) {
//				if(driver.findElement(By.xpath(eaEventCalenderUtils.Locator.get_month_title_xpath)).getText() == eaEventCalenderUtils.TEXT.month_title) {
//					System.out.println("Got the month");
//					break;
//				}else {
//					System.out.println(driver.findElement(By.xpath(eaEventCalenderUtils.Locator.get_month_title_xpath)).getText());
//					System.out.println("Not Got the month");
//					System.out.println(i);
//					System.out.println("Expected month " + eaEventCalenderUtils.TEXT.month_title.toString());
//					System.out.println("---------------");
//					driver.findElement(By.xpath(eaEventCalenderUtils.Locator.navigation_left_xpath)).click();
//					Thread.sleep(1000);
//				}
//			}

			// NAVIGATE TO JULY MONTH
			for (int i = 0; i < 3; i++) {
				driver.findElement(By.xpath(eaEventCalenderUtils.Locator.navigation_left_xpath)).click();
			}

			// CLICK ON THE EVENT
			driver.findElement(By.xpath(eaEventCalenderUtils.Locator.click_event_xpath)).click();
//			SoftAssert softassertion = new SoftAssert();
			Thread.sleep(1000);
			assertEquals(driver.findElement(By.xpath(eaEventCalenderUtils.Locator.check_event_title_xpath)).getText(),
					eaEventCalenderUtils.TEXT.event_title);

			assertEquals(driver.findElement(By.xpath(eaEventCalenderUtils.Locator.check_start_time_xpath)).getText(),
					eaEventCalenderUtils.TEXT.event_start_time_text);
			assertEquals(driver.findElement(By.xpath(eaEventCalenderUtils.Locator.check_end_time_xpath)).getText(),
					eaEventCalenderUtils.TEXT.event_end_time_text);
			assertEquals(driver.findElement(By.xpath(eaEventCalenderUtils.Locator.check_event_description)).getText(),
					eaEventCalenderUtils.TEXT.event_description_text);

			// CLOSING THE ICON
			driver.findElement(By.xpath(eaEventCalenderUtils.Locator.cross_icon_xpath)).click();

			// ---- DAY ---
			driver.findElement(By.xpath(eaEventCalenderUtils.Locator.manual_day_button_xpath)).click();
			for (int i = 0; i < 3; i++) {
				driver.findElement(By.xpath(eaEventCalenderUtils.Locator.navigation_right_xpath)).click();
			}
			driver.findElement(By.xpath(eaEventCalenderUtils.Locator.click_day_event_xpath)).click();

			Thread.sleep(1000);
			assertEquals(driver.findElement(By.xpath(eaEventCalenderUtils.Locator.check_event_title_xpath)).getText(),
					eaEventCalenderUtils.TEXT.event_title);

			assertEquals(driver.findElement(By.xpath(eaEventCalenderUtils.Locator.check_start_time_xpath)).getText(),
					eaEventCalenderUtils.TEXT.event_start_time_text);
			assertEquals(driver.findElement(By.xpath(eaEventCalenderUtils.Locator.check_end_time_xpath)).getText(),
					eaEventCalenderUtils.TEXT.event_end_time_text);
			assertEquals(driver.findElement(By.xpath(eaEventCalenderUtils.Locator.check_event_description)).getText(),
					eaEventCalenderUtils.TEXT.event_description_text);
			// CLOSING THE ICON
			driver.findElement(By.xpath(eaEventCalenderUtils.Locator.cross_icon_xpath)).click();

			// ---- WEEK ----
			driver.findElement(By.xpath(eaEventCalenderUtils.Locator.manual_week_button_xpath)).click();
			driver.findElement(By.xpath(eaEventCalenderUtils.Locator.click_week_event_xpath)).click();
			Thread.sleep(1000);
			assertEquals(driver.findElement(By.xpath(eaEventCalenderUtils.Locator.check_event_title_xpath)).getText(),
					eaEventCalenderUtils.TEXT.event_title);

			assertEquals(driver.findElement(By.xpath(eaEventCalenderUtils.Locator.check_start_time_xpath)).getText(),
					eaEventCalenderUtils.TEXT.event_start_time_text);
			assertEquals(driver.findElement(By.xpath(eaEventCalenderUtils.Locator.check_end_time_xpath)).getText(),
					eaEventCalenderUtils.TEXT.event_end_time_text);
			assertEquals(driver.findElement(By.xpath(eaEventCalenderUtils.Locator.check_event_description)).getText(),
					eaEventCalenderUtils.TEXT.event_description_text);
			// CLOSING THE ICON
			driver.findElement(By.xpath(eaEventCalenderUtils.Locator.cross_icon_xpath)).click();

			// ---- LIST ----
			driver.findElement(By.xpath(eaEventCalenderUtils.Locator.manual_list_button_xpath)).click();

			driver.findElement(By.xpath(eaEventCalenderUtils.Locator.click_list_event_xpath)).click();
			Thread.sleep(1000);
			assertEquals(driver.findElement(By.xpath(eaEventCalenderUtils.Locator.check_event_title_xpath)).getText(),
					eaEventCalenderUtils.TEXT.event_title);

			assertEquals(driver.findElement(By.xpath(eaEventCalenderUtils.Locator.check_start_time_xpath)).getText(),
					eaEventCalenderUtils.TEXT.event_start_time_text);
			assertEquals(driver.findElement(By.xpath(eaEventCalenderUtils.Locator.check_end_time_xpath)).getText(),
					eaEventCalenderUtils.TEXT.event_end_time_text);
			assertEquals(driver.findElement(By.xpath(eaEventCalenderUtils.Locator.check_event_description)).getText(),
					eaEventCalenderUtils.TEXT.event_description_text);
			driver.findElement(By.xpath(eaEventCalenderUtils.Locator.cross_icon_xpath)).click();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
