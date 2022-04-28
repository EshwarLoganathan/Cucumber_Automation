$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/Adactine/Feature/Adactine_Runner.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking in Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cusername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user Enter The \"\u003cpassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user Click The Login Button And It navigates To Hotel Selection Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;login-page;;1"
    },
    {
      "cells": [
        "Eshwar",
        "1234"
      ],
      "line": 15,
      "id": "hotel-booking-in-adactin-application;login-page;;2"
    },
    {
      "cells": [
        "EshwarLogan",
        "Esh1234"
      ],
      "line": 16,
      "id": "hotel-booking-in-adactin-application;login-page;;3"
    },
    {
      "cells": [
        "Eshwarlogan",
        "84XW8Y"
      ],
      "line": 17,
      "id": "hotel-booking-in-adactin-application;login-page;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"Eshwar\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user Enter The \"1234\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user Click The Login Button And It navigates To Hotel Selection Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 1942802100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Eshwar",
      "offset": 16
    }
  ],
  "location": "Step_definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 211543300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 16
    }
  ],
  "location": "Step_definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 148643100,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Click_The_Login_Button_And_It_navigates_To_Hotel_Selection_Page()"
});
formatter.result({
  "duration": 566254500,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"EshwarLogan\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user Enter The \"Esh1234\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user Click The Login Button And It navigates To Hotel Selection Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 412459900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EshwarLogan",
      "offset": 16
    }
  ],
  "location": "Step_definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 153328900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Esh1234",
      "offset": 16
    }
  ],
  "location": "Step_definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 135865700,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Click_The_Login_Button_And_It_navigates_To_Hotel_Selection_Page()"
});
formatter.result({
  "duration": 447678400,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"Eshwarlogan\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user Enter The \"84XW8Y\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user Click The Login Button And It navigates To Hotel Selection Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 401853100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Eshwarlogan",
      "offset": 16
    }
  ],
  "location": "Step_definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 151536800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "84XW8Y",
      "offset": 16
    }
  ],
  "location": "Step_definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 129700900,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Click_The_Login_Button_And_It_navigates_To_Hotel_Selection_Page()"
});
formatter.result({
  "duration": 2334128200,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Search Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "user Enter The Hotel Location",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user Select The Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Select The Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Select The Number Of Rooms Required",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Select The Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Select The Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Select The Number Of Adults Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Select The Number of Children Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user Click The Search Button And It Navigates To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_Enter_The_Hotel_Location()"
});
formatter.result({
  "duration": 1582103600,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Select_The_Hotel()"
});
formatter.result({
  "duration": 386506400,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Select_The_Room_Type()"
});
formatter.result({
  "duration": 257518000,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Select_The_Number_Of_Rooms_Required()"
});
formatter.result({
  "duration": 146589600,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Select_The_Check_In_Date()"
});
formatter.result({
  "duration": 265558300,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Select_The_Check_Out_Date()"
});
formatter.result({
  "duration": 275004100,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Select_The_Number_Of_Adults_Per_Room()"
});
formatter.result({
  "duration": 289319000,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Select_The_Number_of_Children_Per_Room()"
});
formatter.result({
  "duration": 268778800,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 1495758000,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "Hotel Selection Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;hotel-selection-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 49,
  "name": "user Click The Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "user Click The Continue Button And It Navigates To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_Click_The_Radio_Button()"
});
formatter.result({
  "duration": 129256200,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Click_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 863550500,
  "status": "passed"
});
formatter.scenario({
  "line": 54,
  "name": "Book A Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;book-a-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 56,
  "name": "user Enter The FirstName In The FirstName Field",
  "keyword": "When "
});
formatter.step({
  "line": 58,
  "name": "user Enter The LastName In The LastName Field",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "user Enter The Billing Address In The Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "user Enter The Creditcard Number In The CreditCard Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "user Enter The Creditcard Type In The Creditcard Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "user Select The Expiry Month And Year In The Expiry Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "user Enter The Cvv Number In The Cvv Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "user Click The Book Now Button And It Navigates To The Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.user_Enter_The_FirstName_In_The_FirstName_Field()"
});
formatter.result({
  "duration": 271761000,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Enter_The_LastName_In_The_LastName_Field()"
});
formatter.result({
  "duration": 255519300,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Enter_The_Billing_Address_In_The_Billing_Address_Field()"
});
formatter.result({
  "duration": 296526600,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Enter_The_Creditcard_Number_In_The_CreditCard_Number_Field()"
});
formatter.result({
  "duration": 304629000,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Enter_The_Creditcard_Type_In_The_Creditcard_Type_Field()"
});
formatter.result({
  "duration": 286195700,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Select_The_Expiry_Month_And_Year_In_The_Expiry_Date_Field()"
});
formatter.result({
  "duration": 411665700,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Enter_The_Cvv_Number_In_The_Cvv_Number_Field()"
});
formatter.result({
  "duration": 226714600,
  "status": "passed"
});
formatter.match({
  "location": "Step_definition.user_Click_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 148630500,
  "status": "passed"
});
});