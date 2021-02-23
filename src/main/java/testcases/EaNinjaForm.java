package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import utils.eaNinjaFormUtils;

public class EaNinjaForm {
    public static void eaninjaform(WebDriver driver, String url) {
        SoftAssert softassert = new SoftAssert();
        driver.get(wpdev.ea.utils.Config.url + url);

        try {
            wpdev.ea.utils.Config.checkdocandheadtitle.checkdoc(driver, eaNinjaFormUtils.TEXT.ninjaform_title,
                    eaNinjaFormUtils.Locator.documentation_link_path, eaNinjaFormUtils.TEXT.documentation_page);

//			Config.closeNotifications.betterdocs(driver);
//			Config.closeNotifications.notificationBar(driver);
//			Config.closeNotifications.floatNotification(driver);
            Thread.sleep(1000);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,1232); behavior:'smooth';", "");
//            WebElement element = driver.findElement(By.xpath("//*[@id=\"nf-form-1-cont\"]/div/div[4]/form/div/div[1]/nf-section/div"));
//		    js.executeScript("arguments[0].scrollIntoView();", element);

            Thread.sleep(1000);

            driver.findElement(By.id(eaNinjaFormUtils.Locator.name_id)).click();
            driver.findElement(By.id(eaNinjaFormUtils.Locator.name_id)).sendKeys(eaNinjaFormUtils.TEXT.name_text);

            driver.findElement(By.id(eaNinjaFormUtils.Locator.email_id)).click();
            driver.findElement(By.id(eaNinjaFormUtils.Locator.email_id)).sendKeys(eaNinjaFormUtils.TEXT.email_text);

            WebElement message = driver.findElement(By.id(eaNinjaFormUtils.Locator.message_id));
            message.click();
            message.sendKeys(eaNinjaFormUtils.TEXT.message_text);


            js.executeScript("arguments[0].scrollIntoView();", message);
            Thread.sleep(1000);
            driver.findElement(By.id(eaNinjaFormUtils.Locator.submit_button_id)).click();

            Thread.sleep(2000);

            WebElement element_1 = driver.findElement(By.xpath(eaNinjaFormUtils.Locator.success_message_1_xpth));
            WebElement element_2 = driver.findElement(By.xpath(eaNinjaFormUtils.Locator.success_message_2_xpth));

            if (element_1.isDisplayed() && element_2.isDisplayed()) {
                System.out.println("Success message is visible");
                softassert.assertEquals(element_1.getText(), eaNinjaFormUtils.TEXT.success_message_1_text);
                softassert.assertEquals(element_2.getText(), eaNinjaFormUtils.TEXT.success_message_2_text);
            } else {
                System.out.println("Success message is NOT visible");
            }

            softassert.assertAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
