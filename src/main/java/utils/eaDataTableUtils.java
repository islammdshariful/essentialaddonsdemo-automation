package utils;

public class eaDataTableUtils {
	public static class TEXT {
		public static final String datatable_page_title = "EA Data Table";
		public static final String documentation_page = "DATA TABLE";

		// HEADER
		public static final String day_header_text_text = "Day";
		public static final String time_header_text_text = "Time";
		public static final String class_header_text_text = "Class";
		public static final String instructor_header_text = "Instructor";

		// DATA
		public static final String day_data_text_text = "Saturday";
		public static final String time_data_text_text = "10 AM - 11 AM";
		public static final String class_data_text_text = "Mind Body Yoga";
		public static final String instructor_data_text = "Lopita Edward";

	}

	public static class Locator {
		// DOCUMENTATION PAGE
		public static final String documentation_title_id = "betterdocs-entry-title";
		public static final String documentation_link_path = "//*[@id=\"post-1836\"]/div/div/div/div/section[1]/div[3]/div/div[2]/div/div/section[1]/div/div/div[2]/div/div/div[3]/div/div/a";

		// IMAGE
		public static final String day_header_image_xpath = "//*[@id=\"eael-data-table-36eeb442\"]/thead/tr/th[1]/img";
		public static final String time_header_image_xpath = "//*[@id=\"eael-data-table-36eeb442\"]/thead/tr/th[2]/img";
		public static final String class_header_image_xpath = "//*[@id=\"eael-data-table-36eeb442\"]/thead/tr/th[3]/img";
		public static final String instructor_header_image_xpath = "//*[@id=\"eael-data-table-36eeb442\"]/thead/tr/th[4]/img";

		// HEADER
		public static final String day_header_text_xpath = "//*[@id=\"eael-data-table-36eeb442\"]/thead/tr/th[1]/span";
		public static final String time_header_text_xpath = "//*[@id=\"eael-data-table-36eeb442\"]/thead/tr/th[2]/span";
		public static final String class_header_text_xpath = "//*[@id=\"eael-data-table-36eeb442\"]/thead/tr/th[3]/span";
		public static final String instructor_header_text_xpath = "//*[@id=\"eael-data-table-36eeb442\"]/thead/tr/th[4]/span";

		// DATA
		public static final String day_data_text_xpath = "//*[@id=\"eael-data-table-36eeb442\"]/tbody/tr[1]/td[1]/div/div[2]";
		public static final String time_data_text_xpath = "//*[@id=\"eael-data-table-36eeb442\"]/tbody/tr[1]/td[2]/div/div[2]";
		public static final String class_data_text_xpath = "//*[@id=\"eael-data-table-36eeb442\"]/tbody/tr[1]/td[3]/div/div[2]";
		public static final String instructor_data_xpath = "//*[@id=\"eael-data-table-36eeb442\"]/tbody/tr[1]/td[4]/div/div[2]";

	}
}
