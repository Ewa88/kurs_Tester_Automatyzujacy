package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProgressBarPage extends BasePage{
      @FindBy(css = (".ui-progressbar-value"))
    private WebElement progressValue;

    @FindBy(css = (".progress-label"))
    private WebElement progressLabel;

    public ProgressBarPage(WebDriver driver){
        super(driver);
    }

    private void waitForCompletion(){
         wait.until(ExpectedConditions.attributeContains(progressValue,"class","ui-progressbar-complete"));

    }

    public String getLabel(){
        waitForCompletion();
        return progressLabel.getText();
    }


}
