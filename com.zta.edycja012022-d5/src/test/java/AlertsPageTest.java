import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertPage;

public class AlertsPageTest extends BaseTest {
    @Test
    public void shouldDislayCorrectMessageAfterClickingSimpleAlertButton() {
//        // given
        driver.get("https://seleniumui.moderntester.pl/alerts.php");
        AlertPage alertPage = new AlertPage(driver);
        // when
        alertPage.processSimpleAlert();
        //then
        Assert.assertEquals(alertPage.getSimpleAlertLabel(), "OK button pressed");

    }
    @Test
    public void shouldDislayCorrectMessageAfterClickingDelayedAlertButton() {
//        // given
        driver.get("https://seleniumui.moderntester.pl/alerts.php");
        AlertPage alertPage = new AlertPage(driver);
        // when
        alertPage.proccessDelayedAlert();
        //then
        Assert.assertEquals(alertPage.getdelayedAlertLabel(), "OK button pressed");

    }

    @Test
    public void isSimpleAlertLabelCorrect() {
//        // given
        driver.get("https://seleniumui.moderntester.pl/alerts.php");
        AlertPage alertPage = new AlertPage(driver);
        // when
        alertPage.processSimpleAlert();
        //then
        Assert.assertTrue(alertPage.isSimpleAlertLabelCorrect());

    }

    @Test
    public void isDelayedAlertLabelCorrect() {
//        // given
        driver.get("https://seleniumui.moderntester.pl/alerts.php");
        AlertPage alertPage = new AlertPage(driver);
        // when
        alertPage.proccessDelayedAlert();
        //then
        Assert.assertTrue(alertPage.isDelayedAlertLabelCorrect());

    }

}
