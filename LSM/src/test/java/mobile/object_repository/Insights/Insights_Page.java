package mobile.object_repository.Insights;

import io.appium.java_client.android.AndroidDriver;
import io.unity.performaction.automob.Device;
import io.unity.performaction.autoweb.Alert;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Insights_Page {
    WebDriver driver = null;
    Element element = null;
    Verify verify = null;
    Wait wait = null;
    AndroidDriver androidDriver = null;
    Device device = null;
    Alert alert = null;

    public Insights_Page(WebDriver driver) {
        this.driver = driver;
        element = new Element(driver);
        verify = new Verify(driver);
        wait = new Wait(driver);
        androidDriver = (AndroidDriver) driver;
        device = new Device(androidDriver);
        alert = new Alert(driver);
    }
    public void click_on_Insights_menu(){
        wait.wait_for_second(2);
        element.click("Insights");
    }
    public void verify_League_present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("League");
        verify.element_is_present("League");
    }
    public void click_League_present_on_page(){
        element.click("League");
    }
    public void verify_My_activity_present_on_page(){
        wait.wait_until_element_is_visible("My_activity");
        verify.element_is_present("My_activity");
    }
    public void click_on_My_activity_present_on_page(){
        wait.wait_for_second(2);
        element.click("My_activity");
    }
    public void verify_user_see_slider_card_details(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Introducing_leagues_boost_your_daily_activity");
        verify.element_is_present("Introducing_leagues_boost_your_daily_activity");
        device.horizontalScrollRightToTexts("complete_activities_to_advance_to_the_next_league");
        wait.wait_for_second(2);
        verify.element_is_present("complete_activities_to_advance_to_the_next_league");
        wait.wait_for_second(2);
        device.horizontalScrollRightToTexts("complete_daily_activities_to_stay_in_the_qualifying_zone");
        wait.wait_for_second(2);
        verify.element_is_present("complete_daily_activities_to_stay_in_the_qualifying_zone");
    }
    public void click_on_i_button_of_league_of_super_mind(){
        wait.wait_for_second(2);
        element.click("i_button_of_League_of_super_Mind");

    }
    public void user_see_the_pop_up_contains_the_i_button_of_league_of_super_mind(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("what_are_leagues");
        verify.element_is_present("what_are_leagues");
        String leagueText= element.get_element_text("Leagues_are_the_new_xp_leaderboard");
        System.out.println("League text is :"+ leagueText);
        device.sliding("what_are_leagues",-800,0);
        //device.horizontalScrollRightToTexts("How_it_works");
        verify.element_is_present("How_it_works");
        String workText= element.get_element_text("Each_league_has_thirty_participants_complete_activities");
        System.out.println("Work text is :"+ workText);
        wait.wait_for_second(1);
        device.sliding("How_it_works",-800,0);
        //  device.horizontalScrollRightToTexts("Ready_for_the_big_Leagues");
        wait.wait_for_second(1);
        verify.element_is_present("Ready_for_the_big_Leagues");
    }
    public void verify_the_my_activity_screen_present_on_page(){
        wait.wait_for_second(2);
        verify.element_is_present("My_activity");
        verify.element_is_present("Streak");
        verify.element_is_present("you_have_out_of_streak_freeze_available");
        verify.element_is_present("current_streak");
        String currentStreak= element.get_element_text("current_streak_count");
        System.out.println("Current streak is :"+ currentStreak);
        verify.element_is_present("Highest_streak");
        String highestStreak= element.get_element_text("Highest_streak_count");
        System.out.println("Highest streak is :"+ highestStreak);
        device.scrollDownToBottom("Time_spent_on_your_practice");
        wait.wait_for_second(1);
        verify.element_is_present("Time_spent_on_your_practice");
        verify.element_is_present("Set_reminders");
        verify.element_is_present("your_average_number_of_activities_dropped");
        wait.wait_for_second(1);
        verify.element_is_present("weekly_comparison");

    }
    public void verify_the_super_charge_your_mind_in_my_activity_screen_present_on_page(){
        device.scrollDownToBottom("Mindful_days_this_week");
        wait.wait_for_second(1);
        verify.element_is_present("Mindful_days_this_week");
        device.scrollDownToBottom("your_league_ranking");
        verify.element_is_present("your_league_ranking");
        wait.wait_for_second(1);
        device.scrollDownToBottom("super_charge_your_mind");
        verify.element_is_present("My_Statistics");
        verify.element_is_present("Meditations");
        verify.element_is_present("Session");
        String sessionCount= element.get_element_text("Session_count");
        System.out.println("Session count is :"+ sessionCount);
    }


    public void user_see_the_pop_up_contains_of_streak_freeze_and_how_it_work_and_often_can_you_it(){
        wait.wait_for_second(2);
        verify.element_is_present("what_is_streak_freeze");
        String featureText = element.get_element_text("It_is_a_feature");
        System.out.println("Feature text is :"+ featureText);
        wait.wait_for_second(1);
        device.horizontalScrollRightToTexts("How_it_works");
        verify.element_is_present("How_it_works");
        verify.element_is_present("image");
        String frozenText= element.get_element_text("click_on_the_Frozen_icon");
        System.out.println("Frozen text is :"+ frozenText);
        wait.wait_for_second(1);
        device.horizontalScrollRightToTexts("How_often_can_you_see_it");
        verify.element_is_present("How_often_can_you_see_it");
    }
    public void click_on_view_activity_history(){
        wait.wait_for_second(2);
        device.scrollDownToBottom("Set_reminders");
        wait.wait_for_second(2);
        element.click("view_activity_history");
    }
    public void click_on_set_reminder(){
        wait.wait_for_second(2);
        device.scrollDownToBottom("Set_reminders");
        element.click("Set_reminders");
    }
    public void click_on_Reminder_present_on_page(){
        verify.element_is_present("Reminder_Screen");
        element.click("Add_a_new_reminder");
    }
    public void set_the_Reminder_present_on_page(){
        wait.wait_for_second(2);
        device.sliding("Set_a_reminder_for_hour",0,-200);
        wait.wait_for_second(2);
        device.sliding("Set_a_reminder_for_minutes",0,-100);
        element.click("sleep");
    }
    public void click_on_save_new_reminder(){
        wait.wait_for_second(2);
        element.click("save_new_reminder");
        String time= element.get_element_text("time_of_reminder");
        System.out.println("Time is :"+ time);
        wait.wait_for_second(5);
    }
    public void verify_the_current_league_ends_in_page() {
        wait.wait_for_second(2);
        device.scrollDownToBottom("current_league_ends_in");
        verify.element_is_present("current_league_ends_in");
    }
    public void printRemainingTime() {
        try {
            List<WebElement> timeElements = androidDriver.findElements(By.xpath("//android.widget.TextView[@text='Current league ends in:']/following-sibling::android.widget.TextView"));

            for (int i = 0; i <=timeElements.size()-1; i++) {
                if (i==13) {
                    System.out.print("#");
                    continue;
                }
                {
                    WebElement timeElement = timeElements.get(i);
                    String timeValue = timeElement.getText();
                    System.out.print(timeValue);
                }

            }
        }

        catch (Exception e) {
            System.out.println("Error extracting the time: " + e.getMessage());
        }
    }
    public void printRemainingSceond() {
        try {
            // Find the elements that hold the time components
            WebElement daysElement = androidDriver.findElement(By.xpath("//android.widget.TextView[@text=\"4\"]"));
            wait.wait_for_second(2);
            WebElement hoursElement = androidDriver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]"));
            wait.wait_for_second(2);
            WebElement minutesElement = androidDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Sec\"]"));
            wait.wait_for_second(2);
            // Extract the text from each element
            String days = daysElement.getText();
            String hours = hoursElement.getText();
            String minutes = minutesElement.getText();

            // Print the remaining time in the format dd:hh:mm:ss
            System.out.println("Remaining Time: " + days + ":" + hours + ":" + minutes );

        } catch (Exception e) {
            System.out.println("Error extracting the time: " + e.getMessage());
        }
    }

    public void Verify_month_of_history(){
        wait.wait_for_second(2);
        verify.element_is_present("month_of_history");
        String month= element.get_element_text("month_of_history");
        System.out.println("month_of_history :"+ month);
        wait.wait_for_second(5);
    }
    public void Verify_reminder_screen(){
        wait.wait_for_second(2);
        verify.element_is_present("Reminder_Screen");
    }

}
