package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SmallCartPage extends BasePage {
    public SmallCartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css=".product-quantity >strong")
    private WebElement quantity;

    @FindBy(css=".product-total .value")
    private WebElement subtTotalCost;

    @FindBy(css="value")
    private WebElement TotalCost;

    public int shouldGetProductQuantity(){
        wait.until(ExpectedConditions.visibilityOf(quantity));
        return Integer.parseInt(quantity.getText());
    }

    public double shouldGetSubTotalCost(){
        wait.until(ExpectedConditions.visibilityOf(subtTotalCost));
        return Double.parseDouble(subtTotalCost.getText().replace("$", ""));
    }

    public String shouldGetSubTotalCostString(){
        wait.until(ExpectedConditions.visibilityOf(subtTotalCost));
        return subtTotalCost.getText();
    }


}
