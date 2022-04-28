package program.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Options {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();

		WebElement Double = driver.findElement(By.id("doubleClickBtn"));

		Actions ac = new Actions(driver);
		ac.doubleClick(Double).build().perform();

		WebElement Right = driver.findElement(By.id("rightClickBtn"));
		ac.contextClick(Right).build().perform();

		WebElement Click = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		ac.click(Click).build().perform();
		Thread.sleep(2000);

		driver.navigate().to("http://www.leafground.com/");

		WebElement Drop = driver.findElement(By.xpath("//img[@alt='drop']"));
		Drop.click();

		WebElement Drag = driver.findElement(By.id("draggable"));
		WebElement Droppable = driver.findElement(By.id("droppable"));
		ac.dragAndDrop(Drag, Droppable).build().perform();

		driver.navigate().back();
		Thread.sleep(2000);

		WebElement Image = driver.findElement(By.xpath("//img[@alt='Images']"));
		ac.moveToElement(Image).build().perform();

	}

}
