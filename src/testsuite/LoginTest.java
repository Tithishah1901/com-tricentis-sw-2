package testsuite;

/**
 * Write down the following test in the ‘LoginTest’ class
 * 1. userShouldNavigateToLoginPageSuccessfully()
 * * click on the ‘Login’ link
 * * Verify the text ‘Welcome, Please Sign
 * In!’
 * 2. userShouldLoginSuccessfullyWithValidCredentials()
 * * click on the ‘Login’ link
 * * Enter a valid username
 * * Enter a valid password
 * * Click on the ‘Login’ button
 * * Verify the ‘Welcome to our store’
 * text is displayed
 * 3. verifyTheErrorMessage()
 * * click on the ‘Login’ link
 * * Enter the invalid username
 * * Enter the invalid password
 * * Click on the ‘Login’ button
 * * Verify the error message ‘Login was unsuccessful.
 * Please correct the errors and try again. No customer account found’
 */

import browsefactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    static String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUpBrowser(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {

        // find the login element and click on it
        driver.findElement(By.linkText("Log in")).click();

        String expectedText = "Welcome, Please Sign In!";

        //find the welcome text with xpath locator
        String actualText = driver.findElement(By.xpath("//h1")).getText();

        //verify the welcome text with Assert Junit

        Assert.assertEquals("Login Click is not working", expectedText, actualText);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        // find the login element and click on it
        driver.findElement(By.linkText("Log in")).click();

        // Enter the required details
        driver.findElement(By.id("Email")).sendKeys("primetest@test.com");
        driver.findElement(By.id("Password")).sendKeys("123456");

        // click on Login button
        driver.findElement(By.xpath("//input[@value = 'Log in']")).click();

        //verify the login complete text
        String expectedText = "Welcome to our store";
        String actualText = driver.findElement(By.xpath("//h2")).getText();

        // Verify with Assert Junit test
        Assert.assertEquals("Log-in not successfully", expectedText, actualText);

    }
    @Test
    public void verifyErrorMessage() {

        // find the login element and click on it
        driver.findElement(By.linkText("Log in")).click();

        // Enter the required details
        driver.findElement(By.id("Email")).sendKeys("testprime@test.com");
        driver.findElement(By.id("Password")).sendKeys("123456");

        // click on Login button
        driver.findElement(By.xpath("//input[@value = 'Log in']")).click();

        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        String actualText = driver.findElement(By.xpath("//div[@class = 'validation-summary-errors']")).getText();

        Assert.assertEquals("Log-in Not successfully.", expectedText, actualText);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
