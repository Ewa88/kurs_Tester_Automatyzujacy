import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegistrationPage;
import pages.TopBarPage;

public class RegistrationTest extends BaseTest{
    @Test
    public void shouldRegisterNewUser() {
//
        driver.get("http://146.59.32.4/index.php");
        TopBarPage topBarPage = new TopBarPage(driver);
        topBarPage.proccessSignInButton();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.createAccount();

        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.setFirstNameTextBox("Grażyna");
        registrationPage.setLastNameTextBox("Januszowa");
        registrationPage.setEmailTextBox(shouldGenerateRandomEmail());
        registrationPage.setBirthdayTextBox("01/01/2000");
        registrationPage.setPasswordTextBox(shouldGenerateRandomPassword());
        registrationPage.checkAcceptCheckBox();
        registrationPage.checkCustomerCheckBox();

        registrationPage.proccessSaveButton();

        Assert.assertEquals(topBarPage.getUserName(), "Grażyna Januszowa");


    }

    private String shouldGenerateRandomEmail(){
        String email = RandomStringUtils.randomAlphabetic(5);
        email +="@";
        email +=RandomStringUtils.randomAlphabetic(5);
        email+=".com";
        return email;
    }

    private String shouldGenerateRandomPassword(){
        String password = RandomStringUtils.randomAlphabetic(10);
        return password;
    }

    @Test
    public void shouldRegisterNewUser2() {

        // given
        String name = "Grażyna";
        String lastName = "Januszowa";
        String date = "01/01/1900";
        String password = shouldGenerateRandomPassword();
        String email = shouldGenerateRandomEmail();

        driver.get("http://146.59.32.4/index.php");
        TopBarPage topBarPage = new TopBarPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);

        // when
        topBarPage.proccessSignInButton();
        loginPage.createAccount();
        registrationPage.fillAllFields(name, lastName, email, date, password);
        registrationPage.proccessSaveButton();

        //then
        Assert.assertEquals(topBarPage.getUserName(), name+" "+lastName);
    }

    @Test
    public void shouldNotRegisterNewUserWithoutEmailAddress() {

        // given
        String name = "Grażyna";
        String lastName = "Januszowa";
        String date = "01/01/1900";
        String password = shouldGenerateRandomPassword();
        String email="";
        String urlThatShouldNotBeChanged = "http://146.59.32.4/index.php?controller=authentication&create_account=1";

        driver.get("http://146.59.32.4/index.php");
        TopBarPage topBarPage = new TopBarPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);

        // when
        topBarPage.proccessSignInButton();
        loginPage.createAccount();
        registrationPage.fillAllFields(name, lastName, email, date, password);
        registrationPage.proccessSaveButton();

        // then
        // Assert.assertEquals(driver.getCurrentUrl(), "http://146.59.32.4/index.php?controller=authentication&create_account=1");
         Assert.assertTrue(registrationPage.isCurrentUrlCorrect(urlThatShouldNotBeChanged));
         Assert.assertTrue(registrationPage.isSaveButtonDisplayed(), "nie widze przycisku");
    }
}
