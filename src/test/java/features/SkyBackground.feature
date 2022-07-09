
Feature: Sky Background Color Validation
 Background: user is on Techfios Webpage
   Given user is on Techfios Webpage
   
 @Scenario1
  Scenario:  Sky Blue Background
    
    Given  "Set SkyBlue Background" button exists
    When I click on the button
    Then the background color will change to sky blue
    

 
