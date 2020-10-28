package wpdev.ea.utils;

public class eaDualColorHeadlineUtils {
	public static class TEXT {
		public static final String dualcolorheadline_page_title = "Dual Color Headline | Essential Addons for Elementor";
		public static final String documentation_page = "DUAL COLOR HEADING";

		// FIRST HEADING
		public static final String first_normal_text = "Dual Headers";
		public static final String first_normal_text_color = "#4F6592";
		public static final String first_color_text = "With Icon";
		public static final String first_color_text_color = "#207EFF";

		public static final String first_description = "Add Icon with dual headings";

		// SECOND HEADING
		public static final String second_normal_text = "Interactive Look";
		public static final String second_normal_text_color = "#4F6592";
		public static final String second_color_text = "Create An";
		public static final String second_color_text_color = "#F87B3D";
		public static final String second_description = "Choose Icon & Sub Text on top of content ";

	}

	public static class Locator {
		// DOCUMENTATION PAGE
		public static final String documentation_title_id = "betterdocs-entry-title";
		public static final String documentation_link_path = "//*[@id=\"post-1511\"]/div/div/div/div/section[1]/div[3]/div/div[2]/div/div/section/div/div/div[2]/div/div/div[3]/div/div/a";

		// FIRST HEADING

		public static final String first_normal_text_xpath = "//*[@id=\"post-1511\"]/div/div/div/div/section[2]/div/div/div/div/div/div/div/div/h2/span[1]";
		public static final String first_color_text_xpath = "//*[@id=\"post-1511\"]/div/div/div/div/section[2]/div/div/div/div/div/div/div/div/h2/span[2]";
		public static final String first_description_xpath = "//*[@id=\"post-1511\"]/div/div/div/div/section[2]/div/div/div/div/div/div/div/div/span";

		// SECOND HEADING

		public static final String second_normal_text_xpath = "//*[@id=\"post-1511\"]/div/div/div/div/section[3]/div/div/div/div/div/div/div/div/h2/span[2]";
		public static final String second_color_text_xpath = "//*[@id=\"post-1511\"]/div/div/div/div/section[3]/div/div/div/div/div/div/div/div/h2/span[1]";
		public static final String second_description_xpath = "//*[@id=\"post-1511\"]/div/div/div/div/section[3]/div/div/div/div/div/div/div/div/span";
	
		//ICON
		public static final String first_icon_xpath = "//*[@id=\"post-1511\"]/div/div/div/div/section[2]/div/div/div/div/div/div/div/div/i";
		public static final String second_icon_xpath = "//*[@id=\"post-1511\"]/div/div/div/div/section[3]/div/div/div/div/div/div/div/div/i";
		
	}
}
