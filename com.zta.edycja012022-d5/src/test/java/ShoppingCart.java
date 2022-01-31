import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ShoppingCart extends BaseTest {
    @BeforeMethod
    public void openPage() {
        driver.get("http://146.59.32.4/index.php?id_product=6&rewrite=mug-the-best-is-yet-to-come&controller=product&id_lang=2");
    }

    @Test
    public void shouldAddSomethingToCart() {
        driver.findElement(By.cssSelector(".add>button")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        //driver.manage().timeouts().implicityWait(Duration.ofSeconds(5));
        //WebElement tenGuzik = driver.findElement(By.cssSelector(".cart-content-btn>.btn-primary"));

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".cart-content-btn>.btn-primary")));
        driver.findElement(By.cssSelector(".cart-content-btn>.btn-primary")).click();
        //tu mozna czekac na przeladowanie kosza
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "SHOPPING CART");
        driver.findElement(By.className("remove-from-cart")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".remove-from-cart")));
        Assert.assertEquals(driver.findElement(By.className("no-items")).getText(), "There are no more items in your cart");

    }

    @Test
    public void shouldAddSomethingToCartTwice() {
        //dodanie do koszyka

        driver.findElement(By.cssSelector(".add>button")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".cart-content-btn>.btn-secondary")));
        //dodanie do koszyka #2
        driver.findElement(By.cssSelector(".cart-content-btn>.btn-secondary")).click();
        driver.findElement(By.cssSelector(".add>button")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".cart-content-btn>.btn-primary")));
        driver.findElement(By.cssSelector(".cart-content-btn>.btn-primary")).click();
        //sprawdzenie czy jestem w koszyku
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "SHOPPING CART");
        //sprawdzenie ilosci w koszyku
        Assert.assertEquals(driver.findElement(By.cssSelector(".js-cart-line-product-quantity")).getAttribute("value"), "2");
        //usunięcie elementów
        driver.findElement(By.className("remove-from-cart")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".remove-from-cart")));
        //weryfikacja czy wszystko usuniete
        Assert.assertEquals(driver.findElement(By.className("no-items")).getText(), "There are no more items in your cart");

    }
    @Test
    public void shouldAddSomethingToCartThird() {
        //dodanie do koszyka
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        int nMugs=4;
        for (int i=0; i<(nMugs-1); i++) {
            driver.findElement(By.cssSelector(".add>button")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".cart-content-btn>.btn-secondary")));
            driver.findElement(By.cssSelector(".cart-content-btn>.btn-secondary")).click();
        }
        //dodanie do koszyka #2
               driver.findElement(By.cssSelector(".add>button")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".cart-content-btn>.btn-primary")));
        driver.findElement(By.cssSelector(".cart-content-btn>.btn-primary")).click();
        //sprawdzenie czy jestem w koszyku
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "SHOPPING CART");
        //sprawdzenie ilosci w koszyku
        Assert.assertEquals(driver.findElement(By.cssSelector(".js-cart-line-product-quantity")).getAttribute("value"), String.valueOf(nMugs));
        //usunięcie elementów
        driver.findElement(By.className("remove-from-cart")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".remove-from-cart")));
        //weryfikacja czy wszystko usuniete
        Assert.assertEquals(driver.findElement(By.className("no-items")).getText(), "There are no more items in your cart");

    }}

