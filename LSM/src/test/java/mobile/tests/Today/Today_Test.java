package mobile.tests.Today;

import io.unity.framework.init.base;
import io.unity.framework.remotegrid.LambdaTestConfig;
import mobile.object_repository.Onboarding.signin_page;
import mobile.object_repository.Today.Today_Page;
import org.testng.annotations.Test;

import java.time.Duration;

public class Today_Test extends base {

    @Test()
    public void Verify_that_the_user_tap_on_the_Today_footer_menu_TDY_001(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Meditation  footer menu");
    //  Verify that the user search for the meditations using the search field_TDY_002
    //  Verify that the user search for the workouts using the search field_TDY_003
    //  Verify that the user search for the stories using the search field_TDY_004
    //  Verify that the user search for the music using the search field_TDY_005
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Today_Page today_page = new Today_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        today_page.verify_and_click_on_Search_for();
        today_page.verify_search_box_enter_and_clear_text();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Stop_Overthinking_fronm_the_Introducing_Courses_Overthinking_TDY_006(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Stop Overthinking  fron the Introducing Courses Overthinking");
    //  Verify that thr user share the "Overthinking starter kit" from the "Overthinking" screen_TDY_007
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Today_Page today_page = new Today_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        today_page.verify_and_click_on_courses();
        today_page.verify_and_click_on_All_Courses();
        today_page.verify_and_click_on_stop_overthinking();
        today_page.verify_overthinking_Screen_Present_On_Page();
        today_page.verify_and_click_on_Share_Overthinking_Starter_Kit_Present_On_Page();
    }
    @Test()
    public void Verify_that_the_user_share_the_Spirituality_starter_kit_from_the_Spirituality_screen_TY_010(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that thr user share the Spirituality starter kit from the Spirituality screen.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Today_Page today_page = new Today_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        today_page.verify_and_click_on_courses();
        today_page.verify_and_click_on_All_Courses();
        today_page.verify_and_click_on_start_journey();
        today_page.verify_spiruality_Screen_Present_On_Page();
        today_page.verify_and_click_on_Share_Spirituality_Starter_Present_On_Page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Courses_from_the_Courses_screen_TY_012(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Courses from the Courses screen.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Today_Page today_page = new Today_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        today_page.verify_and_click_on_courses();
        today_page.verify_and_click_on_All_Courses();
        today_page.verify_course_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Explore_Now_from_the_Introducing_Courses_TY_013(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Explore Now from the Introducing Courses");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Today_Page today_page = new Today_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        today_page.verify_and_click_on_courses();
        today_page.verify_and_click_on_All_Courses();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Stress_relief_tab_from_the_Courses_screen_TY_014(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Stress relief  tab from the Courses screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Today_Page today_page = new Today_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        today_page.verify_and_click_on_courses();
        today_page.verify_and_click_on_Stress_and_relief();
        today_page.verify_stress_relief_course_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Spiritual_tab_from_the_Courses_screen_TY_016(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Spiritual tab from the Courses screen");
    //  Verify that the user tap on the "Manage your emotions" tab from the Courses screen_TY_017
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Today_Page today_page = new Today_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        today_page.verify_and_click_on_courses();
     //   today_page.verify_and_click_on_All_Courses();
        today_page.verify_and_click_on_Spiritual();
        today_page.verify_spiritual_course_present_on_page();
        today_page.verify_and_click_on_manage_your_emotions();
        today_page.verify_emotional_trauma_course_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_From_your_favourite_coaches_tab_from_the_Courses_screen_TY_018(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the From your favourite coaches tab from the Courses screen.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Today_Page today_page = new Today_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        today_page.verify_and_click_on_courses();
        today_page.verify_and_click_on_from_your_fav_coaches();
        today_page.verify_Rajarshi_Nandy_Special_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Journal_from_the_Explore_TY_022(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Journal from the Explore ");
    //    Verify that the user tap on the "Journal" tab from the Journal screen_TY_041
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Today_Page today_page = new Today_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        today_page.verify_and_click_on_journal();
        today_page.verify_journal_screen_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Music_from_the_Explore_TY_025(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Music from the Explore ");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Today_Page today_page = new Today_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        today_page.verify_and_click_on_music_playlist();
        today_page.verify_and_click_on_custom_music_playlists();
        today_page.verify_music_screen_present_on_page();
    }
   @Test()
    public void Verify_that_the_user_edit_the_Recommended_for_you_Meditations_TY_026(){
       LambdaTestConfig config = new LambdaTestConfig(driver);
       config.addTestName("Verify that the user edit the Recommended for you Meditations");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       signin_page signin_page = new signin_page(driver);
       Today_Page today_page = new Today_Page(driver);
       signin_page.click_sign_in_button();
       signin_page.verify_phone_text_present_on_page();
       signin_page.verify_email_text_present_on_page();
       signin_page.click_and_enter_text_on_phone_no();
       signin_page.enterMobileNumberTextboxByIndex(0);
       signin_page.verify_and_click_on_right_arrow();
       signin_page.click_on_enter_the_code_text_field();
       signin_page.enter_6_digit_code(0);
       signin_page.verify_and_click_on_right_arrow();
       today_page.scroll_to_edit_and_click_on_save_button();
    }
    @Test()
    public void Verify_that_the_user_play_and_listen_the_Series_from_the_Recommended_for_you_activities_TY_027()  {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user play and listen the Series from the Recommended for you activities");
     // Verify that the user pause the Series from the "Recommended for you" activities_TY_028
     // Verify that the user share the Series from the "Recommended for you" activities_TY_029
     // Verify that the user Add to favourite the Series from the "Recommended for you" activities_TY_031
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Today_Page today_page = new Today_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        today_page.verify_and_click_on_recommended_music_present_on_page();
        today_page.verify_and_click_on_cancel_button();
        today_page.scroll_up_Navigate_button();
        today_page.verify_and_click_on_play_pause_add_to_fav_and_share_button();
    }
    @Test()
    public void Verify_that_the_user_share_the_Feeling_like_an_imposter_at_work_TY_033(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user share the Feeling like an imposter at work?");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Today_Page today_page = new Today_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        today_page.verify_and_click_on_vlog_share_button();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_right_arrow_of_the_Feeling_like_an_imposter_at_work_TY_034(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the right arrow of the Feeling like an imposter at work? ");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Today_Page today_page = new Today_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        today_page.verify_and_click_on_right_arrow_of_vlog();
        today_page.verify_user_navigate_on_vlog_page();
        today_page.click_on_drop_down_menu_blog();
        today_page.verify_and_print_the_content_of_blog_selected_lang_in_drop_down();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_My_Coupons_icon_on_the_LSM_Shop_screen_TY_037(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the My Coupons icon on the LSM Shop screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Today_Page today_page = new Today_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        today_page.verify_and_click_on_lsm_shop_on_top();
        today_page.click_on_lsm_shop_now_button();
        today_page.click_on_my_coupons_and_help_menu_lsm_shop();
    }
    @Test()
    public void Verify_that_the_user_tap_on_right_arrow_of_the_Upcoming_Brand_Unlocks_TY_039(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on right arrow of the Upcoming Brand Unlocks ");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Today_Page today_page = new Today_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        today_page.verify_and_click_on_lsm_shop_on_top();
        today_page.click_on_lsm_shop_now_button();
        today_page.verify_upcoming_model_pop_up();
    }
    @Test()
    public void Verify_that_the_user_see_the_Coupans_for_you_on_the_LSM_Shop_screen_TY_040(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user see the Coupans for you on the LSM Shop screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Today_Page today_page = new Today_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        today_page.verify_and_click_on_lsm_shop_on_top();
        today_page.click_on_lsm_shop_now_button();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_History_tab_from_the_Journal_screen_TY_042(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the History tab from the Journal screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Today_Page today_page = new Today_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        today_page.verify_and_click_on_journal();
        today_page.verify_and_click_on_journal_history();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Write_Now_button_of_the_Express_yourself_from_the_Journal_screen_TY_043(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Write Now button of the Express yourself from the Journal screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Today_Page today_page = new Today_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        today_page.verify_and_click_on_journal();
        today_page.click_on_write_now_of_express_your_self_page();
        today_page.click_on_different_category_of_Blank_Page();
        // need to give permission for Recording Manually
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Intention_of_the_Journal_with_Prompts_from_the_journal_screen_TY_044(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Intention of the Journal with Prompts from the journal screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Today_Page today_page = new Today_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        today_page.verify_and_click_on_journal();
        today_page.click_on_Intentions();
        today_page.click_and_choose_the_category_item();
    }

}
