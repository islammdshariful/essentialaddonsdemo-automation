package wpdev.ea.utils;

public class eaInfoBoxUtils {
	public static class TEXT {
		public static final String flipbox_page_title = "Info Box | Essential Addons for Elementor";
		public static final String documentation_page = "INFO BOX";

		// FIRST INFO BOX
		public static final String first_infobox_text = "Development";

		// 2ND INFO BOX
		public static final String second_infobox_title_text = "Easy To Use";
		public static final String second_infobox_description_text = "Netflix has struck a deal set permanent production base at Shepperton Studios, from Alien to Mary Poppins Returns";

	}

	public static class Locator {
		// DOCUMENTATION PAGE
		public static final String documentation_title_id = "betterdocs-entry-title";
		public static final String documentation_link_path = "//*[@id=\"post-1509\"]/div/div/div/div/section[1]/div[4]/div/div[2]/div/div/section/div/div/div[2]/div/div/div[3]/div/div/a";

		// FIRST INFO BOX
		public static final String firstinfobox_text_xpath = "//*[@id=\"post-1509\"]/div/div/div/div/section[2]/div/div/div/div/div/section[2]/div/div/div[1]/div/div/div/div/div/div[2]";

		// 2ND INFO BOX
		public static final String secondinfobox_header_text_xpath = "//*[@id=\"post-1509\"]/div/div/div/div/section[3]/div/div/div/div/div/section[2]/div/div/div[1]/div/div/div/div/div/div[2]/h4";
		public static final String secondinfobox_description_xpath = "//*[@id=\"post-1509\"]/div/div/div/div/section[3]/div/div/div/div/div/section[2]/div/div/div[1]/div/div/div/div/div/div[2]/p";

	}

}
