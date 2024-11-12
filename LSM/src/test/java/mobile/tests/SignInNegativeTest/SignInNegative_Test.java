package mobile.tests.SignInNegativeTest;

import io.unity.framework.init.base;
import io.unity.framework.remotegrid.LambdaTestConfig;
import mobile.object_repository.Onboarding.signin_page;
import org.testng.annotations.Test;

import java.time.Duration;


public class SignInNegative_Test extends base {

    @Test()
    public void To_verify_when_the_user_try_login_with_invalid_email_id_format() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To_verify_when_the_user_try_login_with_invalid_email_id_format");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_email_text_present_on_page();
        signin_page.click_and_enter_text_on_email_id();
        signin_page.enterTextInSpecificTextBox("example.com", 0);
        signin_page.clickOnArrowRightButton();
    }
    @Test()
    public void To_verify_when_the_user_try_login_with_invalid_email_id_format_with_special_character_not_allowed() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To_verify_when_the_user_try_login_with_invalid_email_id_format_with_special_character_not_allowed");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_email_text_present_on_page();
        signin_page.click_and_enter_text_on_email_id();
        signin_page.enterTextInSpecificTextBox("user#email@domain.com", 0);
        signin_page.clickOnArrowRightButton();
    }
    @Test()
    public void To_verify_when_the_user_try_login_with_invalid_email_id_format_with_spaces_not_allowed() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To_verify_when_the_user_try_login_with_invalid_email_id_format_with_spaces_not_allowed");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_email_text_present_on_page();
        signin_page.click_and_enter_text_on_email_id();
        signin_page.enterTextInSpecificTextBox("user name@domain.com", 0);
        signin_page.clickOnArrowRightButton();
    }
    @Test()
    public void To_verify_when_the_user_try_login_with_valid_email_id_format_with_invalid_otp() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To_verify_when_the_user_try_login_with_invalid_email_id_format_with_invalid_otp");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_email_text_present_on_page();
        signin_page.click_and_enter_text_on_email_id();
        signin_page.enterTextInSpecificTextBox("wigipe2884@evasud.com", 0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.clickArrowRightAndVerifyConfirmationInvalidOTPMessage();
    }
    @Test()
    public void To_verify_when_the_user_try_login_with_invalid_phone_no_format_with_few_digits() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To_verify_when_the_user_try_login_with_invalid_phone_no_format_with_few_digits");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterTextInSpecificTextBox("12345", 0);
        signin_page.clickOnArrowRightButton();
    }
    @Test()
    public void To_verify_when_the_user_try_login_with_invalid_phone_no_format_with_more_than_10_digits() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To_verify_when_the_user_try_login_with_invalid_phone_no_format_with_more_than_10_digits");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterTextInSpecificTextBox("123456789012345", 0);
        signin_page.clickOnArrowRightButton();
    }
    @Test()
    public void To_verify_when_the_user_try_login_with_invalid_phone_no_format_with_spaces() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To_verify_when_the_user_try_login_with_invalid_phone_no_format_with_more_than_10_digits");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterTextInSpecificTextBox("123 456 789", 0);
        signin_page.clickOnArrowRightButton();
    }
    @Test
    public void To_verify_when_the_user_try_login_with_invalid_phone_no_format_with_dash() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To_verify_when_the_user_try_login_with_invalid_phone_no_format_with_dash");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterTextInSpecificTextBox("123-456-7890", 0);
        signin_page.clickOnArrowRightButton();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.clickOnArrowRightButton();
    }
    @Test
    public void To_verify_when_the_user_try_login_with_invalid_phone_no_format_with_space() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To_verify_when_the_user_try_login_with_invalid_phone_no_format_with_space");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterTextInSpecificTextBox("123 456 7890", 0);
        signin_page.clickOnArrowRightButton();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.clickOnArrowRightButton();
    }
    @Test
    public void To_verify_when_the_user_try_login_with_valid_email_id_without_enter_phone_no_in_onb_registration_form() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To_verify_when_the_user_try_login_with_valid_email_id_without_enter_name_in_onb_registration_form");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_email_text_present_on_page();
        signin_page.click_and_enter_text_on_email_id();
        signin_page.enterTextInSpecificTextBox("test@qable.io", 0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_and_enter_your_name();
        signin_page.enterTextInSpecificTextBox("shubham", 0);
        signin_page.clickArrowRightAndVerifyConfirmationMessage();
    }
    @Test()
    public void To_verify_when_the_user_try_login_with_valid_email_id_without_enter_name_in_onb_registration_form() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To_verify_when_the_user_try_login_with_valid_email_id_without_enter_name_in_onb_registration_form");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_email_text_present_on_page();
        signin_page.click_and_enter_text_on_email_id();
        signin_page.enterTextInSpecificTextBox("test@qable.io", 0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_and_enter_your_email_or_mobile(false);
        signin_page.enterTextInSpecificTextBox("8000332637", 1);
        signin_page.clickArrowRightAndVerifyConfirmationMessage();
    }

}
