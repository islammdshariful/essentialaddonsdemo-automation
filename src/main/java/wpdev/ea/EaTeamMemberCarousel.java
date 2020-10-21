package wpdev.ea;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import wpdev.ea.utils.eaTeamMemberCarouselUtils;

public class EaTeamMemberCarousel {
	public static void eaTeamMemberCarousel(WebDriver driver) {

		try {
			assertEquals(driver.getTitle(), eaTeamMemberCarouselUtils.TEXT.teammembercarousel_page_title);
			System.out.println("Page title passed !!");

			driver.findElement(By.xpath(eaTeamMemberCarouselUtils.Locator.documentation_link_path)).click();

			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));

			assertEquals(driver.findElement(By.id(eaTeamMemberCarouselUtils.Locator.documentation_title_id)).getText(),
					eaTeamMemberCarouselUtils.TEXT.documentation_page);
			System.out.println("Documentation link passed !!");
			driver.close();

			driver.switchTo().window(tabs2.get(0));

			Thread.sleep(1000);
			Actions mousehover = new Actions(driver);

			// MEMBER 1

			WebElement member1 = driver.findElement(By.xpath(eaTeamMemberCarouselUtils.Locator.member_image_xpath));
			mousehover.moveToElement(member1).build().perform();
			WebElement member_1_fb_icon = driver
					.findElement(By.xpath(eaTeamMemberCarouselUtils.Locator.member_social_fb_xpath));
			if (member_1_fb_icon.isDisplayed()) {
				System.out.println("Facebook link passed !!");
			}
			WebElement member_1_tw_icon = driver
					.findElement(By.xpath(eaTeamMemberCarouselUtils.Locator.member_social_tw_xpath));
			if (member_1_tw_icon.isDisplayed()) {
				System.out.println("Twitter link passed !!");
			}
			WebElement member_1_in_icon = driver
					.findElement(By.xpath(eaTeamMemberCarouselUtils.Locator.member_social_in_xpath));
			if (member_1_in_icon.isDisplayed()) {
				System.out.println("LinkedIn link passed !!");
			}
			assertEquals(driver.findElement(By.xpath(eaTeamMemberCarouselUtils.Locator.member_name_xpath)).getText(),
					eaTeamMemberCarouselUtils.TEXT.memeber_name_text);
			assertEquals(
					driver.findElement(By.xpath(eaTeamMemberCarouselUtils.Locator.memeber_position_xpath)).getText(),
					eaTeamMemberCarouselUtils.TEXT.memeber_position_text);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
