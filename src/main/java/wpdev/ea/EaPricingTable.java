package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wpdev.ea.utils.Config;
import wpdev.ea.utils.eaPricingTableUtils;

public class EaPricingTable {
	public static void eaPricingTable(WebDriver driver, String url) {
		driver.get(Config.url + url);
		try {
			if(Config.go_doc_page == 1) {
				assertEquals(driver.getTitle(), eaPricingTableUtils.TEXT.pricingtable_page_title);
				System.out.println("Page title passed !!");

				driver.findElement(By.xpath(eaPricingTableUtils.Locator.documentation_link_path)).click();

				ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
				driver.switchTo().window(tabs2.get(1));

				assertEquals(driver.findElement(By.id(eaPricingTableUtils.Locator.documentation_title_id)).getText(),
						eaPricingTableUtils.TEXT.documentation_page);
				System.out.println("Documentation link passed !!");
				driver.close();

				driver.switchTo().window(tabs2.get(0));
//				
				Thread.sleep(1000);
			}


			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1061)", "");
			
			Thread.sleep(1000);

			Actions mousehover = new Actions(driver);

			WebElement basic = driver.findElement(By.xpath(eaPricingTableUtils.Locator.basic_price_card_xpath));
			WebElement standard = driver.findElement(By.xpath(eaPricingTableUtils.Locator.basic_price_card_xpath));
			WebElement enterprise = driver.findElement(By.xpath(eaPricingTableUtils.Locator.basic_price_card_xpath));

			mousehover.moveToElement(basic).build().perform();
			assertEquals(driver.findElement(By.xpath(eaPricingTableUtils.Locator.basic_header_xpath)).getText(),
					eaPricingTableUtils.TEXT.basic_header_text);
			System.out.println("Basic price passed !!");
			Thread.sleep(1000);

			mousehover.moveToElement(standard).build().perform();
			assertEquals(driver.findElement(By.xpath(eaPricingTableUtils.Locator.standard_header_xpath)).getText(),
					eaPricingTableUtils.TEXT.standard_header_text);
			System.out.println("Standard price passed !!");
			Thread.sleep(1000);

			mousehover.moveToElement(enterprise).build().perform();
			assertEquals(driver.findElement(By.xpath(eaPricingTableUtils.Locator.enterprise_header_xpath)).getText(),
					eaPricingTableUtils.TEXT.enterprise_header_text);
			System.out.println("Enterprise price passed !!");
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
