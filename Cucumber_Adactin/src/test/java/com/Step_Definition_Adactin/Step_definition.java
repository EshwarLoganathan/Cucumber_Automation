package com.Step_Definition_Adactin;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Maven_Project1.Base_Class_1;
import com.Test_Runner.Test_runner_Adactin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object_manager_Adactin.Page_Object_Manager_Adactin;

public class Step_definition extends Base_Class_1 {
	
	public static WebDriver driver = Test_runner_Adactin.driver;
	
	public static Page_Object_Manager_Adactin pom = new Page_Object_Manager_Adactin(driver);
	
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		
		getUrl("http://adactinhotelapp.com/");
	    
	    
	}
	
	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String arg1) throws Throwable {
		
		inputvalueElement(pom.get_Instance_Hp().getUsername(), arg1);
	    
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String arg1) throws Throwable {
		
		inputvalueElement(pom.get_Instance_Hp().getPasswd(), arg1);
	   
	}
	
	



	

	
	@Then("^user Click The Login Button And It navigates To Hotel Selection Page$")
	public void user_Click_The_Login_Button_And_It_navigates_To_Hotel_Selection_Page() throws Throwable {
		
		clickonElement(pom.get_Instance_Hp().getLogin());
	   
	   
	}


	@When("^user Enter The Hotel Location$")
	public void user_Enter_The_Hotel_Location() throws Throwable {
		
		
		String Location = Particular_Cell_Data(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Test Case - Adactine.xlsx", 7, 5);
		dropdown("byvalue", pom.get_Instance_Sp().getLocation(), Location);
	   
	   
	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		String Hotel = Particular_Cell_Data(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Test Case - Adactine.xlsx", 8, 5);
		
		dropdown("bytext", pom.get_Instance_Sp().getHotels(), Hotel);
	  
	   
	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		
		dropdown("byvalue",pom.get_Instance_Sp().getRoomType(), "Super Deluxe");
	   
	    
	}

	@When("^user Select The Number Of Rooms Required$")
	public void user_Select_The_Number_Of_Rooms_Required() throws Throwable {
		dropdown("byvalue", pom.get_Instance_Sp().getRoomNos(), "1");
		
	    
	}

	@When("^user Select The Check In Date$")
	public void user_Select_The_Check_In_Date() throws Throwable {
		
		clear(pom.get_Instance_Sp().getDatepick_in());

		inputvalueElement(pom.get_Instance_Sp().getDatepick_in(), "01/04/2022");

	   
	}

	@When("^user Select The Check Out Date$")
	public void user_Select_The_Check_Out_Date() throws Throwable {
		
		clear(pom.get_Instance_Sp().getDatepick_out());

		inputvalueElement(pom.get_Instance_Sp().getDatepick_out(), "03/04/20222");
	    
	}

	@When("^user Select The Number Of Adults Per Room$")
	public void user_Select_The_Number_Of_Adults_Per_Room() throws Throwable {
		
		dropdown("byIndex", pom.get_Instance_Sp().getAdultroom(), "2");
	    
	}

	@When("^user Select The Number of Children Per Room$")
	public void user_Select_The_Number_of_Children_Per_Room() throws Throwable {
		
		dropdown("byIndex", pom.get_Instance_Sp().getChildroom(), "1");
	}

	@Then("^user Click The Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
		
		clickonElement(pom.get_Instance_Sp().getSubmit());
	    
	}

	@When("^user Click The Radio Button$")
	public void user_Click_The_Radio_Button() throws Throwable {
		
		clickonElement(pom.get_Instance_Cp().getCheckBox());
	    
	}

	@Then("^user Click The Continue Button And It Navigates To Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
		
		clickonElement(pom.get_Instance_Cp().getContinue());
	    
	}

	@When("^user Enter The FirstName In The FirstName Field$")
	public void user_Enter_The_FirstName_In_The_FirstName_Field() throws Throwable {
		String Firstname = Particular_Cell_Data(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Test Case - Adactine.xlsx", 18, 5);
		inputvalueElement(pom.get_Instance_Pc().getFirst_Name(), Firstname);
	   
	}

	@When("^user Enter The LastName In The LastName Field$")
	public void user_Enter_The_LastName_In_The_LastName_Field() throws Throwable {
		String Lastname = Particular_Cell_Data(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Test Case - Adactine.xlsx", 19, 5);
		inputvalueElement(pom.get_Instance_Pc().getLast_Name(), Lastname);

		
	    
	}

	@When("^user Enter The Billing Address In The Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_The_Billing_Address_Field() throws Throwable {
		String Address = Particular_Cell_Data(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Test Case - Adactine.xlsx", 20, 5);
		inputvalueElement(pom.get_Instance_Pc().getAddress(), Address);
	   
	}

	@When("^user Enter The Creditcard Number In The CreditCard Number Field$")
	public void user_Enter_The_Creditcard_Number_In_The_CreditCard_Number_Field() throws Throwable {
		
		String Cardnumber = Particular_Cell_Data(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Test Case - Adactine.xlsx", 21, 5);
		inputvalueElement(pom.get_Instance_Pc().getCredit(), Cardnumber);
	    
	}
	
	

	@When("^user Enter The Creditcard Type In The Creditcard Type Field$")
	public void user_Enter_The_Creditcard_Type_In_The_Creditcard_Type_Field() throws Throwable {
		String Cardtype = Particular_Cell_Data(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Test Case - Adactine.xlsx", 22, 5);
		
		dropdown("byValue", pom.get_Instance_Pc().getCard_type(), Cardtype);
		
	    
	}
	

	@When("^user Select The Expiry Month And Year In The Expiry Date Field$")
	public void user_Select_The_Expiry_Month_And_Year_In_The_Expiry_Date_Field() throws Throwable {
		
		dropdown("byValue", pom.get_Instance_Pc().getExp_Month(), "4");
		
		dropdown("byText", pom.get_Instance_Pc().getExp_Year(), "2022");
		
		
	}

	@When("^user Enter The Cvv Number In The Cvv Number Field$")
	public void user_Enter_The_Cvv_Number_In_The_Cvv_Number_Field() throws Throwable {
		String Cvv = Particular_Cell_Data(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_Project1\\Test Case - Adactine.xlsx", 24, 5);
		inputvalueElement(pom.get_Instance_Pc().getCvv(), Cvv);
	   
	    
	}

	@Then("^user Click The Book Now Button And It Navigates To The Booking Confirmation Page$")
	public void user_Click_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation_Page() throws Throwable{
		
		implicitly_wait(5, TimeUnit.SECONDS);
		clickonElement(pom.get_Instance_Pc().getBook_Now());
		
		

		
		
		
		
	   
	    
	}



}
