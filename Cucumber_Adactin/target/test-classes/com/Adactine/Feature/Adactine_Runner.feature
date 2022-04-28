Feature: Hotel Booking in Adactin Application

Scenario Outline: Login Page

Given user Launch The Application

When user Enter The "<username>" In Username Field

And user Enter The "<password>" In Password Field

Then user Click The Login Button And It navigates To Hotel Selection Page

Examples:
|username|password|
|Eshwar|1234|
|EshwarLogan|Esh1234|
|Eshwarlogan|84XW8Y|








Scenario: Search Hotel Page

When user Enter The Hotel Location

And user Select The Hotel

And user Select The Room Type

And user Select The Number Of Rooms Required

And user Select The Check In Date

And user Select The Check Out Date

And user Select The Number Of Adults Per Room

And user Select The Number of Children Per Room

Then user Click The Search Button And It Navigates To Select Hotel Page


Scenario: Hotel Selection Page

When user Click The Radio Button

Then user Click The Continue Button And It Navigates To Book A Hotel Page


Scenario: Book A Hotel Page

When user Enter The FirstName In The FirstName Field

And user Enter The LastName In The LastName Field

And user Enter The Billing Address In The Billing Address Field

And user Enter The Creditcard Number In The CreditCard Number Field

And user Enter The Creditcard Type In The Creditcard Type Field

And user Select The Expiry Month And Year In The Expiry Date Field

And user Enter The Cvv Number In The Cvv Number Field

Then user Click The Book Now Button And It Navigates To The Booking Confirmation Page