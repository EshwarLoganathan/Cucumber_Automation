package program.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\SeleniumLearning\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=CjwKCAiAo4OQBhBBEiwA5KWu_w0ksfYkcEf76S9sUKZpPU-Cn2B_75lFUjtr6zxbri2NEPki4w6otBoCGi0QAvD_BwE");

		driver.manage().window().maximize();

		WebElement Profile = driver.findElement(By.className("desktop-userTitle"));
		Profile.click();

		WebElement Login = driver.findElement(By.className("desktop-linkButton"));
		Login.click();

		driver.navigate().back();

		driver.navigate().to("https://www.facebook.com/");

		WebElement Username = driver.findElement(By.id("email"));
		Username.sendKeys("eshwarloganathan@gmail.com");

		WebElement Login1 = driver.findElement(By.name("login"));
		Login1.click();

		WebElement Value = driver.findElement(By.id("email"));
		String attribute = Value.getAttribute("Value");
		System.out.println("The Attribute Value is:" + attribute);

		WebElement Displayed = driver.findElement(By.id("email"));
		boolean dis = Displayed.isDisplayed();
		System.out.println("The Displayed Value is:" + dis);

		WebElement Clr = driver.findElement(By.id("email"));
		Clr.clear();

		driver.close();

	}

}
