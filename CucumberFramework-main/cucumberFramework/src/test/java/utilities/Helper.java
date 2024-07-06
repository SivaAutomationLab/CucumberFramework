package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.concurrent.TimeUnit;

public class Helper {

    private static Helper helper;
    private static WebDriver driver;

    public Helper() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static void getWebURL() {
        String ur = PropertiesFileReader.getAppurl();
        driver.get(ur);
    }

    public static String getTitle() {
        return driver.getTitle();
    }

    public static void NavBack() {
        driver.navigate().back();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() {
        if (helper == null) {
            helper = new Helper();
        }
    }

    public static void tearDown() {
        if (driver != null) {
            driver.close();
//            driver.quit();
        }
        helper = null;
    }
}
