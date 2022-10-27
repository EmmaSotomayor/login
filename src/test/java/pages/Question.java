package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Question extends Base {

    By barraPregunta = By.cssSelector("#question");
    By botonBusqueda = By.xpath("//span[contains(text(),'Find An Expert')]");
    By ask = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/a[2]/li[1]");
    
public Question (WebDriver driver)  {
        
        super(driver);
        
    }

public void askQuestion (WebDriver driver) throws Exception {
    
    click(ask);
    Thread.sleep(3000);
    type("What can I do with Ajax", barraPregunta);
    click(botonBusqueda);
    
    
    }
public String registerMessage () {
    return " ";
}

}
