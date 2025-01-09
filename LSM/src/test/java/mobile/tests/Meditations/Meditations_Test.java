package mobile.tests.Meditations;

import io.appium.java_client.android.AndroidDriver;
import io.unity.framework.init.base;
import io.unity.framework.remotegrid.LambdaTestConfig;
import mobile.object_repository.Meditation.Meditation_Page;
import mobile.object_repository.Onboarding.signin_page;
import mobile.object_repository.sleep_playlist.Sleep_Playlist_Page;
import org.testng.annotations.Test;

import java.time.Duration;

public class Meditations_Test extends base {

    @Test()
    public void Verify_that_the_user_tap_on_the_Meditation_footer_menu_Mind_001() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Meditation  footer menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
    }

    @Test()
    public void Verify_that_the_user_search_for_meditations_mantras_pranayama_using_search_field_Mind_002() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user search for meditations mantras pranayama using search field");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.verify_and_click_on_Search_for();
        meditation_page.verify_search_box_enter_and_clear_text();
    }

    @Test()
    public void Verify_that_the_user_user_tap_on_the_any_technique_of_Meditation_Finder_Find_your_style_Mind_003() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user user tap on the any technique of Meditation Finder Find your style ");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("Mantra");
        meditation_page.verify_and_click_on_Mindfulness_present_on_page();
        meditation_page.verify_Mindfulness_Screen_present_on_page();
        meditation_page.verify_the_About_this_technique_present_on_page();
        meditation_page.verify_the_description_mindfulness_Present_on_page();
        meditation_page.verify_travel_series_present_on_page();
        meditation_page.waitForTextElementAppear("Anxiety Series");
        meditation_page.waitForTextElementAppear("Eat Mindfully");

    }

    @Test()
    public void Verify_that_the_user_tap_on_the_i_icon_of_any_technique_of_Meditation_Finder_Find_your_style_Mind_004() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the i icon of any technique of Meditation Finder Find your style");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("Mantra");
        meditation_page.verify_and_click_on_mindfulness_i_icon();
        meditation_page.verify_the_heading_technique_Present_on_page();
        meditation_page.verify_the_description_mindfulness_Present_on_page();
        meditation_page.verify_Explore_Meditations_Button_Present_on_page();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_Explore_Meditations_button_Mind_005() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Explore Meditations button");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("Mantra");
        meditation_page.verify_and_click_on_mindfulness_i_icon();
        meditation_page.click_on_Explore_Meditations_Button_Present_on_page();
        meditation_page.verify_Mindfulness_Screen_present_on_page();
        meditation_page.verify_the_About_this_technique_present_on_page();
        meditation_page.verify_the_description_mindfulness_Present_on_page();
        meditation_page.waitForTextElementAppear("Eat Mindfully");
        meditation_page.waitForTextElementAppear("Anxiety Series");

    }

    @Test()
    public void Verify_that_the_user_apply_the_filter_by_Meditation_Series_and_Sort_by_Newest_on_Mindfulness_screen_Mind_006() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Explore Meditations button");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("Mantra");
        meditation_page.verify_and_click_on_mindfulness_i_icon();
        meditation_page.click_on_Explore_Meditations_Button_Present_on_page();
        meditation_page.verify_and_click_on_filter_by_button();
        meditation_page.verify_and_click_on_radio_button_meditations_series();
        meditation_page.verify_and_click_apply_button_present_on_page();
        meditation_page.verify_short_series_present_on_page();
        meditation_page.waitForTextElementAppear("Focus Series");
        meditation_page.waitForTextElementAppear("Exam Series");
    }

    @Test()
    public void Verify_that_the_user_apply_the_filter_by_Meditation_Series_and_Sort_by_Unplayed_on_Mindfulness_screen_Mind_007() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Explore Meditations button");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("Mantra");
        meditation_page.verify_and_click_on_Mindfulness_present_on_page();
        meditation_page.verify_and_click_on_filter_by_button();
        meditation_page.verify_and_click_on_radio_button_meditations_series();
        meditation_page.scrollDown();
        meditation_page.verify_and_click_on_radio_button_unplayed();
        meditation_page.verify_and_click_apply_button_present_on_page();
        sleep_playlist_page.wait_for_five_second();
        meditation_page.waitForTextElementAppear("Travel Series");
        meditation_page.waitForTextElementAppear("Anxiety Series");
        meditation_page.waitForTextElementAppear("Eat Mindfully");
    }

    @Test()
    public void Verify_that_the_user_apply_the_filter_by_Meditation_Series_and_Sort_by_Previously_Played_on_Mindfulness_screen_Mind_008() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter by  Meditation Series  and Sort by Previously Played  on Mindfulness screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("Mantra");
        meditation_page.verify_and_click_on_Mindfulness_present_on_page();
        meditation_page.verify_and_click_on_filter_by_button();
        meditation_page.verify_and_click_on_radio_button_meditations_series();
        meditation_page.scrollDown();
        meditation_page.verify_and_click_on_radio_button_previously_played();
        meditation_page.verify_and_click_apply_button_present_on_page();
        meditation_page.waitForTextElementAppear("Travel Series");
        meditation_page.waitForTextElementAppear("Anxiety Series");
    }

    @Test()
    public void Verify_that_the_user_apply_the_filter_by_Quick_Picks_and_Sort_by_Newest_on_Mindfulness_screen_Mind_009() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter by Quick Picks and Sort by Newest on Mindfulness screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("Mantra");
        meditation_page.verify_and_click_on_Mindfulness_present_on_page();
        meditation_page.verify_and_click_on_filter_by_button();
        meditation_page.verify_and_click_on_radio_button_quick_picks();
        meditation_page.scrollDown();
        meditation_page.verify_and_click_apply_button_present_on_page();
        meditation_page.verify_Anapana_present_on_page();
        meditation_page.verify_zazen_meditation_present_on_page();
    }

    @Test()
    public void Verify_that_the_user_apply_the_filter_by_Quick_Picks_and_Sort_by_Unplayed_on_Mindfulness_screen_Mind_010() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter by Quick Picks and Sort by Unplayed on Mindfulness screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("Mantra");
        meditation_page.verify_and_click_on_Mindfulness_present_on_page();
        meditation_page.verify_and_click_on_filter_by_button();
        meditation_page.verify_and_click_on_radio_button_quick_picks();
        meditation_page.scrollDown();
        meditation_page.verify_and_click_on_radio_button_unplayed();
        meditation_page.verify_and_click_apply_button_present_on_page();
        meditation_page.verify_Anapana_present_on_page();
        meditation_page.verify_zazen_meditation_present_on_page();

    }

    @Test()
    public void Verify_that_the_user_apply_the_filter_by_Quick_Picks_and_Sort_by_Previously_Played_on_Mindfulness_screen_Mind_011() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter by Quick Picks and Sort by Previously Played on Mindfulness screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("Mantra");
        meditation_page.verify_and_click_on_Mindfulness_present_on_page();
        meditation_page.verify_and_click_on_filter_by_button();
        meditation_page.verify_and_click_on_radio_button_quick_picks();
        meditation_page.scrollDown();
        meditation_page.verify_and_click_on_radio_button_previously_played();
        meditation_page.verify_and_click_apply_button_present_on_page();
        //  meditation_page.verify_Quick_present_on_page();
        meditation_page.verify_Anapana_present_on_page();
        meditation_page.verify_zazen_meditation_present_on_page();
        //meditation_page.verify_previously_played_present_on_page();
        // meditation_page.waitForTextElementAppear("Quick Recharge");
    }

    @Test()
    public void Verify_that_the_user_apply_the_filter_by_Both_Default_and_Sort_by_Newest_on_Mindfulness_screen_Mind_012() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter by Both(Default)  and Sort by  Newest  on Mindfulness screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("Mantra");
        meditation_page.verify_and_click_on_mindfulness_i_icon();
        meditation_page.click_on_Explore_Meditations_Button_Present_on_page();
        meditation_page.verify_and_click_on_filter_by_button();
        meditation_page.verify_and_click_on_radio_button_both();
        meditation_page.verify_and_click_apply_button_present_on_page();
        meditation_page.verify_travel_series_present_on_page();
        meditation_page.scroll_down_to_the_Text("Eat Mindfully");
        meditation_page.verify_anxiety_series_present_on_page();
        meditation_page.verify_eat_mindfully_present_on_page();
    }

    @Test()
    public void Verify_that_the_user_apply_the_filter_by_Both_Default_and_Sort_by_Unplayed_on_Mindfulness_screen_Mind_013() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user apply the filter by Both(Default)  and Sort by  Unplayed  on Mindfulness screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("Mantra");
        meditation_page.verify_and_click_on_mindfulness_i_icon();
        meditation_page.click_on_Explore_Meditations_Button_Present_on_page();
        meditation_page.verify_and_click_on_filter_by_button();
        meditation_page.verify_and_click_on_radio_button_both();
        meditation_page.verify_and_click_on_radio_button_unplayed();
        meditation_page.verify_and_click_apply_button_present_on_page();
        meditation_page.verify_Unplayed_present_on_page();
        meditation_page.verify_travel_series_present_on_page();
        meditation_page.verify_anxiety_series_present_on_page();
        meditation_page.verify_eat_mindfully_present_on_page();
    }

    @Test()
    public void Verify_that_the_user_Reset_the_Filter_and_sort_Mind_015() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user Reset the Filter and sort.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("Mantra");
        meditation_page.verify_and_click_on_Mindfulness_present_on_page();
        meditation_page.verify_and_click_on_filter_by_button();
        meditation_page.verify_and_click_reset_button_present_on_page();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_English_language_tab_Mind_016() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the English  language tab.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("Mantra");
        meditation_page.verify_and_click_on_Mindfulness_present_on_page();
        meditation_page.verify_and_click_on_english_language();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_Hindi_language_tab_Mind_017() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Hindi  language tab.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("Mantra");
        meditation_page.verify_and_click_on_Mindfulness_present_on_page();
        meditation_page.verify_and_click_on_hindi_language();

    }

    @Test()
    public void Verify_that_the_user_tap_on_the_Marathi_language_tab_Mind_018() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Marathi language tab.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("Mantra");
        meditation_page.verify_and_click_on_Mindfulness_present_on_page();
        meditation_page.verify_and_click_on_marathi_language();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_Gujarati_language_tab_Mind_019() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Gujarati language tab.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("Mantra");
        meditation_page.verify_and_click_on_Mindfulness_present_on_page();
        meditation_page.verify_and_click_on_gujarati_language();
    }

    @Test()
    public void Verify_that_the_user_tap_on_the_Bengali_language_tab_Mind_020() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Bengali language tab.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("Mantra");
        meditation_page.verify_and_click_on_Mindfulness_present_on_page();
        meditation_page.verify_and_click_on_bengali_language();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Tamil_language_tab_Mind_021(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Tamil language tab.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("Mantra");
        meditation_page.verify_and_click_on_Mindfulness_present_on_page();
        meditation_page.verify_and_click_on_tamil_language();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Kannada_language_tab_Mind_022(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Kannada language tab.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("Mantra");
        meditation_page.verify_and_click_on_Mindfulness_present_on_page();
        meditation_page.verify_and_click_on_kannada_language();
    }
    @Test()
    public void Verify_that_the_user_Start_the_Meditation_Timer_for_the_practice_Mind_023() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user Start the Meditation Timer for the practice.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.verify_and_click_Meditation_Timer();
        meditation_page.verify_and_set_timer();
        meditation_page.verify_and_click_on_start_button();
        meditation_page.wait_for_five_second();
    }
    @Test()
    public void Verify_that_the_user_Start_the_Digi_Mala_for_Mantra_set_the_bead_count_and_start_Mind_024(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user Start the Digi Mala for Mantra set the bead count and start.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_pop_up();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("Digi");
        meditation_page.verify_and_click_on_digi_mala();
        meditation_page.verify_and_Select_digi_mala_beads();
        meditation_page.click_on_start_button();
    }
    @Test()
    public void Verify_that_the_user_set_a_Playback_Speed_for_the_Digi_Mala_Mind_025(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user set a Playback Speed for the Digi Mala");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("Digi");
        meditation_page.verify_and_click_on_digi_mala();
        meditation_page.verify_and_click_on_start_button();
        meditation_page.verify_and_click_on_play_button_start_and_stop();
        meditation_page.verify_and_click_on_play_back_speed_button();
        meditation_page.wait_for_five_second();
        Meditation_Page.clickAllMatchingElements((AndroidDriver) driver);
    }
    @Test()
    public void Verify_that_the_user_search_for_the_coach_by_coach_name_Mind_026(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user search for the coach by coach name ");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("see all");
        meditation_page.verify_and_click_on_see_all();
        meditation_page.click_on_search_by_coach_name();
        meditation_page.verify_search_coach_name_enter_and_clear_text();
    }
    @Test()
    public void Verify_that_the_user_share_a_Breakdown_at_work_Find_out_here_Mind_027(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user share a Breakdown at work Find out here");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.verify_and_click_on_share_button_of_breakdown_work();


    }
    @Test()
    public void Verify_that_the_user_play_the_trending_Meditation_series_Mind_028(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user play the trending Meditation series.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.scroll_to_buttom_personalised_for_you();
        meditation_page.verify_and_click_on_meditations_series();
        meditation_page.verify_and_click_on_cancel_button();
        meditation_page.scroll_up_to_top_of_the_page();
        meditation_page.verify_and_click_on_meditations_series_play_button();
    }
    @Test()
    public void Verify_that_the_user_edit_the_What_type_of_meditations_are_you_looking_for_Mind_029(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user edit the What type of meditations are you looking for?");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.scroll_to_buttom_till_end();
        meditation_page.verify_and_click_on_edit_button();
        meditation_page.verify_user_able_to_edit_meditations_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_see_all_for_the_Stress_Anxiety_serieses_Mind_030(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the see all for the Stress Anxiety serieses");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.waitForTextElementAppear("Stress & Anxiety");
        //  meditation_page.scroll_down_to_the_Text("Stress & Anxiety");
        meditation_page.verify_and_click_on_see_all();
    }
    @Test()
    public void Verify_that_the_user_play_and_listen_the_Meditation_Series_of_Stress_Anxiety_series_Mind_031(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user play and listen the Meditation Series of Stress & Anxiety  series");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.scroll_to_buttom_till_end();
        meditation_page.verify_and_click_on_see_all();
        meditation_page.wait_for_five_second();
        meditation_page.verify_and_click_on_english_language();
        meditation_page.verify_and_click_on_meditations_series_first_video();
        meditation_page.verify_and_click_on_cancel_button();
        meditation_page.scroll_up_to_top_of_the_page();
        meditation_page.verify_and_click_on_meditations_series_play_button();
    }
    @Test()
    public void Verify_that_the_user_pause_the_Meditation_Series_of_Stress_Anxiety_series_Mind_032(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user pause the Meditation Series of Stress & Anxiety series");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.scroll_to_buttom_till_end();
        meditation_page.verify_and_click_on_see_all();
        meditation_page.wait_for_five_second();
        meditation_page.verify_and_click_on_english_language();
        meditation_page.verify_and_click_on_meditations_series_first_video();
        meditation_page.verify_and_click_on_cancel_button();
        meditation_page.scroll_up_to_top_of_the_page();
        meditation_page.verify_and_click_on_meditations_series_play_button();
        meditation_page.verify_and_click_on_meditations_series_stop_button();
    }
    @Test()
    public void Verify_that_the_user_share_the_Meditation_Series_of_Stress_Anxiety_series_Mind_033(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user share the Meditation Series of Stress & Anxiety series");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.scroll_to_buttom_till_end();
        meditation_page.verify_and_click_on_see_all();
        meditation_page.wait_for_five_second();
        meditation_page.verify_and_click_on_english_language();
        meditation_page.verify_and_click_on_meditations_series_first_video();
        meditation_page.verify_and_click_on_cancel_button();
        meditation_page.scroll_up_to_top_of_the_page();
        meditation_page.verify_and_click_on_share_button();
    }
    @Test()
    public void Verify_that_the_user_Add_to_favourite_the_Meditation_Series_of_Stress_Anxiety_series_Mind_034(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user Add to favourite the Meditation Series of Stress & Anxiety series");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.scroll_to_buttom_till_end();
        meditation_page.verify_and_click_on_see_all();
        meditation_page.wait_for_five_second();
        meditation_page.verify_and_click_on_english_language();
        meditation_page.verify_and_click_on_meditations_series_first_video();
        meditation_page.verify_and_click_on_cancel_button();
        meditation_page.scroll_up_to_top_of_the_page();
        meditation_page.verify_and_click_on_add_to_fav_button();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_English_language_on_the_Stress_Anxiety_screen_Mind_036(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the English language on the Stress & Anxiety screen");
        //  Verify that the user tap on the Hindi language on the "Stress & Anxiety" screen Mind_037
        //  Verify that the user tap on the Marathi language on the "Stress & Anxiety" screen Mind_038
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.scroll_to_buttom_till_end();
        meditation_page.verify_and_click_on_see_all();
        meditation_page.wait_for_five_second();
        meditation_page.verify_and_click_on_english_language();
        meditation_page.verify_english_track_present_on_page();
        meditation_page.scroll_up_to_top_hindi_present_on_page();
        meditation_page.verify_and_click_on_hindi_language();
        meditation_page.verify_hindi_track_present_on_page();
        meditation_page.scroll_up_to_top_marathi_present_on_page();
        meditation_page.verify_and_click_on_marathi_language();
        meditation_page.verify_marathi_track_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_kebab_menu_of_the_Meditation_Serieson_stress_Anxiety_screen_Mind_039(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the English language on the Stress & Anxiety screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.scroll_to_buttom_till_end();
        meditation_page.verify_and_click_on_see_all();
        meditation_page.wait_for_five_second();
        meditation_page.verify_and_click_on_english_language();
        meditation_page.verify_and_click_on_Meditation_Series_Kebab_Icon();
        meditation_page.verify_scroll_Down_to_Quick_Picks();
        meditation_page.verify_and_click_on_Quick_Picks_Kebab_Icon();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_see_all_for_the_Focus_Productivity_serieses_Mind_041(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the see all  for the Focus Productivity serieses ");
        //  Verify that the user tap on the Bengali language on the "Focus & Productivity" screen_Mind_048
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_pop_up();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.click_on_Focus_and_Productivity();
        meditation_page.verify_and_click_on_see_all();
        meditation_page.verify_focus_productivity_screen_series();
    }
    @Test()
    public void Verify_that_the_user_play_and_listen_the_Meditation_Series_of_Focus_Productivity_series_Mind_042(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user play and listen the Meditation Series of Focus Productivity series");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_pop_up();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.click_on_Focus_and_Productivity();
        meditation_page.verify_and_click_on_see_all();
        meditation_page.click_on_Focus_and_Productivity_Meditation_Series();
        meditation_page.verify_and_click_on_cancel_button();
        meditation_page.scroll_up_to_top_of_the_page();
        meditation_page.click_on_play_and_pause_Productivity_Meditation_Series();
        meditation_page.click_on_add_to_favorites_and_share_focus_productivity_series();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_English_language_on_the_Focus_Productivity_screen_Mind_047(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the English language on the Focus Productivity screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_pop_up();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.click_on_Focus_and_Productivity();
        meditation_page.verify_and_click_on_see_all();
        meditation_page.verify_and_click_on_tap_english_language_focus_productivity_series();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_kebab_menu_of_the_Meditation_Series_on_Focus_Productivity_screen_Mind_049(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the kebab menu of the Meditation Series on Focus Productivity screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_pop_up();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.click_on_Focus_and_Productivity();
        meditation_page.verify_and_click_on_see_all();
        meditation_page.verify_and_click_on_Meditation_Series_Kebab_Icon();
        meditation_page.verify_share_button_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_kebab_menu_of_the_Quick_Picks_on_Focus_Productivity_screen_Mind_050(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the kebab menu of the Quick Picks on Focus Productivity screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_pop_up();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.click_on_Focus_and_Productivity();
        meditation_page.verify_and_click_on_see_all();
        meditation_page.verify_and_click_on_Quick_Picks_Kebab_Icon();
        meditation_page.verify_add_to_fav_and_downloads_button();
        meditation_page.verify_share_button_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_see_all_for_the_Motivation_serieses_Mind_051(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the see all  for the Motivation serieses ");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.scroll_to_buttom_till_end();
        meditation_page.click_on_motivation_button();
        meditation_page.verify_and_click_on_see_all();
        meditation_page.verify_and_click_on_english_language();
        meditation_page.verify_english_track_series_motivation_present_on_page();
        meditation_page.scroll_up_to_top_hindi_present_on_page();
        meditation_page.verify_and_click_on_hindi_language();
        meditation_page.verify_hindi_track_series_motivation_present_on_page();
        meditation_page.verify_and_click_on_marathi_language();
        meditation_page.verify_marathi_track_series_motivation_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_play_and_listen_the_Meditation_Series_of_Motivation_series_Mind_052(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user play and listen the Meditation Series of Motivation series");
        //   Verify that the user pause the Meditation Series of "Motivation" series_Mind_053
        //   Verify that the user share the Meditation Series of "Motivation" series_Mind_054
        //   Verify that the user Add to favourite the Meditation Series of "Motivation" series_Mind_055
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.scroll_to_buttom_till_end();
        meditation_page.click_on_motivation_button();
        meditation_page.verify_and_click_on_see_all();
        meditation_page.verify_motivation_present_page();
        meditation_page.verify_and_click_on_english_language();
        meditation_page.verify_and_click_on_meditations_series_first_video();
        meditation_page.verify_and_click_on_cancel_button();
        meditation_page.scroll_up_to_top_of_the_page();
        meditation_page.verify_and_click_on_meditations_series_play_button();
        meditation_page.verify_and_click_on_meditations_series_stop_button();
        meditation_page.verify_and_click_on_meditations_series_add_to_fav_and_share();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_English_language_on_the_Motivation_screen_Mind_057(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the English language on the Motivation screen");
        //   Verify that the user tap on the Hindi language on the "Motivation" screen_Mind_058
        //    Verify that the user tap on the Marathi language on the "Motivation" screen_Mind_059
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.scroll_to_buttom_till_end();
        meditation_page.click_on_motivation_button();
        meditation_page.verify_and_click_on_see_all();
        meditation_page.verify_motivation_present_page();
        meditation_page.verify_and_click_on_english_language();
        meditation_page.verify_english_track_series_motivation_present_on_page();
        meditation_page.verify_english_track_series_quick_picks_motivation_present_on_page();
        meditation_page.scroll_up_to_top_hindi_present_on_page();
        meditation_page.verify_and_click_on_hindi_language();
        meditation_page.verify_hindi_track_series_motivation_present_on_page();
        meditation_page.verify_and_click_on_marathi_language();
        meditation_page.verify_marathi_track_series_motivation_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_kebab_menu_of_the_Meditation_Series_on_Motivation_screen_Mind_060(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the kebab menu of the Meditation Series on Motivation screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.scroll_to_buttom_till_end();
        meditation_page.click_on_motivation_button();
        meditation_page.verify_and_click_on_see_all();
        meditation_page.verify_motivation_present_page();
        meditation_page.verify_and_click_on_english_language();
        meditation_page.verify_and_click_on_Meditation_Series_Kebab_Icon();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_kebab_menu_of_the_Quick_Picks_on_Motivation_screen_Mind_061(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the kebab menu of the Quick Picks on Motivation  screen");
        // Verify that the user see the added favourites of Meditation serieses in the "Add to Favourite"_Mind_062
        //  Verify that the user see the downloaded Meditation serieses in the "Download"_Mind_063
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Meditation_Page meditation_page = new Meditation_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        meditation_page.verify_and_click_on_Meditations();
        meditation_page.scroll_to_buttom_till_end();
        meditation_page.click_on_motivation_button();
        meditation_page.verify_and_click_on_see_all();
        meditation_page.verify_motivation_present_page();
        meditation_page.verify_and_click_on_english_language();
        meditation_page.scroll_down_Quick_Picks();
        meditation_page.verify_and_click_on_Quick_Picks_Kebab_Icon();
        meditation_page.verify_add_to_fav_and_remove_from_fav();
        meditation_page.verify_download_and_delete_from_downloads();
    }
}
