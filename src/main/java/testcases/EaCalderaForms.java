package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import utils.eaCalderaFormsUtils;

public class EaCalderaForms {
    public static void eacalderaforms(WebDriver driver, String url) {
        SoftAssert softassert = new SoftAssert();
        driver.get(wpdev.ea.utils.Config.url + url);

        try {
            wpdev.ea.utils.Config.checkdocandheadtitle.checkdoc(driver, eaCalderaFormsUtils.TEXT.calderaform_title,
                    eaCalderaFormsUtils.Locator.documentation_link_path, eaCalderaFormsUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
            Thread.sleep(1000);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,1175); behavior:'smooth';", "");
//		    js.executeScript("arguments[0].scrollIntoView();", message);

            Thread.sleep(1000);
            driver.findElement(By.id(eaCalderaFormsUtils.Locator.first_name_id)).click();
            driver.findElement(By.id(eaCalderaFormsUtils.Locator.first_name_id)).sendKeys(eaCalderaFormsUtils.TEXT.first_name_text);

            driver.findElement(By.id(eaCalderaFormsUtils.Locator.last_name_id)).click();
            driver.findElement(By.id(eaCalderaFormsUtils.Locator.last_name_id)).sendKeys(eaCalderaFormsUtils.TEXT.last_name_text);

            driver.findElement(By.id(eaCalderaFormsUtils.Locator.email_id)).click();
            driver.findElement(By.id(eaCalderaFormsUtils.Locator.email_id)).sendKeys(eaCalderaFormsUtils.TEXT.email_text);

            WebElement message = driver.findElement(By.id(eaCalderaFormsUtils.Locator.message_id));
            message.click();
            driver.findElement(By.id(eaCalderaFormsUtils.Locator.message_id)).sendKeys(eaCalderaFormsUtils.TEXT.message_text);

            js.executeScript("arguments[0].scrollIntoView();", message);
            Thread.sleep(1000);
            driver.findElement(By.id(eaCalderaFormsUtils.Locator.submit_button_id)).click();

            Thread.sleep(2000);

            WebElement element = driver.findElement(By.xpath(eaCalderaFormsUtils.Locator.success_message_xpth));
            if (element.isDisplayed()) {
                System.out.println("Success message is visible");
//                softassert.assertEquals(element.getText().trim(), eaCalderaFormsUtils.TEXT.success_message_text);
            } else {
                System.out.println("Success message is NOT visible");
            }

            softassert.assertAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
