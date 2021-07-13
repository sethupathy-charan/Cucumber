package org.locators;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPojo extends BaseClass {
	
	public FacebookPojo(){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy
	(id="email")
	private WebElement txtEmail;
	
	@FindBy
	(id="pass")
	private WebElement txtPass;
	
	@FindBy
	(name="login")
	private WebElement btnLogin;
	
	@FindBy
	(xpath="//a[text()='கடவுச்சொல்லை மறந்துவிட்டீர்களா?']")
	private WebElement forgotPass;
	
	@FindBy
	(id="identify_email")
	private WebElement mobileEmail;
	
	@FindBy
	(id="did_submit")
	private WebElement btnSearch;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getForgotPass() {
		return forgotPass;
	}

	public WebElement getMobileEmail() {
		return mobileEmail;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	
	

}
