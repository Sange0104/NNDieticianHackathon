package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.RegistrationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class InvalidRegistrationSteps {
	public WebDriver driver;
	RegistrationPage Rp;
	private Object PageSource;
	private Object findElements;
	private Object findElement;
	@When("User clicks SIGN UP Button in the Sign Up form  by entering numeric text for First Name, valid values for the remaining fields")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_numeric_text_for_first_name_valid_values_for_the_remaining_fields() {
		WebDriverManager.chromedriver().setup();
		
	   driver=new ChromeDriver();
	   Rp = new RegistrationPage(driver);
		
		if(driver.getPageSource().contains("numeric FirstNAme")){
			driver.close();
			Assert.assertTrue(false);}
		else {
			Assert.assertEquals(PageSource,driver.getPageSource() );
		}
	}

	@When("User clicks SIGN UP Button in the Sign Up form  by entering numeric text for Last Name, valid values for the remaining fields")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_numeric_text_for_last_name_valid_values_for_the_remaining_fields() {
		if(driver.getPageSource().contains("numeric Last Name")){
			driver.close();
			Assert.assertTrue(false);}
		else {
			Assert.assertEquals(PageSource,driver.getPageSource() );
		}
	    
	}

	@When("User clicks SIGN UP Button in the Sign Up form  by entering Aphanumeric text for Mobile Number, valid values for the remaining field")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_aphanumeric_text_for_mobile_number_valid_values_for_the_remaining_field() {
	    
	}

	@When("User clicks SIGN UP Button in the Sign Up form  by entering numeric text for Any other field, valid values for the remaining fields")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_numeric_text_for_any_other_field_valid_values_for_the_remaining_fields() {
	   Rp.clickSignup();
	}

	@When("User clicks SIGN UP Button in the Sign Up form  by entering invalid email Id for Email,valid values for the remaining fields.")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_invalid_email_id_for_email_valid_values_for_the_remaining_fields() {
		if(driver.getPageSource().contains("Invalid email ")){
			driver.close();
			Assert.assertTrue(false);}
		else {
			Assert.assertEquals(PageSource,driver.getPageSource() );
		}
	}

	@Then("User should see a message \"Invalid data entered for \"Email\".")
	public void user_should_see_a_message_invalid_data_entered_for_email() {
		if(driver.getPageSource().contains("Invalid data entered")){
			driver.close();
			Assert.assertTrue(false);}
		else {
			Assert.assertEquals(PageSource,driver.getPageSource() );
		}
	    
	}

	@When("User clicks SIGN UP Button in the Sign Up form  by entering invalid Password , valid values for the remaining fields.")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_invalid_password_valid_values_for_the_remaining_fields() {
		if(driver.getPageSource().contains("Invalid Password")){
			driver.close();
			Assert.assertTrue(false);}
		else {
			Assert.assertEquals(PageSource,driver.getPageSource() );
		}
	}

	@When("User clicks SIGN UP Button in the Sign Up form  by entering valid values for the all fields")
	public void user_clicks_sign_up_button_in_the_sign_up_form_by_entering_valid_values_for_the_all_fields() {
		if (driver.getPageSource().contains("entering valid values for the all fields")) {
			driver.findElements(null);
			Assert.assertTrue(true);
		}
		else {
			Assert.assertEquals(findElements,driver.findElements(null));
		}
	   
	}

	@Then("User is re-directed to Sign In page")
	public void user_is_re_directed_to_sign_in_page() {
		if (driver.getCurrentUrl().contains("re-directed to Sign In page")) {
			driver.findElement(null);
			Assert.assertTrue(true);
		}
		else {
			Assert.assertEquals(findElement,driver.findElement(null));
		}
	    
	}

	@When("User clicks SIGN UP Button in the Sign Up withyour Email form  by entering numeric text for First Name, valid values for the remaining fields .")
	public void user_clicks_sign_up_button_in_the_sign_up_withyour_email_form_by_entering_numeric_text_for_first_name_valid_values_for_the_remaining_fields() {
	    
	}

	@When("User clicks SIGN UP Button in the Sign Up form with your Email by entering numeric text for Last Name, valid values for the remaining fields")
	public void user_clicks_sign_up_button_in_the_sign_up_form_with_your_email_by_entering_numeric_text_for_last_name_valid_values_for_the_remaining_fields() {
	   
	}

	@When("User clicks SIGN UP Button in the Sign Up form with your Email by entering numeric text for Username, valid values for the remaining fields")
	public void user_clicks_sign_up_button_in_the_sign_up_form_with_your_email_by_entering_numeric_text_for_username_valid_values_for_the_remaining_fields() {
	    
	}

	@When("User clicks SIGN UP Button in the Sign Up form with your Email by entering invalid Email Address, valid values for the remaining fields")
	public void user_clicks_sign_up_button_in_the_sign_up_form_with_your_email_by_entering_invalid_email_address_valid_values_for_the_remaining_fields() {
	    
	}

	@When("User clicks SIGN UP Button in the Sign Up form with your Email by entering invalid Password valid values for the remaining fields")
	public void user_clicks_sign_up_button_in_the_sign_up_form_with_your_email_by_entering_invalid_password_valid_values_for_the_remaining_fields() {
	   
	}

	

}
