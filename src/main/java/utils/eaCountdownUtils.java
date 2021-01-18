package utils;

public class eaCountdownUtils {
	public static class TEXT {
		public static final String countdown_title = "Countdown | Essential Addons for Elementor";
		public static final String documentation_page = "COUNTDOWN";

		public static final String countdown_header_text = "Showcase Stunning Countdown Effects";
		public static final String countdown_des_text = "Build and design your timer by trying out different styles of Countdown";

		// TIME VALUE TEXT
		public static final String day_value_text = "450";
		public static final String hour_value_text = "10";
		public static final String min_value_text = "51";

		// TIME TEXT
		public static final String day_text = "DAYS";
		public static final String hour_text = "HOURS";
		public static final String min_text = "MINUTES";
		public static final String sec_text = "SECONDS";
		
		public static final String end_text_text = "Coming Soon!";
		public static final String end_des_text = "We are currently working on an awesome new design. Stay tuned for more information.";
	}

	public static class Locator {
		// DOCUMENTATION PAGE
		public static final String documentation_title_id = "betterdocs-entry-title";
		public static final String documentation_link_path = "//*[@id=\"post-23\"]/div/div/div/div/section[1]/div[4]/div/div[2]/div/div/section/div/div/div[2]/div/div/div[3]/div/div/a";

		public static final String countdown_header_xpath = "//*[@id=\"post-23\"]/div/div/div/div/section[2]/div/div/div/div/div/section[1]/div/div/div/div/div/div[1]/div/h3";
		public static final String countdown_des_xpath = "//*[@id=\"post-23\"]/div/div/div/div/section[2]/div/div/div/div/div/section[1]/div/div/div/div/div/div[2]/div/div";

		// TIME VALUE
		public static final String day_value_xpath = "//*[@id=\"eael-countdown-56d8c80a\"]/li[1]/div/span[1]";
		public static final String hour_value_xpath = "//*[@id=\"eael-countdown-56d8c80a\"]/li[2]/div/span[1]";
		public static final String min_value_xpath = "//*[@id=\"eael-countdown-56d8c80a\"]/li[3]/div/span[1]";
		public static final String sec_value_xpath = "//*[@id=\"eael-countdown-56d8c80a\"]/li[4]/div/span[1]";

		// TIME TEXT
		public static final String day_text_xpath = "//*[@id=\"eael-countdown-56d8c80a\"]/li[1]/div/span[2]";
		public static final String hour_text_xpath = "//*[@id=\"eael-countdown-56d8c80a\"]/li[2]/div/span[2]";
		public static final String min_text_xpath = "//*[@id=\"eael-countdown-56d8c80a\"]/li[3]/div/span[2]";
		public static final String sec_text_xpath = "//*[@id=\"eael-countdown-56d8c80a\"]/li[4]/div/span[2]";
		
		//END TEXT
		public static final String end_text_xpath = "//*[@id=\"post-23\"]/div/div/div/div/section[2]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div[2]/div/h2";
		public static final String end_des_xpath = "//*[@id=\"post-23\"]/div/div/div/div/section[2]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div[3]/div/div/p";
		
	}
}
