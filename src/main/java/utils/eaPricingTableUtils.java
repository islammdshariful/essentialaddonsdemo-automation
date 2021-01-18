package utils;

public class eaPricingTableUtils {
	public static class TEXT {
		public static final String pricingtable_page_title = "Pricing Table | Essential Addons for Elementor";
		public static final String documentation_page = "PRICING TABLE";
		
		public static final String basic_header_text = "Basic";
		public static final String standard_header_text = "Standard";
		public static final String enterprise_header_text = "Enterprise";
	}
	public static class Locator {
		// DOCUMENTATION PAGE
		public static final String documentation_title_id = "betterdocs-entry-title";
		public static final String documentation_link_path = "//*[@id=\"post-1639\"]/div/div/div/div/section[1]/div[3]/div/div[2]/div/div/section/div/div/div[2]/div/div/div[3]/div/div/a";	
	
		public static final String basic_price_card_xpath = "//*[@id=\"post-1639\"]/div/div/div/div/section[2]/div/div/div/div/div/section[2]/div/div/div[1]/div/div";
		public static final String standard_price_card_xpath = "//*[@id=\"post-1639\"]/div/div/div/div/section[2]/div/div/div/div/div/section[2]/div/div/div[2]/div/div";
		public static final String enterprise_price_card_xpath = "//*[@id=\"post-1639\"]/div/div/div/div/section[2]/div/div/div/div/div/section[2]/div/div/div[3]/div/div";
		
		public static final String basic_header_xpath = "//*[@id=\"post-1639\"]/div/div/div/div/section[2]/div/div/div/div/div/section[2]/div/div/div[1]/div/div/div/div/div/div/div[1]/h2";
		public static final String standard_header_xpath = "//*[@id=\"post-1639\"]/div/div/div/div/section[2]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/h2";
		public static final String enterprise_header_xpath = "//*[@id=\"post-1639\"]/div/div/div/div/section[2]/div/div/div/div/div/section[2]/div/div/div[3]/div/div/div/div/div/div/div[1]/h2";
	}
}
