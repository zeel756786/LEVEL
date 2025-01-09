package mobile.object_repository.Body;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.unity.performaction.automob.Device;
import io.unity.performaction.autoweb.Alert;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Body_Page {
    WebDriver driver = null;
    Element element = null;
    Verify verify = null;
    Wait wait = null;
    AndroidDriver androidDriver = null;
    Device device = null;
    Alert alert = null;
    AppiumDriver appiumDriver = null;

    public Body_Page(WebDriver driver) {
        this.driver = driver;
        element = new Element(driver);
        verify = new Verify(driver);
        wait = new Wait(driver);
        androidDriver = (AndroidDriver) driver;
        device = new Device(androidDriver);
        alert = new Alert(driver);
        appiumDriver = (AppiumDriver) driver;
    }

    public void verify_and_click_on_Body() {
        wait.wait_for_second(2);
        verify.element_is_present("Body");
        element.click("Body");
    }

    public void verify_workout_screen_present_on_page() {
        wait.wait_for_second(2);
        verify.element_is_present("Search_for");
        verify.element_is_present("Beginner");
        verify.element_is_present("Intermediate");
        verify.element_is_present("Advanced");
    }

    public void click_on_search_for() {
        wait.wait_for_second(2);
        element.click("Search_for");
    }

    public void click_on_Beginner() {
        wait.wait_for_second(2);
        element.click("Beginner");
    }

    public void click_on_Intermediate() {
        wait.wait_for_second(2);
        element.click("Intermediate");
    }

    public void click_on_Advanced() {
        wait.wait_for_second(2);
        element.click("Advanced");
    }

    public void verify_yoga_training_present_on_screen() {
        wait.wait_for_second(2);
        verify.element_is_present("Sleep_Time_Yoga");
        verify.element_is_present("Sleep_Time_Yoga_Hindi");
        //   wait.wait_for_second(5);
        device.scrollDownToBottom("Day_one_yoga");
        //   wait.wait_for_second(5);
        verify.element_is_present("Day_one_yoga");
        verify.element_is_present("Day_three_yoga");
    }

    public void verify_HIIT_training_present_on_screen() {
        wait.wait_for_second(2);
        verify.element_is_present("one_five_min_HIIT");
        verify.element_is_present("two_zero_min_HIIT");
        device.scrollDownToBottom("Intense_Lower_Body_HIIT");
        wait.wait_for_second(5);
        verify.element_is_present("Intense_Lower_Body_HIIT");
        verify.element_is_present("Core_Endurance_HIIT");
        verify.element_is_present("lower_body_HIIT");
        verify.element_is_present("Build_your_Endurance_HIIT");
        device.scrollUpToTop("Clear");
    }

    public void verify_workout_training_present_on_screen() {
        wait.wait_for_second(2);
        device.scrollDownToBottom("Full_body_Relaxation");
        wait.wait_for_second(2);
        verify.element_is_present("Full_body_Relaxation");
        device.scrollUpToTop("Clear");
    }

    public void verify_search_for_Yoga() {
        WebElement searchBox = androidDriver.findElement(By.xpath("//android.widget.EditText"));
        WebElement searchButton = androidDriver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"clear\"]"));

        searchBox.click();
        searchBox.sendKeys("yoga");
        androidDriver.hideKeyboard();
        searchButton.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        verify_yoga_training_present_on_screen();
        System.out.println("Search for Yoga passed.");
    }

    public void verify_search_for_HIIT() {
        WebElement searchBox = androidDriver.findElement(By.xpath("//android.widget.EditText"));
        WebElement searchButton = androidDriver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"clear\"]"));

        searchBox.click();
        searchBox.sendKeys("HIIT");
        androidDriver.hideKeyboard();
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        verify_HIIT_training_present_on_screen();
        System.out.println("Search for HIIT passed.");
    }

    public void verify_search_for_Workouts() {
        WebElement searchBox = androidDriver.findElement(By.xpath("//android.widget.EditText"));
        WebElement searchButton = androidDriver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"clear\"]"));

        searchBox.click();
        searchBox.sendKeys("workouts");
        androidDriver.hideKeyboard();
        searchButton.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        verify_workout_training_present_on_screen();
        System.out.println("Search for Workouts passed.");
    }

    public void verify_workout_screen_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Workout");
        verify.element_is_present("Workout");
    }

    public void verify_Beginners_Series_present_on_page() {
        verify.element_is_present("Basics_For_Beginners");
        verify.element_is_present("Yoga_Series_Beginners");
        device.scrollDownToBottom("Build_your_Endurance_HIIT");
        verify.element_is_present("Build_your_Endurance_HIIT");
    }

    public void verify_Intermediate_Series_present_on_page() {
        verify.element_is_present("Yoga_Series_Intermediate");
    }

    public void verify_Advanced_Series_present_on_page() {
        verify.element_is_present("full_body_HIIT");
        verify.element_is_present("Full_Body_Workout");
    }

    public void enter_data_in_search_box(String text) {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Search_Text_box");
        element.click("Search_Text_box");
        element.enter_text("Search_Text_box", text);
        element.click("clear_searh_text_field");
    }

    public void enter_new_in_search_text_field() {
        enter_data_in_search_box("New");
        wait.wait_for_second(2);
        androidDriver.hideKeyboard();
        verify.element_is_present("Dawn_of_a_new_day");
        verify.element_is_present("Dawn_of_a_new_day_hindi");
        verify.element_is_present("Intense_Full_Body_Workout");
    }

    public void click_on_pop_up() {
        try {
            element.click("close");
        } catch (Exception e) {
            System.out.println("Pop Up not visible on UI");
            // You can add additional logging or actions here if needed
        }
    }

    public void enter_Frequently_in_search_text_field() {
        enter_data_in_search_box("Frequently Repeated");
        wait.wait_for_second(2);
        androidDriver.hideKeyboard();
        verify.element_is_present("Balance_of_Trilogy");
        verify.element_is_present("Basics_For_Beginners");
        device.sliding("Basics_For_Beginners", -700, 0);
        verify.element_is_present("one_five_min_HIIT");
    }

    public void enter_Strength_Training_in_search_text_field() {
        enter_data_in_search_box("Strength_Training");
        wait.wait_for_second(2);
        androidDriver.hideKeyboard();
        verify.element_is_present("Strength_your_Back");
        verify.element_is_present("Strength_your_Legs");
        device.scrollDownToBottom("Lower_Back_Strength");
        verify.element_is_present("Lower_Back_Strength");
        verify.element_is_present("For_Upper_Body_Strength");
    }

    public void enter_Relaxation_in_search_text_field() {
        enter_data_in_search_box("Relaxation");
        wait.wait_for_second(2);
        androidDriver.hideKeyboard();
        verify.element_is_present("Full_Body_Relaxation");
        device.scrollDownToBottom("Day_seven_Full_Body_Relaxation");
        verify.element_is_present("Day_seven_Full_Body_Relaxation");
        verify.element_is_present("Stretch_It_More");
    }

    public void enter_Fat_Loss_in_search_text_field() {
        enter_data_in_search_box("Fat_loss");
        wait.wait_for_second(2);
        androidDriver.hideKeyboard();
        verify.element_is_present("FatlossSeriesSWeekly");
        verify.element_is_present("full_body_HIIT");
    }

    public void click_on_apply_filter_free_button() {
        element.click("Free");
    }

    public void verify_filter_free_workout_series() {
        verify.element_is_present("upper_Body_Workout");
        verify.element_is_present("Balance_of_Trilogy");
    }

    public void verify_This_week_workout_completed_and_Time_spend_present_on_page() {
        verify.element_is_present("This_Week");
        verify.element_is_present("Workouts_Completed");
        String workoutCompleted = element.get_element_text("Workouts_Task");
        System.out.println("Workouts Completed: " + workoutCompleted);
        String workoutTime = element.get_element_text("Time_Spent");
        System.out.println("Time Spent in workout: " + workoutTime);
    }

    public void click_on_HIIT_Explore_Workouts() {
        element.click("Explore_Workout_HIIT");
    }

    public void click_on_Yoga_Explore_Workouts() {
        element.click("Yoga");
    }

    public void click_on_Relaxation_Explore_Workouts() {
        device.sliding("Relaxation", -100, 0);
        element.click("Relaxation");
    }

    public void click_on_Strength_Training_Explore_Workouts() {
        device.sliding("Relaxation", -500, 0);
        element.click("Strength_Training");
    }

    public void verify_Workout_HIIT_Screen() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Workout_HIIT_Screen");
        verify.element_is_present("Workout_HIIT_Screen");
    }

    public void verify_Workout_Yoga_Screen() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Yoga_Screen");
        verify.element_is_present("Yoga_Screen");
    }

    public void verify_Workout_Relaxation_Screen() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Relaxation_Screen");
        verify.element_is_present("Relaxation_Screen");
        wait.wait_for_second(5);
    }

    public void verify_Workout_Strength_Screen() {
        wait.wait_until_element_is_visible("Strength_Training_Screen");
        verify.element_is_present("Strength_Training_Screen");
    }

    public void verify_Workout_of_HIIT() {
        wait.wait_for_second(2);
        device.waitForTextElementAppear("15 Min HIIT");
        device.waitForTextElementAppear("20 Min HIIT");
        device.waitForTextElementAppear("Build Your Endurance");
        device.waitForTextElementAppear("A Fresh Beginning");
    }

    public void verify_yoga_of_HIIT() {
        wait.wait_for_second(2);
        device.waitForTextElementAppear("Strong Like A Warrior");
        device.waitForTextElementAppear("Dawn Of A New Day");
        device.waitForTextElementAppear("Power Up");
        device.waitForTextElementAppear("For A Rock Solid Core");
    }

    public void verify_Relaxation_of_HIIT() {
        wait.wait_for_second(2);
        device.waitForTextElementAppear("Stretch It More");
        device.waitForTextElementAppear("Bedtime Stretches");
        device.waitForTextElementAppear("Keep Your Joints Happy");
        device.waitForTextElementAppear("For A Deep Sleep");
    }

    public void verify_Strength_Training_of_HIIT() {
        wait.wait_for_second(2);
        device.waitForTextElementAppear("Basics For Beginners");
        device.waitForTextElementAppear("Quick Burn");
        device.waitForTextElementAppear("Hold It There");
        device.waitForTextElementAppear("Tone Your Glutes");
    }

    public void click_on_kebab_menu() {
        wait.wait_for_second(1);
        element.click("Kebab_Menu");
    }

    public void verify_Add_to_favorites_Download_Share_button() {
        wait.wait_for_second(2);
        verify.element_is_present("Add_to_favorites");
        verify.element_is_present("Download");
        verify.element_is_present("Share");
    }

    public void click_on_Share_button_of_Kebab_menu() {
        element.click("Share");
        wait.wait_for_second(5);
    }

    public void verify_add_to_fav_on_Kebab_Menu() {
        wait.wait_for_second(2);
        if (verify.check_element_is_present("Add_to_favorites")) {
            System.out.println("Add_to_favorities is displayed.");
            verify.element_is_present("Add_to_favorites");
        } else if (verify.check_element_is_present("Remove_from_favorites")) {
            element.click("Remove_from_favorites");
            wait.wait_for_second(3);
            verify.element_is_present("Add_to_favorites");
        } else {
            System.out.println("Neither Add_to_favorities nor Remove_from_favorites is visible.");
            throw new IllegalStateException("Expected element not found on the screen.");
        }
    }

    public void click_on_add_to_fav_on_Kebab_Menu() {
        wait.wait_for_second(2);
        if (verify.check_element_is_present("Add_to_favorites")) {
            element.click("Add_to_favorites");
            verify.element_is_present("Remove_from_favorites");
        } else if (verify.check_element_is_present("Remove_from_favorites")) {
            element.click("Remove_from_favorites");
            verify.element_is_present("Add_to_favorites");
            element.click("Add_to_favorites");
            verify.element_is_present("Remove_from_favorites");
        } else {
            System.out.println("Neither Add_to_favorities nor Remove_from_favorites is visible.");
            throw new IllegalStateException("Expected element not found on the screen.");
        }
    }

    public void click_on_see_all_button_coach() {
        wait.wait_for_second(2);
        device.scrollDownToBottom("see_all");
        element.click("see_all");
    }

    public void click_on_search_by_coach_name() {
        element.click("search_by_coach_name");
    }

    public void verify_coaches_screen_and_Explore_Coaches_present_on_page() {
        wait.wait_for_second(2);
        verify.element_is_present("coaches_screen");
        verify.element_is_present("search_by_coach_name");
        verify.element_is_present("Explore_Coaches");
    }

    public void verify_search_coach_name_enter_and_clear_text() {
        String[] searchTerms = {"Giftin", "Amogh", "Anusha"};

        for (String searchTerm : searchTerms) {
            WebElement searchBox = androidDriver.findElement(By.xpath("//android.widget.EditText"));
            searchBox.click();
            searchBox.clear();
            searchBox.sendKeys(searchTerm);

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            if (searchTerm.equals("Saloni")) {
                androidDriver.hideKeyboard();
                verify.element_is_present("Giftin");
                System.out.println("Search for  Giftin  passed.");

            } else if (searchTerm.equals("Amogh")) {
                androidDriver.hideKeyboard();
                verify.element_is_present("Amogh");
                System.out.println("Search for Amogh passed.");
            } else if (searchTerm.equals("Anusha")) {
                androidDriver.hideKeyboard();
                verify.element_is_present("Anusha");
                System.out.println("Search for Anusha passed.");
            }
        }
    }

    public void click_on_giftin_coaches() {
        wait.wait_for_second(2);
        device.scrollDownToBottom("Giftin");
        element.click("Browse_by_coach_giftin");
    }

    public void click_on_giftin_coaches_kebab_menu() {
        wait.wait_for_second(1);
        device.scrollDownToBottoms("Filter");
        element.click("kebab_menu_giftin_coaches");
    }

    public void verify_details_of_trainer_appreciate_follow_button() {
        String textDetails = element.get_element_text("Giftin_is_our_in_house_ACSM_certified_fitness_trainer");
        System.out.println("Trainer details:" + textDetails);
        verify.element_is_present("Appreciate");
        verify.element_is_present("Follow");
    }

    public void tab_on_apreciated_and_follow_button() {
        element.click("Appreciate");
        String toastMessage = element.get_element_text("Appreciate_Toast_Message");
        System.out.println("Appreciate Toast message:" + toastMessage);
        element.click("Follow");
        String followtoastMessage = element.get_element_text("Follow_Toast_Message");
        System.out.println("Follow Toast message:" + followtoastMessage);
    }

    public void click_on_filter_by_button() {
        device.scrollDownToBottom("Filter_button");
        element.click("Filter_button");
    }

    public void click_on_workout_series_and_newest() {
        element.click("workout_series");
        element.click("Newest");
        element.click("Apply");
    }

    public void click_on_workout_series_and_unplayed() {
        element.click("workout_series");
        device.scrollDown();
        element.click("Unplayed");
        element.click("Apply");
    }

    public void click_on_workout_series_and_previously_played() {
        element.click("workout_series");
        device.scrollDown();
        element.click("previously_played");
        element.click("Apply");
    }

    public void click_on_Quicks_Picks_and_Time() {
        element.click("Quick_Picks");
        device.scrollDown();
        element.click("Time");
        element.click("Apply");
    }

    public void click_on_Quicks_Picks_and_Newest() {
        element.click("Quick_Picks");
        device.scrollDown();
        element.click("Newest_button");
        element.click("Apply");
    }

    public void click_on_Quicks_Picks_and_Unplayed() {
        element.click("Quick_Picks");
        device.scrollDown();
        element.click("Unplayed_Button");
        element.click("Apply");
    }

    public void click_on_Quicks_Picks_and_Previously_Played() {
        element.click("Quick_Picks");
        device.scrollDown();
        element.click("previously_played_button");
        element.click("Apply");
    }

    public void click_on_Both_and_Time() {
        wait.wait_for_second(5);
        device.scrollDown();
        element.click("Time");
        element.click("Apply");
    }

    public void click_on_Both_and_Newest() {
        wait.wait_for_second(5);
        device.scrollDown();
        element.click("Newest_button");
        element.click("Apply");
    }

    public void click_on_Both_and_Unplayed() {
        wait.wait_for_second(5);
        device.scrollDown();
        element.click("Unplayed_Button");
        element.click("Apply");
    }

    public void click_on_Both_and_Previously_Played() {
        wait.wait_for_second(5);
        device.scrollDown();
        element.click("previously_played_button");
        element.click("Apply");
    }

    public void click_on_Remove_Filter() {
        try {
            wait.wait_for_second(1);
            element.click("Remove_Filters");
        } catch (Exception e) {
            System.out.println("Remove Filter not visible on UI");
        }
    }

    public void verify_filter_series() {
        verify.element_is_present("Filter_Series");
        String filterSeries = element.get_element_text("Filter_Series");
        System.out.println("Filter Series:" + filterSeries);
    }

    public void verify_add_to_fav_on_giftin_coaches() {
        wait.wait_for_second(2);
        if (verify.check_element_is_present("giftin_coaches_Add_to_favorities")) {
            System.out.println("Add_to_favorities is displayed.");
            verify.element_is_present("giftin_coaches_Add_to_favorities");
        } else if (verify.check_element_is_present("Remove_from_favorites")) {
            element.click("Remove_from_favorites");
            wait.wait_for_second(3);
            verify.element_is_present("giftin_coaches_Add_to_favorities");
        } else {
            System.out.println("Neither Add_to_favorities nor Remove_from_favorites is visible.");
            throw new IllegalStateException("Expected element not found on the screen.");
        }
    }

    public void verify_share_series_view_all_episodes_schedule_reminder_and_Rate_this_series() {
        wait.wait_for_second(2);
        verify.element_is_present("share_this_series");
        verify.element_is_present("view_all_episodes");
        verify.element_is_present("schedule_a_reminder");
        verify.element_is_present("Rate_this_series");
    }

    public void click_on_add_to_fav_on_Kebab_Menu_giftin_coaches() {
        wait.wait_for_second(2);
        if (verify.check_element_is_present("giftin_coaches_Add_to_favorities")) {
            element.click("giftin_coaches_Add_to_favorities");
            verify.element_is_present("Remove_from_favorites");
        } else if (verify.check_element_is_present("Remove_from_favorites")) {
            element.click("Remove_from_favorites");
            verify.element_is_present("giftin_coaches_Add_to_favorities");
            element.click("giftin_coaches_Add_to_favorities");
            verify.element_is_present("Remove_from_favorites");
        } else {
            System.out.println("Neither Add_to_favorities nor Remove_from_favorites is visible.");
            throw new IllegalStateException("Expected element not found on the screen.");
        }
    }

    public void click_on_share_this_series() {
        element.click("share_this_series");
        wait.wait_for_second(5);
    }

    public void click_on_view_all_episodes() {
        try {
            element.click("view_all_episodes");
            element.click("cancel");
        } catch (Exception e) {
            System.out.println("An error occurred while clicking on view all episodes or cancel: " + e.getMessage());
        }
    }

    public void verify_episodes_present_on_page() {
        wait.wait_for_second(2);
        device.waitForTextElementAppear("Day 1: Upper Body Workout");
        device.waitForTextElementAppear("Day 2: Full Body Workout");
        device.waitForTextElementAppear("Day 3: Lower Body Workout");
        device.waitForTextElementAppear("Day 4: Core Endurance");
        device.waitForTextElementAppear("Day 5: Intense Full Body Workout");
        device.waitForTextElementAppear("Day 6: Intense Lower Body");
        device.waitForTextElementAppear("Day 7: Full-Body Relaxation");
    }

    public void set_the_Reminder_present_on_page() {
        wait.wait_for_second(2);
        device.sliding("Set_a_reminder_for_hour", 0, -200);
        wait.wait_for_second(2);
        device.sliding("Set_a_reminder_for_minutes", 0, -100);
        verify.element_is_present("Activity_Label");
        element.click("sleep");
    }

    public void click_on_save_new_reminder() {
        wait.wait_for_second(2);
        element.click("save_new_reminder");
        wait.wait_for_second(10);
    }

    public void click_on_schedule_a_reminder() {
        element.click("schedule_a_reminder");

    }

    public void click_on_Rate_this_series() {
        element.click("Rate_this_series");
    }

    public void verify_and_click_on_give_the_rating_star() {
        element.click("give_the_rating");
        element.click("Search_Text_box");
        element.enter_text("Search_Text_box", "Automation");
        element.click("submit_feedback");
        String text = element.get_element_text("Thank_you");
        System.out.println("Thank you text is :" + text);
        wait.wait_for_second(2);
    }

    public void verify_and_click_workout_series() {
        device.scrollDownToBottom("Filter");
        element.click("workout_Series");
    }

    public void verify_the_pop_up_close() {
        wait.wait_for_second(1);
        verify.element_is_present("Fatloss_Series");
        String seriesName = element.get_element_text("Fatloss_Series");
        System.out.println("Series Name:" + seriesName);
        wait.wait_for_second(1);
    }

    public void verify_and_click_start_workout() {
        element.click("Start_Workout");
        wait.wait_for_second(20);
    }

    public void click_on_cancel_button() {
        try {
            wait.wait_for_second(2);
            element.click("cancel");
        } catch (Exception e) {
            System.out.println(" clicking on the cancel button not vissible");
        }
    }

    public void click_on_Step_Tracker() {
        device.scrollDownToBottom("Step_Tracker");
        element.click("Step_Tracker");
        verify.element_is_present("Activate_Google_Fit");
        element.click("Activate_Google_Fit");
    }

    public void verify_the_pop_up() {
        verify.element_is_present("google_account_pop");
    }

    public void click_on_activate_button_pop_up() {
        verify.element_is_present("Activate");
        verify.element_is_present("cancel");
        element.click("Activate");
        wait.wait_until_element_is_visible("Do_not_disturb_permission");
        wait.wait_for_second(2);
        verify.element_is_present("Do_not_disturb_permission");
    }

    public void click_on_add_to_fav_on_series_giftin_coaches() {
        wait.wait_for_second(2);
        if (verify.check_element_is_present("Add_from_favorites_list")) {
            element.click("Add_from_favorites_list");
            String toastMessage = element.get_element_text("Toast_Message");
            System.out.println("Toast message is :" + toastMessage);
            verify.element_is_present("Remove_to_Favorite_list");
            element.click("Remove_to_Favorite_list");
            String toastMessageRemoved = element.get_element_text("Toast_Message_Removed");
            System.out.println("Toast message Removed :" + toastMessageRemoved);
        } else if (verify.check_element_is_present("Remove_to_Favorite_list")) {
            element.click("Remove_to_Favorite_list");
            String toastMessageRemoved = element.get_element_text("Toast_Message_Removed");
            System.out.println("Toast message Removed :" + toastMessageRemoved);
            wait.wait_for_second(1);
            element.click("Add_from_favorites_list");
            String toastMessage = element.get_element_text("Toast_Message");
            System.out.println("Toast message is :" + toastMessage);
        } else {
            System.out.println("Neither Add_to_favorities nor Remove_from_favorites is visible.");
            throw new IllegalStateException("Expected element not found on the screen.");
        }
    }

    public void click_on_share_series_button() {
        element.click("Share_Series");
        wait.wait_for_second(5);
    }

    public void click_Do_not_show_this_again() {
        element.click("Do_not_show_this_again");
    }

    public void verify_DND_pop_up() {
        wait.wait_for_second(2);
        element.click("Dnd_mode_off");
        wait.wait_for_second(2);
        //   verify.element_is_present("Dnd_permission_required");
        verify.element_is_present("Allow");
        verify.element_is_present("Deny");
    }

    public void click_on_upper_body_workout() {
        device.scrollDownToBottom("upper_Body_Workout");
        element.click("upper_Body_Workout");
        wait.wait_for_second(20);
    }

    public void click_on_HIIT_Kebab_menu() {
        wait.wait_for_second(2);
        device.scrollDownToBottoms("Day_seven_Full_Body_Relaxation");
        wait.wait_for_second(2);
        element.click("HIIT_Kebab_menu");
    }

    public void verify_add_to_favorities_download_and_share_button_present_on_screen() {
        if (verify.check_element_is_present("Add_to_favorites")) {
            System.out.println("Add_to_favorities is displayed.");
            verify.element_is_present("Add_to_favorites");
        } else if (verify.check_element_is_present("Remove_from_favorites")) {
            element.click("Remove_from_favorites");
            wait.wait_for_second(3);
            verify.element_is_present("Add_to_favorites");
        } else {
            System.out.println("Neither Add_to_favorities nor Remove_from_favorites is visible.");
            throw new IllegalStateException("Expected element not found on the screen.");
        }
        wait.wait_for_second(2);
        if (verify.check_element_is_present("Download")) {
            System.out.println("Download is displayed.");
            verify.element_is_present("Download");
        } else if (verify.check_element_is_present("Delete_from_downloads")) {
            element.click("Delete_from_downloads");
            element.click("Delete");
            verify.element_is_present("Download");
        } else {
            System.out.println("Neither Downloads nor Delete from downloads");
        }
        wait.wait_for_second(1);
        verify.element_is_present("Share");
    }

    public void click_on_Add_to_favorites_download_and_share_button() {
        if (verify.check_element_is_present("Add_to_favorites")) {
            System.out.println("Add_to_favorities is displayed.");
            element.click("Add_to_favorites");
            String workoutAdded = element.get_element_text("workout_added");
            System.out.println("Workout Added :" + workoutAdded);
        } else if (verify.check_element_is_present("Remove_from_favorites")) {
            element.click("Remove_from_favorites");
            String workoutRemoved = element.get_element_text("workout_removed");
            System.out.println("Workout Removed :" + workoutRemoved);
            element.click("Add_to_favorites");
            String workoutAdded = element.get_element_text("workout_added");
            System.out.println("Workout Added :" + workoutAdded);
        }
        wait.wait_for_second(2);
        if (verify.check_element_is_present("Download")) {
            System.out.println("Download is displayed.");
            element.click("Download");
            wait.wait_for_second(15);
            verify.element_is_present("Delete_from_downloads");
        } else if (verify.check_element_is_present("Delete_from_downloads")) {
            element.click("Delete_from_downloads");
            element.click("Delete");
            element.click("Download");
            wait.wait_for_second(15);
            verify.element_is_present("Delete_from_downloads");
        } else {
            System.out.println("Neither Download nor Delete from downloads");
        }
        wait.wait_for_second(2);
        element.click("Share");
        wait.wait_for_second(5);
    }

    public void click_on_intense_back_pain_arrow_button() {
        device.scrollDownToBottom("Find_out_here");
        wait.wait_for_second(2);
        element.click("intense_back_pain_arrow");
        wait.wait_for_second(2);
    }

    public void verify_intense_back_pain_present_on_page() {
        verify.element_is_present("intense_back_pain_page");
        String text = element.get_element_text("intense_back_pain_page");
        System.out.println("Text is :" + text);
    }

    public void click_on_English_and_select_Hindi_language_of_drop_down() {
        wait.wait_for_second(2);
        verify.element_is_present("Read_this_blog_in_page");
        element.click("English");
        wait.wait_for_second(2);
        element.click("Hindi");
        String hindiText = element.get_element_text("intense_back_pain_hindi_text");
        System.out.println("Hindi Text is :" + hindiText);
    }

    public void click_on_trending_series_workout() {
        device.scrollDownToBottoms("supercharge_your_mind");
        verify.element_is_present("Trending_Series");
        element.click("Trending_Series");
    }

    public void verify_description_add_to_fav_download_and_share_button_trending_series() {
        wait.wait_for_second(1);
        verify.element_is_present("Trending_series_share_button");
        verify.element_is_present("Trending_series_download_button");
        verify.element_is_present("Trending_series_add_to_fav_button");
        verify.element_is_present("Trending_series_dnd_mode_off");
        verify.element_is_present("Start_Workout");
    }

    public void share_trending_workout_series() {
        element.click("Trending_series_share_button");
        wait.wait_for_second(5);
    }

    public void verify_and_click_on_add_to_favorities_button_trending_series() {
        if (verify.check_element_is_present("Trending_series_add_to_fav_button")) {
            System.out.println("Add_to_favorities is displayed.");
            element.click("Trending_series_add_to_fav_button");
            wait.wait_for_second(5);
        } else if (verify.check_element_is_present("Remove_add_to_fav_Trending_Series")) {
            element.click("Remove_add_to_fav_Trending_Series");
            element.click("Trending_series_add_to_fav_button");
            wait.wait_for_second(5);
        }
    }

    public void verify_and_click_on_download_button_trending_series() {
        wait.wait_for_second(1);
        wait.wait_until_element_is_visible("Trending_series_download_button");
        element.click("Trending_series_download_button");
        wait.wait_for_second(15);
    }

    public void verify_and_click_on_intense_back_pain_share() {
        device.scrollDownToBottom("Find_out_here");
        wait.wait_for_second(1);
        element.click("Share_intense_back_pain");
        wait.wait_for_second(5);
    }

    public void click_on_My_Downloads() {
        wait.wait_for_second(1);
        if (verify.check_element_is_present("Download")) {
            System.out.println("Download is displayed.");
            element.click("Download");
            wait.wait_for_second(15);
            verify.element_is_present("Delete_from_downloads");
        } else if (verify.check_element_is_present("Delete_from_downloads")) {
            element.click("Delete_from_downloads");
            element.click("Delete");
            element.click("Download");
            wait.wait_for_second(15);
            verify.element_is_present("Delete_from_downloads");
        }
    }

    public void verify_and_click_on_My_Downloads() {
        wait.wait_for_second(1);
        element.click("My_Downloads_on_screen");
        wait.wait_for_second(1);
        verify.element_is_present("My_Downloads_page");
        verify.element_is_present("Oops_it_looks_downloads");
    }

    public void verify_and_click_on_Add_to_favorites() {
        wait.wait_for_second(1);
        element.click("Add_to_favorites_on_screen");
        verify.element_is_present("Add_to_favorites_screen");
        String workout = element.get_element_text("Add_to_favorites_workout");
        System.out.println("Workout is " + workout);
    }
    public void enter_Full_Body_Workout_in_search_text_field() {
        enter_data_in_search_box("Full_Body");
        wait.wait_for_second(2);
        androidDriver.hideKeyboard();
        verify.element_is_present("Intense_Full_Body_Workout");
        verify.element_is_present("Full_Body_Workout");
        device.scrollDownToBottom("full_body_HIIT");
        verify.element_is_present("full_body_HIIT");
    }
    public void enter_PCOD_in_search_text_field() {
        enter_data_in_search_box("PCOD");
        wait.wait_for_second(2);
        androidDriver.hideKeyboard();
        verify.element_is_present("PCOD_Series");
    }

}

