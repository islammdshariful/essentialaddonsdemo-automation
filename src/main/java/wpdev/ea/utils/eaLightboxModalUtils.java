package wpdev.ea.utils;

public class eaLightboxModalUtils {
	public static class TEXT {
		public static final String lightbox_title = "Lightbox & Modal | Essential Addons for Elementor";
		public static final String documentation_page = "LIGHTBOX & MODAL";
		
		//HEADER TEXT
		public static final String header_text_text = "Popup Images On Button Trigger";
		public static final String header_des_text = "Represent your amazing image content on a button click trigger, choose the layout & add animation with it";
	
		//LIGHT BOX
		public static final String lightbox_1_text = "Bordered Image";
		public static final String lightbox_2_text = "Image Gallery";
		public static final String lightbox_3_text = "Custom Overlay";
		public static final String lightbox_4_text = "No Overlay";
	}
	
	public static class Locator {
		// DOCUMENTATION PAGE
		public static final String documentation_title_id = "betterdocs-entry-title";
		public static final String documentation_link_path = "//*[@id=\"post-40\"]/div/div/div/div/section[1]/div[3]/div/div[2]/div/div/section/div/div/div[2]/div/div/div[3]/div/div/a";
	
		//HEADER TEXT
		public static final String header_text_xpath = "//*[@id=\"post-40\"]/div/div/div/div/section[2]/div/div/div/div/div/section[1]/div/div/div[2]/div/div/div[1]/div/h3";
		public static final String header_des_xpath = "//*[@id=\"post-40\"]/div/div/div/div/section[2]/div/div/div/div/div/section[1]/div/div/div[2]/div/div/div[2]/div/div";
	
		//LIGHT BOX
		public static final String lightbox_1_xpath = "//*[@id=\"btn-eael-lightbox-1db7394c\"]";
		public static final String lightbox_2_xpath = "//*[@id=\"btn-eael-lightbox-748ab8ec\"]";
		public static final String lightbox_3_xpath = "//*[@id=\"btn-eael-lightbox-704e1464\"]";
		public static final String lightbox_4_xpath = "//*[@id=\"btn-eael-lightbox-5e43b1d\"]";
		
		//LIGHTBOX - IMAGE
		public static final String lightbox_1_image_xpath = "//*[@id=\"eael-lightbox-window-1db7394c\"]/div/img";
		public static final String lightbox_2_image_xpath = "//*[@id=\"gallery-1\"]";
		public static final String lightbox_3_image_xpath = "//*[@id=\"eael-lightbox-window-704e1464\"]/div/img";
		public static final String lightbox_4_image_xpath = "//*[@id=\"eael-lightbox-window-5e43b1d\"]/div/img";
		
		//LIGHTBOX - CLOSE BUTTON
		public static final String lightbox_1_image_close_button = "//*[@id=\"eael-lightbox-window-1db7394c\"]/button";
		public static final String lightbox_2_image_close_button = "//*[@id=\"eael-lightbox-window-748ab8ec\"]/button";
		public static final String lightbox_3_image_close_button = "//*[@id=\"eael-lightbox-window-704e1464\"]/button";
		public static final String lightbox_4_image_close_button = "//*[@id=\"eael-lightbox-window-5e43b1d\"]/button";
		
	}
	
	
}
