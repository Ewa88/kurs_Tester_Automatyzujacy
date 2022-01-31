package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;

public class TopBarPage extends BasePage {
    @FindBy(css="[title=\"Log in to your customer account\"]")
    private WebElement signInButton;

    @FindBy(css = "#_desktop_user_info .account>span")
    private WebElement nickLabel;

    public TopBarPage(WebDriver driver) {
        super(driver);
    }

    public void proccessSignInButton(){
        signInButton.click();
    }

    public String getUserName(){
        File screenshot = nickLabel.getScreenshotAs(OutputType.FILE);
        File dest = new File("screenshot.png");
        try {
            FileHandler.copy(screenshot,dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nickLabel.getText();
    }

}
