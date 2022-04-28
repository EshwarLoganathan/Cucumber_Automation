package projectTwo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_SignIn {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Runner_Class\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		WebElement Login = driver.findElement(By.xpath("//a[@class='login']"));
		Login.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebElement Create = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		Create.sendKeys("eshwarloganathan@gmail.com");

		WebElement CreateButton = driver.findElement(By.id("SubmitCreate"));
		CreateButton.click();

		WebElement Mr = driver.findElement(By.xpath("//label[@for='id_gender1']"));
		Mr.click();

		WebElement First = driver.findElement(By.id("customer_firstname"));
		First.sendKeys("Eshwar");

		WebElement Last = driver.findElement(By.id("customer_lastname"));
		Last.sendKeys("Loganathan");

		WebElement Pass = driver.findElement(By.id("passwd"));
		Pass.sendKeys("IamEshwar@1234");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,2000)");

		WebElement Day = driver.findElement(By.id("days"));

		Select s = new Select(Day);
		s.selectByValue("29");

		WebElement Month = driver.findElement(By.id("months"));
		Select s1 = new Select(Month);

		s1.selectByValue("10");

		WebElement Year = driver.findElement(By.id("years"));

		Select s2 = new Select(Year);
		s2.selectByVisibleText("1992  ");

		WebElement Company = driver.findElement(By.id("company"));
		Company.sendKeys("Cognizant");

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,500)");

		WebElement Address = driver.findElement(By.name("address1"));
		Address.sendKeys("No.15, 4th Street");

		WebElement Address1 = driver.findElement(By.name("address2"));
		Address1.sendKeys("Nandhambakkam");

		WebElement City = driver.findElement(By.id("city"));
		City.sendKeys("Chennai");

		WebElement State = driver.findElement(By.id("id_state"));
		Select s3 = new Select(State);
		s3.selectByValue("5");

		WebElement Postal = driver.findElement(By.id("postcode"));
		Postal.sendKeys("90210");

		WebElement Mobile = driver.findElement(By.id("phone_mobile"));
		Mobile.sendKeys("9710743843");

		WebElement Register = driver.findElement(By.id("submitAccount"));
		Register.click();

		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,500)");

		driver.get("http://automationpractice.com/index.php?controller=my-account");

	}

}
