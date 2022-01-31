package pages;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[name=\"id_gender\"][value=\"2\"]")
    private WebElement msSocialTitleRadioButton;

    @FindBy(name = "firstname")
    private WebElement firstNameTextBox;

    @FindBy(name = "lastname")
    private WebElement lastNameTextBox;

    @FindBy(name = "email")
    private WebElement emailTextBox;

    @FindBy(name = "password")
    private WebElement passwordTextBox;

    @FindBy(name = "birthday")
    private WebElement birthdayTextBox;

    @FindBy(name = "customer_privacy")
    private WebElement customerCheckBox;

    @FindBy(name = "psgdpr")
    private WebElement acceptCheckBox;

    @FindBy(css = "[data-link-action=\"save-customer\"]")
    private WebElement saveButton;

    public void setFirstNameTextBox(String firstName) {
        firstNameTextBox.sendKeys(firstName);
    }

    public void setLastNameTextBox(String lastName) {
        lastNameTextBox.sendKeys(lastName);
    }

    public void setEmailTextBox(String email) {
        emailTextBox.sendKeys(email);
    }

    public void setBirthdayTextBox(String birthdate) {
        birthdayTextBox.sendKeys(birthdate);
    }

    public void setPasswordTextBox(String password) {
        passwordTextBox.sendKeys(password);
    }

    public void checkAcceptCheckBox() {
        acceptCheckBox.click();
    }

    public void checkCustomerCheckBox() {
        customerCheckBox.click();
    }

    public void setSocialTitle() {
        msSocialTitleRadioButton.click();
    }

    public void proccessSaveButton() {
        saveButton.click();
    }

    public void fillAllFields(String userName, String userLastName, String userEmail, String date, String userPassword) {
        setFirstNameTextBox(userName);
        setLastNameTextBox(userLastName);
        setEmailTextBox(userEmail);
        setBirthdayTextBox(date);
        setPasswordTextBox(userPassword);
        checkAcceptCheckBox();
        checkCustomerCheckBox();
        setSocialTitle();
    }

    public boolean isCurrentUrlCorrect(String url) {
        return  driver.getCurrentUrl().equals(url);

    }

    public boolean isSaveButtonDisplayed(){
        return saveButton.isDisplayed();

    }

}


