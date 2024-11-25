package mobile.object_repository.sleep;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.unity.performaction.automob.Device;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class sleep_page {

    WebDriver driver = null;
    Element element = null;
    Verify verify = null;
    Wait wait = null;
    AndroidDriver androidDriver = null;
    Device device = null;

    public sleep_page(WebDriver driver) {
        this.driver = driver;
        element = new Element(driver);
        verify = new Verify(driver);
        wait = new Wait(driver);
        androidDriver = (AndroidDriver) driver;
        device = new Device(androidDriver);
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

    public void verify_a_hindi_option_present_on_page() {
        wait.wait_until_element_is_visible("hindi");
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
        device.sliding("Quick_Deep_Sleep", 300, 0);
        verify.element_is_present("Indian_Raga_for_Deep_Sleep");
        wait.wait_for_second(2);
        element.click("Sleep_Story");
        wait.wait_for_second(2);
        verify.element_is_present("Stream_Dreams_for_Better_Sleep");
        element.click("Ramayan");
        wait.wait_for_second(2);
        verify.element_is_present("Ramayan");
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
        device.waitForTextElementAppear("Dive Deep");
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
    }

    public void verify_the_sleep_stories_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("sleep_stories");
        verify.element_is_present("sleep_stories");
    }

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

    // Helper method for scrolling down
    private boolean scrollDown() {
        try {
            // Use TouchAction or UiScrollable for scrolling
            Dimension size = androidDriver.manage().window().getSize();
            int startX = size.width / 2;
            int startY = (int) (size.height * 0.8); // Start from 80% of screen height
            int endY = (int) (size.height * 0.2);   // End at 20% of screen height

            TouchAction action = new TouchAction(androidDriver);
            action.press(PointOption.point(startX, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(startX, endY))
                    .release()
                    .perform();

            return true; // Scroll successful
        } catch (Exception e) {
            System.out.println("Unable to scroll further.");
            return false; // Scroll failed
        }
    }

}



