package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import utils.eaContactform7Utils;
import utils.eaMailchimpUtils;

public class EaMailChimp {
    public static void eamailchimp(WebDriver driver, String url) {
        SoftAssert softassert = new SoftAssert();
        driver.get(wpdev.ea.utils.Config.url + url);

        try {
            wpdev.ea.utils.Config.checkdocandheadtitle.checkdoc(driver, eaMailchimpUtils.TEXT.mailchimp_title,
                    eaMailchimpUtils.Locator.documentation_link_path, eaMailchimpUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
            Thread.sleep(1000);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,1164); behavior:'smooth';", "");
//		    js.executeScript("arguments[0].scrollIntoView();", message);

            Thread.sleep(1000);

            driver.findElement(By.name(eaMailchimpUtils.Locator.email_classname)).click();
            driver.findElement(By.name(eaMailchimpUtils.Locator.email_classname)).sendKeys(eaMailchimpUtils.TEXT.email_text);

            driver.findElement(By.name(eaMailchimpUtils.Locator.first_name_classname)).click();
            driver.findElement(By.name(eaMailchimpUtils.Locator.first_name_classname)).sendKeys(eaMailchimpUtils.TEXT.first_name_text);

            driver.findElement(By.name(eaMailchimpUtils.Locator.last_name_classname)).click();
            driver.findElement(By.name(eaMailchimpUtils.Locator.last_name_classname)).sendKeys(eaMailchimpUtils.TEXT.last_name_text);


            driver.findElement(By.id(eaMailchimpUtils.Locator.submit_button_id)).click();

            Thread.sleep(2000);

            WebElement element = driver.findElement(By.xpath(eaMailchimpUtils.Locator.success_message_xpth));
            if(element.isDisplayed()){
                System.out.println("Success message is visible");
                softassert.assertEquals(element.getText(), eaMailchimpUtils.TEXT.success_message_text);
            }else {
                System.out.println("Success message is NOT visible");
            }

            softassert.assertAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
