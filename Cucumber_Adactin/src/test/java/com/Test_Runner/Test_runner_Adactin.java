package com.Test_Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Maven_Project1.Base_Class_1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)

@CucumberOptions(
		
		features ="src\\test\\java\\com\\Adactine\\Feature\\Adactine_Runner.feature",
		
		glue = "com.Step_Definition_Adactin",
		
		monochrome = true,
		
		//dryRun = false,
		
		//strict = true,
		
		plugin = {
				"html:Cucumber_Reports/Adactin",
				"json:Cucumber_Reports/Jsonreport.json",
				//"pretty",
				"com.cucumber.listener.ExtentCucumberFormatter:Cucumber_Reports/Ext.html"
		}
		
		
		
		
		)

public class Test_runner_Adactin {
	
	public static WebDriver driver;
	
	
	@BeforeClass
	public static void set_up() {
		
		driver= Base_Class_1.browserlaunch("chrome");
		

	}
	
	@AfterClass
	public static void tear_Down() {
		
		driver.close();
		

	}

}
