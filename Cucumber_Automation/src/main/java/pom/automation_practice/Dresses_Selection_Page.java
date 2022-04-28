package pom.automation_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_Selection_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//a[text()='Dresses'])[2]")
	private WebElement Dresses_Selection;
	
	@FindBy(xpath="//img[@title='Printed Dress']")
	private WebElement Dress_Image;
	
	@FindBy(xpath="//a[@title='Add to cart']")
	private WebElement Add_to_cart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement Proceed_to_checkout;

	public Dresses_Selection_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDresses_Selection() {
		return Dresses_Selection;
	}

	public WebElement getDress_Image() {
		return Dress_Image;
	}

	public WebElement getAdd_to_cart() {
		return Add_to_cart;
	}

	public WebElement getProceed_to_checkout() {
		return Proceed_to_checkout;
	}
	
	
	
	
	
	

	
	

}
