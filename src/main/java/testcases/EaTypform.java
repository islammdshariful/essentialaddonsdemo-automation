package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import utils.eaTypeformUtils;

public class EaTypform {
    public static void eaTypeform(WebDriver driver, String url) {
        SoftAssert softassert = new SoftAssert();
        driver.get(wpdev.ea.utils.Config.url + url);
        try {
//            wpdev.ea.utils.Config.checkdocandheadtitle.checkdoc(driver, eaTypeformUtils.TEXT.typeform_title,
//                    eaTypeformUtils.Locator.documentation_link_path, eaTypeformUtils.TEXT.documentation_page);

//		    Config.closeNotifications.betterdocs(driver);
//		    Config.closeNotifications.notificationBar(driver);
//		    Config.closeNotifications.floatNotification(driver);
            Thread.sleep(1000);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,1299); behavior:'smooth';", "");
//		    js.executeScript("arguments[0].scrollIntoView();", element);

            driver.switchTo().frame(1);
            System.out.println("Switched to Frame 1");
            softassert.assertEquals(driver.findElement(By.xpath(eaTypeformUtils.Locator.form1_quiestion_1_xpth)).getText(), eaTypeformUtils.TEXT.form1_question_1_text);
            softassert.assertEquals(driver.findElement(By.xpath(eaTypeformUtils.Locator.form1_question_des_xpth)).getText(), eaTypeformUtils.TEXT.form1_question_1_des_text);

            driver.findElement(By.xpath(eaTypeformUtils.Locator.form1_image_1_xpth)).click();
            WebElement element = driver.findElement(By.xpath(eaTypeformUtils.Locator.form1_submit_button_xpth));
            js.executeScript("arguments[0].scrollIntoView();", element);
            Thread.sleep(1000);
            element.click();

            softassert.assertEquals(driver.findElement(By.xpath(eaTypeformUtils.Locator.form1_sucess_message_xpth)).getText(), eaTypeformUtils.TEXT.sucess_message_text);

            softassert.assertAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
