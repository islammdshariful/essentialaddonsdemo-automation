package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import utils.eaFluentForm;


public class EaFluentForm {
    public static void eafludentform (WebDriver driver, String url) {
        SoftAssert softassert = new SoftAssert();
        driver.get(wpdev.ea.utils.Config.url + url);

        try {
            wpdev.ea.utils.Config.checkdocandheadtitle.checkdoc(driver, eaFluentForm.TEXT.fluent_title,
                    eaFluentForm.Locator.documentation_link_path, eaFluentForm.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
            Thread.sleep(1000);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,1163); behavior:'smooth';", "");
//		    js.executeScript("arguments[0].scrollIntoView();", message);

            Thread.sleep(1000);

            driver.findElement(By.id(eaFluentForm.Locator.name_id)).click();
            driver.findElement(By.id(eaFluentForm.Locator.name_id)).sendKeys(eaFluentForm.TEXT.name_text);

            driver.findElement(By.id(eaFluentForm.Locator.email_id)).click();
            driver.findElement(By.id(eaFluentForm.Locator.email_id)).sendKeys(eaFluentForm.TEXT.email_text);

            driver.findElement(By.id(eaFluentForm.Locator.subject_id)).click();
            driver.findElement(By.id(eaFluentForm.Locator.subject_id)).sendKeys(eaFluentForm.TEXT.subject_text);


            WebElement message = driver.findElement(By.id(eaFluentForm.Locator.message_id));
            message.click();
            driver.findElement(By.id(eaFluentForm.Locator.message_id)).sendKeys(eaFluentForm.TEXT.message_text);

            js.executeScript("arguments[0].scrollIntoView();", message);

            driver.findElement(By.xpath(eaFluentForm.Locator.submit_button_xpth)).click();

            Thread.sleep(2000);

            WebElement element = driver.findElement(By.xpath(eaFluentForm.Locator.success_message_xpth));
            if (element.isDisplayed()) {
                System.out.println("Success message is visible");
                softassert.assertEquals(element.getText(), eaFluentForm.TEXT.success_message_text);
            } else {
                System.out.println("Success message is NOT visible");
            }

            softassert.assertAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
