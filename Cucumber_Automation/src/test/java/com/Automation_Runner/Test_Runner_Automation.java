package com.Automation_Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Maven_Project1.Maven_BaseClass1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		

		features ="src\\test\\java\\com\\Automation_Feature\\Automation_Practice.feature",
		
		glue = "com.Step_Definition_Adactin",
		
		monochrome = true,
		
		dryRun = false,
		
		strict = true,
		
		plugin = {
				"html:Cucumber_Reports/Automation",
				"json:Cucumber_Reports/Jsonreport.json",
				//"pretty",
			//	"com.cucumber.listener.ExtentCucumberFormatter:Cucumber_Reports.html"
		}
		
		
		
		
		
		
		)



public class Test_Runner_Automation {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_up() {
		
		 driver = Maven_BaseClass1.browserlaunch("chrome");
		

	}
	
	@AfterClass
	public static void tear_Down() {
		
		driver.close();
		

	}

}


