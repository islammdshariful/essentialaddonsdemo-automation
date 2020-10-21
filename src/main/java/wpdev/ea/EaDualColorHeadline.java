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
	public static void eaDualColorHeadline(WebDriver driver) {

		try {
			assertEquals(driver.getTitle(), eaDualColorHeadlineUtils.TEXT.dualcolorheadline_page_title);
			System.out.println("Page title passed !!");

			driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.documentation_link_path)).click();

			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));

			assertEquals(driver.findElement(By.id(eaDualColorHeadlineUtils.Locator.documentation_title_id)).getText(),
					eaDualColorHeadlineUtils.TEXT.documentation_page);
			System.out.println("Documentation link passed !!");
			driver.close();

			driver.switchTo().window(tabs2.get(0));

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,900)", "");

			// FIRST HEADLINE NORMAL
			assertEquals(
					driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.first_normal_text_xpath)).getText(),
					eaDualColorHeadlineUtils.TEXT.first_normal_text);
			System.out.println("First normal headline text passed !!");
			String color_fn = driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.first_normal_text_xpath))
					.getCssValue("color");
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
			assertTrue(value_fn.equals(eaDualColorHeadlineUtils.TEXT.first_normal_text_color));
			System.out.println("First normal headline color passed !!");

			// FIRST HEADLINE COLOR
			assertEquals(
					driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.first_color_text_xpath)).getText(),
					eaDualColorHeadlineUtils.TEXT.first_color_text);
			System.out.println("First color headline text passed !!");
			String color_fc = driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.first_color_text_xpath))
					.getCssValue("color");
			System.out.println(color_fc);
			String[] hexValue_fc = color_fc.replace("rgba(", "").replace(")", "").split(",");
			hexValue_fc[0] = hexValue_fc[0].trim();
			int hexValue1_fc = Integer.parseInt(hexValue_fc[0]);
			hexValue_fc[1] = hexValue_fc[1].trim();
			int hexValue2_fc = Integer.parseInt(hexValue_fc[1]);
			hexValue_fc[2] = hexValue_fc[2].trim();
			int hexValue3_fc = Integer.parseInt(hexValue_fc[2]);
			String actualColor_fc = String.format("#%02x%02x%02x", hexValue1_fc, hexValue2_fc, hexValue3_fc);
			String value_fc = actualColor_fc.toUpperCase();
			System.out.println(value_fc);
			assertTrue(value_fc.equals(eaDualColorHeadlineUtils.TEXT.first_color_text_color));
			System.out.println("First color headline passed !!");
			assertEquals(
					driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.first_description_xpath)).getText(),
					eaDualColorHeadlineUtils.TEXT.first_description);

			// SECOND HEADLINE
			assertEquals(
					driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.second_normal_text_xpath)).getText(),
					eaDualColorHeadlineUtils.TEXT.second_normal_text);
			System.out.println("second normal headline text passed !!");
			String color_sn = driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.second_normal_text_xpath))
					.getCssValue("color");
			System.out.println(color_sn);
			String[] hexValue_sn = color_sn.replace("rgba(", "").replace(")", "").split(",");
			hexValue_sn[0] = hexValue_sn[0].trim();
			int hexValue1_sn = Integer.parseInt(hexValue_sn[0]);
			hexValue_sn[1] = hexValue_sn[1].trim();
			int hexValue2_sn = Integer.parseInt(hexValue_sn[1]);
			hexValue_sn[2] = hexValue_sn[2].trim();
			int hexValue3_sn = Integer.parseInt(hexValue_sn[2]);
			String actualColor_sn = String.format("#%02x%02x%02x", hexValue1_sn, hexValue2_sn, hexValue3_sn);
			String value_sn = actualColor_sn.toUpperCase();
			System.out.println(value_sn);
			assertTrue(value_sn.equals(eaDualColorHeadlineUtils.TEXT.second_normal_text_color));
			System.out.println("second normal headline color passed !!");

			assertEquals(
					driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.second_color_text_xpath)).getText(),
					eaDualColorHeadlineUtils.TEXT.second_color_text);
			System.out.println("second color headline text passed !!");
			String color_sc = driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.second_color_text_xpath))
					.getCssValue("color");
			System.out.println(color_sc);
			String[] hexValue_sc = color_sc.replace("rgba(", "").replace(")", "").split(",");
			hexValue_sc[0] = hexValue_sc[0].trim();
			int hexValue1_sc = Integer.parseInt(hexValue_sc[0]);
			hexValue_sc[1] = hexValue_sc[1].trim();
			int hexValue2_sc = Integer.parseInt(hexValue_sc[1]);
			hexValue_sc[2] = hexValue_sc[2].trim();
			int hexValue3_sc = Integer.parseInt(hexValue_sc[2]);
			String actualColor_sc = String.format("#%02x%02x%02x", hexValue1_sc, hexValue2_sc, hexValue3_sc);
			String value_sc = actualColor_sc.toUpperCase();
			System.out.println(value_sc);
			assertTrue(value_sc.equals(eaDualColorHeadlineUtils.TEXT.second_color_text_color));
			System.out.println("second color headline color passed !!");
			assertEquals(
					driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.second_description_xpath)).getText(),
					eaDualColorHeadlineUtils.TEXT.second_description);

			WebElement logoImageElement = driver.findElement(
					By.xpath("//*[@id=\"post-1511\"]/div/div/div/div/section[2]/div/div/div/div/div/div/div/div/i"));

			if (logoImageElement.isDisplayed()) {
				System.out.println("Icon is Display");
			} else {
				System.out.println("Icon is  NOT Display");
			}

			Thread.sleep(5000);
