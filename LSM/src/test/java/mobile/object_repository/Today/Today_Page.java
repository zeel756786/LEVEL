package mobile.object_repository.Today;

import io.appium.java_client.android.AndroidDriver;
import io.unity.performaction.automob.Device;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Today_Page {
    WebDriver driver = null;
    Element element = null;
    Verify verify = null;
    Wait wait = null;
    AndroidDriver androidDriver = null;
    Device device = null;

    public Today_Page(WebDriver driver) {
        this.driver = driver;
        element = new Element(driver);
        verify = new Verify(driver);
        wait = new Wait(driver);
        androidDriver = (AndroidDriver) driver;
        device = new Device(androidDriver);
    }

    public void wait_for_five_second() {
        wait.wait_for_second(5);
    }

    public void verify_and_click_on_Search_for() {
        wait.wait_for_second(2);
        element.click("Search_for");
    }

    public void verify_Invite_Deep_Sleep_present_on_page() {

        wait.wait_until_element_is_visible("Invite_Deep_Sleep");
        verify.element_is_present("Invite_Deep_Sleep");
    }

    public void verify_A_Journey_to_the_moon_present_on_page() {
        wait.wait_until_element_is_visible("A_Journey_to_the_moon");
        verify.element_is_present("A_Journey_to_the_moon");
    }

    public void verify_Full_Body_Relaxation_present_on_page() {
        wait.wait_until_element_is_visible("Full_Body_Relaxation");
        verify.element_is_present("Full_Body_Relaxation");
    }

    public void verify_The_Story_of_Ekdant_present_on_page() {
        wait.wait_until_element_is_visible("The_Story_of_Ekdant");
        verify.element_is_present("The_Story_of_Ekdant");
    }

    public void verify_Lord_Indra_Realization_present_on_page() {
        wait.wait_until_element_is_visible("Lord_Indra_Realization");
        verify.element_is_present("Lord_Indra_Realization");
    }

    public void verify_Music_of_Winter_present_on_page() {
        wait.wait_until_element_is_visible("Music_of_Winter");
        verify.element_is_present("Music_of_Winter");
    }

    public void verify_Music_For_Soul_present_on_page() {
        wait.wait_until_element_is_visible("Music_For_Soul");
        verify.element_is_present("Music_For_Soul");
    }

    public void verify_search_box_enter_and_clear_text() {
        WebElement searchButton = androidDriver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"clear\"]"));
        String[] searchTerms = {"meditations", "workouts", "stories", "music"};

        for (String searchTerm : searchTerms) {
            WebElement searchBox = androidDriver.findElement(By.xpath("//android.widget.EditText"));
            searchBox.click();
            searchBox.clear();
            searchBox.sendKeys(searchTerm);
            searchButton.click();

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            if (searchTerm.equals("meditations")) {
                androidDriver.hideKeyboard();
                verify_Invite_Deep_Sleep_present_on_page();
                verify_A_Journey_to_the_moon_present_on_page();
                System.out.println("Search for  meditations  passed.");

            } else if (searchTerm.equals("workouts")) {
                androidDriver.hideKeyboard();
                verify_Full_Body_Relaxation_present_on_page();
                System.out.println("Search for workouts passed.");

            } else if (searchTerm.equals("stories")) {
                androidDriver.hideKeyboard();
                verify_The_Story_of_Ekdant_present_on_page();
                verify_Lord_Indra_Realization_present_on_page();
                System.out.println("Search for stories  passed.");
            } else if (searchTerm.equals("music")) {
                androidDriver.hideKeyboard();
                verify_Music_of_Winter_present_on_page();
                verify_Music_For_Soul_present_on_page();
                System.out.println("Search for music  passed.");
            }

            searchButton.click();
        }
    }

    public void verify_and_click_on_courses() {
        wait.wait_for_second(5);
        //   device.scrollDownToBottom("courses");
        device.waitForTextElementAppear("Courses");
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("courses");
        element.click("courses");
    }

    public void verify_and_click_on_All_Courses() {
        wait.wait_for_second(2);
        element.click("All_Courses");
    }

    public void verify_and_click_on_stop_overthinking() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Overthinking");
        element.click("Overthinking");
    }

    public void verify_overthinking_Screen_Present_On_Page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Overthinking_Screen");
        verify.element_is_present("Overthinking_Screen");
        wait.wait_for_second(2);
        device.waitForTextElementAppear("Overthinking");
        device.waitForTextElementAppear("Reminder");
        device.waitForTextElementAppear("Your mindfulness schedule");
        device.waitForTextElementAppear("Morning");
        device.waitForTextElementAppear("Night");
        device.waitForTextElementAppear("Start Now");
    }

    public void verify_and_click_on_Share_Overthinking_Starter_Kit_Present_On_Page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Share_Overthinking_Starter_Kit");
        element.click("Share_Overthinking_Starter_Kit");
        wait.wait_for_second(10);
    }

    public void verify_and_click_on_start_journey() {
        device.scrollDownToBottom("Start_Journey");
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Start_Journey");
        element.click("Start_Journey");
    }

    public void verify_spiruality_Screen_Present_On_Page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("spirtuality_screen");
        verify.element_is_present("spirtuality_screen");
        wait.wait_for_second(2);
        device.waitForTextElementAppear("Spiruality");
        device.waitForTextElementAppear("Reminder");
        device.waitForTextElementAppear("Your mindfulness schedule");
        device.waitForTextElementAppear("Morning");
        device.waitForTextElementAppear("Night");
        device.waitForTextElementAppear("Start Now");
    }

    public void verify_and_click_on_Share_Spirituality_Starter_Present_On_Page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("share_spirituality_kit");
        element.click("share_spirituality_kit");
        wait.wait_for_second(10);
    }

    public void verify_course_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("stress_relief");
        verify.element_is_present("stress_relief");
        device.sliding("stress_relief", -300, 0);
        wait.wait_for_second(2);
        verify.element_is_present("sleep");
        verify.element_is_present("Overthinking");
        device.sliding("Overthinking", -300, 0);
        wait.wait_for_second(3);
        verify.element_is_present("Anxiety");
        wait.wait_for_second(2);
        device.scrollDownToBottom("Spirituality_Course");
        verify.element_is_present("Spirituality_Course");
        device.sliding("Spirituality_Course", -200, 0);
        wait.wait_for_second(2);
        verify.element_is_present("Mantra");
        device.sliding("Mantra", -200, 0);
        verify.element_is_present("shiva_sadhana");
    }

    public void verify_and_click_on_Stress_and_relief() {
        wait.wait_for_second(2);
        device.sliding("All_Courses", -400, 0);
        wait.wait_until_element_is_visible("Stress_relief");
        element.click("Stress_relief");
    }

    public void verify_stress_relief_course_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Overthinking");
        verify.element_is_present("Overthinking");
        wait.wait_for_second(3);
        device.sliding("Overthinking", -1200, 0);
        wait.wait_for_second(5);
        verify.element_is_present("Anxiety");
    }

    public void verify_and_click_on_Spiritual() {
        wait.wait_for_second(2);
        device.sliding("All_Courses", -900, 0);
        wait.wait_for_second(2);
        element.click("Spiritual");

    }

    public void verify_spiritual_course_present_on_page() {
        wait.wait_for_second(2);
        verify.element_is_present("Spirituality_Course");
        wait.wait_for_second(2);
        device.sliding("Spirituality_Course", -600, 0);
        wait.wait_for_second(5);
        verify.element_is_present("Mantra");
        device.sliding("Mantra", -300, 0);
        wait.wait_for_second(2);
        verify.element_is_present("shiva_sadhana");
        wait.wait_for_second(2);
        device.sliding("shiva_sadhana", -300, 0);
        wait.wait_for_second(2);
        verify.element_is_present("Janmashtami");
    }

    public void verify_and_click_on_manage_your_emotions() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Manage_your_emotions");
        element.click("Manage_your_emotions");
    }

    public void verify_emotional_trauma_course_present_on_page() {
        wait.wait_for_second(2);
        verify.element_is_present("Manage_your_emotions");
        wait.wait_until_element_is_visible("Emotional_trauma");
        verify.element_is_present("Emotional_trauma");
    }

    public void verify_and_click_on_from_your_fav_coaches() {
        wait.wait_for_second(2);
        device.sliding("All_Courses", -1800, 0);
        wait.wait_for_second(2);
        element.click("From_your_fav_coaches");
    }

    public void verify_Rajarshi_Nandy_Special_present_on_page() {
        wait.wait_for_second(2);
        verify.element_is_present("From_your_fav_coaches");
        wait.wait_until_element_is_visible("Rajarshi_Nandy");
        verify.element_is_present("Rajarshi_Nandy");
    }

    public void verify_and_click_on_journal() {
        wait.wait_for_second(2);
        device.waitForTextElementAppear("Journal");
        wait.wait_for_second(2);
        element.click("Journal");
    }

    public void verify_journal_screen_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Journal_Screen");
        verify.element_is_present("Journal_Screen");
        wait.wait_for_second(3);
        device.waitForTextElementAppear("Journal");
        device.waitForTextElementAppear("History");
        device.waitForTextElementAppear("Express yourself");
        device.waitForTextElementAppear("Journal with Prompts:");
        device.waitForTextElementAppear("Intention");
    }

    public void verify_and_click_on_music_playlist() {
        wait.wait_for_second(2);
        device.waitForTextElementAppear("Trending");
        wait.wait_for_second(2);
        element.click("Music_Playlist");
    }

    public void verify_music_screen_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Music_Screen");
        verify.element_is_present("Music_Screen");
        wait.wait_for_second(3);
        device.waitForTextElementAppear("Search for musics");
        device.waitForTextElementAppear("New");
        device.waitForTextElementAppear("Free");
        device.waitForTextElementAppear("Frequently Repeated");
        device.sliding("Frequently_Repeated", -100, 0);
        device.waitForTextElementAppear("For Work");
        device.waitForTextElementAppear("Trending");
        String songName = element.get_element_text("Trending_Music_Name");
        System.out.println("Trending Name is :" + songName);
        device.waitForTextElementAppear("Music Playlists");
        device.waitForTextElementAppear("Raag");
        device.waitForTextElementAppear("Alpha Waves");
        device.waitForTextElementAppear("Binaural Beats");
    }

    public void verify_and_click_on_custom_music_playlists() {
        try {
            WebElement customMusicPlaylistsElement = driver.findElement(By.xpath("//android.widget.TextView[@text='Custom Music Playlists!']"));

            if (customMusicPlaylistsElement.isDisplayed()) {
                WebElement targetElement = driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]"));
                targetElement.click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Custom Music Playlists element is not visible");
        }
    }

    public void scroll_to_edit_and_click_on_save_button() {
        wait.wait_for_second(2);
        device.scrollDownToBottoms("Recommended_for_you");
        wait.wait_for_second(2);
        element.click("Edit_button");
        wait.wait_for_second(2);
        verify.element_is_present("Edit_Recommendations_Page");
        element.click("Meditation_Check_Box");
        element.click("Journal_Check_Box");
        wait.wait_for_second(1);
        element.click("Save");
        verify.element_is_present("You_are_all_set");
    }

    public void verify_and_click_on_recommended_music_present_on_page() {
        device.scrollDownToBottoms("supercharge_your_mind");
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Recommended_music_for_you");
        String music = element.get_element_text("Recommended_music_for_you");
        System.out.println("Music Name is :" + music);
        wait.wait_for_second(2);
        element.click("Recommended_music_for_you");
    }

    public void verify_and_click_on_cancel_button() {
        try {
            wait.wait_until_element_is_visible("cancel");
            element.click("cancel");
        } catch (Exception e) {
            System.out.println("Failed to verify or click on the cancel button: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void scroll_up_Navigate_button() {
        try {
            device.scrollUpToTop("Navigate_back");
        } catch (Exception e) {
            System.out.println("Failed to scroll up to the 'Navigate_back' button: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void verify_and_click_on_play_pause_add_to_fav_and_share_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("play_and_pause_button_for_music");
        element.click("play_and_pause_button_for_music");
        wait.wait_for_second(5);
        element.click("play_and_pause_button_for_music");
        wait.wait_for_second(2);
        element.click("Add_to_favorities_song");
        element.click("Share_button_for_music");
        wait.wait_for_second(5);
    }

    public void verify_and_click_on_vlog_share_button() {
        wait.wait_for_second(2);
        device.scrollDownToBottoms("Find_out_here");
        wait.wait_for_second(2);
        element.click("vlog_share_button");
        wait.wait_for_second(5);
    }

    public void verify_and_click_on_right_arrow_of_vlog() {
        device.scrollDownToBottoms("Find_out_here");
        wait.wait_for_second(2);
        element.click("right_arrow_of_vlog");
    }

    public void verify_user_navigate_on_vlog_page() {
        wait.wait_for_second(2);
        String vlogName = element.get_element_text("vlog_page");
        System.out.println("vlog Name is :" + vlogName);
        wait.wait_for_second(2);
        verify.element_is_present("vlog_page");
    }

    public void click_on_drop_down_menu_blog() {
        wait.wait_for_second(2);
        element.click("English_lang_blog");
        wait.wait_for_second(2);
        element.click("Hindi_lang_blog");
        String verifyLang = element.get_element_text("verify_lang");
        System.out.println("Language is :" + verifyLang);
    }

    public void verify_and_print_the_content_of_blog_selected_lang_in_drop_down() {
        wait.wait_for_second(2);
        for (int i = 2; i <= 5; i++) {
            String ele = element.get_element_text("content_blog");
            System.out.println(" Element is " + ele);
        }
    }

    public void verify_and_click_on_lsm_shop_on_top() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("LSM_Shop");
        element.click("LSM_Shop");
    }

    public void click_on_lsm_shop_now_button() {
        try {
            wait.wait_for_second(2);
            element.click("Shop_Now");
            System.out.println("Clicked on the 'Shop_Now' button successfully.");
        } catch (Exception e) {
            System.out.println("LSM Shop Now button not found");
        }
    }

    public void click_on_my_coupons_and_help_menu_lsm_shop() {
        wait.wait_for_second(5);
        verify.element_is_present("LSM_Shop_screen");
        element.click("My_Coupons");
        wait.wait_for_second(2);
        verify.element_is_present("My_Coupons_Screen");
        String eleText = element.get_element_text("Oops_looks_like_you_have_not_bought_any_coupons");
        System.out.println("Element Text is :" + eleText);
        verify.element_is_present("My_Coupons_Screen");
        wait.wait_for_second(2);
        element.click("Navigate_back");
        wait.wait_for_second(5);
        element.click("Help_button_lsm_shop");
        wait.wait_until_element_is_visible("Introducing_LSM_Coins");
        verify.element_is_present("Introducing_LSM_Coins");
        wait.wait_until_element_is_visible("Earn_from_activities");
        verify.element_is_present("Earn_from_activities");
        wait.wait_until_element_is_visible("Unlock_great_rewards");
        verify.element_is_present("Unlock_great_rewards");
        wait.wait_until_element_is_visible("Shop_Now");
        verify.element_is_present("Shop_Now");
    }

    public void verify_upcoming_model_pop_up() {
        wait.wait_for_second(2);
        element.click("Upcoming_Brand_Usage");
        wait.wait_for_second(2);
        verify.element_is_present("Upcoming_Unlocks_Model_Pop");
        String unlockingCoins = element.get_element_text("Unlocking_at_coins");
        System.out.println("Unlocking at coins is :" + unlockingCoins);
    }

    public void verify_and_click_on_journal_history() {
        wait.wait_for_second(2);
        element.click("History");
        String monthYear = element.get_element_text("Month_Year");
        System.out.println("Month and Year is :" + monthYear);
        String history = element.get_element_text("you_haven_t_written_any_journals_yet");
        System.out.println("You haven't written any journals yet is :" + history);
    }

    public void click_on_write_now_of_express_your_self_page() {
        wait.wait_for_second(2);
        element.click("write_now");
    }

    public void click_on_different_category_of_Blank_Page() {
        wait.wait_for_second(2);
        verify.element_is_present("Blank_Page");
        verify.element_is_present("Photo");
        verify.element_is_present("Record");
        element.click("Record");
        wait.wait_for_second(10);
        device.sliding("swipe_left_to_finish", -200, 0);
        wait.wait_for_second(2);
        element.click("Delete_Icon");
        wait.wait_for_second(2);
        element.click("write_your_thoughts");
        element.enter_text("write_your_thoughts", "Automation Testing");
        wait.wait_for_second(1);
        element.click("Save");
        wait.wait_for_second(2);
        element.click("Back_To_Home");
        element.click("History");
        wait.wait_for_second(2);
        element.click("Diary_Delete_Icon");
        element.click("Sure_you_want_to_delete_journal");
        wait.wait_for_second(3);
    }

    public void click_on_Intentions() {
        element.click("Intention_XP");
        wait.wait_for_second(2);
    }

    public void click_and_choose_the_category_item() {
        wait.wait_for_second(2);
        element.click("Shuffle");
        String shuffleName = element.get_element_text("Shuffle_Name");
        System.out.println("Shuffle Name is :" + shuffleName);
        element.click("Record");
        wait.wait_for_second(8);
        device.sliding("swipe_left_to_finish", -100, 0);
        wait.wait_for_second(2);
        element.click("Delete_Icon");
        wait.wait_for_second(2);
        element.click("write_your_thoughts");
        wait.wait_for_second(2);
      //  WebElement textFields = androidDriver.findElement(By.xpath("android.widget.EditText"));
        String enterText = "Automation Testing";
        try {
            WebElement textField = androidDriver.findElement(By.xpath("android.widget.EditText[2]"));

            textField.click();
            textField.sendKeys(enterText);
            androidDriver.hideKeyboard();

            System.out.println("Successfully entered text: " + enterText);
        } catch (NoSuchElementException e) {
            System.out.println("No Such Element found");
        }

        wait.wait_for_second(1);
        element.click("Save");
        wait.wait_for_second(2);
        element.click("Back_To_Home");
    }

}