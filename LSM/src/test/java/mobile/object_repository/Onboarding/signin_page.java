package mobile.object_repository.Onboarding;

import com.github.javafaker.Faker;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.unity.performaction.automob.Device;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;


public class signin_page {

    WebDriver driver = null;
    Element element = null;
    Verify verify = null;
    Wait wait = null;
    AndroidDriver androidDriver = null;
    Device device = null;
    public signin_page(WebDriver driver) {
        this.driver = driver;
        element = new Element(driver);
        verify = new Verify(driver);
        wait = new Wait(driver);
        androidDriver = (AndroidDriver) driver;
        device = new Device(androidDriver);
    }
    public void wait_for_ten_second(){
        wait.wait_for_second(10);
    }
    public void enterTextInSpecificTextBox(String text, int textBoxIndex) {
        try {

            List<WebElement> textBoxes = androidDriver.findElements(AppiumBy.className("android.widget.EditText"));


            if (textBoxes.size() > textBoxIndex) {

                textBoxes.get(textBoxIndex).sendKeys(text);

                androidDriver.hideKeyboard();
            } else {
                System.out.println("There are less than " + (textBoxIndex + 1) + " text boxes on the screen.");
            }

        } catch (Exception e) {
            System.out.println("Error entering text: " + e.getMessage());
        }
    }
    public void verify_get_started_button_present_on_page(){
        wait.wait_until_element_is_visible("Get_started");
        verify.element_is_present("Get_started");
        System.out.println("Element 'get_started' is visible.");
    }
    public void verify_and_click_on_started_button_present_on_page(){
        wait.wait_until_element_is_visible("Get_started");
        element.click("Get_started");
    }

    public void verify_welcome_to_level_supermind() {
            wait.wait_until_element_is_visible("welcome_to_level_supermind");
            verify.element_is_present("welcome_to_level_supermind");
            System.out.println("Element 'welcome_to_level_supermind' is visible.");
    }


    public void verify_learn_from_experts() {
        wait.wait_until_element_is_visible("learn_from_experts");
        verify.element_is_present("learn_from_experts");
        System.out.println("Element 'learn_from_experts. is visible.");
    }

    public void verify_meditation() {
        wait.wait_until_element_is_visible("meditation");
        verify.element_is_present("meditation");
        System.out.println("Element 'meditation. is visible.");
    }

    public void verify_workouts() {
        wait.wait_until_element_is_visible("workouts");
        verify.element_is_present("workouts");
        System.out.println("Element 'workouts. is visible.");
    }

