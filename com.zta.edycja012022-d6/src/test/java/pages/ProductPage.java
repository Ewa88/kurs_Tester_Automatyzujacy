package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".current-price>span")
    private WebElement currentPrice;

    @FindBy(css =".touchspin-up")
    private WebElement upButton;

    @FindBy(css=".add-to-cart")
    private WebElement addToCartButton;

    public String rememberPrice() {
        return currentPrice.getAttribute("content");
    }

    public void clickUpButton( int numberOfProducts){
        for(int i=1; i<numberOfProducts; i++){
            upButton.click();
        }
    }

    public void clickAddToCart( ){
            addToCartButton.click();
    }

    public double shouldAddToCartSelectedNumberOfProducts(int numberOfProducts){
        double unitCost = Double.parseDouble(rememberPrice());
        clickUpButton(numberOfProducts);
        clickAddToCart();
        return unitCost;
    }

}
