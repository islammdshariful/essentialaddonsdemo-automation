package utils;

public class eaFluentForm {
    public static class TEXT {
        public static final String fluent_title = "Demo Fluent Form | Essential Addons for Elementor";
        public static final String documentation_page = "FLUENT FORM";

        public static final String name_text = "Mr. Sabbir";
        public static final String email_text = "Sabbir@gmail.com";
        public static final String subject_text = "Automation going on";
        public static final String message_text = "This message is generated from an automation script, Don't reply to it.";

        public static final String success_message_text = "Thank you for your message. We will get in touch with you shortly";
    }

    public static class Locator {
        // DOCUMENTATION PAGE
        public static final String documentation_title_id = "betterdocs-entry-title";
        public static final String documentation_link_path = "//*[@id=\"post-260959\"]/div/div/div/div/section[1]/div[4]/div/div[2]/div/div/section/div/div/div[2]/div/div/div[4]/div/div/a";
        public static final String name_id = "ff_1_input_text";
        public static final String email_id = "ff_1_email";
        public static final String subject_id = "ff_1_input_text_1";
        public static final String message_id = "ff_1_description";
        public static final String submit_button_xpth = "//*[@id=\"fluentform_1\"]/div[5]/button";

        public static final String success_message_xpth = "//*[@id=\"fluentform_1_success\"]";
    }
}
