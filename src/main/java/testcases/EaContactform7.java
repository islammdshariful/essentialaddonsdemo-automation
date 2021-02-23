package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import utils.eaContactform7Utils;

public class EaContactform7 {
    public static void eacontactform7(WebDriver driver, String url) {
        SoftAssert softassert = new SoftAssert();
        driver.get(wpdev.ea.utils.Config.url + url);

        try {
            wpdev.ea.utils.Config.checkdocandheadtitle.checkdoc(driver, eaContactform7Utils.TEXT.contactform7_title,
                    eaContactform7Utils.Locator.documentation_link_path, eaContactform7Utils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
            Thread.sleep(1000);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,1191); behavior:'smooth';", "");
//		    js.executeScript("arguments[0].scrollIntoView();", message);

            driver.findElement(By.name(eaContactform7Utils.Locator.name_classname)).click();
            driver.findElement(By.name(eaContactform7Utils.Locator.name_classname)).sendKeys(eaContactform7Utils.TEXT.name_text);

            driver.findElement(By.name(eaContactform7Utils.Locator.email_classname)).click();
            driver.findElement(By.name(eaContactform7Utils.Locator.email_classname)).sendKeys(eaContactform7Utils.TEXT.email_text);

            driver.findElement(By.name(eaContactform7Utils.Locator.subject_classname)).click();
            driver.findElement(By.name(eaContactform7Utils.Locator.subject_classname)).sendKeys(eaContactform7Utils.TEXT.subject_text);

            WebElement message = driver.findElement(By.name(eaContactform7Utils.Locator.message_classname));
            message.click();
            driver.findElement(By.name(eaContactform7Utils.Locator.message_classname)).sendKeys(eaContactform7Utils.TEXT.message_text);

            js.executeScript("arguments[0].scrollIntoView();", message);
            driver.findElement(By.xpath(eaContactform7Utils.Locator.submit_button_xpth)).click();

            Thread.sleep(2000);

            WebElement element = driver.findElement(By.xpath(eaContactform7Utils.Locator.success_message_xpth));
            if(element.isDisplayed()){
                System.out.println("Success message is visible");
                softassert.assertEquals(element.getText(), eaContactform7Utils.TEXT.success_message_text);
            }else {
                System.out.println("Success message is NOT visible");
            }

            softassert.assertAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
