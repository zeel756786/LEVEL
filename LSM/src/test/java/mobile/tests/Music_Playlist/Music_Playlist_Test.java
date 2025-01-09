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
    public void To_verify_when_the_user_taps_on_the_Create_Playlist_button_on_the_Your_Playlist_section_Music_PL_001() {
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
    }

    @Test
    public void To_verify_when_the_use_taps_on_the_the_Playlist_Name_filed_Music_PL_003() {
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("@#ZEEL");
    }

    @Test
    public void To_verify_when_the_user_taps_on_the_Cancel_button_Music_PL_004() {
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        signin_page.keyboard_hide();
        sleep_playlist_page.verify_and_click_cancel_button();
        sleep_playlist_page.verify_today_music_screen_present_on_page();
    }

    @Test
    public void To_verify_when_user_try_to_taps_on_the_Create_Button_on_the_Create_Playlist_screen_without_entering_any_data_in_the_Playlist_Name_field_Music_PL_005() {
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        signin_page.keyboard_hide();
        sleep_playlist_page.click_on_CreateButton();
        sleep_playlist_page.verify_give_your_playlist_a_name();
    }

    @Test
    public void To_verify_when_user_try_to_taps_on_the_Create_Button_on_the_Create_Playlist_screen_after_entering_any_data_in_the_Playlist_Name_field_Music_PL_006() {
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_add_item_to_playlist_present_on_page();
    }

    @Test()
    public void To_verify_when_the_user_enters_the_any_keyword_in_search_field_of_the_Add_item_to_playlist_screen_Music_PL_008() {
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Manual");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_add_item_to_playlist_present_on_page();
        sleep_playlist_page.verify_search_text_present_on_page();
        sleep_playlist_page.verify_search_box_enter_and_clear_box();
    }

    @Test()
    public void To_verify_when_the_user_taps_on_the_Expand_icon_on_the_any_category_from_the_list_Music_PL_010() {
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        sleep_playlist_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Manual");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_add_item_to_playlist_present_on_page();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.verify_quick_wind_down();
        today_music_page.verify_get_rapid_calm_present_on_page();
        sleep_playlist_page.scroll_down_to_the_Text("Peace Time");
    }

    @Test()
    public void To_verify_when_the_user_taps_on_the_Collapse_icon_on_the_any_category_from_the_list_Music_PL_011() {
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        sleep_playlist_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        today_music_page.enterTextInPlaylistNameTextBox("Manual");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_add_item_to_playlist_present_on_page();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.verify_quick_wind_down();
        today_music_page.verify_and_click_on_collapse_icon_button();
    }

    @Test
    public void To_verify_when_the_user_taps_on_the_Select_all_radio_button_of_the_expanded_list_of_music_tracks_Music_PL_012() {
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        today_music_page.enterTextInPlaylistNameTextBox("Manual");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.verify_and_click_on_radio_button_for_select_all_music();
    }

    @Test
    public void To_verify_when_user_try_to_add_more_than_50_tracks_in_the_any_created_playlist_Music_PL_013() {
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        today_music_page.enterTextInPlaylistNameTextBox("Manual");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_For_Focus();
        today_music_page.verify_and_click_on_radio_button_for_select_all_music();
    }

    @Test
    public void To_verify_when_the_user_taps_on_the_Add_music_button_on_the_any_music_track_from_the_expanded_music_list_Music_PL_014() {
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        today_music_page.enterTextInPlaylistNameTextBox("Manual");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.scroll_down_to_the_Text("Peace Time");
        today_music_page.clickFirstTwoCheckboxesOfMusic();
    }

    @Test
    public void To_verify_when_the_user_taps_on_the_Selected_icon_on_the_selected_music_track_from_the_expanded_music_list_Music_PL_015() {
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        today_music_page.enterTextInPlaylistNameTextBox("Manual");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.wait_for_five_second();
        today_music_page.verify_and_click_on_quick_wind_down_unselect_the_song();
    }

    @Test()
    public void To_verify_when_the_user_verify_when_user_wraps_left_from_the_Categories_Screen_Music_PL_017() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when user swaps left from the 'Categories' Screen");
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        today_music_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.horizontalScrollRightToTexts("Newly Added");
        today_music_page.verify_Add_items_to_playlist_music();
        // verification of new added id display

    }

    @Test
    public void To_verify_when_the_the_user_try_to_taping_on_the_Go_To_Playlist_button_without_selecting_music_track_Music_PL_018() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the the user try to taping on the 'Go To Playlist' button without selecting any music track.");
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        today_music_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.verify_and_click_on_go_to_playlist();
        today_music_page.verify_New_playlist_name();
        // Add item to playlist for verification
    }

    @Test
    public void To_verify_when_the_the_user_try_to_taping_on_the_Go_To_Playlist_button_after_selecting_music_track_Music_PL_019() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the the user try to taping on the 'Go To Playlist' button after selecting music track.");
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        today_music_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.scroll_down_to_the_Text("Peace Time");
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        today_music_page.verify_New_playlist_name();
    }

    @Test
    public void To_verify_when_the_the_user_taps_on_the_Back_button_Music_PL_021() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Back' button.");
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        today_music_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_navigate_back_button();
        today_music_page.verify_music_tab_icon_highlighted();
    }

    @Test
    public void To_verify_when_the_user_taps_on_the_More_Vert_icon_on_beside_the_playlist_name_Music_PL_022() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'More Vert' icon beside the playlist name.");
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_and_click_on_more_vert();
        sleep_playlist_page.verify_logo_of_music_on_playlist_page();
        today_music_page.verify_name_of_music_track_more_vert();
        today_music_page.verify_duration_of_music_track_more_vert();
        today_music_page.verify_click_on_close_button_more_vert();
        today_music_page.verify_add_to_this_playlist_present_on_page();
        today_music_page.verify_delete_playlist_page_present_on_page();
        today_music_page.verify_edit_playlist_present_on_page();
    }

    @Test
    public void To_verify_when_the_user_taps_on_the_Play_button_Music_PL_023() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Play' button.");
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.click_on_music_play_button_playlist();
    }

    @Test
    public void To_verify_when_the_user_taps_on_the_Close_icon_on_the_bottom_Music_PL_025() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Close' icon on the bottom sheet.");
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_and_click_on_more_vert();
        today_music_page.verify_close_button_of_music_track();
        today_music_page.verify_click_on_close_button();
        today_music_page.verify_New_playlist_name();
        // verify create playlist page
    }

    @Test
    public void To_verify_when_the_user_taps_on_the_Add_to_this_Playlist_option_on_the_bottom_sheet_Music_PL_026() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the '+ Add to this Playlist' option on the bottom sheet.");
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_and_click_on_more_vert();
        today_music_page.verify_and_click_add_to_this_playlist_present_on_page();
        today_music_page.verify_Add_items_to_playlist_music();
        // verify Add item to playlist
    }

    @Test
    public void To_verify_when_the_user_taps_on_the_Delete_playlist_option_on_the_bottom_sheet_Music_PL_027() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Delete playlist' option on the bottom sheet.");
        // To_verify_the_UI_of_the_delete_playlist_confirmation_popup_ with_"emogi"_present_Music_Pl_028().
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_and_click_on_more_vert();
        today_music_page.verify_delete_playlist_page_present_on_page();
        sleep_playlist_page.click_on_delete_playlist();
        sleep_playlist_page.verify_are_you_are_you_sure_pop_up();
    }

    @Test
    public void To_verify_when_the_user_taps_on_the_No_button_on_the_delete_playlist_confirmation_popup_Music_PL_029() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'No' button on the delete playlist confirmation popup. ");
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_and_click_on_more_vert();
        today_music_page.verify_delete_playlist_page_present_on_page();
        sleep_playlist_page.click_on_delete_playlist();
        sleep_playlist_page.verify_and_click_on_no_button_delete_playlist();
        today_music_page.verify_name_of_music_track_more_vert();

    }

    @Test
    public void To_verify_when_the_user_taps_on_the_Yes_button_on_the_delete_playlist_confirmation_popup_Music_PL_030() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Yes' button on the delete playlist confirmation popup. ");
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_and_click_on_more_vert();
        today_music_page.verify_delete_playlist_page_present_on_page();
        sleep_playlist_page.click_on_delete_playlist();
        sleep_playlist_page.verify_and_click_on_yes_delete_playlist();
        today_music_page.verify_Music_screen();
    }

    @Test
    public void To_verify_when_the_user_taps_on_the_Edit_Playlist_on_the_bottom_sheet_Music_PL_031() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Edit Playlist' option on the bottom sheet.");
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_and_click_on_more_vert();
        today_music_page.verify_and_click_edit_playlist_present_on_page();
        sleep_playlist_page.verify_Edit_Playlist_Screen_present_on_page();
    }

    @Test
    public void To_verify_when_the_user_try_to_tap_on_the_Save_button_without_applying_any_changes_in_the_created_playlist_Music_PL_033() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user try to tap on the 'Save' button without applying any changes in the created playlist.");
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_and_click_on_more_vert();
        today_music_page.verify_and_click_edit_playlist_present_on_page();
        sleep_playlist_page.verify_and_click_save_button_playlist();
        sleep_playlist_page.verify_Edit_Playlist_Screen_present_on_page();
    }

    @Test
    public void To_verify_that_the_user_is_able_to_update_the_playlist_name_Music_PL_034() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify that the user is able to update the playlist name.");
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
        sleep_playlist_page.scroll_down_to_the_Text("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_and_click_on_more_vert();
        today_music_page.verify_and_click_edit_playlist_present_on_page();
        sleep_playlist_page.edit_the_playlist_name();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Testing");
        sleep_playlist_page.verify_and_click_save_button_playlist();
    }

    @Test
    public void To_verify_when_the_user_taps_on_the_x_Remove_icon_on_the_any_available_track_in_the_playlist_Music_PL_035() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'x Remove' icon on the any available track in the playlist.");
        //To verify when the user tap on the 'Save' button after removing the tracks in the playlist Music PL 039()
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_and_click_on_more_vert();
        today_music_page.verify_and_click_edit_playlist_present_on_page();
        sleep_playlist_page.verify_and_click_on_Remove_x_icon_playlist();
        sleep_playlist_page.verify_and_click_save_button_playlist();
        today_music_page.verify_New_playlist_name();
    }
    @Test()
    // Need to fix
    public void To_verify_that_the_user_is_able_to_reorder_the_track_available_in_the_playlist_Music_PL_036() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'x Remove' icon on the any available track in the playlist.");
        // To verify when the user tap on the 'Save' button after changing the order of the tracks in the playlist_PL_38()
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_and_click_on_more_vert();
        today_music_page.verify_and_click_edit_playlist_present_on_page();
        today_music_page.Sliding_the_track_on_edit_playlist();
        sleep_playlist_page.verify_and_click_save_button_playlist();
    }
    @Test
    public void To_verify_when_the_user_try_to_tap_on_the_Save_button_after_removing_the_playlist_name_Music_PL_037() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user try to tap on the 'Save' button after removing the playlist name.");
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_and_click_on_more_vert();
        sleep_playlist_page.edit_the_playlist_name();
        sleep_playlist_page.verify_and_click_save_button_playlist();
        today_music_page.verify_and_click_edit_playlist_present_on_page();
    }

    @Test
    public void To_verify_when_the_user_taps_on_the_More_Vert_icon_on_track_song_name_Music_PL_041() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'More Vert' icon beside the playlist name.");
        //To_verify_when_the_user_taps_on_the_Close_icon_on_the_bottom_sheet_music_PL_042
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        today_music_page.verify_and_click_on_more_vert_on_trac();
        today_music_page.verify_name_of_music_track();
        today_music_page.verify_duration_of_music_track_more_vert();
        today_music_page.verify_click_on_close_button_more_vert();
        sleep_playlist_page.verify_add_to_favorites();
        today_music_page.verify_share_the_music();
        today_music_page.verify_rate_of_this_music();
        sleep_playlist_page.verify_schedule_a_reminder();
        today_music_page.verify_click_on_close_button_more_vert();
        today_music_page.verify_New_playlist_name();

    }

    @Test
    public void To_verify_when_the_user_taps_on_the_Add_to_favorites_option_on_the_bottom_sheet_Music_PL_043() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Add to favorites' option on the bottom sheet.");
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        today_music_page.verify_and_click_on_more_vert_on_trac();
        sleep_playlist_page.verify_and_click_Remove_from_favorites();
        sleep_playlist_page.verify_and_click_add_to_favorites();
        sleep_playlist_page.verify_remove_from_favorites();
    }

    @Test
    public void To_verify_when_the_user_taps_on_the_Share_this_music_option_on_the_bottom_sheet_Music_PL_044() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the Share this music option on the bottom sheet");
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        today_music_page.verify_and_click_on_more_vert_on_trac();
        today_music_page.verify_and_click_on_share_the_music();
    }
    @Test
    public void To_verify_when_the_user_taps_on_the_Schedule_a_reminder_option_on_the_bottom_sheet_Music_PL_045() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'More Vert' icon beside the playlist name.");
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        today_music_page.verify_and_click_on_more_vert_on_trac();
        sleep_playlist_page.verify_and_click_schedule_a_reminder();
        sleep_playlist_page.verify_set_a_reminder_present_on_page();
    }
    @Test
    public void Verify_that_the_user_can_Add_a_new_reminder_on_the_Reminder_screen_after_tapping_on_the_Reminder_sub_menu_Music_PL_046() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user can Add a new reminder on the Reminder screen after tapping on the \"Reminder\" sub menu");
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        today_music_page.verify_and_click_on_more_vert_on_trac();
        sleep_playlist_page.verify_and_click_schedule_a_reminder();
        sleep_playlist_page.verify_set_a_reminder_present_on_page();
        today_music_page.set_the_Reminder_present_on_page_music();
        today_music_page.click_on_save_new_reminder_Music();

    }
    @Test
    public void To_verify_when_the_user_taps_on_the_Rate_this_music_option_on_the_bottom_sheet_SLP_PL_047() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'More Vert' icon beside the playlist name.");
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        today_music_page.verify_and_click_on_more_vert_on_trac();
        today_music_page.verify_and_click_rate_of_this_music();
        sleep_playlist_page.verify_submit_feedback_form_present_on_page();
    }
    @Test
    public void To_verify_when_the_user_taps_on_the_Add_More_button_Music_PL_48() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the Add More button.");
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        today_music_page.verify_and_click_on_Add_more();
        today_music_page.verify_Add_items_to_playlist_music();
    }
    @Test
    public void To_verify_that_the_user_is_able_to_add_the_any_currently_played_track_into_the_created_playlist_music_PL_49() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify that the user is able to add the any currently played track into the created playlist.");
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.verify_and_click_on_Music_playlist_first_song();
        today_music_page.verify_and_click_on_Music_play_button_of_first_song();
        today_music_page.verify_and_click_on_more_vert_of_song();
        today_music_page.verify_and_click_on_Add_to_this_playlist();
        today_music_page.verify_and_click_on_playlist();
        today_music_page.verify_and_click_on_Save_button();
    }
    @Test
    public void To_verify_that_the_user_is_able_to_add_the_any_currently_played_track_after_creating_new_playlist_music_PL_50() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify that the user is able to add the any currently played track into the created playlist.");
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.verify_and_click_on_Music_playlist_first_song();
        today_music_page.verify_and_click_on_Music_play_button_of_first_song();
        today_music_page.verify_and_click_on_more_vert_of_song();
        today_music_page.verify_and_click_on_Add_to_this_playlist();
        today_music_page.verify_and_click_on_playlist();
        today_music_page.verify_and_click_on_Add_playlist();
        today_music_page.verify_Give_your_playlist_a_name();
    }
    @Test
    public void To_verify_that_the_user_is_able_to_add_the_track_into_the_created_playlist_using_Add_more_button_Music_PL_52() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'More Vert' icon beside the playlist name.");
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
        sleep_playlist_page.scroll_down_to_the_Text("Explore");
        sleep_playlist_page.horizontalScrollRightToTexts("Music");
        sleep_playlist_page.verify_and_click_on_music();
        sleep_playlist_page.verify_and_click_on_custom_music_playlists();
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) driver);
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        today_music_page.verify_and_click_on_create_button();
        today_music_page.verify_and_click_on_Ease_Anxiety_Stress();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        today_music_page.verify_and_click_on_Add_more();
        today_music_page.verify_Add_items_to_playlist_music();
        today_music_page.verify_and_click_on_For_Focus();
        today_music_page.clickFirstTwoCheckboxesOfMusic();
        today_music_page.verify_and_click_on_go_to_playlist();
        today_music_page.verify_New_playlist_name();
    }
}