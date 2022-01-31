import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import pages.SmallCartPage;

import java.awt.color.ProfileDataException;

import static java.lang.Integer.parseInt;

public class VeryficationOfCart extends BaseTest{
    @Test
            public void VeryficationOfCost() {
// given
        driver.get("http://146.59.32.4/index.php");
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        int numberOfProducts = 4;
        SmallCartPage smallCartPage = new SmallCartPage(driver);

        //when
        homePage.selectProduct(8);
        double unitCost = productPage.shouldAddToCartSelectedNumberOfProducts(numberOfProducts);
        double expectedCost = unitCost * numberOfProducts;

        //then
        Assert.assertEquals(smallCartPage.shouldGetProductQuantity(), numberOfProducts);
        Assert.assertEquals(smallCartPage.shouldGetSubTotalCost(), expectedCost);
        System.out.println(smallCartPage.shouldGetSubTotalCostString());


    }
}
