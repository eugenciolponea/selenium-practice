package demo.tests.products;

import com.demo.pages.ProductsPage;
import demo.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isProductHeaderDisplayed(), "\n Products Header is Not Displayed \n");

    }
}
