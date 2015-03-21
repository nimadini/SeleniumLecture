/*
 *  Nima Dini | March 21, 2015
 *  461L Lecture on Monday 3/23 @ 9AM
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import com.google.common.base.Function;
import java.util.*;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultiplyServerTester {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        /*
        Uncomment to use simulate Firefox behavior with htmlUnit:

        DesiredCapabilities capabilities = DesiredCapabilities.htmlUnit();
        capabilities.setBrowserName("firefox");
        capabilities.setPlatform(Platform.MAC);
        capabilities.setVersion("");
        driver = new HtmlUnitDriver(capabilities);

        */

        driver = new FirefoxDriver();
        driver.get("http://multiply-server.appspot.com"); // visit the web app page
    }

    @Test
    public void testAddingTwoIntegers() {
        // Find the 1st number element by its id
        WebElement firstNum = driver.findElement(By.id("first-num"));
        firstNum.sendKeys("12");

        // Find the 2nd number element by its id
        WebElement secondNum = driver.findElement(By.id("second-num"));
        secondNum.sendKeys("5");

        // Find the submit button
        WebElement submitBtn = driver.findElement(By.id("submit-btn"));
        submitBtn.click();

        // You can use the same By.id approach here. I want you to see another method from By class here! :)
        List<WebElement> allHeadingThreesWithResID = driver.findElements(By.xpath("//h3[@id='res']"));

        // Make sure there is only one element in list
        assertEquals(allHeadingThreesWithResID.size(), 1);

        // Make sure the result is correct
        assertEquals(allHeadingThreesWithResID.get(0).getText(), "12 * 5 = 60");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}