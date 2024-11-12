package mobile.tests.Music_Playlist;

import io.appium.java_client.android.AndroidDriver;
import io.unity.framework.init.base;
import io.unity.framework.remotegrid.LambdaTestConfig;
import mobile.object_repository.Onboarding.signin_page;
import mobile.object_repository.sleep_playlist.Sleep_Playlist_Page;
import mobile.object_repository.today_music_playlist.Today_Music_Page;
import org.testng.annotations.Test;

import java.time.Duration;

public class Music_Playlist_Test extends base {

    @Test
    public void To_verify_when_the_user_taps_on_the_Create_Playlist_button_on_the_Your_Playlist_section_Music_PL_001(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Create Playlist' button on the 'Your Playlist' section");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
    }
    @Test
    public void To_verify_when_the_use_taps_on_the_the_Playlist_Name_filed_Music_PL_003(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the use taps on the the 'Playlist Name' filed");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("@#ZEEL");
    }
    @Test
    public void To_verify_when_the_user_taps_on_the_Cancel_button_Music_PL_004(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Cancel' button");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        signin_page.keyboard_hide();
        sleep_playlist_page.verify_and_click_cancel_button();
        sleep_playlist_page.verify_today_music_screen_present_on_page();
    }
    @Test
    public void To_verify_when_user_try_to_taps_on_the_Create_Button_on_the_Create_Playlist_screen_without_entering_any_data_in_the_Playlist_Name_field_Music_PL_005(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when user try to taps on the Create Button on the Create Playlist screen without entering any data in the Playlist Name field");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        signin_page.keyboard_hide();
        sleep_playlist_page.click_on_CreateButton();
        sleep_playlist_page.verify_give_your_playlist_a_name();
    }
    @Test
    public void To_verify_when_user_try_to_taps_on_the_Create_Button_on_the_Create_Playlist_screen_after_entering_any_data_in_the_Playlist_Name_field_Music_PL_006(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when user try to taps on the Create Button on the Create Playlist screen after entering any data in the Playlist Name field");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox( "Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_add_item_to_playlist_present_on_page();
    }
    @Test()
    public void To_verify_when_the_user_enters_the_any_keyword_in_search_field_of_the_Add_item_to_playlist_screen_Music_PL_008(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user enters the any keyword in search field of the Add item to playlist screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Manual");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_add_item_to_playlist_present_on_page();
        sleep_playlist_page.verify_search_text_present_on_page();
        sleep_playlist_page.verify_search_box_enter_and_clear_box();
    }
    @Test()
    public void To_verify_when_the_user_taps_on_the_Expand_icon_on_the_any_category_from_the_list_Music_PL_010(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the Expand icon on the any category from the list");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Today_Music_Page today_music_page = new Today_Music_Page(driver);
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        today_music_page.verify_and_click_on_music();
        today_music_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        today_music_page.enterTextInPlaylistNameTextBox("Manual");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_add_item_to_playlist_present_on_page();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.verify_quick_wind_down();
        today_music_page.verify_get_rapid_calm_present_on_page();
        today_music_page.scroll_down_to_the_Text("Peace Time");
        today_music_page.verify_natures_lullaby_present_on_page();
    }
    @Test()
    public void To_verify_when_the_user_taps_on_the_Collapse_icon_on_the_any_category_from_the_list_Music_PL_011(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Collapse' icon on the any category from the list ");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Today_Music_Page today_music_page = new Today_Music_Page(driver);
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        today_music_page.verify_and_click_on_music();
        today_music_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        today_music_page.enterTextInPlaylistNameTextBox("Manual");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_add_item_to_playlist_present_on_page();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.verify_quick_wind_down();
        today_music_page.verify_and_click_on_collapse_icon_button();
    }
    @Test
    public void To_verify_when_the_user_taps_on_the_Select_all_radio_button_of_the_expanded_list_of_music_tracks_Music_PL_012(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Select all' radio button of the expanded list of music tracks");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Today_Music_Page today_music_page = new Today_Music_Page(driver);
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        today_music_page.verify_and_click_on_music();
        today_music_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        today_music_page.enterTextInPlaylistNameTextBox("Manual");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.verify_and_click_on_radio_button_for_select_all_music();
    }
    @Test
    public void To_verify_when_user_try_to_add_more_than_50_tracks_in_the_any_created_playlist_Music_PL_013(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Select all' radio button of the expanded list of music tracks");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Today_Music_Page today_music_page = new Today_Music_Page(driver);
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        today_music_page.verify_and_click_on_music();
        today_music_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        today_music_page.enterTextInPlaylistNameTextBox("Manual");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_For_Focus();
        today_music_page.verify_and_click_on_radio_button_for_select_all_music();
    }
    @Test
    public void To_verify_when_the_user_taps_on_the_Add_music_button_on_the_any_music_track_from_the_expanded_music_list_Music_PL_014(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Add music +' button on the any music track from the expanded music list");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Today_Music_Page today_music_page = new Today_Music_Page(driver);
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        today_music_page.verify_and_click_on_music();
        today_music_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        today_music_page.enterTextInPlaylistNameTextBox("Manual");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.scroll_down_to_the_Text("Peace Time");
        today_music_page.clickFirstTwoCheckboxesOfMusic();
    }
    @Test
    public void To_verify_when_the_user_taps_on_the_Selected_icon_on_the_selected_music_track_from_the_expanded_music_list_Music_PL_015(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Selected' icon on the selected music track from the expanded music list");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        Today_Music_Page today_music_page = new Today_Music_Page(driver);
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        today_music_page.verify_and_click_on_music();
        today_music_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        today_music_page.enterTextInPlaylistNameTextBox("Manual");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.scroll_down_to_the_Text("Peace Time");
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.wait_for_five_second();
        today_music_page.verify_and_click_on_quick_wind_down_unselect_the_song();
    }
}
