package org.stepdefinition;

import org.helper.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	
	@Before(order=1)
	public void beforeForgotPass1() {
		chromeBrowser();
	}
	
	@Before(order=2)
	public void beforeForgotPass2() {
		maxWindow();
		launchUrl("https://www.facebook.com/");
	}
	@Before(order=3)
	public void beforeForgotPass3() {
		
		 System.out.println("user is in Facebook login page");
	}
	
	@Before(order=4)
	public void beforeScenario() {
	
		dateAndTime();
		System.out.println("scenario Started");
		
	}


	@After(order=1)
	public void afterScenario(Scenario s) {
		
		if(s.isFailed()) {
			TakesScreenshot tk=(TakesScreenshot)driver;
			byte[] d = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(d, "image/png");
		}
		
		dateAndTime();
		System.out.println("scenario Completed");
		
	}
	}
