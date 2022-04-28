package program.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/home.html");
		driver.manage().window().maximize();

		WebElement Dropdown = driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[5]"));
		Dropdown.click();

		WebElement Multiple = driver.findElement(By.xpath("(//select)[6]"));

		Select d = new Select(Multiple);
		boolean Multi = d.isMultiple();
		System.out.println("Is Multiple :" + Multi);

		d.selectByValue("1");
		d.selectByIndex(4);
		d.selectByVisibleText("UFT/QTP");

		d.deselectByValue("3");

		System.out.println("**All Options**");
		List<WebElement> AllOptions = d.getOptions();

		for (WebElement All : AllOptions) {
			String text = All.getText();
			System.out.println(text);
		}
		System.out.println();

		System.out.println("**All Selected Options**");
		List<WebElement> allSelectedOptions = d.getAllSelectedOptions();

		for (WebElement AllSelected : allSelectedOptions) {
			String text = AllSelected.getText();
			System.out.println(text);

		}
		System.out.println();

		System.out.println("**First Selected Option**");
		WebElement firstSelectedOption = d.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
	}

}
