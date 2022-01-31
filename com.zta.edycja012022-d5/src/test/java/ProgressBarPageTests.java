import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProgressBarPage;

public class ProgressBarPageTests extends BaseTest{

    @Test
    public void worksOrNot() {
        driver.get("https://seleniumui.moderntester.pl/progressbar.php");
        ProgressBarPage progressBarPage = new ProgressBarPage(driver);
        Assert.assertEquals(progressBarPage.getLabel(), "Complete!");
    }
}
