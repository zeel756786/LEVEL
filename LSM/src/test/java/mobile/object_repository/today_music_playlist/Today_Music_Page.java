package mobile.object_repository.today_music_playlist;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Today_Music_Page {

    WebDriver driver = null;
    Element element = null;
    Verify verify = null;
    Wait wait = null;
    AndroidDriver androidDriver = null;

    public Today_Music_Page(WebDriver driver) {
        this.driver = driver;
        element = new Element(driver);
        verify = new Verify(driver);
        wait = new Wait(driver);
        androidDriver = (AndroidDriver) driver;
    }
    public void wait_for_five_second(){
        wait.wait_for_second(5);
    }

    public void verify_and_click_on_Ease_Anxiety_Stress(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Ease_Anxiety_Stress");
        element.click("Ease_Anxiety_Stress");
        wait.wait_for_second(10);
    }
    public void verify_and_click_on_For_Focus(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("For_Focus");
        element.click("For_Focus");
        wait.wait_for_second(5);
    }
    public void verify_and_click_on_collapse_icon_button(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("close_drop_down_collapse_button");
        element.click("close_drop_down_collapse_button");
        wait.wait_for_second(5);
    }
    public void verify_quick_wind_down(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("quick_wind_down");
        verify.element_is_present("quick_wind_down");
    }
    public void verify_get_rapid_calm_present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("get_rapid_calm");
        verify.element_is_present("get_rapid_calm");
    }
    public void verify_natures_lullaby_present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("natures_lullaby");
        verify.element_is_present("natures_lullaby");
    }
    public void verify_and_click_on_music(){
        wait.wait_for_second(5);
        wait.wait_until_element_is_visible("music_playlist");
        element.click("music_playlist");
    }
    public void verify_playlist_name_highlighted() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("playlist_name");
        verify.element_is_enable("playlist_name");
    }
    public void verify_and_click_on_create_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("create");
        element.click("create");
    }
    public void verify_add_item_to_playlist_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("add_item_to_playlist");
        verify.element_is_present("add_item_to_playlist");
    }
    public void verify_search_text_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("search_text");
        verify.element_is_present("search_text");
        element.click("search_text");
    }
    public void verify_Natures_Sound_Present_On_Page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Natures_Sound");
    }
    public void verify_oops_it_seems_we_dont_have_what_youre_searching_for() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("oops_it_seems_we_dont_have_what_youre_searching_for");
        verify.element_is_present("oops_it_seems_we_dont_have_what_youre_searching_for");
    }
    public void verify_and_click_on_radio_button_for_select_all_music(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("radio_button_for_select_all_music");
        element.click("radio_button_for_select_all_music");
        wait.wait_for_second(5);
    }
    public void verify_and_click_on_quick_wind_down_unselect_the_song(){
        wait.wait_for_second(5);
        wait.wait_until_element_is_visible("quick_wind_down_unselect_the_song");
        element.click("quick_wind_down_unselect_the_song");
        wait.wait_for_second(5);
    }
    public void verify_and_click_on_hamburger_button_of_today_page(){
        wait.wait_until_element_is_visible("hamburger");
        element.click("hamburger");
    }
    public void enterTextInPlaylistNameTextBox(String name) {
        wait.wait_for_second(2);
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
        wait.wait_for_second(5);
        List<WebElement> checkboxes = driver.findElements(By.xpath("//android.view.View[starts-with(@resource-id, 'playlist_add')]"));

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
}
