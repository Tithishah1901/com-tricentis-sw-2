package testsuite;
/**
 * 4. Write down the following test in the ‘TopMenuTest’
 * class
 * 1. userShouldNavigateToComputerPageSuccessfully()
 * * click on the ‘COMPUTERS’ Tab
 * * Verify the text ‘Computers’
 * 2. userShouldNavigateToElectronicsPageSuccessfully()
 * * click on the ‘ELECTRONICS’ Tab
 * * Verify the text ‘Electronics’
 * 3. userShouldNavigateToApparelAndShoesPage
 * Successfully()
 * * click on the ‘APPAREL & SHOES’ Tab
 * * Verify the text ‘Apparel & Shoes’
 * 4.
 * userShouldNavigateToDigitalDownloadsPageSuccessfully()
 * * click on the ‘DIGITAL DOWNLOADS’ Tab
 * * Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully()
 * * click on the ‘BOOKS’ Tab
 * * Verify the text ‘Books’
 * 6. userShouldNavigateToJewelryPageSuccessfully()
 * * click on the ‘JEWELRY’ Tab
 * * Verify the text ‘Jewelry’
 * 7. userShouldNavigateToGiftCardsPageSuccessfully()
 * * click on the ‘GIFT CARDS’ Tab
 * * Verify the text ‘Gift Cards’
 */

import browsefactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    static String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUpBrowser() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {

        // navigate to COMPUTERS tab
        driver.findElement(By.linkText("Computers")).click();

        String expectedText = "Computers";

        //find the welcome text with xpath locator
        String actualText = driver.findElement(By.xpath("//h1")).getText();

        //verify text with Assert Junit
        Assert.assertEquals("Computers tab text not verify", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {

        // navigate to Electronics tab
        driver.findElement(By.linkText("Electronics")).click();

        String expectedText = "Electronics";

        //find the welcome text with xpath locator
        String actualText = driver.findElement(By.xpath("//h1")).getText();

        //verify  text with Assert Junit
        Assert.assertEquals("Electronics tab text not verify", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToApparelAndShoesPageSuccessfully() {

        // navigate to Apparel & Shoes tab
        driver.findElement(By.linkText("Apparel & Shoes")).click();

        String expectedText = "Apparel & Shoes";

        //find the welcome text with xpath locator
        String actualText = driver.findElement(By.xpath("//h1")).getText();

        //verify text with Assert Junit
        Assert.assertEquals("Apparel & Shoes tab text not verify", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {

        // navigate to Digital downloads tab
        driver.findElement(By.linkText("Digital downloads")).click();

        String expectedText = "Digital downloads";

        //find the welcome text with xpath locator
        String actualText = driver.findElement(By.xpath("//h1")).getText();

        //verify text with Assert Junit
        Assert.assertEquals("Digital downloads tab text not verify", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {

        // navigate to Books tab
        driver.findElement(By.linkText("Books")).click();

        String expectedText = "Books";

        //find the welcome text with xpath locator
        String actualText = driver.findElement(By.xpath("//h1")).getText();

        //verify text with Assert Junit
        Assert.assertEquals("Book tab text not verify", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {

        // navigate to Jewelry tab
        driver.findElement(By.linkText("Jewelry")).click();

        String expectedText = "Jewelry";

        //find the welcome text with xpath locator
        String actualText = driver.findElement(By.xpath("//h1")).getText();

        //verify text with Assert Junit
        Assert.assertEquals("Jewelry tab text not verify", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {

        // navigate to Gift Cards tab
        driver.findElement(By.linkText("Gift Cards")).click();

        String expectedText = "Gift Cards";

        //find the welcome text with xpath locator
        String actualText = driver.findElement(By.xpath("//h1")).getText();

        //verify text with Assert Junit
        Assert.assertEquals("Gift Cards tab text not verify", expectedText, actualText);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}


