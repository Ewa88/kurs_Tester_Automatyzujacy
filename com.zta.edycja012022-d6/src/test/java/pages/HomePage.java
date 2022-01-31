package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".featured-products [itemprop=\"itemListElement\"] .thumbnail-container>a")
    private List<WebElement> featuredProductsLinks;

    public void selectProduct(int n) {
        wait.until(ExpectedConditions.elementToBeClickable(featuredProductsLinks.get(n-1)));
        featuredProductsLinks.get(n-1).click();
    }
}
