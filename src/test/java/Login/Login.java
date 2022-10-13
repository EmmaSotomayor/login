package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends Base {
	
	By iniciarLocator = By.linkText("Iniciar sesión");
	By userLocator = By.id("email");
	By passLocator = By.id("password");
	By enter = By.tagName("button");
	By welcome = By.cssSelector("div.jss1 main.jss2 div.MuiContainer-root.jss61.MuiContainer-maxWidthLg div.MuiGrid-root.jss62.MuiGrid-container.MuiGrid-spacing-xs-2:nth-child(1) div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-6 > p.MuiTypography-root.jss63.MuiTypography-body1");
	//By quienLocator = By.xpath("//span[contains(text(),'Quién ha visto tu perfil')]");
	
	
	public Login (WebDriver driver)  {
		
		super(driver);
		
	}
	
	public void loginSession (WebDriver driver) throws Exception  {
		
		visit("https://development.radar4.io/");
		type("emmanuel.ayala@accelone.com", userLocator);
		Thread.sleep(4000);
		type("test1234", passLocator);
		Thread.sleep(4000);
		click(enter);
		Thread.sleep(10000);

	}

	
	public String registerMessage () {
		return " ";
	}

}
