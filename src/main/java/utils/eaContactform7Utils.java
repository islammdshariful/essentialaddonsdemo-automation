package utils;

public class eaContactform7Utils {
    public static class TEXT {
        public static final String contactform7_title = "Contact Form 7 | Essential Addons for Elementor";
        public static final String documentation_page = "CONTACT FORM 7";

        public static final String name_text = "Sabbir";
        public static final String email_text = "Sabbir@gmail.com";
        public static final String subject_text = "This is a test message";
        public static final String message_text = "This message is generated from an automation script, Don't reply to it.";

        public static final String success_message_text = "Thank you for your message. It has been sent.";
    }

    public static class Locator {
        // DOCUMENTATION PAGE
        public static final String documentation_title_id = "betterdocs-entry-title";
        public static final String documentation_link_path = "//*[@id=\"post-1231\"]/div/div/div/div/section[1]/div[4]/div/div[2]/div/div/section/div/div/div[2]/div/div/div[3]/div/div/a";

        public static final String name_classname = "your-name";
        public static final String email_classname = "your-email";
        public static final String subject_classname = "your-subject";
        public static final String message_classname = "your-message";
        public static final String submit_button_xpth = "//*[@id=\"wpcf7-f4-p1231-o1\"]/form/p[5]/input";

        public static final String success_message_xpth = "//*[@id=\"wpcf7-f4-p1231-o1\"]/form/div[2]";
    }
}
