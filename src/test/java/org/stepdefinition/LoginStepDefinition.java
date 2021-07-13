package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.helper.BaseClass;
import org.locators.FacebookPojo;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass{
	
	 FacebookPojo f;
	 
	
	
	@Given("user is in chrome browser")
	public void user_is_in_chrome_browser() {
		chromeBrowser();
	}

	@When("user launches facebook url")
	public void user_launches_facebook_url() {
		launchUrl("https://www.facebook.com/");
	}

	@Then("user in facebook login page")
	public void user_in_facebook_login_page() {
		 maxWindow();
		 System.out.println("user is in Facebook login page");
	}
	
	@When("user enters invalid username and invalid password")
	public void user_enters_invalid_username_and_invalid_password(io.cucumber.datatable.DataTable d) {
		 f=new FacebookPojo();
		    implicitWait(5);
		    
	List<Map<String, String>> m = d.asMaps();
		  
		    
		    fillTextbox(f.getTxtEmail(), m.get(0).get("sel"));
		    fillTextbox(f.getTxtPass(), m.get(1).get("jav"));
	
	
	}
	
	@When("user enters valid username and valid password")
	public void user_enters_valid_username_and_valid_password(io.cucumber.datatable.DataTable d) {
		f=new FacebookPojo();
	    implicitWait(5);
	    
List<Map<String, String>> m = d.asMaps();
	  
	    
	    fillTextbox(f.getTxtEmail(), m.get(0).get("selenium"));
	    fillTextbox(f.getTxtPass(), m.get(1).get("java"));
	}

	

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
		btnClick(f.getBtnLogin());
	}

	@Then("user must be in invalid credentials page")
	public void user_must_be_in_invalid_credentials_page() {
		
		WebDriverWait w=new WebDriverWait(driver, 50);
		w.until(ExpectedConditions.urlContains("privacy_mutation_token"));
		String s=pageUrl();
	    if (s.contains("privacy_mutation_token")) {
			System.out.println("User is in InvalidvCredentials Page");
		
		}
	}
	@Given("user is in facebook login page")
	public void user_is_in_facebook_login_page() {
	System.out.println("User in Facebook Login Page");
	    
	}

	@When("user clicks the forgotten password")
	public void user_clicks_the_forgotten_password() {
		f=new FacebookPojo();
		f.getForgotPass().click();
	
	}
	@When("user enters the mobile number or email")
	public void user_enters_the_mobile_number_or_email() {
		f=new FacebookPojo();
		f.getMobileEmail().sendKeys("greens");
		f.getBtnSearch().click();
	}

	@Then("user is in reset password page")
	public void user_is_in_reset_password_page() {
		System.out.println("User is in Reset Password Page");
	}


}
