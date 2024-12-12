package io.unity.performaction.automob;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.unity.framework.readers.json_file_readers;
import io.unity.framework.runner.TestRunner;
import io.unity.performaction.autoweb.Element;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.*;

import static java.time.Duration.ofMillis;
import static java.util.Collections.singletonList;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.function.Function;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Device {
    AppiumDriver driver;
    Element element;
    AndroidDriver androidDriver;
    json_file_readers reader = new json_file_readers();
    private Duration STEP_DURATION = Duration.ofMillis(1);
    private Duration NO_TIME = Duration.ofMillis(0);
    private PointerInput.Origin VIEW = PointerInput.Origin.viewport();

    public Device(AppiumDriver dri) {
        this.driver = dri;
        element = new Element(driver);
        androidDriver = (AndroidDriver) driver;
    }


public void switch_to_context(String context_name) {

        if (reader.getPlatform(TestRunner.currentConfig).equalsIgnoreCase("android")) {
            ((AndroidDriver) driver).context(context_name);
        }
       if (reader.getPlatform(TestRunner.currentConfig).equalsIgnoreCase("iOS")) {
            ((IOSDriver) driver).context(context_name);
        }
    }


    public void scroll_down() {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        int startY = (int) ((driver.manage().window().getSize().getHeight()) * 0.80);
        int endY = (int) ((driver.manage().window().getSize().getHeight()) * 0.20);

        int startX = (int) ((driver.manage().window().getSize().getWidth()) * 0.50);
        Sequence circle = new Sequence(finger, 0);

        circle.addAction(finger.createPointerMove(NO_TIME, VIEW, startX, startY));
        circle.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));


        for (int i = 1; i < 300 + 1; i++) {
            circle.addAction(finger.createPointerMove(STEP_DURATION, VIEW, startX, startY - (i + 10)));
        }

        driver.perform(Arrays.asList(circle));

    }

    public void horizontal_scroll() {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        int startY = (int) ((double) this.driver.manage().window().getSize().getHeight() * 0.8);
        int endY = (int) ((double) this.driver.manage().window().getSize().getHeight() * 0.2);
        int startX = (int) ((double) this.driver.manage().window().getSize().getWidth() * 0.5);
        Sequence circle = new Sequence(finger, 0);
        circle.addAction(finger.createPointerMove(this.NO_TIME, this.VIEW, startX, startY));
        circle.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));

        for (int i = 1; i < 300 + 1; ++i) {
            circle.addAction(finger.createPointerMove(this.STEP_DURATION, this.VIEW, startX - (i + 10), startY));
        }

        this.driver.perform(Arrays.asList(circle));

    }

    public void slider(String element_name) {
        WebElement slider = element.find(element_name);
        Point source = slider.getLocation();
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence sequence = new Sequence(finger, 1);
        sequence.addAction(finger.createPointerMove(ofMillis(0),
                PointerInput.Origin.viewport(), source.x, source.y));
        sequence.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()));
        sequence.addAction(new Pause(finger, ofMillis(600)));
        sequence.addAction(finger.createPointerMove(ofMillis(600),
                PointerInput.Origin.viewport(), source.x + 400, source.y));
        sequence.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));
        driver.perform(singletonList(sequence));
    }

    public void sliding(String element_name, int moveX, int moveY) {

        WebElement slider = element.find(element_name);

        Point source = slider.getLocation();

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence sequence = new Sequence(finger, 1);

        sequence.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), source.x, source.y));
        sequence.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()));

        sequence.addAction(new Pause(finger, Duration.ofMillis(600)));

        sequence.addAction(finger.createPointerMove(Duration.ofMillis(600),

                PointerInput.Origin.viewport(), source.x + moveX, source.y + moveY));

        sequence.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(sequence));
    }
    public void scrollAndClick(String text) {
        By locator = By.xpath("//*[contains(@text,'" + text + "')]");

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        int startY = (int) ((driver.manage().window().getSize().getHeight()) * 0.80);
        int endY = (int) ((driver.manage().window().getSize().getHeight()) * 0.20);
        int startX = (int) ((driver.manage().window().getSize().getWidth()) * 0.50);

        boolean isElementVisible = false;

        while (!isElementVisible) {
            try {
                WebElement element = driver.findElement(locator);
                if (element.isDisplayed()) {
                    isElementVisible = true;
                    element.click();
                    return;
                }
            } catch (Exception e) {
                scroll_down();
            }

            Sequence swipe = new Sequence(finger, 0);
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX, startY));
            swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), startX, endY));
            swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
            driver.perform(Collections.singletonList(swipe));
        }
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

    public void scrollDownToBottom(String element_name) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Dimension screenSize = driver.manage().window().getSize();

        int startX = (int) (screenSize.getWidth() * 0.50);
        int startY = (int) (screenSize.getHeight() * 0.80);
        int endY = (int) (screenSize.getHeight() * 0.20);

        boolean canScrollFurther = true;

        while (canScrollFurther) {
            Sequence scroll = new Sequence(finger, 0);

            scroll.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
            scroll.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
            scroll.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), startX, endY));
            scroll.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

            driver.perform(Arrays.asList(scroll));

            canScrollFurther = isScrollable( element_name);
        }
    }
    public  boolean isScrollable(String element_name) {
        try {
            WebElement lastVisibleElement = element.find(element_name);
            //   WebElement lastVisibleElement = driver.findElement(By.xpath("your_last_element_locator"));
            return !lastVisibleElement.isDisplayed();
        } catch (Exception e) {
            return true;
        }
    }


    public void scrollDownToBottoms(String elementLocator) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Dimension screenSize = driver.manage().window().getSize();

        int startX = (int) (screenSize.getWidth() * 0.50);
        int startY = (int) (screenSize.getHeight() * 0.80);
        int endY = (int) (screenSize.getHeight() * 0.20);

        boolean canScrollFurther = true;

        while (canScrollFurther) {
            try {
                WebElement targetElement = element.find(elementLocator);
                if (targetElement.isDisplayed()) {
                    System.out.println("Element is visible: " + elementLocator);
                    canScrollFurther = false;
                } else {
                    System.out.println("Element is not fully visible, scrolling...");
                }
            } catch (Exception e) {
                System.out.println("Element not found, continuing to scroll...");
            }
            if (canScrollFurther) {
                Sequence scroll = new Sequence(finger, 0);
                scroll.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
                scroll.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
                scroll.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), startX, endY));
                scroll.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

                driver.perform(Arrays.asList(scroll));
            }
        }
    }
    public void scrollUpToTop(String elementLocator) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Dimension screenSize = driver.manage().window().getSize();

        int startX = (int) (screenSize.getWidth() * 0.50);
        int startY = (int) (screenSize.getHeight() * 0.20);
        int endY = (int) (screenSize.getHeight() * 0.80);

        boolean canScrollFurther = true;

        while (canScrollFurther) {
            try {
                WebElement targetElement = element.find(elementLocator);
                if (targetElement.isDisplayed()) {
                    System.out.println("Element is visible: " + elementLocator);
                    canScrollFurther = false;
                } else {
                    System.out.println("Element is not fully visible, scrolling...");
                }
            } catch (Exception e) {
                System.out.println("Element not found, continuing to scroll...");
            }
            if (canScrollFurther) {
                Sequence scroll = new Sequence(finger, 0);
                scroll.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
                scroll.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
                scroll.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), startX, endY));
                scroll.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

                driver.perform(Arrays.asList(scroll));
            }
        }
    }

    public void verifySearchBoxEnterAndClearText(String[] searchTerms, Map<String, Runnable> verificationMethods) {
        WebElement searchButton = androidDriver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"clear\"]"));

        for (String searchTerm : searchTerms) {
            WebElement searchBox = androidDriver.findElement(By.xpath("//android.widget.EditText"));
            searchBox.click();
            searchBox.sendKeys(searchTerm);
            searchButton.click();
            searchBox.clear();
            searchBox.sendKeys(searchTerm);
            searchButton.click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            if (verificationMethods.containsKey(searchTerm)) {
                androidDriver.hideKeyboard();
                verificationMethods.get(searchTerm).run();
                System.out.println("Search for " + searchTerm + " passed.");
            } else {
                System.out.println("No verification method found for " + searchTerm + ".");
            }
            searchButton.click();
        }
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
    public void scrollDown() {

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        int startX = driver.manage().window().getSize().width / 2;
        int startY = (int) (driver.manage().window().getSize().height * 0.7);
        int endY = (int) (driver.manage().window().getSize().height * 0.3);

        Sequence scroll = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), startX, endY))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        androidDriver.perform(Arrays.asList(scroll));
    }
    public void horizontalScrollRightToTexts(String text) {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".setAsHorizontalList()" +
                        ".scrollForward().scrollIntoView(new UiSelector().text(\"" + text + "\"));"));
    }

    public void get_elements_multiple_texts_with_scroll(String element_name) {
        String text_value = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]//android.widget.TextView[2]";
        try {
            boolean canScrollFurther = true;
            int scrollCount = 0;
            int maxScrolls = 20; // Safety limit for scrolls
            Set<String> seenTexts = new HashSet<>(); // To avoid re-printing duplicates

            while (canScrollFurther && scrollCount < maxScrolls) {
                // Get all visible elements during the current scroll
                List<WebElement> elements = driver.findElements(By.xpath(text_value));
                System.out.println("Number of elements found in this scroll: " + elements.size());

                for (WebElement element : elements) {
                    String text = element.getText();

                    // Print only new texts
                    if (seenTexts.add(text)) {
                        System.out.println("Element text: " + text);
                      //  canScrollFurther = isScrollable(element_name);
//                        if (canScrollFurther) {
//                            scrollDownToBottom(element_name);
//                            scrollCount++;
//                            System.out.println("Scrolled down " + scrollCount + " times.");
//                        } else {
//                            System.out.println("No more elements to scroll.");
//                        }
                    }
                }
                canScrollFurther = isScrollable(element_name);

                if (canScrollFurther) {
                    scrollDownToBottom(element_name);
                    scrollCount++;
                    System.out.println("Scrolled down " + scrollCount + " times.");
                } else {
                    System.out.println("No more elements to scroll.");
                }
            }
        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
    public void get_elements_multiplE( String scrollableElementXpath) {
        String locator_value="//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]//android.widget.TextView[2]";
        try {
            int scrollCount = 0;
            int maxScrolls = 20; // Safety limit to prevent infinite scrolling
            Set<String> seenTexts = new HashSet<>(); // To avoid duplicates

            boolean canScrollFurther = true;
            while (canScrollFurther && scrollCount < maxScrolls) {
                // Fetch all visible elements matching the locator
                List<WebElement> elements = driver.findElements(By.xpath(locator_value));
                System.out.println("Number of elements found in this scroll: " + elements.size());

                for (WebElement element : elements) {
                    String text = element.getText();

                    if (seenTexts.add(text)) {
                        System.out.println("Element text: " + text);
                    }
                }

                // Scroll down to the bottom of the visible area
                scrollDownToBottom(scrollableElementXpath);
                scrollCount++;
                System.out.println("Scrolled down " + scrollCount + " times.");

                // Check if more scrolling is possible
                canScrollFurther = isScrollable(scrollableElementXpath);
            }

            System.out.println("All elements have been retrieved. Total scrolls: " + scrollCount);
        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }



    public void get_elements_multiple_texts(String scrollableElementXpath) {
        String textLocator = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]//android.widget.TextView[2]";
        try {
            boolean canScrollFurther = true;
            int scrollCount = 0;
            int maxScrolls = 20; // Safety limit for scrolls
            Set<String> seenTexts = new HashSet<>(); // To avoid re-printing duplicates

            while (canScrollFurther && scrollCount < maxScrolls) {
                // Find all currently visible texts
                List<WebElement> elements = driver.findElements(By.xpath(textLocator));
                System.out.println("Number of elements found in this scroll: " + elements.size());

                for (WebElement element : elements) {
                    String text = element.getText();

                    // Print only new texts
                    if (seenTexts.add(text)) {
                        System.out.println("Element text: " + text);
                    }
                }

                // Check if further scrolling is possible
                canScrollFurther = isScrollable(scrollableElementXpath);

                if (canScrollFurther) {
                    // Scroll down to reveal more content
                    scrollDownToBottom(scrollableElementXpath);
                    scrollCount++;
                    System.out.println("Scrolled down " + scrollCount + " times.");
                } else {
                    System.out.println("No more elements to scroll.");
                }
            }
        } catch (Exception e) {
            System.err.println("Error occurred during scrolling: " + e.getMessage());
        }
    }



}
