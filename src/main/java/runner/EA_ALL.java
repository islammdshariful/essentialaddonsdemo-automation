package runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import testcases.EaAdvancedAccordion;
import testcases.EaAdvancedDataTable;
import testcases.EaAdvancedMenu;
import testcases.EaAdvancedTabs;
import testcases.EaCallToAction;
import testcases.EaContentTicker;
import testcases.EaContentTimeline;
import testcases.EaCountdown;
import testcases.EaCounter;
import testcases.EaCreativeButton;
import testcases.EaDataTable;
import testcases.EaDivider;
import testcases.EaDualColorHeadline;
import testcases.EaDynamicGallery;
import testcases.EaEventCalendar;
import testcases.EaFancyText;
import testcases.EaFeatureList;
import testcases.EaFilterableGallery;
import testcases.EaFlipBox;
import testcases.EaImageAccordion;
import testcases.EaImageComparison;
import testcases.EaImageHotspots;
import testcases.EaInfoBox;
import testcases.EaInstagramFeed;
import testcases.EaInteractiveCards;
import testcases.EaInteractivePromo;
import testcases.EaLightboxModal;
import testcases.EaLogoCarousel;
import testcases.EaOffcanvasContent;
import testcases.EaOnePageNavigation;
import testcases.EaPostBlock;
import testcases.EaPostCarousel;
import testcases.EaPostGrid;
import testcases.EaPostTimeline;
import testcases.EaPriceMenu;
import testcases.EaPricingTable;
import testcases.EaProgressBar;
import testcases.EaProtectedContent;
import testcases.EaSmartPostList;
import testcases.EaStaticProduct;
import testcases.EaStickyVideo;
import testcases.EaTeamMember;
import testcases.EaTeamMemberCarousel;
import testcases.EaTestimonialSlider;
import testcases.EaTestimonials;
import testcases.EaToggle;
import testcases.EaTooltip;
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
		driver.get(Config.url);
	}

	@Test(dependsOnMethods = "openPage")
	public void eaAllTestCase() {
		System.out.println("--------ADVANCE ACCORDION--------");
		EaAdvancedAccordion.eaAdvancedAccordion(driver, "advanced-accordion/");
		System.out.println("--------ADVANCE ACCORDION PASSED--------");

		System.out.println("--------ADVANCE DATA TABLE--------");
		EaAdvancedDataTable.eaAdvancedDataTable(driver, "advanced-data-table/");
		System.out.println("--------ADVANCE DATA TABLE PASSED--------");

		System.out.println("--------ADVANCE MENU--------");
		EaAdvancedMenu.eaAdvancedMenu(driver, "advanced-menu/");
		System.out.println("--------ADVANCE MENU PASSED--------");
		
		System.out.println("--------ADVANCE TAB--------");
		EaAdvancedTabs.eaAdvanceTab(driver, "advanced-tabs/");
		System.out.println("--------ADVANCE TAB PASSED--------");
		
		System.out.println("--------CALL TO ACTION--------");
		EaCallToAction.eaCallToAction(driver, "call-to-action/");
		System.out.println("--------CALL TO ACTION PASSED--------");
		
		System.out.println("--------CONTENT TICKER--------");
		EaContentTicker.eaContentTicker(driver, "content-ticker/");
		System.out.println("--------CONTENT TICKER PASSED--------");
		
		System.out.println("--------CONTENT TIMELINE--------");
		EaContentTimeline.eaontentTimeline(driver, "content-timeline/");
		System.out.println("--------CONTENT TIMELINE PASSED--------");
		
		System.out.println("--------COUNTDOWN--------");
		EaCountdown.eaCountdown(driver, "countdown/");
		System.out.println("--------COUNTDOWN PASSED--------");
		
		System.out.println("--------COUNTER--------");
		EaCounter.eaCounter(driver, "counter/");
		System.out.println("--------COUNTER PASSED--------");
		
		System.out.println("--------CREATIVE BUTTONS--------");
		EaCreativeButton.eaCreativeButton(driver, "creative-buttons/");
		System.out.println("--------CREATIVE BUTTONS PASSED--------");
		
		
		System.out.println("--------EA DATA TABLE--------");
		EaDataTable.eaDataTable(driver, "table/");
		System.out.println("--------EA DATA TABLE PASSED--------");
		
		System.out.println("--------DIVIDER--------");
		EaDivider.eaDivider(driver, "divider/");
		System.out.println("--------DIVIDER PASSED--------");
		
		
		System.out.println("--------DUAL COLOR HEADLINE--------");
		EaDualColorHeadline.eaDualColorHeadline(driver, "dual-color-headline/");
		System.out.println("--------DUAL COLOR HEADLINE PASSED--------");
		
		System.out.println("--------DYNAMIC GALLERY--------");
		EaDynamicGallery.eaDynamicGallery(driver, "dynamic-gallery/");
		System.out.println("--------DYNAMIC GALLERY PASSED--------");
		
		System.out.println("--------FANCY TEXT--------");
		EaFancyText.eaFancyText(driver, "fancy-text/");
		System.out.println("--------FANCY TEXT PASSED--------");
		
		System.out.println("--------FEATURE LIST--------");
		EaFeatureList.eaFeatureList(driver, "feature-list/");
		System.out.println("--------FEATURE LIST PASSED--------");
		
		System.out.println("--------FILTERABLE GALLERY--------");
		EaFilterableGallery.eaFilterableGallery(driver, "filterable-gallery/");
		System.out.println("--------FILTERABLE GALLERY PASSED--------");
		
		System.out.println("--------FLIP BOX--------");
		EaFlipBox.eaFlipBox(driver, "flip-box/");
		System.out.println("--------FLIP BOX PASSED--------");
		
		System.out.println("--------IMAGE ACCORDION--------");
		EaImageAccordion.eaImageAccordion(driver, "image-accordion/");
		System.out.println("--------IMAGE ACCORDION PASSED--------");
		
		System.out.println("--------IMAGE COMPARISON--------");
		EaImageComparison.eaImageComparison(driver, "image-comparison/");
		System.out.println("--------IMAGE COMPARISON PASSED--------");
		
		System.out.println("--------IMAGE HOTSPOTS--------");
		EaImageHotspots.eaEaImageHotspots(driver, "image-hotspots/");
		System.out.println("--------IMAGE HOTSPOTS PASSSED--------");
		
		System.out.println("--------INFO BOX--------");
		EaInfoBox.eaInfoBox(driver, "info-box/");
		System.out.println("--------INFO BOX PASSED--------");
		
		System.out.println("--------INSTAGRAM FEED--------");
		EaInstagramFeed.eaInstagramFeed(driver, "instagram-feed/");
		System.out.println("--------INSTAGRAM FEED PASSED--------");
		
		System.out.println("--------INTERACTIVE CARDS--------");
		EaInteractiveCards.eaInteractiveCards(driver, "interactive-cards/");
		System.out.println("--------INTERACTIVE CARDS PASSED--------");
		
		System.out.println("--------INTERACTIVE PROMO--------");
		EaInteractivePromo.eaInteractivePromo(driver, "interactive-promo/");
		System.out.println("--------INTERACTIVE PROMO PASSED--------");
		
		System.out.println("--------LIGHTBOX AND MODAL--------");
		EaLightboxModal.eaLightboxModal(driver, "lightbox-modal/");
		System.out.println("--------LIGHTBOX AND MODAL PASSSED--------");
		
		System.out.println("--------LOGO CAROUSEL--------");
		EaLogoCarousel.eaLogoCarousel(driver, "logo-carousel/");
		System.out.println("--------LOGO CAROUSEL PASSED--------");
		
		System.out.println("--------OFFCANVAS CONTENT--------");
		EaOffcanvasContent.eaOffcanvasContent(driver, "offcanvas-content/");
		System.out.println("--------OFFCANVAS CONTENT PASSED--------");
		
		System.out.println("--------ONE PAGE NAVIGATION--------");
		EaOnePageNavigation.eaOnePageNavigation(driver, "one-page-nav/");
		System.out.println("--------ONE PAGE NAVIGATION PASSED--------");
		
		System.out.println("--------PRICE MENU--------");
		EaPriceMenu.eaPriceMenu(driver, "price-menu/");
		System.out.println("--------PRICE MENU PASSED--------");
		
		System.out.println("--------PRICING TABLE--------");
		EaPricingTable.eaPricingTable(driver, "pricing-table/");
		System.out.println("--------PRICING TABLE PASSED--------");
		
		System.out.println("--------PROGRESS BAR--------");
		EaProgressBar.eaProgressBar(driver, "progress-bar/");
		System.out.println("--------PROGRESS BAR PASSED--------");
		
		System.out.println("--------PROTECTED CONTENT--------");
		EaProtectedContent.eaProtectedContent(driver, "protected-content/");
		System.out.println("--------PROTECTED CONTENT PASSSED--------");
				
		System.out.println("--------STATIC PRODUCT--------");
		EaStaticProduct.eaStaticProduct(driver, "static-product/");
		System.out.println("--------STATIC PRODUCT PASSED--------");
		
		System.out.println("--------STICKY VIDEO--------");
		EaStickyVideo.eaStickyVideo(driver, "sticky-video/");
		System.out.println("--------STICKY VIDEO PASSED--------");
		
		System.out.println("--------TEAM MEMEBERS--------");
		EaTeamMember.eaTeamMember(driver, "team-members/");
		System.out.println("--------TEAM MEMEBERS PASSED--------");
		
		System.out.println("--------TEAM MEMEBERS CAROUSEL--------");
		EaTeamMemberCarousel.eaTeamMemberCarousel(driver, "team-members-carousel/");
		System.out.println("--------TEAM MEMEBERS CAROUSEL PASSED--------");
		
		System.out.println("-------TESTIMONIALS--------");
		EaTestimonials.eaTestimonials(driver, "testimonials/");
		System.out.println("-------TESTIMONIALS PASSED--------");
		
		System.out.println("-------TESTIMONIALS SLIDE--------");
		EaTestimonialSlider.eaTestimonialSlider(driver, "testimonial-slider/");
		System.out.println("-------TESTIMONIALS SLIDE PASSED--------");
		
		System.out.println("-------CONTENT TOGGLE--------");
		EaToggle.eaToggle(driver, "content-toggle/");
		System.out.println("-------CONTENT TOGGLE PASSED--------");
		
		System.out.println("-------TOOLTIP--------");
		EaTooltip.eaTooltip(driver, "tooltip/");
		System.out.println("-------TOOLTIP PASSED--------");
		
		System.out.println("--------POST BLOCK--------");
		EaPostBlock.eaPostBlock(driver, "post-block/");
		System.out.println("--------POST BLOCK PASSED--------");
		
		System.out.println("--------POST CAROUSEL--------");
		EaPostCarousel.eaPostCarousel(driver, "post-carousel/");
		System.out.println("--------POST CAROUSEL PASSED--------");
		
		System.out.println("--------POST GRID--------");
		EaPostGrid.eaPostGrid(driver, "post-grid/");
		System.out.println("--------POST GRID PASSED--------");
		
		System.out.println("--------POST TIMELINE--------");
		EaPostTimeline.eaPostTimeline(driver, "post-timeline/");
		System.out.println("--------POST TIMELINE PASSED--------");
		
		System.out.println("--------SMART POST LIST--------");
		EaSmartPostList.eaSmartPostList(driver, "post-list/");
		System.out.println("--------SMART POST PASSED--------");
		
//		System.out.println("--------EVENT CALENDAR--------");
//		EaEventCalendar.eaEventCalender(driver);
//		System.out.println("--------EVENT CALENDAR PASSED--------");
		
		driver.close();
	}
}
