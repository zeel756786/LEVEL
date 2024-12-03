package mobile.tests.Sleep;
import io.unity.framework.init.base;
import io.unity.framework.remotegrid.LambdaTestConfig;
import mobile.object_repository.Onboarding.signin_page;
import mobile.object_repository.sleep.sleep_page;

import org.testng.annotations.Test;

import java.time.Duration;


public class Sleep_Test extends base  {

    @Test()
    public void Verify_that_the_user_tap_on_the_Sleep_footer_menu_SLP_001(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Sleep footer menu");
        //   Verify that the user search for sleep meditations,sleep sttories using search field_SLP_002
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        sleep_page sleep_page = new sleep_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_page.verify_and_click_on_sleep_present_on_page();
        sleep_page.search_and_clear_on_sleep();
    }
    @Test()
    public void Verify_that_the_user_apply_the_filter_for_the_categories_SLP_003(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter for the categories");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        sleep_page sleep_page = new sleep_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_page.verify_and_click_on_sleep_present_on_page();
        sleep_page.verify_and_click_on_all_categories_filter();
        sleep_page.verify_and_click_on_sleep_music_filter_button();
        sleep_page.verify_the_music_after_apply_filter();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Tune_in_to_deep_sleep_with_Music_SLP_004 () {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Tune in to deep sleep with Music ");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        sleep_page sleep_page = new sleep_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_page.verify_and_click_on_sleep_present_on_page();
        sleep_page.click_on_tune_deep_sleep_with_music();
        sleep_page.verify_the_sleep_music_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Tune_in_to_deep_sleep_with_Meditation_SLP_005 () {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Tune in to deep sleep with Meditation ");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        sleep_page sleep_page = new sleep_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_page.verify_and_click_on_sleep_present_on_page();
        sleep_page.click_on_tune_deep_sleep_with_meditations();
        sleep_page.verify_the_sleep_meditations_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Tune_in_to_deep_sleep_with_Stories_SLP_006 () {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Tune in to deep sleep with Stories ");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        sleep_page sleep_page = new sleep_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_page.verify_and_click_on_sleep_present_on_page();
        sleep_page.click_on_tune_deep_sleep_with_stories();
        sleep_page.verify_the_sleep_stories_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_see_all_for_the_New_Arrivals_serieses_SLP_007 () {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the see all for the New  Arrivals serieses");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        sleep_page sleep_page = new sleep_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_page.verify_and_click_on_sleep_present_on_page();
        sleep_page.verify_and_click_on_see_all();
        sleep_page.click_on_hindi_option_present_on_page();
        sleep_page.verify_hindi_track_new_arrivals_page();
        sleep_page.scroll_up_to_top_english_present_on_page();
        sleep_page.click_english_option_present_on_page();
        sleep_page.verify_english_track_new_arrivals_page();

    }
    @Test()
    public void Verify_that_the_user_share_the_Meditation_Series_of_sleep_meditations_series_SLP_010(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user share the Meditation Series of sleep meditations series");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        sleep_page sleep_page = new sleep_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_page.verify_and_click_on_sleep_present_on_page();
        sleep_page.click_on_tune_deep_sleep_with_meditations();
        sleep_page.verify_scroll_down_to_sleep_meditations();
        sleep_page.verify_and_click_on_sleep_meditations();
        sleep_page.verify_and_click_on_hambergur_menu_sleep_meditations();
        sleep_page.verify_and_click_on_share_this_sleep_story();
    }
    @Test()
    public void Verify_that_the_user_Add_to_favourite_the_Sleep_Stories_of_New_Arrivals_series_SLP_011(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user Add to favourite the Sleep Stories of New Arrivals series");
     //   Verify that the user download the  Sleep Stories of "New Arrivals" series_SLP_012
     //   Verify that the user share the Sleep Stories of "New Arrivals" series_SLP_013
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        sleep_page sleep_page = new sleep_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_page.verify_and_click_on_sleep_present_on_page();
        sleep_page.verify_and_click_your_on_New_Arrivals_first_music();
        sleep_page.verify_and_click_on_fav_music_new_arrivals_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_English_language_on_Sleep_Stories_of_New_Arrivals_screen_SLP_014 () {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the English language on Sleep Stories of New Arrivals screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        sleep_page sleep_page = new sleep_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_page.verify_and_click_on_sleep_present_on_page();
        sleep_page.click_on__see_all_present_on_page();
        sleep_page.click_english_option_present_on_page();
        sleep_page.verify_english_track_new_arrival_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Hindi_language_on_Sleep_Stories_of_New_Arrivals_series_SLP_015 () {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Hindi language on Sleep Stories of New Arrivals series");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        sleep_page sleep_page = new sleep_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_page.verify_and_click_on_sleep_present_on_page();
        sleep_page.click_on__see_all_present_on_page();
        sleep_page.click_on_hindi_option_present_on_page();
        sleep_page.verify_hindi_track_new_arrivals_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_kebab_menu_of_the_Sleep_Stories_of_New_Arrivals_series_SLP_016(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the kebab menu of the Sleep Stories of New Arrivals  series");
    //    Verify that the user see the added favourites of Meditation serieses in the "Add to Favourite_SLP_017
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        sleep_page sleep_page = new sleep_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_page.verify_and_click_on_sleep_present_on_page();
        sleep_page.click_on__see_all_present_on_page();
        sleep_page.click_english_option_present_on_page();
        sleep_page.verify_and_click_on_new_arrivals_first_music_sleep_kebeb_icon();
        sleep_page.verify_kebab_icon_options_present_on_page();
        sleep_page.verify_add_to_fav_and_remove_from_fav();
        sleep_page.verify_download_and_delete_from_downloads();
        sleep_page.verify_and_click_on_share_button();
    }
    @Test()
    public void Verify_that_the_user_see_the_downloaded_Meditation_serieses_in_the_Downloads_SLP_018() throws InterruptedException {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("User should able to see the downloaded Sleep Stories in the Download .");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        sleep_page sleep_page = new sleep_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_page.verify_and_click_on_sleep_present_on_page();
        sleep_page.verify_and_click_on_down_section_of_sleep_home_page();
//       Not able to see the downloaded video in download section
        Thread.sleep(100000);
    }
    @Test()
    public void Verify_that_the_user_create_Playlist_SLP_019() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user create Playlist");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        sleep_page sleep_page = new sleep_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_page.verify_and_click_on_sleep_present_on_page();
        sleep_page.create_playlist();
    }
    @Test()
    public void Verify_that_the_user_share_the_Best_Worst_Bedroom_Colors_SLP_020() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user share the Best & Worst Bedroom Colors ");
    //    Verify that the user tap on the right arrow of the "Best & Worst Bedroom Colors_SLP_021
    //    Verify that the user select the reading language from the dropdown for reading the blog on the "Best & Worst Bedroom Colors"  screen_SLP_022
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        sleep_page sleep_page = new sleep_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_page.verify_and_click_on_sleep_present_on_page();
        sleep_page.verify_and_click_on_best_and_bedroom_colors_page();
    }
}
