package mobile.tests.Payment;
import io.unity.framework.init.base;
import io.unity.framework.remotegrid.LambdaTestConfig;
import mobile.object_repository.Payment.payment_page;
import mobile.object_repository.Onboarding.signin_page;
import mobile.object_repository.sleep_playlist.Sleep_Playlist_Page;
import mobile.object_repository.today_music_playlist.Today_Music_Page;
import org.testng.annotations.Test;

import java.time.Duration;

public class Payment_Test extends base {

    @Test
    public void user_can_subscribe_plan() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        payment_page payment_page = new payment_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enter_random_mobile_number(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_random_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_customise_your_experience_text();
        signin_page.verify_tell_us_about_yourself_text();
        signin_page.click_and_enter_your_name();
        signin_page.enterTextInSpecificTextBox("zeel", 0);
        signin_page.click_and_enter_your_email_or_mobile(true);
        signin_page.enterTextInSpecificTextBox("zeel@qable.io", 1);
        signin_page.verify_gender_text();
        signin_page.verify_male_text();
        signin_page.verify_and_click_female_checkbox();
        signin_page.verify_other_text();
        signin_page.verify_text_i_agree_to_receive_marketing_present_on_page();
        signin_page.verify_text_i_agree_to_terms_and_conditions_present_on_page();
        signin_page.verify_text_got_a_referral_code_present_on_page();
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_customise_your_experience_text();
        signin_page.verify_stress_and_anxiety_present_on_page();
        signin_page.verify_focus_present_on_page();
        signin_page.verify_productivity_present_on_page();
        signin_page.verify_relaxation_present_on_page();
        signin_page.click_on_stress_and_anxiety();
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_text_stress_relief_present_on_page();
        signin_page.verify_text_better_sleep_present_on_page();
        signin_page.verify_text_personal_growth_present_on_page();
        signin_page.verify_text_spiritual_growth_present_on_page();
        signin_page.click_on_stress_relief();
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_how_your_free_trail_works_text_present_on_page();
        signin_page.click_on_cross_button();
        signin_page.click_on_i_ll_lose_out_on_the_offer();
        signin_page.click_on_cross_button();
        signin_page.click_on_menu_button();
        payment_page.verify_and_click_on_manage_subscription();
        payment_page.verify_subscription_details_page_present_on_page();
        payment_page.verify_and_click_on_start_free_trail();
        payment_page.verify_one_four_nine_months_plans_present_on_page();
        payment_page.verify_and_click_on_continue_button();
        payment_page.verify_and_click_on_subscribe_button();
        payment_page.verify_congratulations_page_present_on_page();
    }

    @Test
    public void user_can_cancel_the_subscription() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        payment_page payment_page = new payment_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enter_random_mobile_number(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_random_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_customise_your_experience_text();
        signin_page.verify_tell_us_about_yourself_text();
        signin_page.click_and_enter_your_name();
        signin_page.enterTextInSpecificTextBox("zeel", 0);
        signin_page.click_and_enter_your_email_or_mobile(true);
        signin_page.enterTextInSpecificTextBox("zeel@qable.io", 1);
        signin_page.verify_gender_text();
        signin_page.verify_male_text();
        signin_page.verify_and_click_female_checkbox();
        signin_page.verify_other_text();
        signin_page.verify_text_i_agree_to_receive_marketing_present_on_page();
        signin_page.verify_text_i_agree_to_terms_and_conditions_present_on_page();
        signin_page.verify_text_got_a_referral_code_present_on_page();
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_customise_your_experience_text();
        signin_page.verify_stress_and_anxiety_present_on_page();
        signin_page.verify_focus_present_on_page();
        signin_page.verify_productivity_present_on_page();
        signin_page.verify_relaxation_present_on_page();
        signin_page.click_on_stress_and_anxiety();
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_text_stress_relief_present_on_page();
        signin_page.verify_text_better_sleep_present_on_page();
        signin_page.verify_text_personal_growth_present_on_page();
        signin_page.verify_text_spiritual_growth_present_on_page();
        signin_page.click_on_stress_relief();
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_how_your_free_trail_works_text_present_on_page();
        signin_page.click_on_cross_button();
        signin_page.click_on_i_ll_lose_out_on_the_offer();
        signin_page.click_on_cross_button();
        signin_page.click_on_menu_button();
        payment_page.verify_and_click_on_manage_subscription();
        payment_page.verify_and_click_on_cancel_subscription();
        payment_page.verify_and_click_on_continue_to_cancel_memberships();
        payment_page.verify_and_click_on_click_on_first_checkbox_for_cancellation();
        payment_page.verify_and_click_on_continue_to_cancel_memberships();
    }
    @Test()
    public void Verify_that_the_user_tap_on_hamburger_icon_on_Today_PYT_001(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on hamburger icon on Today page");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Today_Music_Page today_music_page = new Today_Music_Page(driver);
        payment_page payment_page = new payment_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        today_music_page.verify_and_click_on_hamburger_button_of_today_page();
        payment_page.verify_and_click_on_settings_present_on_page();
        payment_page.verify_settings_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Manage_Subscription_PYT_002(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the 'Manage Subscription'");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Today_Music_Page today_music_page = new Today_Music_Page(driver);
        payment_page payment_page = new payment_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        today_music_page.verify_and_click_on_hamburger_button_of_today_page();
        payment_page.verify_and_click_on_manage_subscription();
        payment_page.verify_my_subscription_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Show_all_plans_PYT_003_and_PYT_004(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the 'Show all plans'");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Today_Music_Page today_music_page = new Today_Music_Page(driver);
        payment_page payment_page = new payment_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        today_music_page.verify_and_click_on_hamburger_button_of_today_page();
        payment_page.verify_and_click_on_manage_subscription();
        payment_page.verify_and_click_on_explore_all_plans();
        payment_page.verify_select_your_plan_present_on_page();
        payment_page.verify_one_four_nine_months_plans_present_on_page();
        payment_page.verify_one_nine_nine_months_plans_present_on_page();
        payment_page.scrollUntilElementVisible();
        payment_page.verify_two_nine_nine_months_plans_present_on_page();
        payment_page.verify_see_benefits_present_on_page();
    }
}

