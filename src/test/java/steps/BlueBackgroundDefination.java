package steps;


import org.openqa.selenium.support.PageFactory;


import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BackgroundColorPage;
import pages.TestBase;

public class BlueBackgroundDefination extends TestBase {

BackgroundColorPage colorPageObj;

@Before
public void beforeRun() {
	initDriver();
	colorPageObj = PageFactory.initElements(driver, BackgroundColorPage.class);
	

}
@Given("^user is on Techfios Webpage$")
public void user_is_on_Techfios_Webpage() throws Throwable {
   driver.get("http://techfios.com/test/102/");
   
}
@Given("^\"([^\"]*)\" button exists$")
public void button_exists(String SkyBlueButton) throws Throwable {
   colorPageObj.button_exists(SkyBlueButton);
   }

@When("^I click on the button$")
public void i_click_on_the_button() throws Throwable {
    colorPageObj.skyBlueButton();
   
}

@Then("^the background color will change to sky blue$")
public void the_background_color_will_change_to_sky_blue() throws Throwable {
   
}
@Given("^\"([^\"]*)\" button is exists$")
public void button_is_exists(String SkyWhiteButton) throws Throwable {
	colorPageObj.button_exists(SkyWhiteButton);
}

@When("^I click the button$")
public void i_click_the_button() throws Throwable {
	colorPageObj.skyWhiteButton();
}

@Then("^the background color will change to white$")
public void the_background_color_will_change_to_white() throws Throwable {
   
}
}



