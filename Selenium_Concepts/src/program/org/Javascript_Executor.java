 package program.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Executor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.oriana.com/?gclid=Cj0KCQiAmKiQBhClARIsAKtSj-maF_eDZOr7Tb5LXSLMnRrDyRkVxVzw7GpetKI54X411EIbgN4AjrQaAoN6EALw_wcB");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Feed = driver.findElement(By.xpath("//a[text()='Feedback']"));

		js.executeScript("arguments[0].scrollIntoView();", Feed);
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,-6000)");

	}

}
