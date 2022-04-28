package projectTwo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation_Purchase {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Runner_Class\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		WebElement SignIn = driver.findElement(By.xpath("//a[@class='login']"));
		SignIn.click();

		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("eshwarloganathan@gmail.com");

		WebElement Password = driver.findElement(By.id("passwd"));
		Password.sendKeys("IamEshwar@1234");

		WebElement Submit = driver.findElement(By.id("SubmitLogin"));
		Submit.click();
		Thread.sleep(1000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\DELL\\eclipse-workspace\\Runner_Class\\Screenshots\\LoginPage.png");

		FileUtils.copyFile(source, destination);

		WebElement Tshirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		Tshirts.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 700)");
		WebElement Image = driver.findElement(By.xpath("//img[@width='250']"));

		Actions ac = new Actions(driver);
		ac.moveToElement(Image).build().perform();

		WebElement Addcart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		Addcart.click();

		WebElement Proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		Proceed.click();

		WebElement FinalProceed = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		FinalProceed.click();

		WebElement Final = driver.findElement(By.xpath("//button[@name='processAddress']"));
		Final.click();

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0, 450)");
		Thread.sleep(2000);

		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File Src = ts1.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\DELL\\eclipse-workspace\\Runner_Class\\Screenshots\\Checkout.png");
		FileUtils.copyFile(Src, des);

		WebElement Check = driver.findElement(By.id("cgv"));
		Check.click();

		WebElement FinalSubmit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		FinalSubmit.click();

		WebElement Bankwire = driver.findElement(By.xpath("//a[@class='bankwire']"));
		Bankwire.click();

		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0, 350)");

		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File Source1 = ts2.getScreenshotAs(OutputType.FILE);
		File Dest = new File("C:\\Users\\DELL\\eclipse-workspace\\Runner_Class\\Screenshots\\PaymentConfirm.png");
		FileUtils.copyFile(Source1, Dest);

		WebElement Finish = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		Finish.click();

		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0, 350)");

		TakesScreenshot ts3 = (TakesScreenshot) driver;
		File Source2 = ts3.getScreenshotAs(OutputType.FILE);
		File Dest2 = new File("C:\\Users\\DELL\\eclipse-workspace\\Runner_Class\\Screenshots\\PaymentConfirm.png");
		FileUtils.copyFile(Source2, Dest2);

	}

}
