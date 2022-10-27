package Question;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import pages.Login;
import pages.Question;
import pages.WebDriverFactory;



class PrimerTest {
   
    private WebDriver driver;
    Login login;
    Question question;
    
    
    @BeforeEach
    void setUp() throws Exception {
        
        driver = WebDriverFactory.chromeDriverConnection();    
        login = new Login(driver);      
        question = new Question(driver);
    }

    @AfterEach
    void tearDown() throws Exception {
        driver.close();
    }

    @Test
    void test() throws Exception {
        login.loginSession(driver);
        Thread.sleep(3000);
        question.askQuestion(driver);
    }
    

}