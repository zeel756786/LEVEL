
package mobile.tests.Body;

import io.unity.framework.init.base;
import io.unity.framework.remotegrid.LambdaTestConfig;
import mobile.object_repository.Body.Body_Page;
import mobile.object_repository.Onboarding.signin_page;
import org.testng.annotations.Test;

import java.time.Duration;



public class Body_Test extends base {
    @Test()
    public void Verify_that_the_user_tap_on_the_Body_footer_menu_BDY_001() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Body footer menu.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.verify_workout_screen_present_on_page();
    }

    @Test()
    public void Verify_that_the_user_search_for_the_yoga_using_the_search_field_BDY_002() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user search for the yoga using the search field.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_search_for();
        body_page.verify_search_for_Yoga();
    }
    @Test()
    public void Verify_that_the_user_search_for_the_HIIT_using_the_search_field_BDY_003() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user search for the yoga using the search field.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_search_for();
        body_page.verify_search_for_HIIT();
    }
    @Test()
    public void Verify_that_the_user_search_for_the_workout_using_the_search_field_BDY_004() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user search for the yoga using the search field.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_search_for();
        body_page.verify_search_for_Workouts();
    }
    @Test()
    public void Verify_that_the_user_apply_the_filter_as_Beginner_workout_tab_on_the_Workouts_screen_BDY_005() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter as Beginner workout tab on the Workouts screen.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_Beginner();
        body_page.verify_workout_screen_on_page();
        body_page.verify_Beginners_Series_present_on_page();
    }

    @Test()
    public void Verify_that_the_user_apply_the_filter_as_Intermediate_workout_tab_on_the_Workouts_screen_BDY_006() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter as Intermediate workout tab on the Workouts screen.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_Intermediate();
        body_page.verify_workout_screen_on_page();
        body_page.verify_Intermediate_Series_present_on_page();
    }

    @Test()
    public void Verify_that_the_user_apply_the_filter_as_Advanced_workout_tab_on_the_Workouts_screen_BDY_007() throws InterruptedException {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter as Advanced workout tab on the Workouts screen.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.click_on_pop_up();
        body_page.verify_and_click_on_Body();
        body_page.click_on_Advanced();
        body_page.verify_workout_screen_on_page();
        body_page.verify_Advanced_Series_present_on_page();
    }

    @Test()
    public void Verify_that_the_user_apply_the_filter_as_New_workout_tab_on_the_Search_screen_BDY_008() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter as New workout tab on the Search screen.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.click_on_pop_up();
        body_page.verify_and_click_on_Body();
        body_page.click_on_search_for();
        body_page.enter_new_in_search_text_field();
    }

    @Test()
    public void Verify_that_the_user_apply_the_filter_as_Free_workout_tab_on_the_Search_screen_BDY_009() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter as Free workout tab on the Search screen.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_Beginner();
        body_page.click_on_apply_filter_free_button();
        body_page.verify_filter_free_workout_series();
    }

    @Test()
    public void Verify_that_the_user_apply_the_filter_as_Frequently_Repeated_workout_tab_on_the_Search_screen_BDY_010() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter as Frequently Repeated workout tab on the Search screen.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.click_on_pop_up();
        body_page.verify_and_click_on_Body();
        body_page.click_on_search_for();
        body_page.enter_Frequently_in_search_text_field();
    }
    @Test()
    public void Verify_that_the_user_apply_the_filter_as_Strength_Training_workout_tab_on_the_Search_screen_BDY_011() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter as Strength Training workout tab on the Search screen.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_search_for();
        body_page.enter_Strength_Training_in_search_text_field();
    }
    @Test()
    public void Verify_that_the_user_apply_the_filter_as_Relaxation_workout_tab_on_the_Search_screen_BDY_012() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter as Relaxation workout tab on the Search screen.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.click_on_pop_up();
        body_page.verify_and_click_on_Body();
        body_page.click_on_search_for();
        body_page.enter_Relaxation_in_search_text_field();
    }
    @Test()
    public void Verify_that_the_user_apply_the_filter_as_Fat_Loss_workout_tab_on_the_Search_screen_BDY_013(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter as Fat Loss workout tab on the Search screen.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.click_on_pop_up();
        body_page.verify_and_click_on_Body();
        body_page.click_on_search_for();
        body_page.enter_Fat_Loss_in_search_text_field();
    }

    @Test()
    public void Verify_that_the_user_apply_the_filter_as_PCOD_workout_tab_on_the_Search_screen_BDY_014() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter as PCOD workout tab on the Search screen.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.click_on_pop_up();
        body_page.verify_and_click_on_Body();
        body_page.click_on_search_for();
        body_page.enter_PCOD_in_search_text_field();
    }

    @Test()
    public void Verify_that_the_user_apply_the_filter_as_Full_Body_Workout_workout_tab_on_the_Search_screen_BDY_015(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter as Full Body Workout tab on the Search screen.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.click_on_pop_up();
        body_page.verify_and_click_on_Body();
        body_page.click_on_search_for();
        body_page.enter_Full_Body_Workout_in_search_text_field();
    }


    @Test()
    public void Verify_that_the_user_see_the_Workouts_Completed_for_this_week_BDY_016() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user see the Workouts Completed for this week.");
        //  Verify that the user see the "Time spent(in minutes) for this week_BDY_017
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.verify_This_week_workout_completed_and_Time_spend_present_on_page();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_HIIT_of_the_Explore_Workouts_from_the_Workouts_screen_BDY_018() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the HIIT of the Explore Workouts from the Workouts screen.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.click_on_pop_up();
        body_page.verify_and_click_on_Body();
        body_page.click_on_HIIT_Explore_Workouts();
        body_page.verify_Workout_HIIT_Screen();
        body_page.verify_Workout_of_HIIT();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_kebab_menu_of_the_HIIT_screen_BDY_019() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the kebab menu of the HIIT screen.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_HIIT_Explore_Workouts();
        body_page.verify_Workout_HIIT_Screen();
        body_page.click_on_kebab_menu();
        body_page.verify_add_to_fav_on_Kebab_Menu();
        body_page.verify_Add_to_favorites_Download_Share_button();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_Add_to_favourite_option_of_the_kebab_menu_from_the_HIIT_screen_BDY_020() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        // Verify that the user tap on the "Download" option of the kebab menu from the HIIT screen_BDY_021
        config.addTestName("Verify that the user tap on the Add to favourite option of the kebab menu from the HIIT screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_HIIT_Explore_Workouts();
        body_page.verify_Workout_HIIT_Screen();
        body_page.click_on_kebab_menu();
        body_page.click_on_add_to_fav_on_Kebab_Menu();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Download_option_of_the_kebab_menu_from_the_HIIT_screen_BDY_021(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Download  option of the kebab menu from the HIIT screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_HIIT_Explore_Workouts();
        body_page.verify_Workout_HIIT_Screen();
        body_page.click_on_kebab_menu();
        body_page.click_on_My_Downloads();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_Share_option_of_the_kebab_menu_from_the_HIIT_screen_BDY_022() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Share option of the kebab menu from the HIIT screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_HIIT_Explore_Workouts();
        body_page.verify_Workout_HIIT_Screen();
        body_page.click_on_kebab_menu();
        body_page.click_on_Share_button_of_Kebab_menu();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_Yoga_of_the_Explore_Workouts_from_the_Workouts_screen_BDY_023() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Yoga of the Explore Workouts from the Workouts screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_Yoga_Explore_Workouts();
        body_page.verify_Workout_Yoga_Screen();
        body_page.verify_yoga_of_HIIT();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_kebab_menu_of_the_Yoga_screen_BDY_024() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Yoga of the Explore Workouts from the Workouts screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_Yoga_Explore_Workouts();
        body_page.verify_Workout_Yoga_Screen();
        body_page.click_on_kebab_menu();
        body_page.verify_add_to_fav_on_Kebab_Menu();
        body_page.verify_Add_to_favorites_Download_Share_button();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_Add_to_favourite_option_of_the_kebab_menu_from_the_Yoga_screen_BDY_025() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Add to favourite option of the kebab menu from the Yoga screen");
        //  Verify that the user tap on the "Share" option of the kebab menu from the Yoga screen_BDY_027
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_Yoga_Explore_Workouts();
        body_page.verify_Workout_Yoga_Screen();
        body_page.click_on_kebab_menu();
        body_page.click_on_add_to_fav_on_Kebab_Menu();
        body_page.click_on_Share_button_of_Kebab_menu();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_Download_option_of_the_kebab_menu_from_the_Yoga_screen_BDY_026(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Download option of the kebab menu from the Yoga screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_Yoga_Explore_Workouts();
        body_page.verify_Workout_Yoga_Screen();
        body_page.click_on_kebab_menu();
        body_page.click_on_My_Downloads();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Relaxation_of_the_Explore_Workouts_from_the_Workouts_screen_BDY_029() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Relaxation of the Explore Workouts from the Workouts screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_Relaxation_Explore_Workouts();
        body_page.verify_Workout_Relaxation_Screen();
        body_page.verify_Relaxation_of_HIIT();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_kebab_menu_of_the_Relaxation_screen_BDY_030() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the kebab menu of the Relaxation screen BDY 030");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_Relaxation_Explore_Workouts();
        body_page.verify_Workout_Relaxation_Screen();
        body_page.click_on_kebab_menu();
        body_page.verify_add_to_fav_on_Kebab_Menu();
        body_page.verify_Add_to_favorites_Download_Share_button();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_Add_to_favourite_option_of_the_kebab_menu_from_the_Relaxation_screen_BDY_031() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Add to favourite option of the kebab menu from the Relaxation screen");
        //  Verify that the user tap on the "Share" option of the kebab menu from the Relaxation screen_BDY_033
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_Relaxation_Explore_Workouts();
        body_page.click_on_kebab_menu();
        body_page.click_on_add_to_fav_on_Kebab_Menu();
        body_page.click_on_Share_button_of_Kebab_menu();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_Download_option_of_the_kebab_menu_from_the_Relaxation_screen_BDY_032(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Download option of the kebab menu from the Relaxation screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_Relaxation_Explore_Workouts();
        body_page.click_on_kebab_menu();
        body_page.click_on_My_Downloads();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_Strength_Training_of_the_Explore_Workouts_from_the_Workouts_screen_BDY_035() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Strength Training of the Explore Workouts from the Workouts screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_Strength_Training_Explore_Workouts();
        body_page.verify_Workout_Strength_Screen();
        body_page.verify_Strength_Training_of_HIIT();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_kebab_menu_of_the_Strength_Training_screen_BDY_036() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the kebab menu of the Strength Training_screen BDY 036");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_Strength_Training_Explore_Workouts();
        body_page.click_on_kebab_menu();
        body_page.verify_add_to_fav_on_Kebab_Menu();
        body_page.verify_Add_to_favorites_Download_Share_button();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_Add_to_favourite_option_of_the_kebab_menu_from_the_Strength_Training_screen_BDY_037() {
        // Verify that the user tap on the "Share" option of the kebab menu from the Strength Training screen BDY_039()
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Add to favourite option of the kebab menu from the Strength Training screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_Strength_Training_Explore_Workouts();
        body_page.click_on_kebab_menu();
        body_page.click_on_add_to_fav_on_Kebab_Menu();
        body_page.click_on_Share_button_of_Kebab_menu();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_Download_option_of_the_kebab_menu_from_the_Strength_Training_screen_BDY_038(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Download option of the kebab menu from the Strength Training screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_Strength_Training_Explore_Workouts();
        body_page.click_on_kebab_menu();
        body_page.click_on_My_Downloads();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_see_all_of_the_Browse_by_coach_from_the_Workouts_screen_BDY_041() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the see all of the Browse by coach from the Workouts screen");
        //  Verify that the user search the coach by name on the Coaches screen_BDY_042
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_see_all_button_coach();
        body_page.verify_coaches_screen_and_Explore_Coaches_present_on_page();
        body_page.click_on_search_by_coach_name();
        body_page.verify_search_coach_name_enter_and_clear_text();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_any_coach_from_the_Browse_by_coach_from_the_Workouts_screen_BDY_043() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the any coach from the Browse by coach from the Workouts screen");
        // Verify that the user tap on the "Appreciate" button for trainer BDY_044()
        // Verify that the user tap on the "Following" button to follow the trainer BDY_045()
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.verify_details_of_trainer_appreciate_follow_button();
        body_page.tab_on_apreciated_and_follow_button();
    }

    @Test()
    public void Verify_that_the_user_apply_the_filter_by_Workout_Series_and_Sort_by_Newest_after_tap_on_the_any_coach_from_the_Workouts_screen_BDY_047() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter by Workout Series and Sort by Newest after tap on the any coach from the Workouts screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.click_on_filter_by_button();
        body_page.click_on_workout_series_and_newest();
        body_page.verify_filter_series();
    }

    @Test()
    public void Verify_that_the_user_apply_the_filter_by_Workout_Series_and_Sort_by_Unplayed_after_tap_on_the_any_coach_from_the_Workouts_screen_BDY_048() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter by Workout Series and Sort by Unplayed after tap on the any coach from the Workouts screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.click_on_filter_by_button();
        body_page.click_on_workout_series_and_unplayed();
        body_page.verify_filter_series();
    }

    @Test()
    public void Verify_that_the_user_apply_the_filter_by_Workout_Series_and_Sort_by_Previously_Played_after_tap_on_the_any_coach_from_the_Workouts_screen_BDY_049() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter by Workout Series and Sort by Previously Played after tap on the any coach from the Workouts screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.click_on_filter_by_button();
        body_page.click_on_workout_series_and_previously_played();
        body_page.verify_filter_series();
    }
    @Test()
    public void Verify_that_the_user_apply_the_filter_by_Quick_Picks_and_Sort_by_Time_after_tap_on_the_any_coach_from_the_Workouts_screen_BDY_051(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter by Quick Picks and Sort by Time after tap on the any coach from the Workouts screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.click_on_filter_by_button();
        body_page.click_on_Quicks_Picks_and_Time();
        body_page.click_on_Remove_Filter();
        body_page.verify_filter_series();
    }
    @Test()
    public void Verify_that_the_user_apply_the_filter_by_Quick_Picks_and_Sort_by_Newest_after_tap_on_the_any_coach_from_the_Workouts_screen_BDY_052(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter by Quick Picks and Sort by Newest after tap on the any coach from the Workouts screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.click_on_filter_by_button();
        body_page.click_on_Quicks_Picks_and_Newest();
        body_page.click_on_Remove_Filter();
        body_page.verify_filter_series();
    }
    @Test()
    public void Verify_that_the_user_apply_the_filter_by_Quick_Picks_and_Sort_by_Unplayed_after_tap_on_the_any_coach_from_the_Workouts_screen_BDY_053(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter by \"Quick Picks\" and Sort by \"Unplayed\" after tap on the any coach from the Workouts screen_BDY_53");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.click_on_filter_by_button();
        body_page.click_on_Quicks_Picks_and_Unplayed();
        body_page.click_on_Remove_Filter();
        body_page.verify_filter_series();
    }
    @Test()
    public void Verify_that_the_user_apply_the_filter_by_Quick_Picks_and_Sort_by_Previously_Played_after_tap_on_the_any_coach_from_the_Workouts_screen_BDY_054(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter by \"Quick Picks\" and Sort by \"Previously Played\" after tap on the any coach from the Workouts screen_BDY_054");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.click_on_filter_by_button();
        body_page.click_on_Quicks_Picks_and_Previously_Played();
        body_page.click_on_Remove_Filter();
        body_page.verify_filter_series();
    }
    @Test()
    public void Verify_that_the_user_apply_the_filter_by_Both_and_Sort_by_Time_after_tap_on_the_any_coach_from_the_Workouts_screen_BDY_056(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter by \"Both(Default)\" and Sort by \"Time\" after tap on the any coach from the Workouts screen_BDY_056");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.click_on_filter_by_button();
        body_page.click_on_Both_and_Time();
        body_page.click_on_Remove_Filter();
        body_page.verify_filter_series();
    }
    @Test()
    public void Verify_that_the_user_apply_the_filter_by_Both_and_Sort_by_Newest_after_tap_on_the_any_coach_from_the_Workouts_screen_BDY_057(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter by \"Both(Default)\" and Sort by \"Newest\" after tap on the any coach from the Workouts screen_BDY_057");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.click_on_filter_by_button();
        body_page.click_on_Both_and_Newest();
        body_page.click_on_Remove_Filter();
        body_page.verify_filter_series();
    }
    @Test()
    public void Verify_that_the_user_apply_the_filter_by_Both_and_Sort_by_Unplayed_after_tap_on_the_any_coach_from_the_Workouts_screen_BDY_058(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter by \"Both(Default)\" and Sort by \"Unplayed\" after tap on the any coach from the Workouts screen_BDY_058");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.click_on_filter_by_button();
        body_page.click_on_Both_and_Unplayed();
        body_page.click_on_Remove_Filter();
        body_page.verify_filter_series();
    }
    @Test()
    public void Verify_that_the_user_apply_the_filter_by_Both_and_Sort_by_Previously_Played_after_tap_on_the_any_coach_from_the_Workouts_screen_BDY_059(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter by \"Both(Default)\" and Sort by \"Previously Played\" after tap on the any coach from the Workouts screen_BDY_059");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.click_on_filter_by_button();
        body_page.click_on_Both_and_Previously_Played();
        body_page.click_on_Remove_Filter();
        body_page.verify_filter_series();
    }


    @Test()
    public void Verify_that_the_user_tap_on_the_kebab_menu_after_tap_on_the_any_coach_from_the_Workouts_screen_BDY_061() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the kebab menu after tap on the any coach from the Workouts screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.click_on_giftin_coaches_kebab_menu();
        body_page.verify_add_to_fav_on_giftin_coaches();
        body_page.verify_share_series_view_all_episodes_schedule_reminder_and_Rate_this_series();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_Add_to_favourite_option_of_kebab_menu_after_tap_on_the_any_coach_from_the_Workouts_screen_BDY_062() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Add to favourite option of kebab menu after tap on the any coach from the Workouts screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.click_on_giftin_coaches_kebab_menu();
        body_page.click_on_add_to_fav_on_Kebab_Menu_giftin_coaches();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_Share_this_series_option_of_kebab_menu_after_tap_on_the_any_coach_from_the_Workouts_screen_BDY_063() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Share this series option of kebab menu after tap on the any coach from the Workouts screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.click_on_giftin_coaches_kebab_menu();
        body_page.click_on_share_this_series();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_View_all_episodes_option_of_kebab_menu_after_tap_on_the_any_coach_from_the_Workouts_screen_BDY_064() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the View all episodes option of kebab menu after tap on the any coach from the Workouts screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.click_on_giftin_coaches_kebab_menu();
        body_page.click_on_view_all_episodes();
        body_page.verify_episodes_present_on_page();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_Schedule_a_reminder_option_of_kebab_menu_after_tap_on_the_any_coach_from_the_Workouts_screen_BDY_065() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Schedule a reminder option of kebab menu after tap on the any coach from the Workouts screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.click_on_giftin_coaches_kebab_menu();
        body_page.click_on_schedule_a_reminder();
        body_page.set_the_Reminder_present_on_page();
        body_page.click_on_save_new_reminder();
    }
    //need to fix
    @Test()
    public void Verify_that_the_user_tap_on_the_View_this_series_option_of_kebab_menu_after_tap_on_the_any_coach_from_the_Workouts_screen_BDY_066() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the View this series option of kebab menu after tap on the any coach from the Workouts screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.click_on_giftin_coaches_kebab_menu();
        body_page.click_on_Rate_this_series();
        body_page.verify_and_click_on_give_the_rating_star();
    }
    @Test()
    public void Verify_that_the_user_play_the_workout_series_after_tap_on_the_any_coach_from_the_Workouts_screen_BDY_067(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user play the workout series after tap on the any coach from the Workouts screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.verify_and_click_workout_series();
        body_page.click_on_cancel_button();
        body_page.verify_and_click_start_workout();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_right_arrow_of_the_Step_Tracker_from_the_Workouts_screen_BDY_068(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the right arrow of the Step Tracker from the Workouts screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_Step_Tracker();
        body_page.verify_the_pop_up();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_any_series_from_the_workouts_screen_BDY_069(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the any series from the Workouts screen");
        // Verify that the user tap on the "Active" button of the modal popup after tap on the any workout series_BDY_070
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.verify_and_click_workout_series();
        body_page.click_on_activate_button_pop_up();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Cancel_button_of_the_modal_popup_after_tap_on_the_any_workout_series_BDY_071(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Cancel button of the modal popup after tap on the any workout series");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.verify_and_click_workout_series();
        body_page.click_on_cancel_button();
        body_page.verify_the_pop_up_close();
        body_page.click_on_add_to_fav_on_series_giftin_coaches();
        body_page.click_on_share_series_button();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_share_icon_from_the_top_right_corner_after_tap_on_the_any_workout_series_BDY_073(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the share icon from the top right corner after tap on the any workout series");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.verify_and_click_workout_series();
        body_page.click_on_cancel_button();
        body_page.verify_the_pop_up_close();
        body_page.click_on_share_series_button();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Add_To_Favourite_icon_from_the_top_right_corner_after_tap_on_the_any_workout_series_BDY_074(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Add To Favourite icon from the top right corner after tap on the any workout series");
        // Verify that the user tap on the "Add To Favourite" icon for the series which was already added to the favourite from the top right corner after tap on the any workout series_BDY_075
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.verify_and_click_workout_series();
        body_page.click_on_cancel_button();
        body_page.verify_the_pop_up_close();
        body_page.click_on_add_to_fav_on_series_giftin_coaches();
    }

    @Test()
    public void Verify_that_the_user_check_the_checkbox_of_the_modal_popup_after_tap_on_the_any_workout_series_BDY_072(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user check the checkbox of the modal popup after tap on the any workout series");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.verify_and_click_workout_series();
        body_page.click_Do_not_show_this_again();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_DND_mode_off_radio_button_after_tap_on_the_any_workout_series_BDY_076(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the DND mode off radio button after tap on the any workout series");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.verify_and_click_workout_series();
        body_page.click_on_cancel_button();
        body_page.verify_DND_pop_up();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Start_Workout_button_after_tap_on_the_any_workout_series_BDY_077(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Start Workout after tap on the any workout series");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.verify_and_click_workout_series();
        body_page.click_on_cancel_button();
        body_page.click_on_upper_body_workout();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_kebab_menu_after_tap_on_the_any_workout_series_BDY_078(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the kebab menu after tap on the any workout series");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.verify_and_click_workout_series();
        body_page.click_on_cancel_button();
        body_page.click_on_HIIT_Kebab_menu();
        body_page.verify_add_to_favorities_download_and_share_button_present_on_screen();
    }
    // need to fix
    @Test()
    public void Verify_that_the_user_tap_on_the_Add_to_favourite_option_of_the_kebab_menu_after_tap_on_the_any_workout_series_BDY_079(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Add to favourite option of the kebab menu after tap on the any workout series");
        // Verify that the user tap on the "Download" option of the kebab menu after tap on the any workout series_BDY_080
        // Verify that the user tap on the "Share" option of the kebab menu after tap on the any workout series_BDY_081
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_giftin_coaches();
        body_page.verify_and_click_workout_series();
        body_page.click_on_cancel_button();
        body_page.click_on_HIIT_Kebab_menu();
        body_page.click_on_Add_to_favorites_download_and_share_button();
    }
    @Test()
    public void Verify_that_the_user_share_the_Easy_Yoga_streches_for_office_series_from_the_Workouts_screen_BDY_082(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user share the Easy Yoga streches for office series from the Workouts screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.verify_and_click_on_intense_back_pain_share();
    }
    @Test()
    public void Verify_that_the_user_select_the_reading_language_from_the_dropdown_for_reading_the_blog_on_the_Feeling_like_an_imposter_at_work_screen_BDY_084(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user select the reading language from the dropdown for reading the blog on the Feeling like an imposter at work screen");
        // Verify that the user tap on the right arrow of the "Easy Yoga streches for office" series from the Workouts screen_BDY_083
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_intense_back_pain_arrow_button();
        body_page.verify_intense_back_pain_present_on_page();
        body_page.click_on_English_and_select_Hindi_language_of_drop_down();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Trending_workout_series_from_the_Workout_screen_BDY_085(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        //  Verify that the user tap on the share icon from the top right corner after tap on the Trending workout series_BDY_086
        config.addTestName("Verify that the user tap on the Trending workout series from the Workout screen.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_trending_series_workout();
        body_page.click_on_cancel_button();
        body_page.verify_description_add_to_fav_download_and_share_button_trending_series();
        body_page.share_trending_workout_series();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Add_to_favourite_icon_after_tap_on_the_Trending_workout_series_BDY_087(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Add to favourite icon after tap on the Trending workout series BDY_087");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_trending_series_workout();
        body_page.click_on_cancel_button();
        body_page.verify_and_click_on_add_to_favorities_button_trending_series();
        body_page.verify_and_click_on_download_button_trending_series();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_toggle_after_tap_on_the_Trending_workout_series_BDY_089(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the toggle after tap on the Trending workout series.");
        // Verify that the user tap on the "Download" icon from the top right corner after tap on the Trending workout series_BDY_090
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_trending_series_workout();
        body_page.click_on_cancel_button();
        body_page.verify_DND_pop_up();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Start_Workout_button_after_tap_on_the_Trending_workout_series_BDY_091() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Start Workout button after tap on the Trending workout series.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.click_on_trending_series_workout();
        body_page.click_on_cancel_button();
        body_page.verify_and_click_start_workout();
    }
    @Test()
    public void Verify_that_the_user_see_the_added_favourites_of_workout_serieses_in_the_Add_to_Favourite_BDY_092(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user see the added favourites of workout serieses in the Add to Favourite.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.verify_and_click_on_Add_to_favorites();
    }
    @Test()
    public void Verify_that_the_user_see_the_downloaded_workout_serieses_in_the_Download_BDY_093(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user see the downloaded workout serieses in the Download ");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Body_Page body_page = new Body_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        body_page.verify_and_click_on_Body();
        body_page.verify_and_click_on_My_Downloads();
    }

}


