package mobile.object_repository.Hamburger_Menu;
import io.appium.java_client.android.AndroidDriver;
import io.unity.performaction.automob.Device;
import io.unity.performaction.autoweb.Alert;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hamburger_Menu_Page {
    WebDriver driver = null;
    Element element = null;
    Verify verify = null;
    Wait wait = null;
    AndroidDriver androidDriver = null;
    Device device = null;
    Alert alert = null;

    public Hamburger_Menu_Page(WebDriver driver) {
        this.driver = driver;
        element = new Element(driver);
        verify = new Verify(driver);
        wait = new Wait(driver);
        androidDriver = (AndroidDriver) driver;
        device = new Device(androidDriver);
        alert = new Alert(driver);
    }
    public void verify_and_click_on_hamburger_menu(){
        wait.wait_for_second(2);
        verify.element_is_present("Hamburger_Menu");
        element.click("Hamburger_Menu");
    }
    public void verify_options_present_on_hamburger_menu(){
        wait.wait_for_second(2);
        verify.element_is_present("Manage_subscription");
        verify.element_is_present("Favorites");
        verify.element_is_present("Downloads");
        verify.element_is_present("Activity_History_Details");
        verify.element_is_present("Gift_a_Subscription");
        verify.element_is_present("Settings");
        verify.element_is_present("Support");
        device.scrollDownToBottoms("Logout");
        verify.element_is_present("Logout");
        verify.element_is_present("Refer_and_earn");
        verify.element_is_present("Reminder");
        verify.element_is_present("Rate_us");
    }
    public void verify_and_click_on_View_Profile(){
        verify.element_is_present("View_Profile");
        element.click("View_Profile");
    }
    public void verify_Edit_Profile_present_on_page(){
        wait.wait_for_second(1);
        verify.element_is_present("Edit_Profile");
    }
    public void verify_delete_and_help_support_present_on_page(){
        device.scrollDownToBottoms("Help_and_Support");
        verify.element_is_present("Delete_Account");
        verify.element_is_present("Help_and_Support");
    }
    public void click_on_Manage_subscription() {
        wait.wait_for_second(2);
        element.click("Manage_subscription");
        wait.wait_for_second(2);
    }
    public void verify_my_subscription_screen_present_on_page(){
        wait.wait_for_second(2);
        verify.element_is_present("My_subscription");
        verify.element_is_present("Subscription_Details");
        verify.element_is_present("Explore_all_plans");
        verify.element_is_present("Cancel_Subscription");
    }
    public void click_on_Favorites(){
        wait.wait_for_second(2);
        element.click("Favorites");
    }
    public void verify_Favorites_screen_present_on_page(){
        wait.wait_for_second(2);
        verify.element_is_present("Favorites");
        String text= element.get_element_text("Recently_Added");
        System.out.println("Text is :"+ text);
        String Song= element.get_element_text("Recently_Added_Song");
        System.out.print("Recently Added Song is :"+ Song);
    }
    public void click_on_navigate_back_button(){
        wait.wait_for_second(2);
        element.click("Navigate_back");
    }
    public void click_on_downloads_button(){
        wait.wait_for_second(2);
        element.click("Downloads");
    }
    public void verify_downloads_screen_present_on_page(){
        wait.wait_for_second(2);
        verify.element_is_present("My_Downloads");

    }
    public void click_on_Gift_a_Subscription_on_page(){
        wait.wait_for_second(2);
        verify.element_is_present("Gift_a_Subscription");
        element.click("Gift_a_Subscription");
    }
    public void verify_on_Gift_a_Premium_on_page(){
        wait.wait_for_second(2);
        verify.element_is_present("Gift_a_Premium");
        verify.element_is_present("Choose_a_Plan");
        verify.element_is_present("For_Corporate_Partnership");
        verify.element_is_present("Got_a_coupon_code");
        verify.element_is_present("Continue");
    }
    public void click_on_the_select_the_quantity_for_gift_mindfulness_screen(){
        wait.wait_for_second(2);
        element.click("select_five_quantity");
        wait.wait_for_second(2);
        String priceQuantity= element.get_element_text("five_quantity_price");
        System.out.println("Price is for five quantity :"+ priceQuantity);
        wait.wait_for_second(2);
        element.click("select_one_quantity");
        wait.wait_for_second(2);
        String oneQuantityPrice= element.get_element_text("one_quantity_price");
        System.out.println("Price is for one quantity :"+ oneQuantityPrice);
    }
    public void click_on_For_Corporate_Partnerships(){
        wait.wait_for_second(2);
        element.click("For_Corporate_Partnerships_Right_Arrow");
        wait.wait_for_second(2);
    }
    public void click_on_Got_a_coupon_code_Right_Arrow(){
        wait.wait_for_second(2);
        element.click("Got_a_coupon_code_Right_Arrow");
        wait.wait_for_second(2);
    }
    public void verify_Redeem_your_gift_card_screen(){
        wait.wait_until_element_is_visible("Redeem_your_gift_card");
        verify.element_is_present("Redeem_your_gift_card");
    }
    public void click_on_My_Purchases(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("My_Purchases");
        verify.element_is_present("My_Purchases");
        element.click("My_Purchases");
    }
    public void verify_the_Your_Purchase_History_screen(){
      wait.wait_for_second(2);
      wait.wait_until_element_is_visible("Your_Purchase_History");
      verify.element_is_present("Your_Purchase_History");
      verify.element_is_present("Gift_Level_Super_Mind_Premium_now");

    }
    public void click_on_Settings_sub_menu(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Settings");
        verify.element_is_present("Settings");
        element.click("Settings");
    }
    public void verify_the_options_on_Setting_Page(){
        wait.wait_for_second(2);
        verify.element_is_present("Settings");
        verify.element_is_present("Notifications");
        verify.element_is_present("Terms_and_Conditions");
        verify.element_is_present("Privacy_Policy");
        verify.element_is_present("Connect_with_us_on_Social");
            element.click("Notifications");
            wait.wait_for_second(2);
            performNavigateBack(1);
            verify.element_is_present("Settings");
            wait.wait_for_second(2);
            element.click("Terms_and_Conditions");
            wait.wait_for_second(2);
            performNavigateBack(1);
            verify.element_is_present("Settings");
            wait.wait_for_second(2);
            element.click("Privacy_Policy");
            wait.wait_for_second(2);
            performNavigateBack(1);
            verify.element_is_present("Settings");
            wait.wait_for_second(2);
            element.click("Connect_with_us_on_Social");
        }

    public void performNavigateBack(int count) {
        for (int j = 0; j < count; j++) {
            element.click("Navigate_back");
            wait.wait_for_second(1);
        }
    }
    public void click_on_Support_sub_menu(){
        wait.wait_for_second(2);
        element.click("Support");
        wait.wait_for_second(3);
    }
    public void click_on_Refer_and_earn(){
        wait.wait_for_second(2);
        device.scrollDownToBottom("Logout");
        element.click("Refer_and_earn");
        wait.wait_for_second(2);
        verify.element_is_present("Rewards_button");
        verify.element_is_present("My_Referrals");
    }
    public void click_on_enter_your_code_here(){
        wait.wait_for_second(2);
        element.click("Enter_your_code_here_text_field");
        element.enter_text("Enter_code","1234");
        androidDriver.hideKeyboard();
    }
    public void verify_the_toast_message(){
        String toastMessage= element.get_element_text("invalid_referral_code");
        System.out.print("Toast message is :"+ toastMessage);
    }
    public void verify_and_click_on_Reward_History_Page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Reward_History");
        element.click("Reward_History");
        verify.element_is_present("You_have_no_cash_back_reward_yet");
    }
    public void click_on_Invite_a_friend(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("invite_a_friend");
        element.click("invite_a_friend");
        wait.wait_for_second(5);
    }
    public void click_on_Reminder_present_on_page(){
        wait.wait_for_second(2);
        device.scrollDownToBottoms("Logout");
        element.click("Reminder");
        wait.wait_for_second(2);
        verify.element_is_present("Reminder_Screen");
        element.click("Add_a_new_reminder");
    }
    public void set_the_Reminder_present_on_page(){
        wait.wait_for_second(2);
        device.sliding("Set_a_reminder_for_hour",0,-200);
        wait.wait_for_second(2);
        device.sliding("Set_a_reminder_for_minutes",0,-100);
        verify.element_is_present("Activity_Label");
        element.click("sleep");
    }
    public void click_on_save_new_reminder(){
        wait.wait_for_second(2);
        element.click("save_new_reminder");
        wait.wait_for_second(10);
    }
    public void click_on_Rate_us_page(){
        device.scrollDownToBottom("Logout");
        element.click("Rate_us");
        wait.wait_for_second(5);
    }
    public void click_on_Logout_button_present_on_page(){
        device.scrollDownToBottoms("Logout");
        element.click("Logout");
    }
    public void verify_the_logout_pop_up_present_on_screen(){
        wait.wait_for_second(2);
        verify.element_is_present("Are_you_sure");
        verify.element_is_present("Log_out_button");
        verify.element_is_present("Stay_Logged_in");
    }
    public void click_the_logout_pop_up_present_on_screen(){
        wait.wait_for_second(2);
        element.click("Log_out_button");
        verify.element_is_present("Get_Started");
    }
    public void click_on_stay_logged_in(){
        wait.wait_for_second(2);
        element.click("Stay_Logged_in");
        String name= element.get_element_text("Hi_name");
        System.out.print("Name is :"+ name);
    }
    public void click_on_view_profile(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("View_Profile");
        element.click("View_Profile");
    }
    public void verify_and_click_on_edit_profile_screen(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Edit_Profile");
        verify.element_is_present("Edit_Profile");
        element.click("Edit_Profile");
    }
    public void click_on_name_email_id_phone_and_enter_the_data(int index,  String textToEnter){
      try {
          wait.wait_for_second(2);
          WebElement textFiled = androidDriver.findElement(By.xpath("//android.widget.EditText[" + index + "]"));
          textFiled.click();
          textFiled.clear();
          textFiled.sendKeys(textToEnter);
          androidDriver.hideKeyboard();
      }catch (Exception e){
          System.out.println("Failed to handle the text filed");
      }
    }
    public void enter_the_value_in_name_email_id_phone_text_filed(){
        click_on_name_email_id_phone_and_enter_the_data(1,"Zeel");
        click_on_name_email_id_phone_and_enter_the_data(2,"zeel@gmail.com");
        click_on_name_email_id_phone_and_enter_the_data(3,"8000332637");
    }
    public void verify_and_click_on_select_your_gender(){
        wait.wait_for_second(2);
        device.scrollDownToBottoms("other");
        element.click("Female");
        element.click("Male");
    }
    public void verify_and_click_on_save_button_of_edit_profile(){
        element.click("save_button");
        String profileUpdated= element.get_element_text("Profile_updated_successfully");
       System.out.println("Profile updated successfully :"+ profileUpdated);
    }
    public void click_on_verify_your_email_id(){
       wait.wait_for_second(2);
       element.click("verify_your_email_id");
    }
    public void verify_otp_screen_present_on_page(){
        wait.wait_for_second(2);
        verify.element_is_present("verify_otp_screen");
    }
    public void verify_and_click_on_view_more_activity_details(){
        device.scrollDownToBottom("Help_and_Support");
        element.click("view_more_activity_details");
    }
    public void verify_activity_history_details_present_on_page(){
        wait.wait_for_second(2);
     //   verify.element_is_present("Activity_History");
        String year= element.get_element_text("Month_Year");
        System.out.println("Year of the Month:" + year);
        String historyMessage= element.get_element_text("Oops_it_seems");
        System.out.println("History Message:" + historyMessage);
    }
    public void click_on_refer_and_win(){
        performNavigateBack(1);
        wait.wait_for_second(2);
        element.click("refer_and_win");
        wait.wait_for_second(5);
    }
    public void verify_and_click_on_Delete_Account_and_pause_my_account(){
       device.scrollDownToBottom("Help_and_Support");
       element.click("Delete_Account");
       verify.element_is_present("pause_my_account");
       verify.element_is_present("Delete_my_account");
       element.click("pause_my_account");
       verify.element_is_present("Get_Started");
    }
    public void verify_and_click_on_Delete_Account_and_delete_my_account(){
        device.scrollDownToBottom("Help_and_Support");
        element.click("Delete_Account");
        element.click("Delete_my_account");
        verify.element_is_present("Delete_Account_Page");
        verify.element_is_present("I_have_found_other_app");
        verify.element_is_present("level_app_takes_a_lot");
        verify.element_is_present("I_have_Privacy_concerns");
        verify.element_is_present("I_have_a_different_reason");
    }


    public void click_on_How_it_works_link_on_page(){
        wait.wait_for_second(2);
        element.click("How_it_works");
    }
    public void verify_the_things_inside_the_pop_up(){
        wait.wait_for_second(3);
        verify.element_is_present("Select_Quantity");
        wait.wait_for_second(2);
        device.horizontalScrollRightToTexts("Customize_your_cards");
        wait.wait_for_second(2);
        verify.element_is_present("Customize_your_cards");
        wait.wait_for_second(2);
        device.horizontalScrollRightToTexts("Complete_Payment");
        wait.wait_for_second(2);
        verify.element_is_present("Complete_Payment");
        wait.wait_for_second(2);
        device.horizontalScrollRightToTexts("Share_your_Gift_Cards");
        wait.wait_for_second(2);
        verify.element_is_present("Share_your_Gift_Cards");
        wait.wait_for_second(2);
        device.horizontalScrollRightToTexts("Redeem");
        verify.element_is_present("Redeem");
    }
}

