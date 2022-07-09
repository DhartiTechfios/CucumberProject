package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackgroundColorPage {

	WebDriver driver;

	public BackgroundColorPage(WebDriver driver) {
		this.driver = driver;
		
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//span/child::button[1]")
	WebElement SkyBlueButton;
	@FindBy(how = How.XPATH, using = "//span/child::button[2]")
	WebElement SkyWhiteButton;
	
	

	// Method to interact with the elements
	
public void button_exists(String skyBlueButton) {
		
		SkyBlueButton.isDisplayed();
	}

	public void skyBlueButton()  {
	       SkyBlueButton.click();
	   	
	}

	public void backGroundColorChange() {
		SkyBlueButton.isSelected();
		
	}
	public  String getPageTitle() {
		return driver.getTitle();

	}
	public void whiteButton_exists(String skyWhiteButton) {
	SkyWhiteButton.isDisplayed();
     }
	public void skyWhiteButton()  {
	       SkyWhiteButton.click();
	   	
	}
	public void backGroundColorChange2() {
		SkyWhiteButton.isSelected();
		
	}
	public  String getPageTitle1() {
		return driver.getTitle();

	}
}
