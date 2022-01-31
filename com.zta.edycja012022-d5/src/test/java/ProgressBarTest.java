import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProgressBarTest extends BaseTest{

    @BeforeMethod
    public void openPage(){
        driver.get("https://seleniumui.moderntester.pl/progressbar.php");
    }

    @Test
    public void shouldDisplayCompleteInProgressBar(){
        //given
        String exceptedText ="Complete!";

        //when
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBe(By.cssSelector(".progress-label"), exceptedText));

        //then
        Assert.assertEquals(driver.findElement(By.cssSelector(".progress-label")).getText(), exceptedText);
    }

    @Test
    public void shouldDisplayCompleteInProgressBar2(){
        //given
        String exceptedText ="Complete!";

        //when
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("ui-progressbar-complete")));

        //then
        Assert.assertEquals(driver.findElement(By.cssSelector(".progress-label")).getText(), exceptedText);
    }
}
