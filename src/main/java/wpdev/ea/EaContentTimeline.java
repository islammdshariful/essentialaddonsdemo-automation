package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaContentTimelineUtils;

public class EaContentTimeline {
	public static void timeline(WebDriver driver, String number, String iconxpath, String datexpath, String datetext,
			String headerxpath, String headertext, String desxpath, String destext) {

		WebElement icon = driver.findElement(By.xpath(iconxpath));
		if (icon.isDisplayed()) {
			System.out.println(number + " icon passed!!");
		}
		assertEquals(driver.findElement(By.xpath(datexpath)).getText(), datetext);
		assertEquals(driver.findElement(By.xpath(headerxpath)).getText(), headertext);
		assertEquals(driver.findElement(By.xpath(desxpath)).getText(), destext);
		System.out.println(number + " passed!!");
	}

	public static void eaontentTimeline(WebDriver driver, String url) {
		driver.get(Config.url + url);
		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaContentTimelineUtils.TEXT.contenttimeline_page_title,
					eaContentTimelineUtils.Locator.documentation_link_path,
					eaContentTimelineUtils.TEXT.documentation_page);

			Thread.sleep(1000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1103)", "");
			timeline(driver, "First", eaContentTimelineUtils.Locator.first_content_icon_xpath,
					eaContentTimelineUtils.Locator.first_content_date_xpath,
					eaContentTimelineUtils.TEXT.first_content_date_text,
					eaContentTimelineUtils.Locator.first_content_header_xpath,
					eaContentTimelineUtils.TEXT.first_content_header_text,
					eaContentTimelineUtils.Locator.first_content_des_xpath,
					eaContentTimelineUtils.TEXT.first_content_des_text);

			js.executeScript("window.scrollBy(0,1405)", "");
			timeline(driver, "Second", eaContentTimelineUtils.Locator.second_content_icon_xpath,
					eaContentTimelineUtils.Locator.second_content_date_xpath,
					eaContentTimelineUtils.TEXT.second_content_date_text,
					eaContentTimelineUtils.Locator.second_content_header_xpath,
					eaContentTimelineUtils.TEXT.second_content_header_text,
					eaContentTimelineUtils.Locator.second_content_des_xpath,
					eaContentTimelineUtils.TEXT.second_content_des_text);

			js.executeScript("window.scrollBy(0,1505)", "");
			timeline(driver, "Third", eaContentTimelineUtils.Locator.third_content_icon_xpath,
					eaContentTimelineUtils.Locator.third_content_date_xpath,
					eaContentTimelineUtils.TEXT.third_content_date_text,
					eaContentTimelineUtils.Locator.third_content_header_xpath,
					eaContentTimelineUtils.TEXT.third_content_header_text,
					eaContentTimelineUtils.Locator.third_content_des_xpath,
					eaContentTimelineUtils.TEXT.third_content_des_text);

			timeline(driver, "Fourth", eaContentTimelineUtils.Locator.fourth_content_icon_xpath,
					eaContentTimelineUtils.Locator.fourth_content_date_xpath,
					eaContentTimelineUtils.TEXT.fourth_content_date_text,
					eaContentTimelineUtils.Locator.fourth_content_header_xpath,
					eaContentTimelineUtils.TEXT.fourth_content_header_text,
					eaContentTimelineUtils.Locator.fourth_content_des_xpath,
					eaContentTimelineUtils.TEXT.fourth_content_des_text);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
