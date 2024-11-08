package mobile.tests.Music_Playlist;

import io.appium.java_client.android.AndroidDriver;
import io.unity.framework.init.base;
import io.unity.framework.remotegrid.LambdaTestConfig;
import mobile.object_repository.signin.signin_page;
import mobile.object_repository.sleep_playlist.Sleep_Playlist_Page;
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
}
