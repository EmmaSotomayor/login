package Ingoing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import pages.Login;

class c3199_Test {

    private WebDriver driver;
    Login login;
    
    
    @BeforeEach
    void setUp() throws Exception {
        login = new Login(driver);
        driver = login.chromeDriverConnection();
        
    }

    @AfterEach
    void tearDown() throws Exception {
        driver.close();
    }

    @Test
    void test() throws Exception {
        login.loginSession(driver);
    }
    

}
