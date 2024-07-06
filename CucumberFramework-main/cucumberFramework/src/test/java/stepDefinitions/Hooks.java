package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Helper;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void setUp() throws InterruptedException {
        Helper.setUpDriver();
    }


    @After
    public void tearDown(Scenario scenario) {
//        if (scenario.isFailed()) {
////            final byte[] screenshot = ((TakesScreenshot) Helper.getDriver()).getScreenshotAs(OutputType.BYTES);
////            scenario.attach(screenshot, "image/png", scenario.getName());
//        }

        Helper.tearDown();

    }
}
