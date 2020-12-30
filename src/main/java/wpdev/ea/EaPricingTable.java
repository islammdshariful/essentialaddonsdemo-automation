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
import wpdev.ea.utils.eaPricingTableUtils;

public class EaPricingTable {
	public static void eaPricingTable(WebDriver driver, String url) {
		SoftAssert softassert = new SoftAssert();
		driver.get(Config.url + url);
		try {
			Config.checkdocandheadtitle.checkdoc(driver, eaPricingTableUtils.TEXT.pricingtable_page_title,
					eaPricingTableUtils.Locator.documentation_link_path, eaPricingTableUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
			Config.closeNotifications.notificationBar(driver);
			Config.closeNotifications.floatNotification(driver);
			Thread.sleep(1000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1061)", "");
			
			Thread.sleep(1000);

			Actions mousehover = new Actions(driver);

			WebElement basic = driver.findElement(By.xpath(eaPricingTableUtils.Locator.basic_price_card_xpath));
			WebElement standard = driver.findElement(By.xpath(eaPricingTableUtils.Locator.basic_price_card_xpath));
			WebElement enterprise = driver.findElement(By.xpath(eaPricingTableUtils.Locator.basic_price_card_xpath));

			mousehover.moveToElement(basic).build().perform();
			softassert.assertEquals(driver.findElement(By.xpath(eaPricingTableUtils.Locator.basic_header_xpath)).getText(),
					eaPricingTableUtils.TEXT.basic_header_text);
			System.out.println("Basic price passed !!");
			Thread.sleep(1000);

			mousehover.moveToElement(standard).build().perform();
			softassert.assertEquals(driver.findElement(By.xpath(eaPricingTableUtils.Locator.standard_header_xpath)).getText(),
					eaPricingTableUtils.TEXT.standard_header_text);
			System.out.println("Standard price passed !!");
			Thread.sleep(1000);

			mousehover.moveToElement(enterprise).build().perform();
			softassert.assertEquals(driver.findElement(By.xpath(eaPricingTableUtils.Locator.enterprise_header_xpath)).getText(),
					eaPricingTableUtils.TEXT.enterprise_header_text);
			System.out.println("Enterprise price passed !!");
			Thread.sleep(1000);
			softassert.assertAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
