package utils;

public class eaMailchimpUtils {
    public static class TEXT {
        public static final String mailchimp_title = "Mailchimp | Essential Addons for Elementor";
        public static final String documentation_page = "MAILCHIMP";

        public static final String first_name_text = "Mr.";
        public static final String last_name_text = "Sabbir";
        public static final String email_text = "Sabbir@gmail.com";

        public static final String success_message_text = "You have subscribed successfully!";
    }

    public static class Locator {
        // DOCUMENTATION PAGE
        public static final String documentation_title_id = "betterdocs-entry-title";
        public static final String documentation_link_path = "//*[@id=\"post-2603\"]/div/div/div/div/section[1]/div[3]/div/div[2]/div/div/section/div/div/div[2]/div/div/div[3]/div/div/a";
        public static final String first_name_classname = "eael_mailchimp_firstname";
        public static final String last_name_classname = "eael_mailchimp_lastname";
        public static final String email_classname = "eael_mailchimp_email";
        public static final String submit_button_id = "eael-subscribe-50de1e0a";

        public static final String success_message_xpth = "//*[@id=\"eael-mailchimp-form-50de1e0a\"]/div[2]/p";
    }
}
