package stepDefinitions;

import utilities.Helper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.Login_Page;

import java.util.concurrent.TimeUnit;

public class Login_Steps extends BaseClass {

    @Given("user launch the webpage")
    public void user_launch_the_webpage() throws InterruptedException {

        loginPage = new Login_Page(Helper.getDriver());
        Helper.getWebURL();
        Helper.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.verifyUsername();
    }

    @Then("user closes the browser")
    public void user_closes_the_browser() {
        System.out.println("close");
    }

}
