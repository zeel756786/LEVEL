package mobile.tests.SignInNegativeTest;

import io.unity.framework.init.base;
import io.unity.framework.remotegrid.LambdaTestConfig;
import mobile.object_repository.signin.signin_page;
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
}
