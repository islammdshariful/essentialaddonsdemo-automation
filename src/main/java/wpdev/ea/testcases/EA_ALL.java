package wpdev.ea.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import wpdev.ea.EaAdvancedAccordion;
import wpdev.ea.EaAdvancedDataTable;
import wpdev.ea.EaAdvancedMenu;
import wpdev.ea.EaAdvancedTabs;
import wpdev.ea.EaContentTicker;
import wpdev.ea.EaContentTimeline;
import wpdev.ea.EaCreativeButton;
import wpdev.ea.EaDataTable;
import wpdev.ea.EaDualColorHeadline;
import wpdev.ea.EaDynamicGallery;
import wpdev.ea.EaFeatureList;
import wpdev.ea.EaFlipBox;
import wpdev.ea.EaInfoBox;
import wpdev.ea.EaOffcanvasContent;
import wpdev.ea.EaProtectedContent;
import wpdev.ea.EaSmartPostList;
import wpdev.ea.EaStaticProduct;
import wpdev.ea.EaTeamMember;
import wpdev.ea.EaTestimonials;
import wpdev.ea.EaToggle;
import wpdev.ea.EaTooltip;
import wpdev.ea.utils.Config;
import wpdev.ea.utils.DriverManager;

public class EA_ALL {
	WebDriver driver = null;

	@Test
	public void invokeBrowser() {
		driver = DriverManager.driver;
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@Test(dependsOnMethods = "invokeBrowser")
	public void openPage() {
//		driver.get(Config.url+"flip-box/");
		driver.get(Config.url);
	}

	@Test(dependsOnMethods = "openPage")
	public void eaAllTestCase() {
		System.out.println("--------ADVANCE ACCORDION--------");
		EaAdvancedAccordion.eaAdvancedAccordion(driver, "advanced-accordion/");
		System.out.println("--------ADVANCE DATA TABLE--------");
		EaAdvancedDataTable.eaAdvancedDataTable(driver, "advanced-data-table/");
		System.out.println("--------ADVANCE MENU--------");
		EaAdvancedMenu.eaAdvancedMenu(driver, "advanced-menu/");
		System.out.println("--------ADVANCE TAB--------");
		EaAdvancedTabs.eaAdvanceTab(driver, "advanced-tabs/");
		System.out.println("--------CONTENT TICKER--------");
		EaContentTicker.eaContentTicker(driver, "content-ticker/");
		System.out.println("--------CONTENT TIMELINE--------");
		EaContentTimeline.eaontentTimeline(driver, "content-timeline/");
		System.out.println("--------CREATIVE BUTTONS--------");
		EaCreativeButton.eaCreativeButton(driver, "creative-buttons/");
		System.out.println("--------EA DATA TABLE--------");
		EaDataTable.eaDataTable(driver, "table/");
		System.out.println("--------DUAL COLOR HEADLINE--------");
		EaDualColorHeadline.eaDualColorHeadline(driver, "dual-color-headline/");
//		System.out.println("--------DYNAMIC GALLERY--------");
//		EaDynamicGallery.eaDynamicGallery(driver, "dynamic-gallery/"); //need update
		System.out.println("--------FEATURE LIST--------");
		EaFeatureList.eaFeatureList(driver, "feature-list/");
		System.out.println("--------FLIP BOX--------");
		EaFlipBox.eaFlipBox(driver, "flip-box/");
		System.out.println("--------INFO BOX--------");
		EaInfoBox.eaInfoBox(driver, "info-box/");
//		System.out.println("--------OFFCANVAS CONTENT--------");
//		EaOffcanvasContent.eaOffcanvasContent(driver, "offcanvas-content/"); //need update
		System.out.println("--------PROTECTED CONTENT--------");
		EaProtectedContent.eaProtectedContent(driver, "protected-content/");
//		System.out.println("--------SMART POST LIST--------"); //need update
//		EaSmartPostList.eaSmartPostList(driver, "post-list/");
		System.out.println("--------STATIC PRODUCT--------");
		EaStaticProduct.eaStaticProduct(driver, "static-product/");
		System.out.println("--------TEAM MEMEBERS--------");
		EaTeamMember.eaTeamMember(driver, "team-members/");
		System.out.println("-------TESTIMONIALS SLIDE--------");
		EaTestimonials.eaTestimonials(driver, "testimonials/");
		System.out.println("-------CONTENT TOGGLE--------");
		EaToggle.eaToggle(driver, "content-toggle/");
		System.out.println("-------TOOLTIP--------");
		EaTooltip.eaTooltip(driver, "tooltip/");
		driver.close();
	}
}
