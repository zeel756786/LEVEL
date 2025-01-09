package mobile.object_repository.today_music_playlist;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.unity.performaction.automob.Device;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Today_Music_Page {

    WebDriver driver = null;
    Element element = null;
    Verify verify = null;
    Wait wait = null;
    AndroidDriver androidDriver = null;
    Device device = null;

    public Today_Music_Page(WebDriver driver) {
        this.driver = driver;
        element = new Element(driver);
        verify = new Verify(driver);
        wait = new Wait(driver);
        androidDriver = (AndroidDriver) driver;
        device = new Device(androidDriver);
    }
    public void wait_for_five_second(){
        wait.wait_for_second(5);
    }

    public void verify_and_click_on_Ease_Anxiety_Stress(){
        wait.wait_until_element_is_visible("Ease_Anxiety_Stress");
        element.click("Ease_Anxiety_Stress");
        wait.wait_for_second(10);
    }
    public void verify_and_click_on_For_Focus(){
        wait.wait_until_element_is_visible("For_Focus");
        element.click("For_Focus");
        wait.wait_for_second(5);
    }
    public void verify_and_click_on_collapse_icon_button(){
        wait.wait_until_element_is_visible("close_drop_down_collapse_button");
        element.click("close_drop_down_collapse_button");
        wait.wait_for_second(5);
    }
    public void verify_quick_wind_down(){
        wait.wait_until_element_is_visible("quick_wind_down");
        verify.element_is_present("quick_wind_down");
    }
    public void verify_get_rapid_calm_present_on_page(){
        wait.wait_until_element_is_visible("get_rapid_calm");
        verify.element_is_present("get_rapid_calm");
    }
    public void verify_natures_lullaby_present_on_page(){
        wait.wait_until_element_is_visible("natures_lullaby");
        verify.element_is_present("natures_lullaby");
    }

    public void verify_playlist_name_highlighted() {
        wait.wait_until_element_is_visible("playlist_name");
        verify.element_is_enable("playlist_name");
    }
    public void verify_and_click_on_create_button() {
        wait.wait_until_element_is_visible("create");
        element.click("create");
    }
    public void verify_and_click_on_navigate_back_button() {
        wait.wait_until_element_is_visible("navigate_back");
        verify.element_is_present("navigate_back");
        element.click("navigate_back");
    }
    public void verify_music_tab_icon_highlighted() {
        wait.wait_until_element_is_visible("music_tab_icon");
        verify.element_is_present("music_tab_icon");
        verify.element_is_enable("music_tab_icon");
    }
    public void verify_Get_rapid_calm_music_present_on_playlist_page(){
        wait.wait_until_element_is_visible("Get_rapid_calm");
        verify.element_is_present("Get_rapid_calm");
    }
    public void verify_add_item_to_playlist_present_on_page() {
        wait.wait_until_element_is_visible("add_item_to_playlist");
        verify.element_is_present("add_item_to_playlist");
    }
    public void horizontalScrollRightToTexts(String text) {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".setAsHorizontalList()" +
                        ".scrollForward().scrollIntoView(new UiSelector().text(\"" + text + "\"));"));
    }
    public void verify_and_click_on_go_to_playlist(){
        wait.wait_until_element_is_visible("go_to_playlist");
        verify.element_is_present("go_to_playlist");
        element.click("go_to_playlist");
    }
    public void verify_search_text_present_on_page() {
        wait.wait_until_element_is_visible("search_text");
        verify.element_is_present("search_text");
        element.click("search_text");
    }
    public void verify_Natures_Sound_Present_On_Page(){
        wait.wait_until_element_is_visible("Natures_Sound");
    }
    public void verify_oops_it_seems_we_dont_have_what_youre_searching_for() {
        wait.wait_until_element_is_visible("oops_it_seems_we_dont_have_what_youre_searching_for");
        verify.element_is_present("oops_it_seems_we_dont_have_what_youre_searching_for");
    }
    public void verify_and_click_on_radio_button_for_select_all_music(){
        wait.wait_until_element_is_visible("radio_button_for_select_all_music");
        element.click("radio_button_for_select_all_music");
        wait.wait_for_second(5);
    }
    public void verify_and_click_on_quick_wind_down_unselect_the_song(){
        wait.wait_until_element_is_visible("quick_wind_down_unselect_the_song");
        element.click("quick_wind_down_unselect_the_song");
        wait.wait_for_second(5);
    }
    public void verify_and_click_on_hamburger_button_of_today_page(){
        wait.wait_until_element_is_visible("hamburger");
        element.click("hamburger");
    }
    public void verify_name_of_music_track(){
        wait.wait_until_element_is_visible("name_of_music_track");
        verify.element_is_present("name_of_music_track");
    }
    public void verify_duration_of_music_track(){
        wait.wait_until_element_is_visible("duration_of_music_track");
        verify.element_is_present("duration_of_music_track");
    }
    public void verify_close_button_of_music_track() {
        wait.wait_until_element_is_visible("close_button_of_music_track");
        verify.element_is_present("close_button_of_music_track");
    }

    public void enterTextInPlaylistNameTextBox(String name) {
        WebElement textBoxes = androidDriver.findElement(By.className("android.widget.EditText"));
        if (textBoxes.isDisplayed()) {
            textBoxes.sendKeys(name+element.getRandomalphabet());
            androidDriver.hideKeyboard();
            System.out.println("Text entered into a text box.");

        } else {
            System.out.println("No text box found on the screen.");
        }
    }
    public void scroll_down_to_the_Text(String Text) {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"" + Text + "\"));"));

    }
    public static  void scrollDownAndClickPlaylists(AndroidDriver androidDriver) {
        boolean isYourPlaylistVisible = false;
        boolean isCreatePlaylistVisible = false;

        try {

            WebElement yourPlaylistsElement = androidDriver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Your Playlists\"));"));

            if (yourPlaylistsElement.isDisplayed()) {
                isYourPlaylistVisible = true;

                androidDriver.findElement(By.xpath(
                        "//android.widget.TextView[@text=\"New\"]")).click();

                System.out.println("Clicked on the specified element in Your Playlists");
                return;
            }
        } catch (NoSuchElementException e) {
            System.out.println("Your Playlists not found.");
        } catch (Exception e) {
            System.out.println("Your Playlists is not visible.");
        }

        if (!isYourPlaylistVisible) {
            try {
                WebElement createPlaylistElement = androidDriver.findElement(AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Create Playlist\"));"));

                if (createPlaylistElement.isDisplayed()) {
                    isCreatePlaylistVisible = true;
                    createPlaylistElement.click();
                    System.out.println("Clicked on: Create Playlist");
                }
            } catch (NoSuchElementException e) {
                System.out.println("Create Playlist not found.");
            } catch (Exception e) {
                System.out.println("Create Playlist is not visible.");
            }
        }
    }
    public void verify_search_box_enter_and_clear_box() {
        WebElement searchButton = androidDriver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"clear\"]"));
        String[] searchTerms = {"Sonu", "Zeel"};

        for (String searchTerm : searchTerms) {
            WebElement searchBox = androidDriver.findElement(By.xpath("//android.widget.EditText"));
            searchBox.click();
            searchBox.clear();
            searchBox.sendKeys(searchTerm);
            searchButton.click();

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            if (searchTerm.equals("Sonu")) {
                verify_Natures_Sound_Present_On_Page();
                System.out.println("Search for 'Sonu' passed.");

            } else if (searchTerm.equals("Zeel")) {
                verify_oops_it_seems_we_dont_have_what_youre_searching_for();
                System.out.println("Search for 'Zeel' passed.");
            }
            searchButton.click();
        }
    }
    public void clickFirstTwoCheckboxesOfMusic() {
        wait.wait_for_second(1);
        List<WebElement> checkboxes = androidDriver.findElements(By.xpath("//android.view.View[starts-with(@resource-id, 'playlist_add')]"));

        int count = 0;

        for (WebElement checkbox : checkboxes) {
            if (count < 2) {
                checkbox.click();
                count++;

            } else {
                break;
            }
        }
    }
    public void verify_and_click_on_more_vert_on_trac() {
        wait.wait_until_element_is_visible("more_vert_on_trac");
        verify.element_is_present("more_vert_on_trac");
        element.click("more_vert_on_trac");

    }
    public void verify_share_the_music() {
        wait.wait_until_element_is_visible("share_the_music");
        verify.element_is_present("share_the_music");
    }
    public void verify_and_click_on_share_the_music() {
        element.click("share_the_music");
        wait.wait_for_second(5);
    }

    public void verify_rate_of_this_music() {
        wait.wait_until_element_is_visible("rate_of_this_music_of_more_vert");
        verify.element_is_present("rate_of_this_music_of_more_vert");
    }
    public void verify_and_click_rate_of_this_music() {
        wait.wait_until_element_is_visible("rate_of_this_music_of_more_vert");
        verify.element_is_present("rate_of_this_music_of_more_vert");
        element.click("rate_of_this_music_of_more_vert");
    }
    public void verify_click_on_close_button() {
        wait.wait_until_element_is_visible("close_button_of_music_track");
        element.click("close_button_of_music_track");
    }
    public void verify_add_to_this_playlist_present_on_page() {
        wait.wait_until_element_is_visible("add_to_this_playlist");
        verify.element_is_present("add_to_this_playlist");
    }
    public void verify_and_click_add_to_this_playlist_present_on_page() {
        wait.wait_until_element_is_visible("add_to_this_playlist");
        verify.element_is_present("add_to_this_playlist");
        element.click("add_to_this_playlist");
    }
    public void verify_edit_playlist_present_on_page() {
        wait.wait_until_element_is_visible("edit_playlist");
        verify.element_is_present("edit_playlist");
    }
    public void verify_and_click_edit_playlist_present_on_page() {
        wait.wait_until_element_is_visible("edit_playlist");
        verify.element_is_present("edit_playlist");
        element.click("edit_playlist");
    }
    public void verify_delete_playlist_page_present_on_page() {
        wait.wait_until_element_is_visible("delete_playlist");
        verify.element_is_present("delete_playlist");
    }
    public void verify_name_of_music_track_more_vert(){
        verify.element_is_present("name_of_music_track_of_more_vert");
    }
    public void verify_duration_of_music_track_more_vert(){
        verify.element_is_present("duration_of_music_track_more_vert");
        String duration=  element.get_element_text("duration_of_music_track_more_vert");
        System.out.println("Duration of track " + duration);
    }
    public void verify_click_on_close_button_more_vert() {
        verify.element_is_present("close_button_of_music_track_more_vert");
    }
    public void verify_and_click_on_close_button_more_vert() {
        wait.wait_until_element_is_visible("close_button_of_music_track_more_vert");
        verify.element_is_present("close_button_of_music_track_more_vert");
        element.click("close_button_of_music_track_more_vert");
    }
    public void verify_and_click_on_Add_more(){
        wait.wait_until_element_is_visible("Add_more");
        verify.element_is_present("Add_more");
        element.click("Add_more");
    }
    public void verify_Add_items_to_playlist_music(){
        wait.wait_until_element_is_visible("Add_items_to_playlist_music");
        verify.element_is_present("Add_items_to_playlist_music");
    }
    public void verify_New_playlist_name(){
        wait.wait_until_element_is_visible("New_playlist_name");
        verify.element_is_present("New_playlist_name");
    }
    public void set_the_Reminder_present_on_page_music() {
        wait.wait_for_second(2);
        device.sliding("Set_a_reminder_for_hour", 0, -200);
        wait.wait_for_second(2);
        device.sliding("Set_a_reminder_for_minutes", 0, -100);
        verify.element_is_present("Activity_Label");
        element.click("sleep");
    }
    public void click_on_save_new_reminder_Music() {
        element.click("save_new_reminder");
        wait.wait_for_second(10);
    }
    public void Sliding_the_track_on_edit_playlist() {
        WebElement ele= androidDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Quick Wind Down \"]"));
        int startX = ele.getLocation().getX() + ele.getSize().getWidth() / 2;
        System.out.println("X"+startX);
        int startY = ele.getLocation().getY() + ele.getSize().getHeight() / 2;
        System.out.println("Y"+startY);
        int endY = startY + 200;

        // Step 2: Create a TouchAction for the long press and slide gesture
        TouchAction action = new TouchAction(androidDriver);

        action.longPress(LongPressOptions.longPressOptions()
                        .withPosition(PointOption.point(startX, startY))
                        .withDuration(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(startX, endY))
                .release()  // Release the touch action
                .perform();


        try {
            Thread.sleep(1000); // Wait 1 second after performing the action
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void verify_and_click_on_Music_playlist_first_song(){
        wait.wait_until_element_is_visible("Music_Playlist_first_song");
        element.click("Music_Playlist_first_song");
        wait.wait_for_second(2);
    }
    public void verify_and_click_on_Music_play_button_of_first_song(){
        wait.wait_until_element_is_visible("Music_play_button");
        element.click("Music_play_button");
        wait.wait_for_second(2);
    }
    public void verify_and_click_on_playlist(){
        wait.wait_until_element_is_visible("Playlist");
        verify.element_is_present("Playlist");
        element.click("Playlist");
        wait.wait_for_second(2);
    }
    public void verify_and_click_on_Save_button(){
        wait.wait_until_element_is_visible("Done_button");
        element.click("Done_button");
        wait.wait_for_second(2);
    }
    public void verify_and_click_on_more_vert_of_song(){
        wait.wait_until_element_is_visible("more_vert_of_song");
        element.click("more_vert_of_song");
        wait.wait_for_second(2);
    }
    public void verify_and_click_on_Add_to_this_playlist(){
        wait.wait_until_element_is_visible("Add_to_playlist");
        element.click("Add_to_playlist");
        wait.wait_for_second(2);
    }
    public void verify_and_click_on_Add_playlist(){
        wait.wait_until_element_is_visible("Add_Playlist");
        element.click("Add_Playlist");
        wait.wait_for_second(2);
    }
    public void verify_Give_your_playlist_a_name(){
        wait.wait_until_element_is_visible("Give_your_playlist_a_name");
        verify.element_is_present("Give_your_playlist_a_name");
        wait.wait_for_second(2);
    }
    public void verify_Music_screen(){
        wait.wait_until_element_is_visible("Music_screen");
        verify.element_is_present("Music_screen");
        wait.wait_for_second(2);
    }

}
