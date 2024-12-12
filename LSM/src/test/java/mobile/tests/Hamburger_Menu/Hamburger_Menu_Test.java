package mobile.tests.Hamburger_Menu;

import io.unity.framework.init.base;
import io.unity.framework.remotegrid.LambdaTestConfig;
import mobile.object_repository.Hamburger_Menu.Hamburger_Menu_Page;
import mobile.object_repository.Meditation.Meditation_Page;
import mobile.object_repository.Onboarding.signin_page;
import mobile.object_repository.sleep_playlist.Sleep_Playlist_Page;
import org.testng.annotations.Test;

import java.time.Duration;

public class Hamburger_Menu_Test extends base {

    @Test()
    public void Verify_that_the_user_tap_on_the_Hamburger_menu_HBM_001(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Hamburger  menu.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Hamburger_Menu_Page hamburger_menu_page = new Hamburger_Menu_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        hamburger_menu_page.verify_and_click_on_hamburger_menu();
        hamburger_menu_page.verify_options_present_on_hamburger_menu();
    }
    @Test()
    public void Verify_that_the_user_click_on_the_View_Profile_button_HBM_002(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user click on the View Profile button.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Hamburger_Menu_Page hamburger_menu_page = new Hamburger_Menu_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        hamburger_menu_page.verify_and_click_on_hamburger_menu();
        hamburger_menu_page.verify_and_click_on_View_Profile();
        hamburger_menu_page.verify_Edit_Profile_present_on_page();
        hamburger_menu_page.verify_delete_and_help_support_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Manage_Subscription_option_on_the_side_panel_menu_HBM_003(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Manage Subscription option on the side panel menu.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Hamburger_Menu_Page hamburger_menu_page = new Hamburger_Menu_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        hamburger_menu_page.verify_and_click_on_hamburger_menu();
        hamburger_menu_page.click_on_Manage_subscription();
        hamburger_menu_page.verify_my_subscription_screen_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_favourite_option_on_the_side_panel_menu_HBM_004(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the favourite option on the side panel menu.");
        // Verify that the user tap on the Download option on the side panel menu
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Hamburger_Menu_Page hamburger_menu_page = new Hamburger_Menu_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        hamburger_menu_page.verify_and_click_on_hamburger_menu();
        hamburger_menu_page.click_on_Favorites();
        hamburger_menu_page.verify_Favorites_screen_present_on_page();
        hamburger_menu_page.click_on_navigate_back_button();
        hamburger_menu_page.verify_and_click_on_hamburger_menu();
        hamburger_menu_page.click_on_downloads_button();
        hamburger_menu_page.verify_downloads_screen_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Activity_History_sub_menu_of_the_Hamburger_menu_HBM_006(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Activity History sub menu of the hamburger menu.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Hamburger_Menu_Page hamburger_menu_page = new Hamburger_Menu_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        hamburger_menu_page.verify_and_click_on_hamburger_menu();
        hamburger_menu_page.click_on_Activity_History_Details();
        hamburger_menu_page.verify_activity_history_details_screen_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Gift_a_Subscription_sub_menu_of_the_Hamburger_menu_HBM_007(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the 'Gift a Subscription' sub menu of the hamburger menu.");
    //    Verify that the select the Quantity for the Gift Mindfullness on the "Gift a Premium" screen after tapping on the Gift a Subscription"  sub menu_HBM_009
    //    Verify that the user tap on the "For Corporate Partnerships" right arrow on the "Gift a Premium" screen after tapping on the Gift a Subscription"  sub menu_HBM_010
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Hamburger_Menu_Page hamburger_menu_page = new Hamburger_Menu_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        hamburger_menu_page.verify_and_click_on_hamburger_menu();
        hamburger_menu_page.click_on_Gift_a_Subscription_on_page();
        hamburger_menu_page.verify_on_Gift_a_Premium_on_page();
        hamburger_menu_page.click_on_the_select_the_quantity_for_gift_mindfulness_screen();
        hamburger_menu_page.click_on_For_Corporate_Partnerships();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_How_It_works_hyperlink_on_the_Gift_a_Premium_screen_after_tapping_on_the_Gift_a_Subscription_sub_menu_HBM_008(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the 'How It works' hyperlink on the 'Gift a Premium' screen after tapping on the 'Gift a Subscription' sub menu.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Hamburger_Menu_Page hamburger_menu_page = new Hamburger_Menu_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        hamburger_menu_page.verify_and_click_on_hamburger_menu();
        hamburger_menu_page.click_on_Gift_a_Subscription_on_page();
        hamburger_menu_page.click_on_How_it_works_link_on_page();
        hamburger_menu_page.verify_the_things_inside_the_pop_up();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Got_a_Coupon_code_right_arrow_on_the_Gift_a_Premium_screen_after_tapping_on_the_Gift_a_Subscription_sub_menu_HBM_011(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the 'Got a Coupon code' right arrow on the 'Gift a Premium' screen after tapping on the 'Gift a Subscription' sub menu.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Hamburger_Menu_Page hamburger_menu_page = new Hamburger_Menu_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        hamburger_menu_page.verify_and_click_on_hamburger_menu();
        hamburger_menu_page.click_on_Gift_a_Subscription_on_page();
        hamburger_menu_page.click_on_Got_a_coupon_code_Right_Arrow();
        hamburger_menu_page.verify_Redeem_your_gift_card_screen();
        hamburger_menu_page.enter_coupon_code_gift_card_screen();
        hamburger_menu_page.click_on_Redeem_button();
        hamburger_menu_page.verify_Code_Invalid_or_Redeemed_Message();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_My_Purchases_on_the_top_right_corner_of_the_on_the_Gift_a_Premium_screen_after_tapping_on_the_Gift_a_Subscription_sub_menu_HBM_014(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the 'My Purchases' on the top right corner of the 'Gift a Premium' screen after tapping on the 'Gift a Subscription' sub menu.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Hamburger_Menu_Page hamburger_menu_page = new Hamburger_Menu_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        hamburger_menu_page.verify_and_click_on_hamburger_menu();
        hamburger_menu_page.click_on_Gift_a_Subscription_on_page();
        hamburger_menu_page.click_on_My_Purchases();
        hamburger_menu_page.verify_the_Your_Purchase_History_screen();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Settings_sub_menu_of_the_Hamburger_menu_HBM_015(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the 'Settings' sub menu of the 'Hamburger menu'.");
     //   Verify that the user tap on the "Notifications" submenu after tapping on the "Settings"_HBM_016
    //     Verify that the user tap on the "Terms & Condition" submenu after tapping on the "Settings"_HBM_017
    //    Verify that the user tap on the "Privacy Policy" submenu after tapping on the "Settings"_HBM_018
    //    Verify that the user tap on the "Connected with us on Social" submenu after tapping on the "Settings"_HBM_019
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Hamburger_Menu_Page hamburger_menu_page = new Hamburger_Menu_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        hamburger_menu_page.verify_and_click_on_hamburger_menu();
        hamburger_menu_page.click_on_Settings_sub_menu();
        hamburger_menu_page.verify_the_options_on_Setting_Page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Support_sub_menu_of_the_Hamburger_menu_HBM_020(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the 'Support' sub menu of the 'Hamburger menu'.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Hamburger_Menu_Page hamburger_menu_page = new Hamburger_Menu_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        hamburger_menu_page.verify_and_click_on_hamburger_menu();
        hamburger_menu_page.click_on_Support_sub_menu();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Refer_and_earn_sub_menu_of_the_Hamburger_menu_HBM_021(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the 'Refer and earn' sub menu of the 'Hamburger menu'.");
    //  Verify that the user enter the invalid referral code and tap on the right arrow on the "Refer and Earn" screen after tapping on the "Refer & Earn"  sub menu_HBM_023
    //  Verify that the user tap on the "Invite a Friend" button on the "Refer and Earn" screen after tapping on the "Refer & Earn"  sub menu_HBM_024
    //    Verify that the user tap on the "Reward History" on the "Refer and Earn" screen after tapping on the "Refer & Earn"  sub menu_HBM_025
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Hamburger_Menu_Page hamburger_menu_page = new Hamburger_Menu_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        hamburger_menu_page.verify_and_click_on_hamburger_menu();
        hamburger_menu_page.click_on_Refer_and_earn();
        hamburger_menu_page.click_on_enter_your_code_here();
        signin_page.verify_and_click_on_right_arrow();
        hamburger_menu_page.verify_the_toast_message();
        hamburger_menu_page.verify_and_click_on_Reward_History_Page();
        hamburger_menu_page.click_on_Invite_a_friend();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Reminder_sub_menu_of_the_Hamburger_menu_HBM_026(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the 'Reminder' sub menu of the 'Hamburger menu'.");
      //  Verify that the user tap on the "Add a new reminder" button on the Reminder screen after tapping on the "Reminder" sub menu_HBM_027
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Hamburger_Menu_Page hamburger_menu_page = new Hamburger_Menu_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        hamburger_menu_page.verify_and_click_on_hamburger_menu();
        hamburger_menu_page.click_on_Reminder_present_on_page();
        hamburger_menu_page.set_the_Reminder_present_on_page();
        hamburger_menu_page.click_on_save_new_reminder();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Rate_Us_sub_menu_of_the_Hamburger_menu_HBM_028(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the 'Rate Us' sub menu of the 'Hamburger menu'.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Hamburger_Menu_Page hamburger_menu_page = new Hamburger_Menu_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        hamburger_menu_page.verify_and_click_on_hamburger_menu();
        hamburger_menu_page.click_on_Rate_us_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Logout_sub_menu_of_the_Hamburger_menu_HBM_029(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the 'Logout' sub menu of the 'Hamburger menu'.");
     //   Verify that the user tap on the "Log Out" button of the popup after tap on the "Logout" sub menu of the Hamburger menu_HBM_030
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Hamburger_Menu_Page hamburger_menu_page = new Hamburger_Menu_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        hamburger_menu_page.verify_and_click_on_hamburger_menu();
        hamburger_menu_page.click_on_Logout_button_present_on_page();
        hamburger_menu_page.verify_the_logout_pop_up_present_on_screen();
        hamburger_menu_page.click_the_logout_pop_up_present_on_screen();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Stay_Logged_In_button_of_the_pop_up_after_tap_on_the_Logout_sub_menu_of_the_Hamburger_menu_HBM_031(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the 'Stay Logged In' button of the popup after tap on the 'Logout' sub menu of the 'Hamburger menu'.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Hamburger_Menu_Page hamburger_menu_page = new Hamburger_Menu_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        hamburger_menu_page.verify_and_click_on_hamburger_menu();
        hamburger_menu_page.click_on_Logout_button_present_on_page();
        hamburger_menu_page.click_on_stay_logged_in();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Edit_Profile_option_after_tap_on_the_View_Profile_option_on_the_side_panel_menu_HBM_032(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the 'Edit Profile' option after tap on the 'View Profile' option on the side panel menu.");
      //  Verify that the user edit and save the name by using edit profile_HBM_034
      //  Verify that the user edit and save the Email Id by using edit profile_HBM_035
     //   Verify that the user edit and save the Phone number by using edit profile_HBM_036
     //    Verify that the user verify the Email Id if user has sign up using Phone number by using edit profile_HBM_038
     //    Verify that the user and save the gender by selecting the gender using edit profile._HBM_039
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Hamburger_Menu_Page hamburger_menu_page = new Hamburger_Menu_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        hamburger_menu_page.verify_and_click_on_hamburger_menu();
        hamburger_menu_page.click_on_view_profile();
        hamburger_menu_page.verify_and_click_on_edit_profile_screen();
        hamburger_menu_page.enter_the_value_in_name_email_id_phone_text_filed();
        hamburger_menu_page.verify_and_click_on_select_your_gender();
        hamburger_menu_page.verify_and_click_on_save_button_of_edit_profile();
        hamburger_menu_page.click_on_verify_your_email_id();
        hamburger_menu_page.verify_otp_screen_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_verify_the_contact_number_if_user_has_sign_up_using_email_address_by_using_edit_profile_HBM_037(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user verify the contact number if user has sign up using email address by using edit profile.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Hamburger_Menu_Page hamburger_menu_page = new Hamburger_Menu_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_email_text_present_on_page();
        signin_page.click_and_enter_text_on_email_id();
        signin_page.enteremailIdTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        hamburger_menu_page.verify_and_click_on_hamburger_menu();
        hamburger_menu_page.click_on_view_profile();
        hamburger_menu_page.verify_and_click_on_edit_profile_screen();
        hamburger_menu_page.click_on_verify_your_contact_number();
        hamburger_menu_page.verify_otp_screen_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_View_More_Activity_Details_after_tapping_on_the_View_Profile_HBM_040(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the 'View More Activity Details' after tapping on the 'View Profile'.");
     //   Verify that the user tap on the right arrow of the "Refer and Win" after tapping on the "View Profile"_HBM_041
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Hamburger_Menu_Page hamburger_menu_page = new Hamburger_Menu_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        hamburger_menu_page.verify_and_click_on_hamburger_menu();
        hamburger_menu_page.click_on_view_profile();
        hamburger_menu_page.verify_and_click_on_view_more_activity_details();
        hamburger_menu_page.verify_activity_history_details_present_on_page();
        hamburger_menu_page.click_on_refer_and_win();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Delete_Account_button_after_tapping_on_the_View_Profile_HBM_042(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the 'Delete Account' button after tapping on the 'View Profile'.");
     // Verify that the user tap on the "Pause my account" after tapping on the "Delete Account"_HBM_043
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Hamburger_Menu_Page hamburger_menu_page = new Hamburger_Menu_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        hamburger_menu_page.verify_and_click_on_hamburger_menu();
        hamburger_menu_page.click_on_view_profile();
        hamburger_menu_page.verify_and_click_on_Delete_Account_and_pause_my_account();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Delete_my_account_after_tapping_on_the_Delete_Account_HBM_044(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the 'Delete my account' after tapping on the 'Delete Account'.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Hamburger_Menu_Page hamburger_menu_page = new Hamburger_Menu_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        hamburger_menu_page.verify_and_click_on_hamburger_menu();
        hamburger_menu_page.click_on_view_profile();
        hamburger_menu_page.verify_and_click_on_Delete_Account_and_delete_my_account();
    }

}
