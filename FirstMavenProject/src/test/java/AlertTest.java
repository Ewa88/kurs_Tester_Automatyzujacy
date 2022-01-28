import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest{

    @BeforeMethod
    public void openPage(){
        driver.get("https://seleniumui.moderntester.pl/alerts.php");
    }

    @Test
    public void shouldConfirmSimpleAlert(){
        //given
        driver.findElement(By.id("simple-alert")).click();

        //when
        driver.switchTo().alert().accept();

        //then
        String validationMessage = driver.findElement(By.id("simple-alert-label")).getText();
        Assert.assertEquals(validationMessage, "OK button pressed");
    }

    @Test
    public void shouldConfirmPromptAlertBox(){
        //given
        driver.findElement(By.id("prompt-alert")).click();
        String name = "Jan";
        //when
        driver.switchTo().alert().sendKeys(name);
        driver.switchTo().alert().accept();

        //then
        String validationMessage = driver.findElement(By.id("prompt-label")).getText();
        Assert.assertEquals(validationMessage, "Hello "+name+"! How are you today?");
    }

    @Test
    public void shouldDeclinePromptAlertBox(){
        //given
        driver.findElement(By.id("prompt-alert")).click();
        //when
        driver.switchTo().alert().dismiss();
        //then
        String validationMessage = driver.findElement(By.id("prompt-label")).getText();
        Assert.assertEquals(validationMessage, "User cancelled the prompt.");
    }
}