//			driver.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void eaDualColorHeadline(WebDriver driver, String pageurl) {
		driver.get(Config.url + pageurl);
		try {
			assertEquals(driver.getTitle(), eaDualColorHeadlineUtils.TEXT.dualcolorheadline_page_title);
			System.out.println("Page title passed !!");

			driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.documentation_link_path)).click();

			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));

			assertEquals(driver.findElement(By.id(eaDualColorHeadlineUtils.Locator.documentation_title_id)).getText(),
					eaDualColorHeadlineUtils.TEXT.documentation_page);
			System.out.println("Documentation link passed !!");
			driver.close();

			driver.switchTo().window(tabs2.get(0));

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,900)", "");

			// FIRST HEADLINE NORMAL
			assertEquals(
					driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.first_normal_text_xpath)).getText(),
					eaDualColorHeadlineUtils.TEXT.first_normal_text);
			System.out.println("First normal headline text passed !!");
			String color_fn = driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.first_normal_text_xpath))
					.getCssValue("color");
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
			assertTrue(value_fn.equals(eaDualColorHeadlineUtils.TEXT.first_normal_text_color));
			System.out.println("First normal headline color passed !!");

			// FIRST HEADLINE COLOR
			assertEquals(
					driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.first_color_text_xpath)).getText(),
					eaDualColorHeadlineUtils.TEXT.first_color_text);
			System.out.println("First color headline text passed !!");
			String color_fc = driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.first_color_text_xpath))
					.getCssValue("color");
			System.out.println(color_fc);
			String[] hexValue_fc = color_fc.replace("rgba(", "").replace(")", "").split(",");
			hexValue_fc[0] = hexValue_fc[0].trim();
			int hexValue1_fc = Integer.parseInt(hexValue_fc[0]);
			hexValue_fc[1] = hexValue_fc[1].trim();
			int hexValue2_fc = Integer.parseInt(hexValue_fc[1]);
			hexValue_fc[2] = hexValue_fc[2].trim();
			int hexValue3_fc = Integer.parseInt(hexValue_fc[2]);
			String actualColor_fc = String.format("#%02x%02x%02x", hexValue1_fc, hexValue2_fc, hexValue3_fc);
			String value_fc = actualColor_fc.toUpperCase();
			System.out.println(value_fc);
			assertTrue(value_fc.equals(eaDualColorHeadlineUtils.TEXT.first_color_text_color));
			System.out.println("First color headline passed !!");
			assertEquals(
					driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.first_description_xpath)).getText(),
					eaDualColorHeadlineUtils.TEXT.first_description);

			// SECOND HEADLINE
			assertEquals(
					driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.second_normal_text_xpath)).getText(),
					eaDualColorHeadlineUtils.TEXT.second_normal_text);
			System.out.println("second normal headline text passed !!");
			String color_sn = driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.second_normal_text_xpath))
					.getCssValue("color");
			System.out.println(color_sn);
			String[] hexValue_sn = color_sn.replace("rgba(", "").replace(")", "").split(",");
			hexValue_sn[0] = hexValue_sn[0].trim();
			int hexValue1_sn = Integer.parseInt(hexValue_sn[0]);
			hexValue_sn[1] = hexValue_sn[1].trim();
			int hexValue2_sn = Integer.parseInt(hexValue_sn[1]);
			hexValue_sn[2] = hexValue_sn[2].trim();
			int hexValue3_sn = Integer.parseInt(hexValue_sn[2]);
			String actualColor_sn = String.format("#%02x%02x%02x", hexValue1_sn, hexValue2_sn, hexValue3_sn);
			String value_sn = actualColor_sn.toUpperCase();
			System.out.println(value_sn);
			assertTrue(value_sn.equals(eaDualColorHeadlineUtils.TEXT.second_normal_text_color));
			System.out.println("second normal headline color passed !!");

			assertEquals(
					driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.second_color_text_xpath)).getText(),
					eaDualColorHeadlineUtils.TEXT.second_color_text);
			System.out.println("second color headline text passed !!");
			String color_sc = driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.second_color_text_xpath))
					.getCssValue("color");
			System.out.println(color_sc);
			String[] hexValue_sc = color_sc.replace("rgba(", "").replace(")", "").split(",");
			hexValue_sc[0] = hexValue_sc[0].trim();
			int hexValue1_sc = Integer.parseInt(hexValue_sc[0]);
			hexValue_sc[1] = hexValue_sc[1].trim();
			int hexValue2_sc = Integer.parseInt(hexValue_sc[1]);
			hexValue_sc[2] = hexValue_sc[2].trim();
			int hexValue3_sc = Integer.parseInt(hexValue_sc[2]);
			String actualColor_sc = String.format("#%02x%02x%02x", hexValue1_sc, hexValue2_sc, hexValue3_sc);
			String value_sc = actualColor_sc.toUpperCase();
			System.out.println(value_sc);
			assertTrue(value_sc.equals(eaDualColorHeadlineUtils.TEXT.second_color_text_color));
			System.out.println("second color headline color passed !!");
			assertEquals(
					driver.findElement(By.xpath(eaDualColorHeadlineUtils.Locator.second_description_xpath)).getText(),
					eaDualColorHeadlineUtils.TEXT.second_description);

			WebElement logoImageElement = driver.findElement(
					By.xpath("//*[@id=\"post-1511\"]/div/div/div/div/section[2]/div/div/div/div/div/div/div/div/i"));

			if (logoImageElement.isDisplayed()) {
				System.out.println("Icon is Display");
			} else {
				System.out.println("Icon is  NOT Display");
			}

			Thread.sleep(5000);
//			driver.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
