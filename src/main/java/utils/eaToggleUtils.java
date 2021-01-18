package utils;

public class eaToggleUtils {

	public static class TEXT {

		public static final String toggle_page_title = "Content Toggle | Essential Addons for Elementor";

		public static final String documentation_page = "CONTENT TOGGLE";

		// BASIC - STANDARD - ENTERPRISE TOGGLE
		public static final String limited__basic = "Basic";
		public static final String limited__standard = "Standard";
		public static final String limited__enterprise = "Enterprise";

		public static final String unlimited_1_website = "1 Website";
		public static final String unlimited_3_ebsites = "3 Websites";
		public static final String unlimited_website = "Unlimited";

		// SINGLE - UNLIMITED TOGGLE
		public static final String single_text = "Single";
		public static final String unlimited_text = "Unlimited";

		// DATATABLE - COMPARISON TOGGLE
		public static final String day_text = "Day";
		public static final String time_text = "Time";
		public static final String class_text = "Class";
		public static final String intructor_text = "Instructor";

		public static final String feature_text = "Features";
		public static final String elementor_text = "Elementor";
		public static final String elementor_pro_text = "Elementor Pro";
		public static final String elementor_gold_text = "Elementor Gold";

		// CURRENT FEATURE - UPCOMMING FEATURE TOGGGLE
		public static final String creative_text = "Creative Buttons";
		public static final String content_text = "Content Ticker";

		public static final String info_box_text = "Info Box";
		public static final String advance_tabs_text = "Advanced Tabs";

		// GET STARED PRICE
		public static final String pricing_text = "Flexible Pricing for Everyone";
	}

	public static class Locator {
		// DOCUMENTATION PAGE
		public static final String documentation_title_id = "betterdocs-entry-title";

		public static final String documentation_link_xpath = "//*[@id=\"post-2605\"]/div/div/div/div/section[1]/div[3]/div/div[2]/div/div/section/div/div/div[2]/div/div/div[3]/div/div/a";

		// LIMITED - UNLIMITED TOGGLE BUTTON
		public static final String toggle_button_xpath = "//*[@id=\"eael-toggle-container-3591ac1\"]/div[1]/div/div[2]/label/span";

		public static final String limited_basic_text_xpath = "//*[@id=\"eael-toggle-container-3591ac1\"]/div[2]/div[1]/div/div/section/div/div/div[1]/div/div/div/div/div/div/div[1]/h2";
		public static final String limited_standard_text_xpath = "//*[@id=\"eael-toggle-container-3591ac1\"]/div[2]/div[1]/div/div/section/div/div/div[2]/div/div/div/div/div/div/div[1]/h2";
		public static final String limited_enterprise_text_xpath = "//*[@id=\"eael-toggle-container-3591ac1\"]/div[2]/div[1]/div/div/section/div/div/div[3]/div/div/div/div/div/div/div[1]/h2";

		public static final String unlimited_1_website_text_xpath = "//*[@id=\"eael-toggle-container-3591ac1\"]/div[2]/div[2]/div/div/section/div/div/div[1]/div/div/div/div/div/div/div[1]/h2";
		public static final String unlimited_2_website_text_xpath = "//*[@id=\"eael-toggle-container-3591ac1\"]/div[2]/div[2]/div/div/section/div/div/div[2]/div/div/div/div/div/div/div[1]/h2";
		public static final String unlimited_website_text_xpath = "//*[@id=\"eael-toggle-container-3591ac1\"]/div[2]/div[2]/div/div/section/div/div/div[3]/div/div/div/div/div/div/div[1]/h2";

		// SINGLE - UNLIMITED TOGGLE BUTTON
		public static final String single_toggle_button_xpath = "//*[@id=\"eael-toggle-container-6bee69bf\"]/div[1]/div/div[2]/label/span";
		public static final String single_text_xpath = "//*[@id=\"eael-toggle-container-6bee69bf\"]/div[2]/div[1]/div/div/section/div/div/div/div/div/div/div/div/div/div[2]/h2";
		public static final String unlimited_text_xpath = "//*[@id=\"eael-toggle-container-6bee69bf\"]/div[2]/div[2]/div/div/section/div/div/div/div/div/div/div/div/div/div[2]/h2";

		// DATATABLE - COMPARION TABLE TOGGLE BUTTON

		public static final String data_table_toggle_button_xpath = "//*[@id=\"eael-toggle-container-498b5c9b\"]/div[1]/div/div[2]/label/span";

		public static final String day_text_xpath = "//*[@id=\"eael-data-table-3dcd083e\"]/thead/tr/th[1]/span";
		public static final String time_text_xpath = "//*[@id=\"eael-data-table-3dcd083e\"]/thead/tr/th[2]/span";
		public static final String class_text_xpath = "//*[@id=\"eael-data-table-3dcd083e\"]/thead/tr/th[3]/span";
		public static final String instructor_text_xpath = "//*[@id=\"eael-data-table-3dcd083e\"]/thead/tr/th[4]/span";

		public static final String feature_text_xpath = "//*[@id=\"eael-data-table-3adb3c51\"]/thead/tr/th[1]/span";
		public static final String elementor_text_xpath = "//*[@id=\"eael-data-table-3adb3c51\"]/thead/tr/th[2]/span";
		public static final String elementor_pro_text_xpath = "//*[@id=\"eael-data-table-3adb3c51\"]/thead/tr/th[3]/span";
		public static final String elementor_gold_text_xpath = "//*[@id=\"eael-data-table-3adb3c51\"]/thead/tr/th[4]/span";

		// CURRENT FEATURE - UPCOMMING FEATURE TOGGLE BUTTON

		public static final String current_feature_toggle_button_xpath = "//*[@id=\"eael-toggle-container-4762ef82\"]/div[1]/div/div[2]/label/span";
		public static final String info_box_text_xpath = "//*[@id=\"eael-toggle-container-4762ef82\"]/div[2]/div[1]/div/div/section/div/div/div/div/div/section[1]/div/div/div[1]/div/div/div/div/a/div/div[2]/h4";
		public static final String advanced_tabs_text_xpath = "//*[@id=\"eael-toggle-container-4762ef82\"]/div[2]/div[1]/div/div/section/div/div/div/div/div/section[2]/div/div/div[4]/div/div/div/div/a/div/div[2]/h4";
		public static final String creative_button_text_xpath = "//*[@id=\"eael-toggle-container-4762ef82\"]/div[2]/div[2]/div/div/section/div/div/div/div/div/section[1]/div/div/div[1]/div/div/div/div/a/div/div[2]/h4";
		public static final String content_ticker_text_xpath = "//*[@id=\"eael-toggle-container-4762ef82\"]/div[2]/div[2]/div/div/section/div/div/div/div/div/section[2]/div/div/div[4]/div/div/div/div/a/div/div[2]/h4";

		// GET STARTED LINK
		public static final String get_stared_link_xpath = "/html/body/div[3]/div[2]/div/section[1]/div/div/div/div/div/section/div/div/div[2]/div/div/div/div/div/a/div/span";
		public static final String pricing_text_xpath = "//*[@id=\"pricing\"]/div/div/div/div/div/section/div/div/div/div/div/div[1]/div/h2";

	}

}
