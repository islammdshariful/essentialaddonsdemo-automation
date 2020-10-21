package wpdev.ea.utils;

public class eaProtectedContentUtils {
	public static class TEXT {
		public static final String protected_page_title = "Protected Content | Essential Addons for Elementor";
		public static final String documentation_page = "EA PROTECTED CONTENT";

		public static final String password_text = "This section is password protected. So use 1234 to access the content.";

		// CONTENT
		public static final String content_header_text = "Ya! You Have Typed The Right Password";
		public static final String content_des_text = "Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero’s De Finibus Bonorum et Malorum for use in a type specimen book.";

	}

	public static class Locator {
		// DOCUMENTATION PAGE
		public static final String documentation_title_id = "betterdocs-entry-title";
		public static final String documentation_link_path = "//*[@id=\"post-3712\"]/div/div/div/div/section[1]/div[3]/div/div[2]/div/div/section/div/div/div[2]/div/div/div[3]/div/div/a";

		// PASSWORD FIELD
		public static final String password_text_xpath = "//*[@id=\"post-3712\"]/div/div/div/div/section[2]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/div[1]/div/p";
		public static final String password_input_feild_name = "protection_password_3d01145b";
		public static final String password_submit_button_xpath = "//*[@id=\"post-3712\"]/div/div/div/div/section[2]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/div[2]/form/input[2]";

		// CONTENT
		public static final String content_image_xpath = "//*[@id=\"post-3712\"]/div/div/div/div/section[2]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/div/div/div/div/div/section/div/div/div/div/div/div[1]/div/div/img";
		public static final String content_header_xpath = "//*[@id=\"post-3712\"]/div/div/div/div/section[2]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/div/div/div/div/div/section/div/div/div/div/div/div[2]/div/h2";
		public static final String content_des_xpath = "//*[@id=\"post-3712\"]/div/div/div/div/section[2]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/div/div/div/div/div/section/div/div/div/div/div/div[3]/div/div";

	}

}
