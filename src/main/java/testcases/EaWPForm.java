package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import utils.eaWPFormUtils;

public class EaWPForm {
    public static void eaontactform7(WebDriver driver, String url) {
        SoftAssert softassert = new SoftAssert();
        driver.get(wpdev.ea.utils.Config.url + url);

        try {
            wpdev.ea.utils.Config.checkdocandheadtitle.checkdoc(driver, eaWPFormUtils.TEXT.wpform_title,
                    eaWPFormUtils.Locator.documentation_link_path, eaWPFormUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
            Thread.sleep(1000);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,1190); behavior:'smooth';", "");
//		    js.executeScript("arguments[0].scrollIntoView();", message);

            Thread.sleep(1000);
            driver.findElement(By.id(eaWPFormUtils.Locator.first_name_id)).click();
            driver.findElement(By.id(eaWPFormUtils.Locator.first_name_id)).sendKeys(eaWPFormUtils.TEXT.first_name_text);

            driver.findElement(By.id(eaWPFormUtils.Locator.last_name_id)).click();
            driver.findElement(By.id(eaWPFormUtils.Locator.last_name_id)).sendKeys(eaWPFormUtils.TEXT.last_name_text);

            driver.findElement(By.id(eaWPFormUtils.Locator.email_id)).click();
            driver.findElement(By.id(eaWPFormUtils.Locator.email_id)).sendKeys(eaWPFormUtils.TEXT.email_text);

            WebElement message = driver.findElement(By.id(eaWPFormUtils.Locator.message_id));
            message.click();
            driver.findElement(By.id(eaWPFormUtils.Locator.message_id)).sendKeys(eaWPFormUtils.TEXT.message_text);

            js.executeScript("arguments[0].scrollIntoView();", message);

            driver.findElement(By.id(eaWPFormUtils.Locator.submit_button_id)).click();

            Thread.sleep(2000);

            WebElement element = driver.findElement(By.xpath(eaWPFormUtils.Locator.success_message_xpth));
            if (element.isDisplayed()) {
                System.out.println("Success message is visible");
                softassert.assertEquals(element.getText(), eaWPFormUtils.TEXT.success_message_text);
            } else {
                System.out.println("Success message is NOT visible");
            }

            softassert.assertAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
