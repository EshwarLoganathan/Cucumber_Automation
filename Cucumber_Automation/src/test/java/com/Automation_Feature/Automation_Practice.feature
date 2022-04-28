Feature: Dresses Selection In Automation Purchase


Scenario: Home Page

Given user Launch The Application

When user Click On The Sign-In Button And It Navigates To Sign-In Page

Scenario Outline: Sign-In Page

When user Enter The Valid "<Email-ID>" In The Email Address Field

And user Enter The Valid "<Password>" In The Password Field

Then User Click On The Sign-In Button And It Navigates To Selection Page

Examples:
|Email-ID|Password|
|Eshwarlogan@gmail.com|1234567|
|eshwarloganathan@gmail.com|Esh@123|
|eshwarloganathan@gmail.com|IamEshwar@1234|

Scenario: Women Selection page

When user Click On The Women Button and It Navigates to Women Fashion Collection Page

And user Click On The Printed Dress Image And Add The Dress To Add To Cart Section

Then user Click On The Proceed To Checkout Button And It Navigates To Shopping Cart Summary Page


Scenario: Dresses Selection Page

When user Click On The Dresses Button and It Navigates to Dresses Fashion Collection Page

And user Click On The Printed Dress Image And Add The Dress To Add To Cart Section

Then user Click On The Proceed To Checkout Button And It Navigates To Shopping Cart Summary Page

Scenario: T-Shirts Selection Page

When user Click On The T-Shirts Button and It Navigates to T-Shirts Fashion Collection Page

And user Click On The Printed Dress Image And Add The Dress To Add To Cart Section

Then user Click On The Proceed To Checkout Button And It Navigates To Shopping Cart Summary Page



Scenario: Shopping Cart Summary Page

Then user Click on The Proceed To Checkout Button And IT Navigates To Billing Address Page

Scenario: Billing Address Page

Then user Click On The Proceed To Checkout Button And It Navigates To Shipping Address Page

Scenario: Shipping Address Page

When user click On the Terms Of Service Check Box

Then user Click On The Proceed To Checkout Button And It Navigates To Payment Method Page

Scenario: Payment Method Page

Then user Click On The Pay By Bank Wire Payment Method

Scenario: Bank Wire Payment Pages

Then user Click On The I Confirm The Order Button And It Navigates to Order Confirmation Page

Scenario: Sign-Out Page

Then user Click On The Sign-Out Button And It Navigates To The Sign-In Page




