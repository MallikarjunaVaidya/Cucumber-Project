package com.examples.cucmberproject.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.examples.cucmberproject.pageclasses.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class LoginPageStepDef {

	private LoginPage loginPage;
	private WebDriver driver;
	
	@Before
	public void setup() {
		driver=new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	

@Given("as the user lands on login page")
public void as_the_user_lands_on_login_page() {
	driver.get("https://naveenautomationlabs.com/opencart/");
	
}
@Given ("as the user enters valid email and password")
public void  as_the_user_enters_valid_email_and_password() {
	loginPage.enterEmail("qatester@gmail.com");
	loginPage.enterPassword("Test@123");
}
@Given ("as the user enters invalid {String} and {String}")
public void as_the_user_enters_invalid_and(String username, String password) {
	loginPage.enterEmail(username);
	loginPage.enterPassword(password);
}
@And ("clicks on the login button")
public void clicks_on_the_login_button() {
	loginPage.clickOnLoginButton();
}
@Then ("user should be able to login in successfully")
public void user_should_be_able_to_login_in_successfully() {
	Assert.assertEquals(loginPage.clickoOnLogoutButton(),true);
}

@Then ("User should see an error message indicating {String}")
public void  User_should_see_an_error_message_indicating(String errorMessage) {
	Assert.assertEquals(driver.findElement(By.className(".alert alert-danger alert-dismissible")).isDisplayed(),true);
}
}








