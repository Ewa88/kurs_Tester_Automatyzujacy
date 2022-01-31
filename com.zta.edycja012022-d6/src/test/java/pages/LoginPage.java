package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".no-account")
    private WebElement createAccountButton;

    public void createAccount(){
        createAccountButton.click();
    }
}
