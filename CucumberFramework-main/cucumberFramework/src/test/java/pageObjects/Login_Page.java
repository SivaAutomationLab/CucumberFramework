package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.BaseClass;

public class Login_Page extends BaseClass {

    public Login_Page(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//label[text()='Username']")
    WebElement usernameLabel;

    public void verifyUsername() {
        usernameLabel.isDisplayed();
    }

}