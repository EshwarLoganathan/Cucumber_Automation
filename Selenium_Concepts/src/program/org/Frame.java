package program.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("singleframe");
		
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("Single Frame");
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		WebElement Multi = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		Multi.click();
		
		Thread.sleep(2000);
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerframe);
		
		WebElement textbox2 = driver.findElement(By.xpath("//input[@type='text']"));
		textbox2.sendKeys("Multi Frame");
		
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		

	}

}