    public void verify_sleep() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("sleep_menu");
        verify.element_is_present("sleep_menu");
        System.out.println("Element 'sleep. is visible.");
    }

    public void click_on_sleep_tab_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("sleep");
        element.click("sleep");
    }

    public void verify_sign_in_button_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("sign_in");
        verify.element_is_present("sign_in");
    }
    public void verify_sign_in_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("sign_in_page");
        verify.element_is_present("sign_in_page");
    }

    public void click_sign_in_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("sign_in");
        element.click("sign_in");
    }

    public void verify_phone_text_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("phone");
        verify.element_is_present("phone");
    }

    public void verify_email_text_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("email");
        verify.element_is_present("email");
    }

    public void click_email_text_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("email");
        element.click("email");
    }

    public void click_and_enter_text_on_phone_no() {
        wait.wait_for_second(2);
        element.click("enter_mobile_no");
        wait.wait_for_second(5);

    }
    public void click_and_enter_text_on_email_id() {
        wait.wait_for_second(2);
        element.click("enter_email_id");
        wait.wait_for_second(5);
    }
    public void verify_and_click() {
        wait.wait_for_second(2);
        element.click("enter_email_id");
        wait.wait_for_second(5);
    }

    public void enter_random_mobile_number(int index) {
        Faker faker = new Faker();
        String fixedFiveDigitNumber = "97528";
        String randomFiveDigitNumber = faker.number().digits(5);
        String completeNumber = fixedFiveDigitNumber + randomFiveDigitNumber;
        List<WebElement> textFields = androidDriver.findElements(By.className("android.widget.EditText"));
        if (index >= 0 && index < textFields.size()) {
            WebElement numberTextField = textFields.get(index);
            numberTextField.click();
            numberTextField.sendKeys(completeNumber);
            androidDriver.hideKeyboard();
            System.out.println("10-digit number (first 5 fixed, last 5 random) in mobile : " + completeNumber);
        } else {
            System.out.println("Invalid index: " + index + " No such text field found ");
        }

    }

    public void verify_and_click_on_right_arrow() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("right_arrow");
        verify.element_is_enable("right_arrow");
        element.click("right_arrow");
    }

    public void click_on_enter_the_code_text_field() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("enter_the_code_text_box");
        element.click("enter_the_code_text_box");
        wait.wait_for_second(5);
    }
    public void verify_customise_your_experience_text() {
        try {
            wait.wait_for_second(2);
            wait.wait_until_element_is_visible("customise_your_experience");
            verify.element_is_present("customise_your_experience");
            System.out.println("Element 'customise_your_experience' is visible and present.");
        } catch (Exception e) {
            System.out.println("'customise_your_experience_page_not_displayed_user_is_on_Home_Page' element: " + e.getMessage());
        }
    }


    public void verify_tell_us_about_yourself_text() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("tell_us_about_yourself");
    }

    public void click_and_enter_your_name() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("your_name_text_field");
        element.click("your_name_text_field");
    }

    public void click_and_enter_your_email() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("your_email_text_field");
        element.click("your_email_text_field");
    }

    public void click_and_enter_your_email_or_mobile(boolean isEmail) {
        wait.wait_for_second(2);

        if (isEmail) {
            wait.wait_until_element_is_visible("your_email_text_field");
            element.click("your_email_text_field");
        } else {

            wait.wait_until_element_is_visible("your_phone_number");
            element.click("your_phone_number");
        }
    }

    public void verify_gender_text() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("gender");
    }

    public void verify_male_text() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("male");
    }

    public void verify_and_click_female_checkbox() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("female");
        element.click("female");
    }

    public void verify_other_text() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("other");
    }

    public void verify_text_i_agree_to_receive_marketing_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("i_agree_to_receive_marketing");
    }

    public void verify_text_i_agree_to_terms_and_conditions_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("i_agree_to_the_terms_and_conditions");
    }

    public void verify_text_invalid_otp_present_on_page() {
        wait.wait_until_element_is_visible("invalid_otp");
        verify.element_text_is_equal_to("invalid_otp", "Invalid OTP");
        System.out.println("invalid OTP");
    }

    public void verify_text_please_fill_all_the_details() {
        wait.wait_until_element_is_visible("please_fill_all_the_details");
        verify.element_is_enable("please_fill_all_the_details");
        //  verify.element_is_present("please_fill_all_the_details");
        System.out.println("please fill all the details");
    }

    public void verify_text_got_a_referral_code_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("got_a_referral_code");
    }

    public void verify_text_what_type_of_meditations_are_you_looking_for_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("what_type_of_meditations_are_you_looking_for");
    }

    public void verify_stress_and_anxiety_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("stress_and_anxiety");
    }

    public void verify_focus_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("focus");
    }

    public void verify_productivity_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("productivity");
    }

    public void verify_relaxation_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("anger");
    }

    public void click_on_stress_and_anxiety() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("stress_and_anxiety");
        element.click("stress_and_anxiety");
    }
    public void click_on_focus_and_productivity() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("focus_and_productivity");
        element.click("focus_and_productivity");
    }
    public void verify_and_click_on_Relaxation() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Relaxation");
        element.click("Relaxation");
    }

    public void verify_text_what_are_you_looking_for_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("what_are_you_looking_for");
        verify.element_is_present("what_are_you_looking_for");
    }

    public void verify_text_stress_relief_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("stress_relief");
    }

    public void verify_text_better_sleep_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("better_sleep");
    }

    public void verify_text_personal_growth_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("personal_growth");
    }

    public void verify_text_spiritual_growth_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("spiritual_growth");
    }

    public void click_on_stress_relief() {
        wait.wait_for_second(2);
        element.click("stress_relief");
    }
    public void click_on_show_now_present_on_page(){
        try {
            wait.wait_until_element_is_visible("shop_now");
            element.click("shop_now");
        }
        catch (Exception e)
        {
            System.out.println("LSM Shop not found");
        }
    }


    public void click_on_navigate_back_button_present_on_page() {
        try {
            wait.wait_until_element_is_visible("navigate_back");
            element.click("navigate_back");
        }
        catch (Exception e)
        {
            System.out.println("Navigate back not found");
        }
    }

    public void verify_how_your_free_trail_works_text_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("how_your_free_trail_works");
        verify.element_is_present("how_your_free_trail_works");
    }
    public void verify_and_click_start_my_free_trial() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("start_my_free_trial");
        verify.element_is_present("start_my_free_trial");
        element.click("start_my_free_trial");
    }

    public void click_on_cross_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("cross_button");
        element.click("cross_button");
    }

    public void verify_you_ll_lose_out_on_this_offer_text_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("you_ll_lose_out_on_this_offer");
    }

    public void click_on_i_ll_lose_out_on_the_offer() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("i_ll_lose_out_on_the_offer");
        element.click("i_ll_lose_out_on_the_offer");
    }

    public void verify_i_ll_lose_out_on_the_offer_text_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("i_ll_lose_out_on_the_offer");
        element.click("i_ll_lose_out_on_the_offer");
    }

    public void verify_name_text_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("name_verify");
    }

    public void verify_continue_playing_text_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("continue_playing");
    }

    public void verify_meditation_tab_button_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("meditation_tab");
    }

    public void verify_and_click_sleep_tab_button_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("sleep_tab");
        element.click("sleep_tab");
    }

    public void verify_today_tab_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("today_tab");
    }

    public void verify_body_tab_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("body_tab");
    }

    public void verify_insights_tab_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("insights_tab");
    }

    public void click_on_menu_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("menu");
        element.click("menu");
    }

    public void click_on_logout_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Logout");
        element.click("Logout");
    }

    public void scroll_down_to_the_bottom(String Text) {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"" + Text + "\"));"));
    }

    public void verify_are_you_sure_page_display() {
        wait.wait_until_element_is_visible("are_you_sure");
    }

    public void click_on_are_you_sure_logout_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("are_you_sure_logout");
        element.click("are_you_sure_logout");
    }
    public void verify_and_click_on_view_profile() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("view_profile");
        element.click("view_profile");
    }
    public void verify_and_click_on_edit_profile() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("edit_profile");
        element.click("edit_profile");
    }
    public void verify_back_arrow_button_present_on_page() {
        wait.wait_until_element_is_visible("back_arrow_button");
    }
    public void verify_and_click_on_back_arrow_button_present_on_page() {
        wait.wait_until_element_is_visible("back_arrow_button");
        element.click("back_arrow_button");
    }
    public void verify_longest_streak_present_on_page() {
        wait.wait_until_element_is_visible("longest_streak");
    }
    public void verify_total_xp_present_on_page() {
        wait.wait_until_element_is_visible("total_xp");
    }
    public void verify_total_activities_on_page() {
        wait.wait_until_element_is_visible("total_activities");
    }
    public void verify_and_click_on_delete_account() {
        wait.wait_until_element_is_visible("delete_account");
        element.click("delete_account");
    }
    public void verify_and_click_on_delete_my_account() {
        wait.wait_until_element_is_visible("delete_my_account");
        element.click("delete_my_account");
    }
    public void verify_we_are_really_sad_to_see_you_go_present_on_page() {
        wait.wait_until_element_is_visible("we_are_really_sad_to_see_you_go");
    }
    public void verify_and_click_on_i_ve_found_other_apps_to_achieve_my_goals_present_on_page() {
        wait.wait_until_element_is_visible("i_ve_found_other_apps_to_achieve_my_goals");
        element.click("i_ve_found_other_apps_to_achieve_my_goals");
    }
    public void verify_and_click_delete_Account() {
        wait.wait_until_element_is_visible("Delete_Account");
        element.click("Delete_Account");
    }
    public void verify_and_click_on_i_agree_receive_marketing() {
        wait.wait_for_second(1);
        wait.wait_until_element_is_visible("check_box_of_I_agree_receive_marketing");
        element.click("check_box_of_I_agree_receive_marketing");
        wait.wait_for_second(1);
        element.click("check_box_of_I_agree_receive_marketing");
    }
    public void verify_and_uncheck_on_i_agree_receive_marketing() {
        wait.wait_for_second(1);
        wait.wait_until_element_is_visible("check_box_of_I_agree_receive_marketing");
        element.click("check_box_of_I_agree_receive_marketing");
    }
    public void verify_and_click_on_i_agree_terms_and_conditions() {
        wait.wait_for_second(1);
        wait.wait_until_element_is_visible("check_box_of_I_agree_to_the_terms_and_conditions");
        element.click("check_box_of_I_agree_to_the_terms_and_conditions");
        wait.wait_for_second(1);
        element.click("check_box_of_I_agree_to_the_terms_and_conditions");
    }
    public void verify_and_uncheck_on_i_agree_terms_and_conditions() {
        wait.wait_until_element_is_visible("check_box_of_I_agree_to_the_terms_and_conditions");
        element.click("check_box_of_I_agree_to_the_terms_and_conditions");
    }
    public void verify_the_thank_you_present_on_page() {
        wait.wait_until_element_is_visible("thank_you");
        verify.element_is_present("thank_you");
        System.out.println("Element 'Thank You Page' is visible.");

    }
    public void click_on_enter_the_referral_code() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("enter_the_code_text_field");
        verify.element_is_present("enter_the_code_text_field");
        element.click("enter_the_code_text_field");
        element.enter_text("enter_the_code_text_field","12345");
        wait.wait_for_second(5);
    }
    public void keyboard_hide() {
        wait.wait_for_second(2);
        try {
            if (((AndroidDriver) driver).isKeyboardShown()) {
                wait.wait_for_second(1);
                ((AndroidDriver) driver).hideKeyboard();
            } else {
                wait.wait_for_second(2);
            }
        } catch (Exception e) {
        }
    }

    public void enter_random_6_digit_code(int index) {
        Random random = new Random();
        int randomCode = 100000 + random.nextInt(900000);

        List<WebElement> textBoxes = androidDriver.findElements(By.className("android.widget.EditText"));

        if (index >= 0 && index < textBoxes.size()) {
            WebElement codeTextBox = textBoxes.get(index);
            codeTextBox.click();
            codeTextBox.sendKeys(String.valueOf(randomCode));
            androidDriver.hideKeyboard();
            System.out.println("Entered 6-digit random code: " + randomCode);
        } else {
            System.out.println("Invalid index: " + index + " No such text box found ");
        }
    }
    public void enter_6_digit_code(int index){
        wait.wait_for_second(2);
        List<WebElement> textField = androidDriver.findElements(By.className("android.widget.EditText"));
        textField.get(index).sendKeys("123456");
        androidDriver.hideKeyboard();
    }

    public void enterMobileNumberTextboxByIndex(int index) {
        wait.wait_for_second(2);
        String mobileNumber = "8000332637";
        List<WebElement> textFields = androidDriver.findElements(By.className("android.widget.EditText"));
        if (index >= 0 && index < textFields.size()) {
            WebElement numberTextField = textFields.get(index);
            numberTextField.click();
            numberTextField.sendKeys(mobileNumber);
            androidDriver.hideKeyboard();
            System.out.println("Successfully entered mobile number: " + mobileNumber);

        } else {
            System.out.println("Invalid index: " + index + " No such text field found ");
        }

    }
    public void enteremailIdTextboxByIndex(int index) {
        wait.wait_for_second(2);
        String emailId = "test@qable.io";
        List<WebElement> textFields = androidDriver.findElements(By.className("android.widget.EditText"));
        if (index >= 0 && index < textFields.size()) {
            WebElement numberTextField = textFields.get(index);
            numberTextField.click();
            numberTextField.sendKeys(emailId);
            androidDriver.hideKeyboard();
            System.out.println("Successfully entered  email id: " + emailId);

        } else {
            System.out.println("Invalid index: " + index + " No such text field found ");
        }

    }
    public void handle_pop_up() {
        List<WebElement> featureAlert = androidDriver.findElements(By.xpath("//android.widget.TextView[@text='Feature Alert']"));

        if (featureAlert.size() > 0) {
            WebElement closeButton = androidDriver.findElement(By.xpath("//android.widget.ImageView[@content-desc='close']"));
            closeButton.click();
            System.out.println("Close button clicked.");
        } else {
            System.out.println("Feature Alert is not visible. Skipping...");
        }
    }
    public void clickOnArrowRightButton() {
        String arrowRightLocator = "(//android.view.View[@content-desc='Arrow Right'])[1]";

        try {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

            WebElement arrowRightButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(arrowRightLocator)));
            if (arrowRightButton.isEnabled()) {
                System.out.println("Button is disable on UI User is not able to click on it ");
                arrowRightButton.click();
            } else {

                System.out.println("Right button is is enabled");
            }
        } catch (NoSuchElementException e) {

            System.out.println("Arrow Right button not found.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    public void clickArrowRightAndVerifyConfirmationMessage() {

        String arrowRightLocator = "//android.view.View[@content-desc='Arrow Right']";

        String confirmationMessage = "//android.widget.Toast[@text=\"Please fill all the details\"]";

        try {

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
            WebElement arrowRightButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(arrowRightLocator)));
            arrowRightButton.click();
            WebElement confirmationToast = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(confirmationMessage)));

            String actualMessage = confirmationToast.getText();

            if (actualMessage.equals("Please fill all the details")) {
                System.out.println("Toast message verified successfully: " + actualMessage);
            } else {
                System.out.println("Expected Toast message not found. Actual message: " + actualMessage);
            }

        } catch (NoSuchElementException e) {

            System.out.println("No such element found: " + e.getMessage());
        } catch (Exception e) {

            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public void clickArrowRightAndVerifyConfirmationInvalidOTPMessage() {

        String arrowRightLocator = "//android.view.View[@content-desc='Arrow Right']";

        String confirmationMessage = "//android.widget.Toast[@text=\"Invalid OTP\"]";

        try {

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
            WebElement arrowRightButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(arrowRightLocator)));
            arrowRightButton.click();
            WebElement confirmationToast = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(confirmationMessage)));


            String actualMessage = confirmationToast.getText();

            if (actualMessage.equals("Invalid OTP")) {
                System.out.println("Toast message verified successfully: " + actualMessage);
            } else {
                System.out.println("Expected Toast message not found. Actual message: " + actualMessage);
            }

        } catch (NoSuchElementException e) {

            System.out.println("No such element found: " + e.getMessage());
        } catch (Exception e) {

            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    public void verify_and_close_feature_alert_pop_up() {
        try {
            WebElement featureAlertElement = driver.findElement(By.xpath("//android.widget.TextView[@text='Feature Alert']"));

            if (featureAlertElement.isDisplayed()) {
                WebElement  closeButton = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='close']"));
                closeButton.click();
                System.out.println("Feature Alert closed.");
            }
        } catch (Exception e) {
            System.out.println("Feature Alert is not visible.");
        }
    }
    public void click_on_terms_and_conditions() {
        WebElement termsElement = driver.findElement(By.xpath("//android.widget.TextView[@text='I agree to the terms and conditions of Level SuperMind. *']"));

        String fullText = termsElement.getText();

        String termsAndConditions = "terms and conditions";

        if (fullText.contains(termsAndConditions)) {
            WebElement  clickableTerms = driver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'terms and conditions')]"));
            clickableTerms.click();
            wait.wait_for_second(10);
        } else {
            System.out.println("Text does not contain 'terms and conditions'");
        }
    }
    public void verifyTheToastMessaageUserCanSelectThreeMeditations() {

        String RelationShip = "//android.widget.TextView[@text=\"Relationship\"]";

        String ToastMessage = "//android.widget.Toast[@text=\"You can select upto 3 options\"]";

        try {

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
            WebElement arrowRightButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RelationShip)));
            arrowRightButton.click();
            WebElement confirmationToast = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ToastMessage)));


            String actualMessage = confirmationToast.getText();

            if (actualMessage.equals("You can select upto 3 options")) {
                System.out.println("Toast message verified successfully: " + actualMessage);
            } else {
                System.out.println("Expected Toast message not found. Actual message: " + actualMessage);
            }

        } catch (NoSuchElementException e) {

            System.out.println("No such element found: " + e.getMessage());
        } catch (Exception e) {

            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    public void click_on_show_all_plan(){
        wait.wait_for_second(2);
        element.click("show_all_plan");
    }
    public void verify_on_show_all_plan(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("one_four_nine_plan");
        verify.element_is_present("one_four_nine_plan");
        device.scrollDownToBottom("what_you_get");
        wait.wait_for_second(1);
        verify.element_is_present("one_nine_nine_plan");
    }
}




