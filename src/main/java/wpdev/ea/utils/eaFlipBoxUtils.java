package wpdev.ea.utils;

public class eaFlipBoxUtils {
	public static class TEXT {
		public static final String flipbox_page_title = "Flip Box | Essential Addons for Elementor";
		public static final String documentation_page = "FLIP BOX";

		// FLIP BOX 1
		public static final String flip1_front_text = "Interface Design";
		public static final String flip1_back_text = "Back Title";

		// FLIP BOX 1
		public static final String flip2_front_text = "Development";
		public static final String flip2_back_text = "Back Title";

	}

	public static class Locator {
		// DOCUMENTATION PAGE
		public static final String documentation_title_id = "betterdocs-entry-title";
		public static final String documentation_link_path = "//*[@id=\"post-1519\"]/div/div/div/div/section[1]/div[3]/div/div[2]/div/div/section/div/div/div[2]/div/div/div[3]/div/div/a";

		// FLIP BOX 1
		public static final String flip1_box_xpath = "//*[@id=\"post-1519\"]/div/div/div/div/section[2]/div/div/div/div/div/section[2]/div/div/div[1]/div/div/div/div/div/a/div[1]";
		public static final String flip1_front_text_xpath = "//*[@id=\"post-1519\"]/div/div/div/div/section[2]/div/div/div/div/div/section[2]/div/div/div[1]/div/div/div/div/div/a/div[1]/div/div/div/h2";
		public static final String flip1_back_text_xpath = "//*[@id=\"post-1519\"]/div/div/div/div/section[2]/div/div/div/div/div/section[2]/div/div/div[1]/div/div/div/div/div/a/div[2]/div/div/div/h2";

		// FLIP BOX 2
		public static final String flip2_box_xpath = "//*[@id=\"post-1519\"]/div/div/div/div/section[2]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/div/a/div[1]";
		public static final String flip2_front_text_xpath = "//*[@id=\"post-1519\"]/div/div/div/div/section[2]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/div/a/div[1]/div/div/div/h2";
		public static final String flip2_back_text_xpath = "//*[@id=\"post-1519\"]/div/div/div/div/section[2]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/div/a/div[2]/div/div/div/h2";

	}
}
