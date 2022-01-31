import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.xml.datatype.Duration;


public class AlertsTests extends BaseTest{
    @BeforeMethod
    public void openPage(){
        driver.get("https://seleniumui.moderntester.pl/alerts.php");
    }


    @Test
    public void shouldAcceptDelayedAlert(){
        driver.findElement(By.id("delayed-alert")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.switchTo().alert().accept();
        String textFromWebPage = driver.findElement(By.id("delayed-alert-label")).getText();
        Assert.assertEquals(textFromWebPage, "OK button pressed");
    }

    @Test
    public void shouldAcceptDelayedAlertBetter(){
        //given
        String exceptedText ="OK button pressed";

        //when
        driver.findElement(By.id("delayed-alert")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        //then
        String textFromWebPage = driver.findElement(By.id("delayed-alert-label")).getText();
        Assert.assertEquals(textFromWebPage, exceptedText);
    }
}
