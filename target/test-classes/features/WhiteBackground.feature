Feature: Sky Background Color Validation
 Background: user is on Techfios Webpage
   Given user is on Techfios Webpage
   
   @Scenario2
   Scenario: White Background Change
    Given "Set SkyWhite Background" button is exists
    When I click the button
    Then the background color will change to white

   