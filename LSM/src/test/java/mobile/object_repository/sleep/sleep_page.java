package mobile.object_repository.sleep;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.unity.performaction.automob.Device;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import mobile.object_repository.today_music_playlist.Today_Music_Page;
import org.openqa.selenium.*;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;


public class sleep_page {

    WebDriver driver = null;
    Element element = null;
    Verify verify = null;
    Wait wait = null;
    AndroidDriver androidDriver = null;
    Device device = null;
    Today_Music_Page today_music_page = null;

    public sleep_page(WebDriver driver) {
        this.driver = driver;
        element = new Element(driver);
        verify = new Verify(driver);
        wait = new Wait(driver);
        androidDriver = (AndroidDriver) driver;
        device = new Device(androidDriver);
        today_music_page = new Today_Music_Page(driver);
    }

    public void verify_all_categories_present_on_page() {
        wait.wait_until_element_is_visible("all_categories");
    }

    public void click_on_all_categories() {
        wait.wait_for_second(2);
        element.click("all_categories");
    }

    public void verify_new_present_on_page() {
        wait.wait_until_element_is_visible("new");
    }

    public void verify_free_present_on_page() {
        wait.wait_until_element_is_visible("free");
    }

    public void verify_frequently_repeated_present_on_page() {
        wait.wait_until_element_is_visible("frequently_repeated");
    }

    public void verify_sleep_story_present_on_page() {
        wait.wait_until_element_is_visible("sleep_story");
    }

    public void verify_music_present_on_page() {
        wait.wait_until_element_is_visible("music");
    }

    public void verify_meditation_present_on_page() {
        wait.wait_until_element_is_visible("meditations");
    }

    public void verify_stories_present_on_page() {
        wait.wait_until_element_is_visible("stories");
    }

    public void verify_new_arrivals_present_on_page() {
        wait.wait_until_element_is_visible("new_arrivals");
    }

    public void verify_see_all_present_on_page() {
        wait.wait_until_element_is_visible("see_all");
    }
    public void click_on__see_all_present_on_page() {
        wait.wait_for_second(2);
        element.click("see_all");
    }

    public void verify_your_playlists_present_on_page() {
        wait.wait_until_element_is_visible("your_playlists");
    }

