package pom.automation_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Selection_Page {
	
	
	public WebDriver driver;

	@FindBy(xpath = "//a[@title='Women']")
	private WebElement Women_Selection;

	@FindBy(xpath = "(//img[@alt='Printed Dress'])[2]")
	private WebElement Women_image;

	@FindBy(xpath = "(//span[text()='Add to cart'])[4]")
	private WebElement Add_to_Cart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement Proceed_to_check;
	
	public Women_Selection_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen_Selection() {
		return Women_Selection;
	}

	public WebElement getWomen_image() {
		return Women_image;
	}

	public WebElement getAdd_to_Cart() {
		return Add_to_Cart;
	}

	public WebElement getProceed_to_check() {
		return Proceed_to_check;
	}


	

	}


