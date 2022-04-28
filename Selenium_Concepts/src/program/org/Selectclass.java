package program.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Relative X-path with Contains and Index
		WebElement signup = driver.findElement(By.xpath("(//span[contains(@class,'css-16my406 r-poiln3 r-bcqeeo')])[5]"));
		signup.click();
		
		Thread.sleep(2000);
		
		WebElement Details = driver.findElement(By.name("name"));
		Details.sendKeys("Eshwar");
		
		WebElement Phone = driver.findElement(By.name("phone_number"));
		Phone.sendKeys("9876543210");
		
		WebElement Month = driver.findElement(By.id("SELECTOR_1"));
		
		Select d = new Select(Month);
		d.selectByValue("10");
		
		WebElement Day = driver.findElement(By.id("SELECTOR_2"));
		Select d1= new Select(Day);
		d1.selectByIndex(29);
		
		WebElement Year = driver.findElement(By.id("SELECTOR_3"));
		Select d3 = new Select(Year);
		d3.selectByVisibleText("1992");
		
	}

}
