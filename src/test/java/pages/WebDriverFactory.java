package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {

    
    static {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");

    }
    
    public static WebDriver chromeDriverConnection () {
        
        return new ChromeDriver();
    }
}
