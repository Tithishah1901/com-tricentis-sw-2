package browsefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    /**
     * Create the package ‘browserfactory’ and create the
     * class with the name ‘BaseTest’ inside the
     * ‘browserfactory’ package. And write the browser setup
     * code inside the class ‘BaseTest’.
     */

    public static WebDriver driver;

    public void openBrowser(String baseUrl){
        driver = new ChromeDriver();
        //load the url
        driver.get(baseUrl);

        //maximize the browser window
        driver.manage().window().maximize(); // maximise the browser window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public void closeBrowser(){
        driver.quit();
    }
}
