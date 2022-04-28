package projectOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_MiniProject {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Runner_Class\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();

		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("Eshwarlogan");

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("eshwar1234");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement Login = driver.findElement(By.id("login"));
		Login.click();

		WebElement Location = driver.findElement(By.id("location"));

		Select s = new Select(Location);
		s.selectByValue("London");

		WebElement Hotels = driver.findElement(By.id("hotels"));

		Select s1 = new Select(Hotels);
		s1.selectByVisibleText("Hotel Sunshine");

		WebElement Room = driver.findElement(By.id("room_type"));

		Select s2 = new Select(Room);
		s2.selectByIndex(4);

		WebElement Nos = driver.findElement(By.id("room_nos"));

		Select s3 = new Select(Nos);
		s3.selectByValue("1");

		WebElement Date = driver.findElement(By.id("datepick_in"));
		Date.clear();

		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.sendKeys("01/04/2022");

		WebElement Date1 = driver.findElement(By.id("datepick_out"));
		Date1.clear();

		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.sendKeys("03/04/20222");

		WebElement Adult = driver.findElement(By.id("adult_room"));

		Select s4 = new Select(Adult);
		s4.selectByIndex(2);

		WebElement Child = driver.findElement(By.id("child_room"));

		Select s5 = new Select(Child);
		s5.selectByIndex(1);

		WebElement Submit = driver.findElement(By.id("Submit"));
		Submit.click();

		Thread.sleep(2000);

		WebElement RadioButton = driver.findElement(By.xpath("//input[@type = 'radio']"));
		RadioButton.click();

		WebElement Continue = driver.findElement(By.id("continue"));
		Continue.click();

		Thread.sleep(2000);

		WebElement Name = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		Name.sendKeys("Eshwar");

		WebElement LastName = driver.findElement(By.xpath("//input[@name='last_name']"));
		LastName.sendKeys("Loganathan");

		WebElement Address = driver.findElement(By.id("address"));
		Address.sendKeys("India,Tamilnadu,Chennai");

		WebElement Credit = driver.findElement(By.xpath("(//input[@class='reg_input'])[3]"));
		Credit.sendKeys("1234 5678 1234 5678");

		WebElement CardType = driver.findElement(By.id("cc_type"));

		Select s6 = new Select(CardType);

		s6.selectByValue("MAST");

		WebElement Day = driver.findElement(By.id("cc_exp_month"));

		Select s7 = new Select(Day);
		s7.selectByValue("4");

		WebElement Year = driver.findElement(By.id("cc_exp_year"));

		Select s8 = new Select(Year);
		s8.selectByVisibleText("2022");

		WebElement cvv = driver.findElement(By.xpath("(//input[contains(@onkeypress,'return')])[2]"));
		cvv.sendKeys("111");

		WebElement Booknow = driver.findElement(By.xpath("//input[@type='button']"));
		Booknow.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Logout = driver.findElement(By.id("logout"));
		js.executeScript("arguments[0].scrollIntoView();", Logout);

		Thread.sleep(2000);

		WebElement ClickLogout = driver.findElement(By.id("logout"));
		ClickLogout.click();

	}

}