    public void verify_and_click_on_create_playlist() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("create_playlist");
        element.click("create_playlist");
    }

    public void verify_give_your_playlist_a_name_present_on_page() {

        wait.wait_until_element_is_visible("give_your_playlist_a_name");
    }
    public void verify_and_click_your_on_New_Arrivals_first_music() {
        device.waitForTextElementAppear("Your Playlists");
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("New_Arrivals_first_music_sleep");
        verify.element_is_present("New_Arrivals_first_music_sleep");
        element.click("New_Arrivals_first_music_sleep");
    }
    public void verify_and_click_on_fav_music_new_arrivals_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("fav_muusic_new_arrivals");
        element.click("fav_muusic_new_arrivals");
        wait.wait_for_second(5);
        element.click("download_fav_music_new_arrivals");
        wait.wait_for_second(5);
        element.click("share_fav_music_new_arrivals");
    }
    public void verify_and_click_on_best_and_bedroom_colors_page() {
        device.waitForTextElementAppear("Find out here");
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Find_out_here");
        element.click("Find_out_here");
        wait.wait_for_second(5);
        element.click("English_language");
        wait.wait_for_second(2);
        element.click("Hindi_language");
        wait.wait_for_second(3);
        element.click("navigate_back_button_best_and_worst_bedrooms_colors");
        wait.wait_for_second(3);
    }

    public void verify_and_click_on_playlist_name(String playlistName) {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("playlist_name");
        element.click("playlist_name");
        element.clear_and_enter_in_text_field("playlist_name", "playlistName");
    }

    public void verify_and_click_on_create_button() {
        wait.wait_until_element_is_visible("create");
        element.click("create");
    }

    public void verify_and_click_on_cancel_button() {
        wait.wait_until_element_is_visible("cancel");
        element.click("cancel");
    }

    public void verify_add_items_to_playlist_present_on_page() {
        wait.wait_until_element_is_visible("add_item_to_playlist");
    }

    public void verify_a_english_option_present_on_page() {
        wait.wait_until_element_is_visible("a_english");
    }
    public void click_english_option_present_on_page() {
        wait.wait_for_second(5);
        element.click("a_english");
    }
    public void verify_english_track_new_arrival_present_on_page() {
        wait.wait_for_second(5);
        device.waitForTextElementAppear("Magic of Faith");
        device.waitForTextElementAppear("Castle of Mind");
        device.waitForTextElementAppear("Land of Dreams");
        device.waitForTextElementAppear("Meerabai's Eternal Love Part");
    }

    public void verify_a_hindi_option_present_on_page() {
        wait.wait_until_element_is_visible("hindi");
    }
    public void click_on_hindi_option_present_on_page() {
        wait.wait_for_second(5);
        wait.wait_until_element_is_visible("hindi");
        element.click("hindi");
    }
    public void verify_hindi_track_new_arrivals_page() {
        wait.wait_for_second(2);
        device.waitForTextElementAppear("Dattatreya and His 24 Gurus (हिन्दी)");
        device.waitForTextElementAppear("Shri Guru Nanak (हिन्दी)");
        device.waitForTextElementAppear("Story of Tulsi Vivaha (हिन्दी)");
        device.waitForTextElementAppear("Significance of Dev Deepawali (हिन्दी)");
    }
    public void verify_english_track_new_arrivals_page() {
        wait.wait_for_second(2);
        device.waitForTextElementAppear("Magic of Faith");
        device.waitForTextElementAppear("Castle of Mind");
        device.waitForTextElementAppear("Land of Dreams");
    }
    public void scroll_up_to_top_english_present_on_page() {
        wait.wait_for_second(5);
        device.scrollUpToTop("a_english");
    }
    public void verify_and_click_on_down_section_of_sleep_home_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Download_section_sleep_home_page");
        element.click("Download_section_sleep_home_page");
    }

    public void verify_a_marathi_option_present_on_page() {
        wait.wait_until_element_is_visible("marathi");
    }

    public void verify_ancient_wisdom_present_on_page() {
        wait.wait_until_element_is_visible("ancient_wisdom");
    }

    public void verify_and_click_on_playlist_card_first_dropdown() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("playlist_card_first_dropdown");
        element.click("playlist_card_first_dropdown");
    }

    public void verify_and_click_on_plus_icon() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("first_plus_icon");
        element.click("first_plus_icon");
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("second_plus_icon");
        element.click("second_plus_icon");
    }
    public void verify_and_click_on_new_arrivals_first_music_sleep_kebeb_icon() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("new_arrivals_first_music_sleep_kebeb_icon");
        element.click("new_arrivals_first_music_sleep_kebeb_icon");
        wait.wait_for_second(2);
    }
    public void verify_kebab_icon_options_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Add_to_favorities");
        verify.element_is_present("Add_to_favorities");
        wait.wait_for_second(3);
        wait.wait_until_element_is_visible("Download_button");
        verify.element_is_present("Download_button");
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Share");
        verify.element_is_present("Share");
    }

    public void verify_and_click_on_go_to_playlist() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("go_to_playlist");
        element.click("go_to_playlist");
    }

    public void verify_golden_values_of_life_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("golden_values_of_life");
    }

    public void verify_siddhartha_chapter_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("siddhartha_chapter");
    }

    public void verify_and_click_on_sleep_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Sleep");
        verify.element_is_present("Sleep");
        element.click("Sleep");
    }

    public void verify_and_click_on_search_for_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Sleep_for");
        element.click("Sleep_for");
    }

    public void verify_sleep_anxiety_meditations_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("sleep_anxiety_meditations");
        verify.element_is_present("sleep_anxiety_meditations");
    }

    public void verify_sleep_anxiety_meditations_hindi_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("sleep_anxiety_meditations");
        verify.element_is_present("sleep_anxiety_meditations");
    }
    public void verify_scroll_down_to_sleep_meditations() {
        wait.wait_for_second(2);
        device.scrollDownToBottom("Sleep_Meditations");
    }
    public void verify_and_click_on_sleep_meditations() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Sleep_Meditations");
        element.click("Sleep_Meditations");
    }
    public void verify_and_click_on_hambergur_menu_sleep_meditations() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Hambergur_menu_button_sleep_meditations");
        element.click("Hambergur_menu_button_sleep_meditations");
    }
    public void verify_and_click_on_share_this_sleep_story() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("share_this_sleep_story");
        element.click("share_this_sleep_story");
        wait.wait_for_second(5);
    }

    public void search_and_clear_on_sleep() {
        String[] searchTerms = {"sleep meditations", "sleep stories"};
        Map<String, Runnable> verificationMethods = new HashMap<>();
        verificationMethods.put("sleep meditations", this::verify_sleep_anxiety_meditations_present_on_page);
        verificationMethods.put("sleep stories", this::verify_sleep_anxiety_meditations_hindi_present_on_page);
        device.verifySearchBoxEnterAndClearText(searchTerms, verificationMethods);
    }

    public void verify_and_click_on_all_categories_filter() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("All_Categories");
        verify.element_is_present("All_Categories");
        element.click("All_Categories");
        wait.wait_for_second(2);
        List<WebElement> textViews = androidDriver.findElements(By.xpath("//android.widget.TextView"));
        for (int i = 0; i < textViews.size(); i++) {
            int position = i + 1;
            if (position % 2 != 0 && position <= 17) {
                String text = textViews.get(i).getText();
                System.out.println("Text of all categories is : " + text);
            }
        }
    }

    public void verify_and_click_on_sleep_music_filter_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Sleep_Music");
        verify.element_is_present("Sleep_Music");
        element.click("Sleep_Music");
        wait.wait_until_element_is_visible("Search");
        verify.element_is_present("Search");
    }

    public void verify_the_music_after_apply_filter() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Sufi_Music_for_deep_sleep");
        verify.element_is_present("Sufi_Music_for_deep_sleep");
        verify.element_is_present("Quick_Deep_Sleep");
        device.sliding("Quick_Deep_Sleep", -900, 0);
        verify.element_is_present("Indian_Raga_for_Deep_Sleep");
        wait.wait_for_second(2);
        element.click("Sleep_Story");
        wait.wait_for_second(2);
        verify.element_is_present("Stream_Dreams_for_Better_Sleep");
        wait.wait_for_second(2);
        element.click("Mahabharat");
        wait.wait_for_second(2);
        verify.element_is_present("Mahabharat");
        wait.wait_for_second(2);
        verify.element_is_present("Lessons_from_mahabharat");
    }

    public void click_on_tune_deep_sleep_with_music() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("tune_deep_sleep_with_music");
        element.click("tune_deep_sleep_with_music");
    }

    public void click_on_tune_deep_sleep_with_meditations() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("tune_deep_sleep_with_meditations");
        element.click("tune_deep_sleep_with_meditations");
    }

    public void click_on_tune_deep_sleep_with_stories() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("tune_deep_sleep_with_stories");
        element.click("tune_deep_sleep_with_stories");
    }

    public void verify_the_sleep_music_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("sleep_music");
        verify.element_is_present("sleep_music");
        device.waitForTextElementAppear("Recommended for you");
        device.waitForTextElementAppear("A Walk In The Rain");
        device.waitForTextElementAppear("Top played");
        device.waitForTextElementAppear("Into The Light");
    }

    public void verify_the_sleep_meditations_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("sleep_Meditations");
        verify.element_is_present("sleep_Meditations");
        device.waitForTextElementAppear("All Categories");
        device.waitForTextElementAppear("New");
        device.waitForTextElementAppear("Free");
        device.waitForTextElementAppear("Select your preferred language");
        device.waitForTextElementAppear("English");
        device.waitForTextElementAppear("Hindi");
        device.waitForTextElementAppear("Marathi");
        device.waitForTextElementAppear("New Arrivals");
        device.waitForTextElementAppear("Castle of Mind");
        device.waitForTextElementAppear("Land of Dreams");
        device.waitForTextElementAppear("see all");
        wait.wait_for_second(2);
        element.click("see_all");
        wait.wait_for_second(2);
        try {
            device.waitForTextElementAppear("Land of Dreams");
        } catch (StaleElementReferenceException e) {
            System.out.println("Element becomes now stable.");
            device.waitForTextElementAppear("Land of Dreams");
        }
        device.waitForTextElementAppear("Moonlight path of the Sufi");
    }

    public void verify_the_sleep_stories_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("sleep_stories");
        verify.element_is_present("sleep_stories");
        device.waitForTextElementAppear("All Categories");
        device.waitForTextElementAppear("New");
        device.waitForTextElementAppear("Free");
        device.waitForTextElementAppear("Select your preferred language");
        device.waitForTextElementAppear("English");
        device.waitForTextElementAppear("Hindi");
        device.waitForTextElementAppear("Marathi");
        device.waitForTextElementAppear("New Arrivals");
        device.waitForTextElementAppear("Meerabai's Eternal Love");
        device.waitForTextElementAppear("Stories from Ramayan");
        device.waitForTextElementAppear("Ramayan: Ayodhya Kand 7");
        device.waitForTextElementAppear("Stories from Puranas");
        device.waitForTextElementAppear("Matsya aur Kurma Avatar");
        device.waitForTextElementAppear("Stories from Mahabharat");
        device.waitForTextElementAppear("Guru Dronacharya");
        device.waitForTextElementAppear("Beloved Classics");
        device.waitForTextElementAppear("A Magical Kingdom");
        device.waitForTextElementAppear("Travel Stories");
        device.waitForTextElementAppear("Experience Time Travel");
        device.waitForTextElementAppear("Sounds Of Creation");
        device.waitForTextElementAppear("The Making: Bread");

    }
    public void verify_download_and_delete_from_downloads() {
        wait.wait_for_second(2);
        if(verify.check_element_is_present("Download_button")){
            System.out.println("Download_button is displayed.");
            element.click("Download_button");
            wait.wait_for_second(15);
            verify.element_is_present("Delete_from_download");
        } else if (verify.check_element_is_present("Delete_from_download")) {
            System.out.println("Delete_from_download is displayed.");
            element.click("Delete_from_download");
            wait.wait_for_second(2);
            element.click("Delete_Item");
            wait.wait_for_second(2);
            element.click("Download_button");
            wait.wait_for_second(15);
            verify.element_is_present("Delete_from_download");
        }
    }
    public void verify_add_to_fav_and_remove_from_fav() {
        wait.wait_for_second(2);
        if (verify.check_element_is_present("Add_to_favorities")) {
            System.out.println("Add_to_favorities is displayed.");
            element.click("Add_to_favorities");
            wait.wait_for_second(5);
            verify.element_is_present("Remove_from_favorites");
        } else if (verify.check_element_is_present("Remove_from_favorites")) {
            System.out.println("Remove_from_favorites is displayed.");
            element.click("Remove_from_favorites");
            wait.wait_for_second(3);
            element.click("Add_to_favorities");
            wait.wait_for_second(5);
            verify.element_is_present("Remove_from_favorites");
        } else {
            System.out.println("Neither Add_to_favorities nor Remove_from_favorites is visible.");
            throw new IllegalStateException("Expected element not found on the screen.");
        }
    }
    public void verify_and_click_on_share_button(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Share");
        verify.element_is_present("Share");
        element.click("Share");
        wait.wait_for_second(5);
    }

