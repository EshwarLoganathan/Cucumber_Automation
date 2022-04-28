package program.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement BestSellers = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		
		Actions ac = new Actions(driver);
		ac.contextClick(BestSellers).build().perform();
		
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement Electronics = driver.findElement(By.xpath(" //a[text() =' Electronics '] "));
		ac.contextClick(Electronics).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String str : windowHandles) {
			String title = driver.switchTo().window(str).getTitle();
			System.out.println("The Titles are : " + title);
		}
		
		String Mytitle = "Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
		
		for (String str : windowHandles) {
			
			if (driver.switchTo().window(str).getTitle().equals(Mytitle)) {
				
				break;
				
			}
			
		}
	}

}
