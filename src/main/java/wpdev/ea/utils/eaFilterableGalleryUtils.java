package wpdev.ea.utils;

public class eaFilterableGalleryUtils {
	public static class TEXT {
		public static final String filterable_title = "Filterable Gallery for Elementor | Essential Addons for Elementor";
		public static final String documentation_page = "FILTERABLE GALLERY";
		
		//HEADER TEXT
		public static final String header_text_text = "Filter Images With Gallery Layout";
		public static final String header_des_text = "Display images with separate categories, Grid Styles and customize the overall design to ensure the extraordinary look";
	
		//TABS
		public static final String all_tab_text = "All";
		public static final String news_tab_text = "NEWS";
		public static final String updates_tab_text = "UPDATES";
		public static final String events_tab_text = "EVENTS";
		public static final String masonry_tab_text = "MASONRY";
		
		//HOVER TEXT
		public static final String hover_text = "HIGHLY DELIGHTED PRESENT";
				
	}
	public static class Locator {
		// DOCUMENTATION PAGE
		public static final String documentation_title_id = "betterdocs-entry-title";
		public static final String documentation_link_path = "//*[@id=\"post-1925\"]/div/div/div/div/section[1]/div[4]/div/div[2]/div/div/section/div/div/div[2]/div/div/div[3]/div/div/a";
	
		//HEADER TEXT
		public static final String header_text_xpath = "//*[@id=\"post-1925\"]/div/div/div/div/section[2]/div/div/div/div/div/section/div/div/div[2]/div/div/div[1]/div/h3";
		public static final String header_des_xpath = "//*[@id=\"post-1925\"]/div/div/div/div/section[2]/div/div/div/div/div/section/div/div/div[2]/div/div/div[2]/div/div";
		
		//TABS
		public static final String all_tab_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[1]/ul/li[1]";
		public static final String news_tab_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[1]/ul/li[2]";
		public static final String updates_tab_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[1]/ul/li[3]";
		public static final String events_tab_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[1]/ul/li[4]";
		public static final String masonry_tab_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[1]/ul/li[5]";
				
		//PICTURE HOVER TEXT
		
		
		//ZOOM PHOTO
		public static final String zoom_photo_right_arrow_xpath = "/html/body/div[2]/div/button[2]";
		public static final String zoom_photo_left_arrow_xpath = "/html/body/div[2]/div/button[1]";
		public static final String zoom_photo_cross_button_xpath = "/html/body/div[2]/div/div[1]/div/button";
		
		//PHOTO - ALL TAB
		public static final String all_tab_first_photo_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[1]";
		public static final String all_tab_second_photo_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[2]";
		public static final String all_tab_third_photo_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[3]";		
		//HOVER
		public static final String all_1_hover_text_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[1]/div/div[2]/div[2]/h5";
		public static final String all_2_hover_text_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[2]/div/div[2]/div[2]/h5";
		public static final String all_3_hover_text_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[3]/div/div[2]/div[2]/h5";
		public static final String all_1_hover_zoom_button_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[1]/div/div[2]/div[2]/div/a/span/i";
		public static final String all_2_hover_zoom_button_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[2]/div/div[2]/div[2]/div/a/span/i";
		public static final String all_3_hover_zoom_button_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[3]/div/div[2]/div[2]/div/a/span/i";
		
		
		//PHOTO - NEWS TAB
		public static final String news_tab_first_photo_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[1]/div/div[2]/div[1]";
		public static final String news_tab_second_photo_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[5]/div/div[2]/div[1]";
		//HOVER
		public static final String news_1_hover_text_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[1]/div/div[2]/div[2]/h5";
		public static final String news_2_hover_text_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[5]/div/div[2]/div[2]/h5";
		public static final String news_1_hover_zoom_button_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[1]/div/div[2]/div[2]/div/a/span/i";
		public static final String news_2_hover_zoom_button_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[5]/div/div[2]/div[2]/div/a/span/i";
		
		//PHOTO - UPDATES TAB
		public static final String updates_tab_first_photo_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[2]/div/div[2]/div[1]";
		public static final String updates_tab_second_photo_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[6]/div/div[2]/div[1]";
		//HOVER
		public static final String updates_1_hover_text_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[2]/div/div[2]/div[2]/h5";
		public static final String updates_2_hover_text_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[6]/div/div[2]/div[2]/h5";
		public static final String updates_1_hover_zoom_button_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[2]/div/div[2]/div[2]/div/a/span/i";
		public static final String updates_2_hover_zoom_button_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[6]/div/div[2]/div[2]/div/a/span/i";
		
		
		//PHOTO - EVENTS TAB
		public static final String events_tab_first_photo_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[3]/div/div[2]/div[1]";
		public static final String events_tab_second_photo_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[7]/div/div[2]/div[1]";
		//HOVER
		public static final String events_1_hover_text_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[3]/div/div[2]/div[2]/h5";
		public static final String events_2_hover_text_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[7]/div/div[2]/div[2]/h5";
		public static final String events_1_hover_zoom_button_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[3]/div/div[2]/div[2]/div/a/span/i";
		public static final String events_2_hover_zoom_button_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[7]/div/div[2]/div[2]/div/a/span/i";
		
		//PHOTO - MASONRY TAB
		public static final String masonry_tab_first_photo_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[4]/div/div[2]/div[1]";
		public static final String masonry_tab_second_photo_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[8]/div/div[2]/div[1]";
		//HOVER
		public static final String masonry_1_hover_text_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[4]/div/div[2]/div[2]/h5";
		public static final String masonry_2_hover_text_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[8]/div/div[2]/div[2]/h5";
		public static final String masonry_1_hover_zoom_button_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[4]/div/div[2]/div[2]/div/a/span/i";
		public static final String masonry_2_hover_zoom_button_xpath = "//*[@id=\"eael-filter-gallery-wrapper-66fe3cdd\"]/div[2]/div[8]/div/div[2]/div[2]/div/a/span/i";
	}
}
