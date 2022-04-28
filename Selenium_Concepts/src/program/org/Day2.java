package program.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.instagram.com/");
		
		driver.navigate().back();
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The Current Url is" +currentUrl);

		WebElement Relative1 = driver.findElement(By.xpath("//input[@type='text']"));
		Relative1.sendKeys("eshwarloganathan@gmail.com");

		WebElement Relative2 = driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[2]"));
		Relative2.sendKeys("12345678");
		
		WebElement Relative3 = driver.findElement(By.xpath("//button[@name='login']"));
		Relative3.click();
		
		
	}

}
