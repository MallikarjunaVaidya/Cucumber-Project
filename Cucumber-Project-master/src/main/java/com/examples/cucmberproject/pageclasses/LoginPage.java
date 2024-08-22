package com.examples.cucmberproject.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebDriver driver;
	
	private By myAccountLocator=By.xpath("//span[@class='caret']/ancestor::li/descendant::li/child::a[contains(text(),'Login')]");
	private By emailAddressLocator=By.name("[name='email']");
	private By passwordLocator=By.name("[name='password']");
	private By loginButtonLocator=By.className("[class='btn btn-primary']");
	private By logoutButtonLocator= By.xpath("//a[contains(@class,'list-group-item')][13]");
	//private By forgottenPasswordLocator=By.xpath("//a[contains(text(),'Forgotten Password')]");
	
	LoginPage loginPage;
	

	public void enterEmail(String email) {
		WebElement emailInput=driver.findElement(emailAddressLocator);
		emailInput.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		WebElement passwordInput=driver.findElement(passwordLocator);
		passwordInput.sendKeys(password);
	}
	
	public void clickOnMyAccount() {
		WebElement myAccountButton=driver.findElement(myAccountLocator);
		myAccountButton.click();
	}
	
	public boolean clickoOnLogoutButton() {
		return driver.findElement(logoutButtonLocator).isDisplayed();
		
	}
	
	public void clickOnLoginButton() {
		WebElement loginButton=driver.findElement(loginButtonLocator);
		loginButton.click();
	}
	
	public void login(String email,String password) {
		enterEmail(email);
		enterPassword(password);
		clickOnLoginButton();
	}
}
