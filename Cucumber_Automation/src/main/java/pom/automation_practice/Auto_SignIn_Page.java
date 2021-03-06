package pom.automation_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Auto_SignIn_Page {
	
	

	public WebDriver driver;
	
	@FindBy(id="email")
	private WebElement Email;
	
	@FindBy(id="passwd")
	private WebElement Password;
	
	@FindBy(id="SubmitLogin")
	private WebElement Submitlogin;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement TShirts;
	
	public Auto_SignIn_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSubmitlogin() {
		return Submitlogin;
	}

	public WebElement getTShirts() {
		return TShirts;
	}
	
	
	

}


