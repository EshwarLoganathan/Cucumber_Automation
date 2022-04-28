package com.Maven_Bo_Furniture;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class {
	
		
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\com.Maven_Bo_Furniture\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.boconcept.com/hi-in/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		
		
		
		
	}

}