//    public void verify_the_sleep_stories_present_on_page() {
//        wait.wait_for_second(2);
//        wait.wait_until_element_is_visible("sleep_stories");
//        verify.element_is_present("sleep_stories");
//    }

    public void verify_and_click_on_see_all() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("see_all");
        element.click("see_all");
        wait.wait_for_second(5);
    }
    public void verifyAllSongsPresence() {
        Set<String> uniqueSongTitles = new HashSet<>(); // To store unique song titles
        boolean isEndOfList = false;

        System.out.println("Songs present in the list:");

        while (!isEndOfList) {
            List<WebElement> songTitles = androidDriver.findElements(By.xpath("//android.widget.TextView"));

            for (WebElement song : songTitles) {
                String title = song.getText();
                if (!title.isEmpty() && uniqueSongTitles.add(title)) {
                    System.out.println(title);
                }
            }
            isEndOfList = !scrollDown();
        }
    }

    private boolean scrollDown() {
        try {
            Dimension size = androidDriver.manage().window().getSize();
            int startX = size.width / 2;
            int startY = (int) (size.height * 0.8);
            int endY = (int) (size.height * 0.2);

            TouchAction action = new TouchAction(androidDriver);
            action.press(PointOption.point(startX, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(startX, endY))
                    .release()
                    .perform();

            return true;
        } catch (Exception e) {
            System.out.println("Unable to scroll further.");
            return false;
        }
    }
    public void  create_playlist() {
        today_music_page.scrollDownAndClickPlaylists((AndroidDriver) androidDriver);;
    }

}



