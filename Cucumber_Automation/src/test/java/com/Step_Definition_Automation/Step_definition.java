package com.Step_Definition_Automation;

import org.openqa.selenium.WebDriver;

import com.Automation_Runner.Test_Runner_Automation;
import com.Maven_Project1.Maven_BaseClass1;
import com.property_Automation.File_Reader_Manager_Auto;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object_manager_automation.Page_Object_Manger_Automation;

public class Step_definition extends Maven_BaseClass1 {
	
	public static WebDriver driver = Test_Runner_Automation.driver;
	
	public static Page_Object_Manger_Automation POMA = new Page_Object_Manger_Automation(driver);
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		
String url = File_Reader_Manager_Auto.get_Instance_FRM().get_Instance_CR().get_config_url();
		
		getUrl(url);
	    
	}

	@When("^user Click On The Sign-In Button And It Navigates To Sign-In Page$")
	public void user_Click_On_The_Sign_In_Button_And_It_Navigates_To_Sign_In_Page() throws Throwable {
		
		clickonElement(POMA.getAHP().getHome_Page());
	   
	}

	@When("^user Enter The Valid <\"([^\"]*)\"> In The Email Address Field$")
	public void user_Enter_The_Valid_In_The_Email_Address_Field(String arg1) throws Throwable {
		
		//String email = File_Reader_Manager_Auto.get_Instance_FRM().get_Instance_CR().get_config_email();
		inputvalueElement(POMA.getASP().getEmail(), arg1);
	   
	}

	@When("^user Enter The Valid <\"([^\"]*)\"> In The Password Field$")
	public void user_Enter_The_Valid_In_The_Password_Field(String arg1) throws Throwable {
		
		//String password = File_Reader_Manager_Auto.get_Instance_FRM().get_Instance_CR().get_config_password();

		inputvalueElement(POMA.getASP().getPassword(), arg1);
	    
	}

	@Then("^User Click On The Sign-In Button And It Navigates To Selection Page$")
	public void user_Click_On_The_Sign_In_Button_And_It_Navigates_To_Selection_Page() throws Throwable {
		
		clickonElement(POMA.getASP().getSubmitlogin());
	    
	}

	@When("^user Click On The Women Button and It Navigates to Women Fashion Collection Page$")
	public void user_Click_On_The_Women_Button_and_It_Navigates_to_Women_Fashion_Collection_Page() throws Throwable {
	 
		
		clickonElement(POMA.getWSP().getWomen_Selection());

		action_class(POMA.getWSP().getWomen_image());

		clickonElement(POMA.getWSP().getAdd_to_Cart());

		clickonElement(POMA.getWSP().getProceed_to_check());
	}
	
	@When("^user Click On The Dresses Button and It Navigates to Dresses Fashion Collection Page$")
	public void user_Click_On_The_Dresses_Button_and_It_Navigates_to_Dresses_Fashion_Collection_Page() throws Throwable {
	   
		
		clickonElement(POMA.getDSP().getDresses_Selection());
		
		action_class(POMA.getDSP().getDress_Image());
		
		clickonElement(POMA.getDSP().getAdd_to_cart());
		
		clickonElement(POMA.getDSP().getProceed_to_checkout());
	}

	@When("^user Click On The T-Shirts Button and It Navigates to T-Shirts Fashion Collection Page$")
	public void user_Click_On_The_T_Shirts_Button_and_It_Navigates_to_T_Shirts_Fashion_Collection_Page() throws Throwable {
	  
		clickonElement(POMA.getASP().getTShirts());

		action_class(POMA.getTSP().getImage());

		clickonElement(POMA.getTSP().getAdd_to_Cart());

		clickonElement(POMA.getTSP().getProceed());

		
	}

	@When("^user Click On The Printed Dress Image And Add The Dress To Add To Cart Section$")
	public void user_Click_On_The_Printed_Dress_Image_And_Add_The_Dress_To_Add_To_Cart_Section() throws Throwable {
	   
	}

	@Then("^user Click On The Proceed To Checkout Button And It Navigates To Shopping Cart Summary Page$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_And_It_Navigates_To_Shopping_Cart_Summary_Page() throws Throwable {
	   
	}

	@Then("^user Click on The Proceed To Checkout Button And IT Navigates To Billing Address Page$")
	public void user_Click_on_The_Proceed_To_Checkout_Button_And_IT_Navigates_To_Billing_Address_Page() throws Throwable {
	    
	}

	@Then("^user Click On The Proceed To Checkout Button And It Navigates To Shipping Address Page$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_And_It_Navigates_To_Shipping_Address_Page() throws Throwable {
	    
	}

	@When("^user click On the Terms Of Service Check Box$")
	public void user_click_On_the_Terms_Of_Service_Check_Box() throws Throwable {
	    
	}

	@Then("^user Click On The Proceed To Checkout Button And It Navigates To Payment Method Page$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_And_It_Navigates_To_Payment_Method_Page() throws Throwable {
	   
	}

	@Then("^user Click On The Pay By Bank Wire Payment Method$")
	public void user_Click_On_The_Pay_By_Bank_Wire_Payment_Method() throws Throwable {
	   
	}

	@Then("^user Click On The I Confirm The Order Button And It Navigates to Order Confirmation Page$")
	public void user_Click_On_The_I_Confirm_The_Order_Button_And_It_Navigates_to_Order_Confirmation_Page() throws Throwable {
	   
	}



}
