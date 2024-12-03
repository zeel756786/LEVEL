package mobile.tests.Onboarding;

import io.unity.framework.init.base;
import io.unity.framework.remotegrid.LambdaTestConfig;
import mobile.object_repository.Onboarding.signin_page;
import mobile.object_repository.sleep_playlist.Sleep_Playlist_Page;
import org.testng.annotations.Test;

import java.time.Duration;

public class signin_test extends base {

    @Test()
    public void Verify_that_the_user_open_the_installed_app_OB_001() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user open the installed app");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.verify_get_started_button_present_on_page();
        signin_page.verify_welcome_to_level_supermind();
        signin_page.verify_learn_from_experts();
        signin_page.verify_meditation();
        signin_page.verify_workouts();
    //    signin_page.verify_sleep();
        signin_page.verify_sign_in_button_present_on_page();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_Get_Started_button_OB_002() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Get Started button");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.verify_and_click_on_started_button_present_on_page();
        signin_page.verify_sign_in_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Sign_In_button_OB_003(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Sign In button");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_sign_in_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_Sign_in_with_valid_Email_OB_004(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user Sign in with valid Email");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.click_email_text_present_on_page();
        signin_page.click_and_enter_text_on_email_id();
        signin_page.enteremailIdTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_customise_your_experience_text();
    }
    @Test()
    public void Verify_that_the_user_Sign_in_with_invalid_Email_OB_005(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user Sign in with invalid Email");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.click_email_text_present_on_page();
        signin_page.click_and_enter_text_on_email_id();
        signin_page.enterTextInSpecificTextBox("user name@domain.com", 0);
        signin_page.clickOnArrowRightButton();
    }
    @Test()
    public void Verify_that_the_user_Sign_with_valid_Phone_number_OB_006(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user Sign with valid Phone number");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_customise_your_experience_text();
    }
    @Test
    public void Verify_that_the_user_Sign_with_invalid_Phone_number_OB_007(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user Sign with invalid Phone number");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterTextInSpecificTextBox("123 456 789", 0);
        signin_page.clickOnArrowRightButton();
    }
    @Test()
    public void Verify_that_the_user_Enter_correct_name_in_your_Name_field_on_Tell_us_about_yourself_for_personalised_recommendations_screen_OB_009(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        //Verify that the user Enter correct Mobile number in Your Phone Number field on Tell us about yourself for personalised recommendations screen_OB_010
        //Verify that the user select the Gender on Tell us about yourself for personalised recommendations screen_OB_011
        //Verify that the user check the checkbox of "I agree to receive marketing communications from Level SuperMind on Tell us about yourself for personalised recommendations screen_OB_012
        //Verify that the user check the check box of "I agree to the terms and conditions of Level SuperMind on Tell us about yourself for personalised recommendations screen_OB_013
        config.addTestName("Verify that the user Enter correct name in your Name field on Tell us about yourself for personalised recommendations screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.click_email_text_present_on_page();
        signin_page.click_and_enter_text_on_email_id();
        signin_page.enteremailIdTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_customise_your_experience_text();
        signin_page.verify_tell_us_about_yourself_text();
        signin_page.click_and_enter_your_name();
        signin_page.enterTextInSpecificTextBox("priyanka", 0);
        signin_page.click_and_enter_your_email_or_mobile(false);
        signin_page.enterTextInSpecificTextBox("3535353355", 1);
        signin_page.verify_gender_text();
        signin_page.verify_male_text();
        signin_page.verify_other_text();
        signin_page.verify_and_click_female_checkbox();
        signin_page.verify_and_click_on_i_agree_receive_marketing();
        signin_page.verify_and_click_on_i_agree_terms_and_conditions();
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_text_what_type_of_meditations_are_you_looking_for_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_uncheck_the_checkbox_of_I_agree_to_receive_marketing_communications_from_Level_SuperMind_on_Tell_us_about_yourself_for_personalised_recommendations_screen_OB_014_and_OB_015(){
        //Verify that the user uncheck the check box of "I agree to the terms and conditions of Level SuperMind on Tell us about yourself for personalised recommendations screen_OB_015
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user uncheck the checkbox of \"I agree to receive marketing communications from Level SuperMind on Tell us about yourself for personalised recommendations screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.click_email_text_present_on_page();
        signin_page.click_and_enter_text_on_email_id();
        signin_page.enteremailIdTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_customise_your_experience_text();
        signin_page.verify_tell_us_about_yourself_text();
        signin_page.click_and_enter_your_name();
        signin_page.enterTextInSpecificTextBox("priyanka", 0);
        signin_page.click_and_enter_your_email_or_mobile(false);
        signin_page.enterTextInSpecificTextBox("3535353355", 1);
        signin_page.verify_and_click_female_checkbox();
        signin_page.verify_and_uncheck_on_i_agree_receive_marketing();
        signin_page.verify_and_uncheck_on_i_agree_terms_and_conditions();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_terms_and_conditions_hyperlink_on_Tell_us_about_yourself_for_personalised_recommendations_screen_OB_016(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the terms and conditions hyperlink on Tell us about yourself for personalised recommendations screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.click_email_text_present_on_page();
        signin_page.click_and_enter_text_on_email_id();
        signin_page.enteremailIdTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_terms_and_conditions();
    }
    @Test()
    public void Verify_that_the_user_enter_the_valid_referral_code_on_on_Tell_us_about_yourself_for_personalised_recommendations_screen_OB_017(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user enter the valid referral code on on Tell us about yourself for personalised recommendations screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.click_email_text_present_on_page();
        signin_page.click_and_enter_text_on_email_id();
        signin_page.enteremailIdTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_and_enter_your_name();
        signin_page.enterTextInSpecificTextBox("priyanka", 0);
        signin_page.click_and_enter_your_email_or_mobile(false);
        signin_page.enterTextInSpecificTextBox("3535353355", 1);
        signin_page.verify_and_click_female_checkbox();
     //   signin_page.click_on_enter_the_referral_code();
    }
    @Test()
    public void Verify_that_the_user_select_only_three_type_of_meditations_from_the_What_type_of_meditations_are_you_looking_for_screen_and_tap_on_right_arrow_icon_OB_019(){
        //Verify that the user select morethen three type of meditations from the "What type of meditations are you looking for?" screen_OB_020
        //Verify that the user select any one option from the "What are you looking for?" screen and tap on right arrow_OB_021
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user select only three type of meditations from the What type of meditations are you looking for?  screen and tap on right arrow icon");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.click_email_text_present_on_page();
        signin_page.click_and_enter_text_on_email_id();
        signin_page.enteremailIdTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_and_enter_your_name();
        signin_page.enterTextInSpecificTextBox("priyanka", 0);
        signin_page.click_and_enter_your_email_or_mobile(false);
        signin_page.enterTextInSpecificTextBox("3535353355", 1);
        signin_page.verify_and_click_female_checkbox();
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_stress_and_anxiety();
        signin_page.click_on_focus_and_productivity();
        signin_page.verify_and_click_on_Relaxation();
        signin_page.verifyTheToastMessaageUserCanSelectThreeMeditations();
        signin_page.verify_and_click_on_right_arrow();
    //    signin_page.verify_text_what_are_you_looking_for_present_on_page();
        signin_page.click_on_stress_relief();
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_the_thank_you_present_on_page();
        signin_page.click_on_show_all_plan();
    //    signin_page.verify_on_show_all_plan();
     //   signin_page.verify_how_your_free_trail_works_text_present_on_page();
      //  signin_page.verify_and_click_start_my_free_trial();
    }

    @Test
    public void user_can_login_the_account_by_email() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_email_text_present_on_page();
        signin_page.click_and_enter_text_on_email_id();
        signin_page.enterTextInSpecificTextBox("kikan56719@avzong.com", 0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_random_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_customise_your_experience_text();
        signin_page.verify_tell_us_about_yourself_text();
        signin_page.click_and_enter_your_name();
        signin_page.enterTextInSpecificTextBox("shubham", 0);
        signin_page.click_and_enter_your_email_or_mobile(false);
        signin_page.enterTextInSpecificTextBox("3535353355", 1);
        signin_page.verify_gender_text();
        signin_page.verify_male_text();
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
        signin_page.scroll_down_to_the_bottom("Logout");
        signin_page.click_on_logout_button();
        signin_page.verify_are_you_sure_page_display();
        signin_page.click_on_are_you_sure_logout_page();
        signin_page.verify_sign_in_button_present_on_page();
    }
    @Test
    public void user_can_delete_the_account(){
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        //   signin_page.enter_random_mobile_number(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        //   signin_page.enter_random_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_customise_your_experience_text();
        signin_page.verify_tell_us_about_yourself_text();
        signin_page.click_and_enter_your_name();
        signin_page.enterTextInSpecificTextBox("zeel", 0);
        signin_page.click_and_enter_your_email();
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
        signin_page.verify_and_click_on_view_profile();
        signin_page.verify_back_arrow_button_present_on_page();
        signin_page.scroll_down_to_the_bottom("Delete Account");
        signin_page.verify_and_click_on_delete_account();
        signin_page.verify_longest_streak_present_on_page();
        signin_page.verify_total_xp_present_on_page();
        signin_page.verify_total_xp_present_on_page();
        signin_page.verify_and_click_on_delete_my_account();
        signin_page.verify_we_are_really_sad_to_see_you_go_present_on_page();
        signin_page.verify_and_click_on_i_ve_found_other_apps_to_achieve_my_goals_present_on_page();
        signin_page.verify_and_click_delete_Account();
        signin_page.verify_sign_in_button_present_on_page();
    }

}


