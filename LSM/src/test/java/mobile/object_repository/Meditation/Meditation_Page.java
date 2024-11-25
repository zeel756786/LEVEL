package mobile.object_repository.Meditation;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.unity.performaction.automob.Device;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.PointerInput.Origin;
import java.time.Duration;
import java.util.Arrays;


import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

import static java.time.Duration.ofMillis;
import static java.util.Collections.singletonList;

public class Meditation_Page {

    WebDriver driver = null;
    Element element = null;
    Verify verify = null;
    Wait wait = null;
    AndroidDriver androidDriver = null;
    Device device = null;

    public Meditation_Page(WebDriver driver) {
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
    public void verify_and_click_on_Meditations(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Meditation");
        verify.element_is_present("Meditation");
        element.click("Meditation");

    }
    public void verify_and_click_on_Search_for(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Search_for");
        verify.element_is_present("Search_for");
        element.click("Search_for");
    }
    public void verify_Anchoring_on_breath_present_on_page(){
        wait.wait_until_element_is_visible("Anchoring_on_breath");
        verify.element_is_present("Anchoring_on_breath");
    }
    public void verify_Dealing_with_Disappointment_present_on_page(){
        wait.wait_until_element_is_visible("Dealing_with_Disappointment");
        verify.element_is_present("Dealing_with_Disappointment");
    }
    public void verify_Mantras_and_spirituality_present_on_page(){
        wait.wait_until_element_is_visible("Mantras_and_spirituality");
        verify.element_is_present("Mantras_and_spirituality");
    }
    public void verify_Pranayama_Victorious_Breath_present_on_page(){
        wait.wait_until_element_is_visible("Pranayama_Victorious_Breath");
        verify.element_is_present("Pranayama_Victorious_Breath");
    }
    public void verify_saloni_present_on_page(){
        wait.wait_until_element_is_visible("saloni");
        verify.element_is_present("saloni");
    }
    public void verify_neha_present_on_page(){
        wait.wait_until_element_is_visible("neha");
        verify.element_is_present("neha");
    }
    public void verify_and_click_on_Mindfulness_present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Mindfulness");
        verify.element_is_present("Mindfulness");
        element.click("Mindfulness");
    }
    public void verify_Mindfulness_Screen_present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Mindfulness");
        verify.element_is_present("Mindfulness");
    }
    public void verify_and_click_on_mindfulness_i_icon(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Mindfulness_i_icon");
        verify.element_is_present("Mindfulness_i_icon");
        element.click("Mindfulness_i_icon");
    }
    public void verify_Explore_Meditations_Button_Present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Explore_Meditations_Button");
        verify.element_is_present("Explore_Meditations_Button");
    }
    public void click_on_Explore_Meditations_Button_Present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Explore_Meditations_Button");
        verify.element_is_present("Explore_Meditations_Button");
        element.click("Explore_Meditations_Button");
        wait.wait_for_second(10);
    }
    public void verify_the_heading_technique_Present_on_page() {
        try {
            wait.wait_for_second(2);
            wait.wait_until_element_is_visible("Technique");
            verify.element_is_present("Technique");

            wait.wait_for_second(2);
            wait.wait_until_element_is_visible("Mindfulness");
            verify.element_is_present("Mindfulness");
        } catch (Exception e) {
            System.out.println("Exception occurred while verifying 'Technique' or 'Mindfulness' element: " + e.getMessage());
        }
    }
    public void verify_the_description_mindfulness_Present_on_page() {
        try {
            wait.wait_for_second(2);
            wait.wait_until_element_is_visible("Mindfulness_Description");
            verify.element_is_present("Mindfulness_Description");
        } catch (Exception e) {
            System.out.println("Exception occurred while verifying 'Mindfulness Description' element: " + e.getMessage());
        }
    }
    public void verify_the_About_this_technique_present_on_page() {
        try {
            wait.wait_for_second(2);
            wait.wait_until_element_is_visible("About_this_technique");
            verify.element_is_present("About_this_technique");
        } catch (Exception e) {
            System.out.println("Exception occurred while verifying 'About this technique' element: " + e.getMessage());
        }
    }
    public void verify_travel_series_present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Travel_Series");
        verify.element_is_present("Travel_Series");
    }
    public void verify_short_series_present_on_page() {
        try {
            wait.wait_for_second(2);
            wait.wait_until_element_is_visible("Series");
            verify.element_is_present("Series");
        } catch (Exception e) {
            System.out.println("Exception occurred while verifying 'Series' element: " + e.getMessage());
        }
    }
    public void verify_anxiety_series_present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Anxiety_Series");
        verify.element_is_present("Anxiety_Series");
    }
    public void verify_eat_mindfully_present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Eat_Mindfully");
        verify.element_is_present("Eat_Mindfully");
    }
    public void verify_and_click_on_filter_by_button(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("filter_by_button");
        element.click("filter_by_button");
    }
    public void verify_and_click_on_radio_button_meditations_series(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Radio_button_meditation_series");
        element.click("Radio_button_meditation_series");
    }
    public void verify_and_click_on_radio_button_quick_picks(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Radio_button_Quick_Picks");
        element.click("Radio_button_Quick_Picks");
    }
    public void verify_and_click_on_radio_button_both(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Both_Default_Meditation_and_Quick");
        element.click("Both_Default_Meditation_and_Quick");
    }
    public void verify_and_click_on_radio_button_time(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Radio_button_Time");
        element.click("Radio_button_Time");
    }
    public void verify_and_click_on_radio_button_newest(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Radio_button_Newest");
        element.click("Radio_button_Newest");
    }
    public void verify_and_click_on_radio_button_unplayed(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Radio_button_unplayed");
        element.click("Radio_button_unplayed");
    }
    public void verify_filter_and_sort(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Filter_and_sort");
    }
    public void verify_set_timer_present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("set_timer");
    }
    public void verify_and_click_on_radio_button_previously_played(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Radio_button_previously_played");
        element.click("Radio_button_previously_played");
    }
    public void verify_and_click_apply_button_present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Apply");
        element.click("Apply");
    }
    public void verify_and_click_reset_button_present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Reset");
        element.click("Reset");
        wait_for_five_second();
        waitForTextElementAppear("Focus Series");
        waitForTextElementAppear("Anxiety Series");
        verify_and_click_on_hindi_language();
        waitForTextElementAppear("Exam Series (हिन्दी)");
        verify_and_click_on_marathi_language();
        waitForTextElementAppear("Focus Series (मराठी)");
    }
    public void verify_meditations_for_traders_present_on_page(){
        wait.wait_until_element_is_visible("meditations_for_traders");
        verify.element_is_present("meditations_for_traders");
        System.out.println("Element 'meditations_for_traders' is visible.");
    }
    public void verify_Meditation_Series_present_on_page() {
        try {
            wait.wait_for_second(2);
            wait.wait_until_element_is_visible("Meditation_Series");
            verify.element_is_present("Meditation_Series");
        } catch (Exception e) {
            System.out.println("Exception occurred while verifying 'Meditation Series' element: " + e.getMessage());
        }
    }
    public void verify_Unplayed_present_on_page() {
        try {
            wait.wait_for_second(2);
            wait.wait_until_element_is_visible("Unplayed");
            verify.element_is_present("Unplayed");
        } catch (Exception e) {
            System.out.println("Exception occurred while verifying 'Unplayed' element: " + e.getMessage());
        }
    }
    public void verify_Quick_present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Quick_Picks");
        verify.element_is_present("Quick_Picks");
    }
    public void verify_previously_played_present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("previously_played");
        verify.element_is_present("previously_played");
    }
    public void verify_Anapana_present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Anapana_Meditation");
        verify.element_is_present("Anapana_Meditation");
    }
    public void verify_zazen_meditation_present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("zazen_meditation");
        verify.element_is_present("zazen_meditation");
    }
    public void verify_and_click_on_english_language() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("english_language");
        verify.element_is_present("english_language");
        element.click("english_language");
        wait_for_five_second();
        waitForTextElementAppear("Focus Series");
        waitForTextElementAppear("Exam Series");
        waitForTextElementAppear("Anxiety Series");
    }
    public void verify_and_click_on_hindi_language() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("hindi_language");
        verify.element_is_present("hindi_language");
        element.click("hindi_language");
        wait_for_five_second();
        waitForTextElementAppear("Train Your Mind Series (हिन्दी)");
        waitForTextElementAppear("Exam Series (हिन्दी)");
        waitForTextElementAppear("Focus Series (हिन्दी)");
    }
    public void verify_and_click_on_marathi_language() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("marathi_language");
        verify.element_is_present("marathi_language");
        element.click("marathi_language");
        wait_for_five_second();
        waitForTextElementAppear("Beginner's Series (मराठी)");
        waitForTextElementAppear("Focus Series (मराठी)");

    }
    public void verify_and_click_on_gujarati_language() {
        device.sliding("marathi_language",-600,0);
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("gujarati_language");
        verify.element_is_present("gujarati_language");
        element.click("gujarati_language");
        wait_for_five_second();
        waitForTextElementAppear("Beginner's Series (ગુજરાતી)");
    }
    public void verify_and_click_on_bengali_language() {
        device.sliding("marathi_language",-1400,0);
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Bengali_language");
        verify.element_is_present("Bengali_language");
        element.click("Bengali_language");
        wait_for_five_second();
        waitForTextElementAppear("Beginner's Series (বাংলা)");
    }
    public void verify_and_click_on_digi_mala() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Digi_Mala");
        element.click("Digi_Mala");
    }
    public void verify_and_click_on_Meditation_Timer() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Meditation_Timer");
        element.click("Meditation_Timer");
    }
    public void verify_and_click_on_start_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Start");
        element.click("Start");
    }
    public void verify_and_click_on_play_button_start_and_stop() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("play_button");
        element.click("play_button");
    }
    public void verify_and_click_on_play_back_speed_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("digi_mala_play_back_speed");
        element.click("digi_mala_play_back_speed");
    }
    public void verify_and_click_on_share_button_of_breakdown_work() {
        wait.wait_for_second(8);
      //  wait.wait_until_element_is_visible("share_break_down_work");
        element.click("share_break_down_work");
    //    element.click("share_break_down_work");
        wait.wait_for_second(5);
    }
    public void verify_and_click_on_see_all() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("see_all");
        element.click("see_all");
    }
    public void verify_and_click_on_tamil_language() {
        device.sliding("marathi_language",-2000,0);
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Tamil_language");
        verify.element_is_present("Tamil_language");
        element.click("Tamil_language");
        wait_for_five_second();
        waitForTextElementAppear("Beginner's Series (தமிழ்)");
        waitForTextElementAppear("Train Your Mind Series (தமிழ்)");
    }

    public void verify_and_click_on_kannada_language() {
        device.sliding("marathi_language",-2000,0);
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Kannada_language");
        verify.element_is_present("Kannada_language");
        element.click("Kannada_language");
        wait_for_five_second();
        waitForTextElementAppear("Beginner's Series");
        waitForTextElementAppear("21 Days Challenge (ಕನ್ನಡ)");
    }
    public void verify_and_click_on_edit_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Edit_button");
        verify.element_is_present("Edit_button");
        element.click("Edit_button");
    }
    public void click_on_motivation_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("motivation");
        verify.element_is_present("motivation");
        element.click("motivation");
    }
    public void click_on_cross_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("click_on_cross_button");
        verify.element_is_present("click_on_cross_button");
        element.click("click_on_cross_button");
    }
    public void click_on_search_by_coach_name() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("search_by_coach_name");
        element.click("search_by_coach_name");
    }
    public void verify_and_click_on_cancel_button() {
        try {
            wait.wait_for_second(2);
            wait.wait_until_element_is_visible("cancel");
            verify.element_is_present("cancel");
            element.click("cancel");
            wait.wait_for_second(5);
        } catch (Exception e) {
            System.out.println("An error occurred while verifying and clicking on the cancel button: " + e.getMessage());
            e.printStackTrace();
            wait.wait_for_second(5);
        }
    }
    public void verify_and_click_on_meditations_series() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("meditations_trending_series");
        verify.element_is_present("meditations_trending_series");
        String Text =  element.get_element_text("meditations_trending_series");
        System.out.println("Text is: " + Text);
        element.click("meditations_trending_series");

    }
    public void verify_and_click_on_meditations_series_first_video() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("meditation_series_first_video");
        verify.element_is_present("meditation_series_first_video");
        String Text =  element.get_element_text("meditation_series_first_video");
        System.out.println("Text is: " + Text);
        element.click("meditation_series_first_video");

    }
    public void verify_user_able_to_edit_meditations_page(){
        wait.wait_for_second(2);
        click_on_motivation_button();
        click_on_motivation_button();
        click_on_cross_button();
    }
    public void verify_motivation_present_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Motivation");
        verify.element_is_present("Motivation");
    }
    public void verify_and_click_on_meditations_series_play_button() {
        try {
            wait.wait_for_second(2);
            wait.wait_until_element_is_visible("meditations_trending_play_button");
            verify.element_is_present("meditations_trending_play_button");
            element.click("meditations_trending_play_button");
            wait.wait_for_second(5);
        } catch (Exception e) {
            System.out.println("An error occurred while verifying and clicking on the meditations series play button: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public void verify_and_click_on_meditations_series_stop_button() {
        try {
            wait.wait_for_second(2);
            wait.wait_until_element_is_visible("meditations_trending_play_button");
            verify.element_is_present("meditations_trending_play_button");
            element.click("meditations_trending_play_button");
        } catch (Exception e) {
            System.out.println("An error occurred while verifying and clicking on the meditations series play button: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public void verify_and_click_on_meditations_series_add_to_fav_and_share() {
        try {
            wait.wait_for_second(2);
            wait.wait_until_element_is_visible("meditations_series_add_to_fav");
            verify.element_is_present("meditations_series_add_to_fav");
            element.click("meditations_series_add_to_fav");
            wait.wait_for_second(2);
            element.click("meditations_series_share");
            wait.wait_for_second(5);
        } catch (Exception e) {
            System.out.println("An error occurred while verifying and clicking on the meditations series play button: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public void scroll_down_to_the_Text(String Text) {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"" + Text + "\"));"));
    }
    public void scroll_up_to_the_Text(String Text) {
        try {
            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true))" +
                            ".setAsVerticalList().scrollBackward()" +
                            ".scrollIntoView(new UiSelector().text(\"" + Text + "\"));"));
        } catch (Exception e) {
            System.out.println("An error occurred while scrolling up to the text: " + Text);
            e.printStackTrace();
        }
    }
    public void verify_stress_and_anxiety_present_on_screen() {
        wait.wait_until_element_is_visible("stress_axiety");
    }

    public void verify_search_box_enter_and_clear_text() {
        WebElement searchButton = androidDriver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"clear\"]"));
        String[] searchTerms = {"meditations", "mantras", "pranayama"};

        for (String searchTerm : searchTerms) {
            WebElement searchBox = androidDriver.findElement(By.xpath("//android.widget.EditText"));
            searchBox.click();
            searchBox.clear();
            searchBox.sendKeys(searchTerm);
            searchButton.click();

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            if (searchTerm.equals("meditations")) {
                androidDriver.hideKeyboard();
                verify_Anchoring_on_breath_present_on_page();
                verify_Dealing_with_Disappointment_present_on_page();
                System.out.println("Search for  meditations  passed.");

            } else if (searchTerm.equals("mantras")) {
                androidDriver.hideKeyboard();
                verify_Mantras_and_spirituality_present_on_page();
                System.out.println("Search for mantras passed.");

            } else if (searchTerm.equals("pranayama")) {
                androidDriver.hideKeyboard();
                verify_Pranayama_Victorious_Breath_present_on_page();
                System.out.println("Search for pranayama  passed.");
            }

            searchButton.click();
        }
    }
    public void scrollUntilElementVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        boolean canScrollMore;

        do {

            try {
                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//android.widget.TextView[@text='Previously Played']")
                ));
                if (element.isDisplayed()) {
                    System.out.println("Element is visible, stopping scroll.");
                    break;
                }
            } catch (Exception e) {

            }

            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 200, "height", 200,
                    "direction", "down",
                    "percent", 1.0
            ));
        } while (canScrollMore);

    }
    public void scrollDown() {

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        int startX = driver.manage().window().getSize().width / 2;
        int startY = (int) (driver.manage().window().getSize().height * 0.7);
        int endY = (int) (driver.manage().window().getSize().height * 0.3);

        Sequence scroll = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(Duration.ZERO, Origin.viewport(), startX, startY))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger.createPointerMove(Duration.ofMillis(500), Origin.viewport(), startX, endY))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        androidDriver.perform(Arrays.asList(scroll));
    }
    public void waitForTextElementAppear(String text) {
        int maxAttempts = 0;
        while (maxAttempts < 3) {
            try {
                if (driver.findElement(By.xpath("//android.widget.TextView[contains(@text, \"" + text + "\")]")).isDisplayed()) {
                    System.out.println("Text '" + text + "' is displayed");
                    break;
                }
            } catch (NoSuchElementException e) {

                scrollDown();
            }
            maxAttempts++;
        }
    }

    public static void clickAllMatchingElements(AndroidDriver driver) {
        try {
            List<WebElement> elements = driver.findElements(By.xpath("//android.widget.TextView[contains(@text, ' x')]"));

            for (int i = 0; i <=elements.size(); i++) {
                elements.get(i).click();
                System.out.println("Element clicked: " + elements.get(i).getText());
                Thread.sleep(5000);
            }

            System.out.println("Successfully clicked all elements matching the locator.");
        } catch (Exception e) {
            System.out.println("An error occurred while clicking elements: " + e.getMessage());
        }
    }
    public void verify_search_coach_name_enter_and_clear_text() {
        String[] searchTerms = {"Saloni", "Neha"};

        for (String searchTerm : searchTerms) {
            WebElement searchBox = androidDriver.findElement(By.xpath("//android.widget.EditText"));
            searchBox.click();
            searchBox.clear();
            searchBox.sendKeys(searchTerm);

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            if (searchTerm.equals("Saloni")) {
                androidDriver.hideKeyboard();
                verify_saloni_present_on_page();
                System.out.println("Search for  saloni  passed.");

            } else if (searchTerm.equals("Neha")) {
                androidDriver.hideKeyboard();
                verify_neha_present_on_page();
                System.out.println("Search for Neha passed.");
            }
        }

    }
    public void verify_and_set_timer(){
        wait.wait_for_second(5);
        device.sliding("set_timer",0,-200);
        wait.wait_for_second(5);
    }
    public void scroll_to_buttom_till_end(){
        device.scrollDownToBottoms("stress_axiety");
    }
    public void scroll_to_buttom_personalised_for_you(){
        device.scrollDownToBottoms("personalised_for_you");
    }
    public void scroll_to_buttom_breakdown_at_work(){
        device.scrollDownToBottoms("Break_down_at_work");
    }
    public void verify_english_track_present_on_page()
    {
        wait.wait_for_second(5);
        try {
            waitForTextElementAppear("Anxiety Series");
            waitForTextElementAppear("Breakup Series");
            waitForTextElementAppear("Eat Mindfully");
            waitForTextElementAppear("Quick Body Scan");
            waitForTextElementAppear("Beat Performance Anxiety");
        }
        catch(NoSuchElementException e)
        {
            System.out.println("Element not found");
        }
    }
    public void scroll_up_to_meditations_series(){
        wait.wait_for_second(5);
        device.scrollUpToTop("Meditation Series");
    }
    public void verify_hindi_track_present_on_page(){
        wait.wait_for_second(2);
        waitForTextElementAppear("Anxiety Series (हिन्दी)");
    }
    public void verify_marathi_track_present_on_page(){
        wait.wait_for_second(2);
        waitForTextElementAppear("Om Mantra Series (मराठी)");
    }
    public void verify_scroll_Down_to_Quick_Picks(){
        wait.wait_for_second(2);
        device.scrollDownToBottoms("Quick_Picks");
    }
    public void verify_and_click_on_Meditation_Series_Kebab_Icon(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Meditation_Series_Kebab_Icon");
        element.click("Meditation_Series_Kebab_Icon");
        if(verify.check_element_is_present("Remove_from_favorites")){
            element.click("Remove_from_favorites");
            wait.wait_for_second(5);
            wait.wait_until_element_is_visible("Add_to_favorities");
            verify.element_is_present("Add_to_favorities");
        }
        else {
            wait.wait_for_second(2);
            wait.wait_until_element_is_visible("Add_to_favorities");
            verify.element_is_present("Add_to_favorities");
        }
    }
    public void verify_and_click_on_Quick_Picks_Kebab_Icon(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Quick_Picks_Kebab_Icon");
        element.click("Quick_Picks_Kebab_Icon");
     //   wait.wait_for_second(5);
     //   verify.element_is_present("Add_to_favorities");
//        element.click("Add_to_favorities");
//        wait.wait_until_element_is_visible("Share_button");
//        verify.element_is_present("Share_button");
//        wait.wait_until_element_is_visible("Download_button");
//        verify.element_is_present("Download_button");
    }
    public void verify_english_track_series_motivation_present_on_page(){
        wait.wait_for_second(2);
        waitForTextElementAppear("Breakup Series");
        waitForTextElementAppear("Eat Mindfully");
        waitForTextElementAppear("Maa Durga Series");
        waitForTextElementAppear("Ganesh Mantra Series");
        waitForTextElementAppear("Quick Picks");
    }
    public void verify_english_track_series_quick_picks_motivation_present_on_page(){
        wait.wait_for_second(2);
        waitForTextElementAppear("Find Your Inner Strength");
        waitForTextElementAppear("Visualise Your Future");
        waitForTextElementAppear("Face Your Fears");
    }

    public void verify_hindi_track_series_motivation_present_on_page(){
        wait.wait_for_second(2);
        waitForTextElementAppear("Ganesh Mantra Series");
        waitForTextElementAppear("Sun Sign Meditation Series");
    }
    public void verify_marathi_track_series_motivation_present_on_page(){
        wait.wait_for_second(2);
        waitForTextElementAppear("Ganesh Mantra Series");
    }
    public void scroll_up_to_top_of_the_page(){
        wait.wait_for_second(5);
        device.scrollUpToTop("Navigate_back");
    }
    public void verify_and_click_on_share_button(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("meditations_series_share");
        element.click("meditations_series_share");
        wait.wait_for_second(5);
    }
    public void verify_and_click_on_add_to_fav_button(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("meditations_series_add_to_fav");
        element.click("meditations_series_add_to_fav");
    }

    public void scroll_up_to_top_hindi_present_on_page(){
        wait.wait_for_second(5);
        device.scrollUpToTop("hindi_language");
    }
    public void scroll_up_to_top_marathi_present_on_page(){
        wait.wait_for_second(5);
        device.scrollUpToTop("marathi_language");
    }
    public void print_text_value() {
        WebElement element =  driver.findElement(By.xpath("(//android.widget.TextView)[3]"));

        String textValue = element.getAttribute("text");

        System.out.println("The text value is: " + textValue);
    }
    public void scroll_down_Quick_Picks(){
        wait.wait_for_second(2);
        device.scrollDownToBottom("Quick_Pick");
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


}


