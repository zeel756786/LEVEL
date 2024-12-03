package mobile.object_repository.Payment;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class payment_page {
    WebDriver driver = null;
    Element element = null;
    Verify verify = null;
    Wait wait = null;
    AndroidDriver androidDriver = null;

    public payment_page(WebDriver driver) {
        this.driver = driver;
        element = new Element(driver);
        verify = new Verify(driver);
        wait = new Wait(driver);
        androidDriver = (AndroidDriver) driver;
    }

    public void verify_and_click_on_manage_subscription() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Manage_subscription");
        element.click("Manage_subscription");
    }

    public void verify_subscription_details_page_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("subscription_Details");
    }

    public void verify_and_click_on_start_free_trail() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("start_free_trial");
        element.click("start_free_trial");
    }

    public void verify_one_million_meditators_worldwide_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("one_million_meditators_worldwide");
    }

    public void verify_one_four_nine_months_plans_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("one_four_nine_months");
        verify.element_is_present("one_four_nine_months");
    }

    public void verify_one_nine_nine_months_plans_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("one_nine_nine_months");
        verify.element_is_present("one_nine_nine_months");
    }

    public void verify_two_nine_nine_months_plans_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("two_nine_nine_months");
        verify.element_is_present("two_nine_nine_months");
    }

    public void verify_and_click_on_continue_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("continue_button");
        element.click("continue_button");
    }

    public void verify_and_click_on_subscribe_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("subscribe_button");
        element.click("subscribe_button");
    }

    public void verify_congratulations_page_present_on_page() {
        wait.wait_for_second(2);
        try {
            wait.wait_until_element_is_visible("congratulations");

            System.out.println("Congratulations! The congratulations page is present.");

        } catch (Exception e) {
            System.out.println("Congratulations page is not visible.");
            System.out.println("Error occurred while verifying the congratulations page: " + e.getMessage());
        }
    }

    public void verify_and_click_on_cancel_subscription() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("cancel_subscription");
        element.click("cancel_subscription");
    }

    public void verify_and_click_on_continue_to_cancel_memberships() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("continue_to_cancel_memberships");
        element.click("continue_to_cancel_memberships");
    }

    public void verify_and_click_on_click_on_first_checkbox_for_cancellation() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("click_on_first_checkbox");
        element.click("click_on_first_checkbox");
    }

    public void verify_and_click_on_settings_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Settings");
        element.click("Settings");
    }

    public void verify_settings_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Settings");
    }

    public void verify_my_subscription_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("my_subscriptions");
    }

    public void verify_and_click_on_explore_all_plans() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Explore_all_plans");
        verify.element_is_present("Explore_all_plans");
        element.click("Explore_all_plans");
    }
    public void verify_select_your_plan_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("select_your_plan");
        verify.element_is_present("select_your_plan");
    }
    public void verify_see_benefits_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("see_benefits");
        verify.element_is_present("see_benefits");
    }

    public void scroll_up_to_the_Text(String Text) {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".setAsVerticalList().scrollBackward()" +
                        ".scrollIntoView(new UiSelector().text(\"" + Text + "\"));"));
    }

    public void scroll_down_to_the_Text(String Text) {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"" + Text + "\"));"));
    }

    public void scrollUntilElementVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        boolean canScrollMore;

        do {

            try {
                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//android.widget.TextView[@text='What you get:']")
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
}





