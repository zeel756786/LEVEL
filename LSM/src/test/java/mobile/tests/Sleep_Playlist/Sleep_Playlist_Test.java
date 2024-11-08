package mobile.tests.Sleep_Playlist;

import io.appium.java_client.android.AndroidDriver;
import io.unity.framework.init.base;
import io.unity.framework.remotegrid.LambdaTestConfig;
import mobile.object_repository.signin.signin_page;
import mobile.object_repository.sleep_playlist.Sleep_Playlist_Page;
import org.testng.annotations.Test;

import java.time.Duration;

public class Sleep_Playlist_Test extends base {

    @Test
    public void To_verify_when_the_user_taps_on_the_Sleep_menu_on_th_bottom_menu_bar_SLP_PL_001() {

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To_verify_when_the_user_taps_on_the_Sleep_menu_on_th_bottom_menu_bar");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        sleep_playlist_page.verify_sleep_text_tab_button_present_on_page();
        sleep_playlist_page.verify_sleep_tab_icon_highlighted();
        sleep_playlist_page.verify_search_for_sleep_text_present_on_page();
        sleep_playlist_page.verify_music_text_present_on_page();
        sleep_playlist_page.verify_meditation_text_present_on_page();
    }

    @Test()
    public void To_verify_when_the_user_taps_on_the_Create_Playlist_button_on_the_Your_Playlist_section_SLP_PL_002() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To_verify_when_the_user_taps_on_the_Create_Playlist_button_on_the_Your_Playlist_section");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
    }

    @Test()
    public void To_verify_the_UI_of_theCreate_Playlist_screen_SLP_PL_003() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To_verify_the_UI_of_the_'Create_Playlist'_screen");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
      // can't Automate the figma design
    }

    @Test()
    public void To_verify_when_the_use_taps_on_the_Playlist_Name_filed_SLP_PL_004() {
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox( "@123zeel");
    }

    @Test()
    public void To_verify_when_the_user_taps_on_the_Cancel_button_SLP_PL_005() {
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        signin_page.keyboard_hide();
        sleep_playlist_page.verify_and_click_cancel_button();
        sleep_playlist_page.verify_sleep_tab_icon_highlighted();
    }
    @Test()
    public void To_verify_when_user_try_to_taps_on_the_Create_Button_on_the_Create_Playlist_screen_without_entering_any_data_in_the_Playlist_Name_field_SLP_PL_006(){
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        signin_page.keyboard_hide();
        sleep_playlist_page.click_on_CreateButton();
        sleep_playlist_page.verify_give_your_playlist_a_name();
    }
    @Test()
    public void To_verify_when_user_try_to_taps_on_the_Create_Button_on_the_Create_Playlist_screen_after_entering_any_data_in_the_Playlist_Name_field_SLP_PL_007() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when user try to taps on the 'Create' Button on the 'Create Playlist' screen after entering any data in the 'Playlist Name' field");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox( "Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_add_item_to_playlist_present_on_page();
    }
    @Test
    public void To_verify_the_UI_of_the_Add_Items_to_playlist_screen_SLP_PL_008(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify the UI of the 'Add Items to playlist screen");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox( "Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_add_item_to_playlist_present_on_page();
        // Can't automate the figma design
    }
    @Test()
    public void To_verify_when_the_user_enters_the_any_keyword_in_search_field_of_the_Add_item_to_playlist_screen_SLP_PL_009(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        signin_page signin_page = new signin_page(driver);
        config.addTestName("To verify when the user enters the any keyword in search field of the 'Add item to playlist' screen");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox( "Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_add_item_to_playlist_present_on_page();
        sleep_playlist_page.verify_search_text_present_on_page();
        sleep_playlist_page.verify_search_box_enter_and_clear_text();
    }
    @Test()
    public void To_verify_when_the_user_taps_on_the_any_language_filter_below_the_search_field_SLP_PL_010_and_SLP_PL_011(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the any language filter below the search field");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox( "Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_hindi_language();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.verify_gudi_padwa_present_on_page();
        sleep_playlist_page.scroll_down_to_the_Text("Akbar And Birbal's Adventure (हिन्दी)");
        sleep_playlist_page.verify_hanuman_and_machhindranath_present_on_page();
        sleep_playlist_page.verify_story_of_jesus_christ_present_on_page();
        sleep_playlist_page.verify_yama_and_nachiketa_present_on_page();
        sleep_playlist_page.scroll_up_to_the_Text("Add items to playlist");
        sleep_playlist_page.verify_and_click_on_marathi_language();
        sleep_playlist_page.verify_the_fearless_lord_present_on_page();
    }
    @Test()
    public void To_verify_when_the_user_taps_on_the_Collapse_icon_on_the_any_category_from_the_list_SLP_PL_012(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the Collapse icon on the any category from the list");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox( "Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_hindi_language();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.verify_gudi_padwa_present_on_page();
        sleep_playlist_page.scroll_down_to_the_Text("Akbar And Birbal's Adventure (हिन्दी)");
        sleep_playlist_page.verify_hanuman_and_machhindranath_present_on_page();
        sleep_playlist_page.verify_story_of_jesus_christ_present_on_page();
        sleep_playlist_page.verify_yama_and_nachiketa_present_on_page();
        sleep_playlist_page.scroll_up_to_the_Text("Add items to playlist");
        sleep_playlist_page.verify_and_click_on_collapse_icon_button();
    }
    @Test()
    public void To_verify_when_user_try_to_add_more_than_50_tracks_in_the_any_created_playlist_SLP_PL_014(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when user try to add more than 50 tracks in the any created playlist");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox( "Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_hindi_language();
        sleep_playlist_page.scroll_down_to_the_Text("Sleep Music");
        sleep_playlist_page.verify_and_click_on_stories_from_puranas_present_on_page();
        sleep_playlist_page.verify_and_click_on_radio_button_for_select_all_music();
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.scroll_down_to_the_Text("Remove Filters");
        sleep_playlist_page.verify_and_click_on_remove_filter();
        sleep_playlist_page.verify_and_click_on_radio_button_for_select_all_music();
        sleep_playlist_page.verifyTheToastMessage();
    }
    @Test()
    public void To_verify_when_the_user_taps_on_the_Add_music_plus_button_on_the_any_music_track_from_the_expanded_music_list_SLP_PL_015(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Add music +' button on the any music track from the expanded music list");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox( "Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_hindi_language();
        sleep_playlist_page.scroll_down_to_the_Text("Sleep Music");
        sleep_playlist_page.verify_and_click_on_stories_from_puranas_present_on_page();
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
      // can't verify the confirmation message because there is no locator in dom page
        sleep_playlist_page.wait_for_five_second();
    }
    @Test()
    public void To_verify_when_the_user_taps_on_the_Selected_icon_on_the_selected_music_track_from_the_expanded_music_list_SLP_PL_016(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Selected' icon on the selected music track from the expanded music list");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox( "Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_hindi_language();
        sleep_playlist_page.scroll_down_to_the_Text("Sleep Music");
        sleep_playlist_page.verify_and_click_on_stories_from_puranas_present_on_page();
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
        sleep_playlist_page.clickAndUncheckSecondCheckbox();
      //  sleep_playlist_page.verify_and_click_the_story_of_ekdant();
      //  sleep_playlist_page.verify_and_click_yama_and_nachiket();
        // can't verify the confirmation message because there is no locator in dom page
    }
    @Test()
    public void To_verify_when_the_user_taps_on_the_Remove_Filters_button_in_the_expanded_music_track_list_SLP_PL_017(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Remove Filters' button in the expanded music track list");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox( "Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_hindi_language();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.scroll_down_to_the_Text("Remove Filters");
        sleep_playlist_page.verify_and_click_on_remove_filter();
       // sleep_playlist_page.verify_and_click_on_see_all();
        sleep_playlist_page.verify_add_item_to_playlist_present_on_page();
    }
    @Test()
    public void To_verify_when_the_user_taps_swaps_left_from_the_categories_Screen_SLP_PL_018() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when user swaps left from the 'Categories' Screen");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.horizontalScrollRightToTexts("Newly Added");
    }
    @Test()
    public void To_verify_when_the_user_try_to_taping_on_the_Go_To_Playlist_button_without_selecting_any_music_track_SLP_PL_019() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user try to tapping on the 'Go To Playlist' button without selecting any music track");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_add_item_to_playlist_present_on_page();
    }
    @Test()
    public void To_verify_when_the_user_try_to_taping_on_the_Go_To_Playlist_button_after_selecting_music_track_SLP_PL_020(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user try to tapping on the 'Go To Playlist' button after selecting music track");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
        // can't verify the confirmation message because there is no locator in dom page
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_playlist_page_present_on_page();
    }
    @Test
    public void To_verify_when_the_user_taps_on_the_Back_button_SLP_PL_022(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the Back button");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_and_click_on_navigate_back_button();
        sleep_playlist_page.verify_sleep_tab_icon_highlighted();
    }
    @Test
    public void To_verify_when_the_user_taps_on_the_More_Vert_icon_beside_the_playlist_name_SLP_PL_023(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the More Vert icon beside the playlist name");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
      //  sleep_playlist_page.verify_and_click_on_hindi_language();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.scroll_down_to_the_Text("Siddhartha Chapter 2");
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_playlist_page_present_on_page();
        sleep_playlist_page.verify_and_click_on_more_vert();
        sleep_playlist_page.verify_close_icon_present_on_page();
        sleep_playlist_page.verify_add_to_this_playlist_present_on_page();
        sleep_playlist_page.verify_delete_playlist_page_present_on_page();
        sleep_playlist_page.verify_edit_playlist_present_on_page();
    }
    @Test
    public void To_verify_when_the_user_taps_on_the_Play_button_SLP_PL_024(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Play' button");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.scroll_down_to_the_Text("Siddhartha Chapter 2");
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_golden_values_of_life_music_present_on_playlist_page();
        sleep_playlist_page.verify_siddhartha_chapter_present_on_playlist_page();
        sleep_playlist_page.click_on_music_play_button_playlist();
        sleep_playlist_page.click_on_music_forward_button();
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.click_on_stop_music();
        sleep_playlist_page.verify_and_click_on_video_back_button();
        sleep_playlist_page.verify_playlist_page_present_on_page();
    }
    @Test
    public void To_verify_when_the_user_taps_on_the_More_Vert_icon_on_the_any_added_track_from_the_playlist_SLP_PL_025(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'More Vert' icon on the any added track from the playlist");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.scroll_down_to_the_Text("Siddhartha Chapter 1");
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_golden_values_of_life_music_present_on_playlist_page();
        sleep_playlist_page.verify_siddhartha_chapter_present_on_playlist_page();
        sleep_playlist_page.click_on_more_vert_icon_playlist();
        sleep_playlist_page.verify_logo_of_music_on_playlist_page();
        sleep_playlist_page.verify_name_of_golden_values_of_life();
        sleep_playlist_page.verify_duration_of_golden_values_of_life();
        sleep_playlist_page.verify_close_button_golden_values_of_life();
        sleep_playlist_page.verify_add_to_favorites();
        sleep_playlist_page.verify_share_this_sleep_story();
        sleep_playlist_page.verify_schedule_a_reminder();
        sleep_playlist_page.verify_rate_this_sleep_story();
    }
    @Test
    public void To_verify_when_the_user_taps_on_the_Close_icon_on_the_bottom_sheet_SLP_PL_026(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the Close icon on the bottom sheet");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.scroll_down_to_the_Text("Siddhartha Chapter 2");
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_golden_values_of_life_music_present_on_playlist_page();
        sleep_playlist_page.verify_siddhartha_chapter_present_on_playlist_page();
        sleep_playlist_page.click_on_more_vert_icon_playlist();
        sleep_playlist_page.click_on_close_button_golden_values_of_life();
    }
    @Test
    public void To_verify_when_the_user_taps_on_the_plus_Add_to_this_Playlist_option_on_the_bottom_sheet_SLP_PL_027(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the '+ Add to this Playlist' option on the bottom sheet");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.scroll_down_to_the_Text("Siddhartha Chapter 2");
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_golden_values_of_life_music_present_on_playlist_page();
        sleep_playlist_page.verify_siddhartha_chapter_present_on_playlist_page();
        sleep_playlist_page.verify_and_click_on_add_items_button();
        sleep_playlist_page.verify_add_item_to_playlist_present_on_page();
    }
    @Test
    public void To_verify_when_the_user_taps_on_the_Delete_playlist_option_on_the_bottom_sheet_SLP_PL_028(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Delete playlist' option on the bottom sheet");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.scroll_down_to_the_Text("Siddhartha Chapter 2");
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_golden_values_of_life_music_present_on_playlist_page();
        sleep_playlist_page.verify_siddhartha_chapter_present_on_playlist_page();
        sleep_playlist_page.verify_and_click_on_more_vert();
        sleep_playlist_page.click_on_delete_playlist();
        sleep_playlist_page.verify_are_you_are_you_sure_pop_up();
    }
    @Test
    public void To_verify_the_UI_of_the_delete_playlist_confirmation_popup_SLP_PL_029(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Delete playlist' option on the bottom sheet");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.scroll_down_to_the_Text("Siddhartha Chapter 2");
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_and_click_on_more_vert();
        sleep_playlist_page.click_on_delete_playlist();
        sleep_playlist_page.verify_emoji_present_on_delete_confirmation_pop();
    }
    @Test
    public void To_verify_when_the_user_taps_on_the_No_button_on_the_delete_playlist_confirmation_popup_SLP_PL_030(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'No' button on the delete playlist confirmation popup");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.scroll_down_to_the_Text("Siddhartha Chapter 2");
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_and_click_on_more_vert();
        sleep_playlist_page.click_on_delete_playlist();
        sleep_playlist_page.verify_and_click_on_no_button_delete_playlist();
        sleep_playlist_page.verify_add_to_this_playlist_present_on_page();
    }
    @Test
    public void To_verify_when_the_user_taps_on_the_Yes_delete_playlist_button_on_the_delete_playlist_confirmation_popup_SLP_PL_031(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Yes, delete playlist' button on the delete playlist confirmation popup");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.scroll_down_to_the_Text("Siddhartha Chapter 2");
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_and_click_on_more_vert();
        sleep_playlist_page.click_on_delete_playlist();
        sleep_playlist_page.verify_and_click_on_yes_delete_playlist();
    }
    @Test()
    public void To_verify_when_the_user_taps_on_the_Edit_Playlist_option_option_on_the_bottom_sheet_SLP_PL_032(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Edit Playlist' option option on the bottom sheet");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("QATest");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.scroll_down_to_the_Text("Siddhartha Chapter 2");
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_and_click_on_more_vert();
        sleep_playlist_page.click_on_edit_playlist();
        sleep_playlist_page.verify_Edit_Playlist_Screen_present_on_page();
    }
    @Test
    public void To_verify_when_the_user_try_to_tap_on_the_Save_button_without_applying_any_changes_in_the_created_playlist_SLP_PL_034(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user try to tap on the 'Save' button without applying any changes in the created playlist");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("QATest");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.scroll_down_to_the_Text("Siddhartha Chapter 2");
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_and_click_on_more_vert();
        sleep_playlist_page.click_on_edit_playlist();
        sleep_playlist_page.verify_and_click_save_button_playlist();
        sleep_playlist_page.verify_Edit_Playlist_Screen_present_on_page();
    }
    @Test
    public void To_verify_that_the_user_is_able_to_update_the_playlist_name_SLP_PL_035(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify that the user is able to update the playlist name");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.scroll_down_to_the_Text("Siddhartha Chapter 2");
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_and_click_on_more_vert();
        sleep_playlist_page.click_on_edit_playlist();
        sleep_playlist_page.edit_the_playlist_name();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Testing");
        sleep_playlist_page.verify_and_click_save_button_playlist();
    }
    @Test()
    public void To_verify_when_the_user_taps_on_the_x_Remove_icon_on_the_any_available_track_in_the_playlist_SLP_PL_036(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'x Remove' icon on the any available track in the playlist");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Test");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.scroll_down_to_the_Text("Siddhartha Chapter 2");
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_and_click_on_more_vert();
        sleep_playlist_page.click_on_edit_playlist();
        sleep_playlist_page.verify_and_click_on_Remove_x_icon_playlist();
        // Success message not displayed
    }
    @Test
    public void To_verify_when_the_user_try_to_tap_on_the_Save_button_after_removing_the_playlist_SLP_PL_038(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user try to tap on the 'Save' button after removing the playlist");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Automation");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.scroll_down_to_the_Text("Siddhartha Chapter 2");
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_and_click_on_more_vert();
        sleep_playlist_page.click_on_edit_playlist();
        sleep_playlist_page.edit_the_playlist_name();
        sleep_playlist_page.verify_and_click_save_button_playlist();
    }
    @Test()
    public void To_verify_when_the_user_tap_on_the_Save_button_after_removing_the_tracks_in_the_playlist_SLP_PL_040(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user try to tap on the 'Save' button after removing the playlist");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Test");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.scroll_down_to_the_Text("Siddhartha Chapter 2");
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.verify_and_click_on_more_vert();
        sleep_playlist_page.click_on_edit_playlist();
        sleep_playlist_page.verify_and_click_on_Remove_x_icon_playlist();
        sleep_playlist_page.verify_and_click_save_button_playlist();
        sleep_playlist_page.edit_the_playlist_name_present_on_page();
    }
    @Test()
    public void To_verify_when_the_user_taps_on_the_More_Vert_icon_on_the_any_added_track_from_the_playlist_SLP_PL_042(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'More Vert' icon on the any added track from the playlist");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Test");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.scroll_down_to_the_Text("Siddhartha Chapter 2");
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.click_on_more_vert_icon_playlist();
        sleep_playlist_page.verify_logo_of_music_on_playlist_page();
        sleep_playlist_page.verify_name_of_golden_values_of_life();
        sleep_playlist_page.verify_duration_of_golden_values_of_life();
        sleep_playlist_page.verify_close_button_golden_values_of_life();
        sleep_playlist_page.verify_and_click_Remove_from_favorites();
        sleep_playlist_page.verify_add_to_favorites();
        sleep_playlist_page.verify_schedule_a_reminder();
    }
    @Test()
    public void To_verify_when_the_user_taps_on_the_Close_icon_on_the_bottom_sheet_SLP_PL_043(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Close' icon on the bottom sheet");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Test");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.scroll_down_to_the_Text("Siddhartha Chapter 2");
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.click_on_more_vert_icon_playlist();
        sleep_playlist_page.click_on_close_button_golden_values_of_life();
    }
    @Test()
    public void To_verify_when_the_user_taps_on_the_Add_to_favorites_option_on_the_bottom_sheet_SLP_PL_044(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Add to favorites' option on the bottom sheet");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Test");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.scroll_down_to_the_Text("Siddhartha Chapter 2");
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.click_on_more_vert_icon_playlist();
        sleep_playlist_page.verify_and_click_Remove_from_favorites();
        sleep_playlist_page.verify_and_click_add_to_favorites();
        sleep_playlist_page.click_on_close_button_golden_values_of_life();
        sleep_playlist_page.verify_and_click_on_navigate_back_button();
        sleep_playlist_page.verify_and_click_on_favorite_list();
        sleep_playlist_page.verify_favorites_screen_present_on_page();
        sleep_playlist_page.verify_name_of_golden_values_of_life();
    }
    @Test()
    public void To_verify_when_the_user_taps_on_the_Schedule_a_reminder_option_on_the_bottom_sheet_SLP_PL_045(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Schedule a reminder' option on the bottom sheet");
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
        signin_page.click_on_show_now_present_on_page();
        signin_page.click_on_navigate_back_button_present_on_page();
        signin_page.verify_and_close_feature_alert_pop_up();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Test");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.scroll_down_to_the_Text("Siddhartha Chapter 2");
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.click_on_more_vert_icon_playlist();
        sleep_playlist_page.verify_and_click_schedule_a_reminder();
        sleep_playlist_page.verify_set_a_reminder_present_on_page();
    }
    @Test
    public void To_verify_when_the_user_taps_on_the_Rate_this_meditation_option_on_the_bottom_sheet_SLP_PL_047(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Rate this meditation' option on the bottom sheet");
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
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        Sleep_Playlist_Page.scrollDownAndClickPlaylists((AndroidDriver)driver);
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox("Test");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.scroll_down_to_the_Text("Siddhartha Chapter 2");
        sleep_playlist_page.clickFirstTwoCheckboxesOfMusic();
        sleep_playlist_page.wait_for_five_second();
        sleep_playlist_page.verify_and_click_on_go_to_playlist();
        sleep_playlist_page.click_on_more_vert_icon_playlist();
        sleep_playlist_page.verify_and_click_on_Rate_this_meditations();
        sleep_playlist_page.verify_submit_feedback_form_present_on_page();
    }
    @Test
    public void To_verify_when_the_user_taps_on_the_Add_Items_button_SLP_PL_048(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Add Items' button");
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
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        sleep_playlist_page.scroll_down_to_the_Text("51 mins • 20 XP");
        sleep_playlist_page.click_on_current_playlist();

    }
    @Test
    public void To_verify_that_the_user_is_able_to_add_the_any_currently_played_track_after_creating_new_playlist_SLP_PL_050(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify that the user is able to add the any currently played track after creating new playlist");
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
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        sleep_playlist_page.scroll_down_to_the_Text("Story of Tulsi Vivaha (हिन्दी)");
        sleep_playlist_page.verify_and_click_on_story_of_Tulsi();
        sleep_playlist_page.verify_and_click_on_story_of_Tulsi_Vivaha_more_vert();
        sleep_playlist_page.verify_and_click_on_add_to_playlist();
        sleep_playlist_page.verify_and_click_on_add_playlist();
        sleep_playlist_page.verify_playlist_name_highlighted();
    }
}
