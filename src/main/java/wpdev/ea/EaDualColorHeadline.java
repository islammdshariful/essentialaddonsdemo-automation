package wpdev.ea;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaDualColorHeadlineUtils;

public class EaDualColorHeadline {
	public static void colorcode(WebDriver driver, String textxpath, String text, String color, String number,
			String type) {
		assertEquals(driver.findElement(By.xpath(textxpath)).getText(), text);
		System.out.println(number + " " + type + " headline text passed !!");
		String color_fn = driver.findElement(By.xpath(textxpath)).getCssValue("color");
		System.out.println(color_fn);
		String[] hexValue_fn = color_fn.replace("rgba(", "").replace(")", "").split(",");
		hexValue_fn[0] = hexValue_fn[0].trim();
		int hexValue1_fn = Integer.parseInt(hexValue_fn[0]);
		hexValue_fn[1] = hexValue_fn[1].trim();
		int hexValue2_fn = Integer.parseInt(hexValue_fn[1]);
		hexValue_fn[2] = hexValue_fn[2].trim();
		int hexValue3_fn = Integer.parseInt(hexValue_fn[2]);
		String actualColor_fn = String.format("#%02x%02x%02x", hexValue1_fn, hexValue2_fn, hexValue3_fn);
		String value_fn = actualColor_fn.toUpperCase();
		System.out.println(value_fn);
		assertTrue(value_fn.equals(color));
		System.out.println(number + " " + type + " headline color passed !!");
	}

	public static void eaDualColorHeadline(WebDriver driver, String pageurl) {
		driver.get(Config.url + pageurl);
		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaDualColorHeadlineUtils.TEXT.dualcolorheadline_page_title,
					eaDualColorHeadlineUtils.Locator.documentation_link_path,
					eaDualColorHeadlineUtils.TEXT.documentation_page);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,900)", "");

			// FIRST HEADLINE 
			colorcode(driver, eaDualColorHeadlineUtils.Locator.first_normal_text_xpath,
					eaDualColorHeadlineUtils.TEXT.first_normal_text,
					eaDualColorHeadlineUtils.TEXT.first_normal_text_color, "First", "Normal");

			colorcode(driver, eaDualColorHeadlineUtils.Locator.first_color_text_xpath,
					eaDualColorHeadlineUtils.TEXT.first_color_text,
					eaDualColorHeadlineUtils.TEXT.first_color_text_color, "First", "Color");
			
			assertEquals(
					driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.first_description_xpath)).getText(),
					eaDualColorHeadlineUtils.TEXT.first_description);

			// SECOND HEADLINE
			colorcode(driver, eaDualColorHeadlineUtils.Locator.second_normal_text_xpath,
					eaDualColorHeadlineUtils.TEXT.second_normal_text,
					eaDualColorHeadlineUtils.TEXT.second_normal_text_color, "Second", "Normal");
			
			colorcode(driver, eaDualColorHeadlineUtils.Locator.second_color_text_xpath,
					eaDualColorHeadlineUtils.TEXT.second_color_text,
					eaDualColorHeadlineUtils.TEXT.second_color_text_color, "Second", "Color");
			
			assertEquals(
					driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.second_description_xpath)).getText(),
					eaDualColorHeadlineUtils.TEXT.second_description);

			WebElement icon_1 = driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.first_icon_xpath));
			WebElement icon_2 = driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.second_icon_xpath));
			
			if (icon_1.isDisplayed() && icon_2.isDisplayed()) {
				System.out.println("Icon is Display");
			} else {
				System.out.println("Icon is  NOT Display");
			}

			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
