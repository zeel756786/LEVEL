package mobile.tests.Insights;

import io.unity.framework.init.base;
import io.unity.framework.remotegrid.LambdaTestConfig;
import mobile.object_repository.Insights.Insights_Page;
import mobile.object_repository.Onboarding.signin_page;
import org.testng.annotations.Test;

import java.time.Duration;

public class Insights_Test extends base {

    @Test()
    public void Verify_that_the_user_tap_on_the_Insights_footer_menu_INSGT_001() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Insights footer menu.");
        //  Verify that the user tap on the "League" tab of the Insights screen._INSGT_002
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Insights_Page insights_page = new Insights_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        insights_page.click_on_Insights_menu();
        insights_page.verify_League_present_on_page();
        insights_page.verify_My_activity_present_on_page();
        insights_page.click_League_present_on_page();
        insights_page.verify_user_see_slider_card_details();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_I_icon_of_the_League_of_SuperMinds_on_the_Insights_screen_INSGT_003() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the I icon of the League of SuperMinds on the Insights screen.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Insights_Page insights_page = new Insights_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        insights_page.click_on_Insights_menu();
        insights_page.click_on_i_button_of_league_of_super_mind();
        insights_page.user_see_the_pop_up_contains_the_i_button_of_league_of_super_mind();
    }
    @Test()
    public void Verify_that_the_user_see_the_timer_for_the_Current_league_ends_in_INSGT_004(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user see the timer for the Current league ends in.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Insights_Page insights_page = new Insights_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_My_activity_tab_INSGT_005(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the My activity tab.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Insights_Page insights_page = new Insights_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        insights_page.click_on_Insights_menu();
        insights_page.click_on_My_activity_present_on_page();
        insights_page.verify_the_my_activity_screen_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_icon_beside_the_Streak_on_the_My_activity_tab_INSGT_006(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the icon beside the Streak on the My activity tab.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Insights_Page insights_page = new Insights_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        insights_page.click_on_Insights_menu();
        insights_page.click_on_My_activity_present_on_page();
        insights_page.click_on_i_button_of_league_of_super_mind();
        insights_page.user_see_the_pop_up_contains_of_streak_freeze_and_how_it_work_and_often_can_you_it();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_View_Activity_History_on_the_My_activity_tab_INSGT_007(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the View Activity History on the My activity tab.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Insights_Page insights_page = new Insights_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        insights_page.click_on_Insights_menu();
        insights_page.click_on_My_activity_present_on_page();
    }
    @Test()
    public void Verify_that_the_user_tap_on_the_Set_reminders_on_the_My_activity_tab_INSGT_008(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("Verify that the user tap on the Set reminders on the My activity tab.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Insights_Page insights_page = new Insights_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        insights_page.click_on_Insights_menu();
        insights_page.click_on_My_activity_present_on_page();
        insights_page.click_on_set_reminder();
        insights_page.click_on_Reminder_present_on_page();
        insights_page.set_the_Reminder_present_on_page();
        insights_page.click_on_save_new_reminder();
    }
}
