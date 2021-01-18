package utils;

public class eaEventCalenderUtils {

	public static class TEXT {
		public static final String eventcalender_page_title = "Event Calendar | Essential Addons for Elementor";

		// DOCUMENTATION PAGE
		public static final String documentation_page = "EA EVENT CALENDAR";

		public static final String event_on_doc_page = "EA EVENT CALENDAR INTEGRATION: THE EVENTON WORDPRESS PLUGIN";
		public static final String the_event_doc_page = "EA EVENT CALENDAR INTEGRATION: THE EVENT CALENDAR WORDPRESS PLUGIN";

		// MONTH FOR MANUAL
		public static final String month_title = "July 2020";

		// MONTH POPUP WINDOW FOR MANUAL
		public static final String event_title = "Event Title Jul";
		public static final String event_start_time_text = "Jul 4th 7:00 AM";
		public static final String event_end_time_text = "- 7:00 AM";
		public static final String event_description_text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Quis ipsum suspendisse ultrices gravida. Risus commodo viverra maecenas accumsan lacus vel facilisis. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";

	}

	public static class Locator {
		// DOCUMENTATION PAGE
		public static final String documentation_title_id = "betterdocs-entry-title";
		public static final String documentation_link_xpath = "//*[@id=\"post-257828\"]/div/div/div/div/section[1]/div[3]/div/div[2]/div/div/section/div/div/div[2]/div/div/div[3]/div/div/a/span/span";

		public static final String ea_event_calender_4_elementor_doc_link_xpath = "//*[@id=\"post-257828\"]/div/div/div/div/section[2]/div/div/div[2]/div/div/section/div/div/div[1]/div/div/div/div/div/figure/a";
		public static final String google_calender_doc_link_xpath = "//*[@id=\"post-257828\"]/div/div/div/div/section[2]/div/div/div[2]/div/div/section/div/div/div[2]/div/div/div[1]/div/div/figure/a";
		public static final String event_on_doc_doc_link_xpath = "//*[@id=\"post-257828\"]/div/div/div/div/section[2]/div/div/div[2]/div/div/section/div/div/div[2]/div/div/div[2]/div/div/figure/a";
		public static final String the_event_calender_doc_link_xpath = "//*[@id=\"post-257828\"]/div/div/div/div/section[2]/div/div/div[2]/div/div/section/div/div/div[2]/div/div/div[3]/div/div/figure/a";

		// MANUAL BUTTONS
		public static final String manual_month_button_xpath = "//*[@id=\"eael-event-calendar-22bed70e\"]/div[1]/div[3]/div/button[3]";
		public static final String manual_day_button_xpath = "//*[@id=\"eael-event-calendar-22bed70e\"]/div[1]/div[3]/div/button[1]";
		public static final String manual_week_button_xpath = "//*[@id=\"eael-event-calendar-22bed70e\"]/div[1]/div[3]/div/button[2]";
		public static final String manual_list_button_xpath = "//*[@id=\"eael-event-calendar-22bed70e\"]/div[1]/div[3]/div/button[4]";

		// NAVIGATION BUTTONS FOR MANUAL
		public static final String navigation_left_xpath = "//*[@id=\"eael-event-calendar-22bed70e\"]/div[1]/div[1]/div/button[1]/span";
		public static final String navigation_right_xpath = "//*[@id=\"eael-event-calendar-22bed70e\"]/div[1]/div[1]/div/button[2]/span";
		public static final String get_month_title_xpath = "//*[@id=\"eael-event-calendar-22bed70e\"]/div[1]/div[2]";
		public static final String click_event_xpath = "//*[@id=\"eael-event-calendar-22bed70e\"]/div[2]/div/table/tbody/tr/td/div/div/div[1]/div[2]/table/tbody/tr/td[6]/a/div/span[2]";

		// MONTH POPUP WINDOW
		public static final String check_event_title_xpath = "//*[@id=\"eaelecModal\"]/div[2]/div[1]/h2";
		public static final String check_start_time_xpath = "//*[@id=\"eaelecModal\"]/div[2]/div[1]/span[1]";
		public static final String check_end_time_xpath = "//*[@id=\"eaelecModal\"]/div[2]/div[1]/span[2]";
		public static final String check_event_description = "//*[@id=\"eaelecModal\"]/div[2]/div[2]/p";
		public static final String cross_icon_xpath = "//*[@id=\"eaelecModal\"]/div[2]/div[1]/div/span/i";

		// DAY POP WINDOW
		public static final String click_day_event_xpath = "//*[@id=\"eael-event-calendar-22bed70e\"]/div[2]/div/table/tbody/tr/td/div[2]/div/div[3]/table/tbody/tr/td[2]/div/div[2]/a/div";

		// WEEK POPUP WINDOW
		public static final String click_week_event_xpath = "//*[@id=\"eael-event-calendar-22bed70e\"]/div[2]/div/table/tbody/tr/td/div[2]/div/div[3]/table/tbody/tr/td[7]/div/div[2]/a/div";

		// LIST POPUP WINDOW
		public static final String click_list_event_xpath = "//*[@id=\"eael-event-calendar-22bed70e\"]/div[2]/div/div/table/tbody/tr[2]/td[3]";

	}

}
