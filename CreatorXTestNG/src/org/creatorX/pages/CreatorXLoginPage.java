package org.creatorX.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatorXLoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Enter your email']")
	WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Enter your password']")
	WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;
	
	public CreatorXLoginPage(WebDriver driver) {
		 
		 this.driver = driver;  
		 
		 PageFactory.initElements(driver, this); 
	 }
	
	

}
