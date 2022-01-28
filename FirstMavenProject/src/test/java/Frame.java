import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Frame extends BaseTest{

    @BeforeMethod
    public void openPage(){
        driver.get("https://seleniumui.moderntester.pl/iframes.php");
    }

    @Test
    public void switchFrames(){
        driver.switchTo().frame("iframe1");
        driver.findElement(By.id("inputFirstName3")).sendKeys("Ewa");
        driver.switchTo().defaultContent();
        driver.switchTo().frame("iframe2");
        driver.findElement(By.id("inputLogin")).sendKeys("login");
        driver.findElement(By.cssSelector("[type=submit]")).click();
    }
}
