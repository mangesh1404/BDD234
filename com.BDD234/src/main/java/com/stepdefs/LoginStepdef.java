package com.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdef {

	WebDriver driver=null;
	
	@Given("^User should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("file:///C:/Users/LENOVO/Downloads/Offline%20Website/index.html");
	}
	@When("^User enters valid username$")
	public void user_enters_valid_username() throws Throwable {
	    driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	}
	@When("^User enters valid password$")
	public void user_enters_valid_password() throws Throwable {
	    driver.findElement(By.id("password")).sendKeys("123456");
	}
	@When("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    driver.findElement(By.xpath("//button")).click();
	}
	@Then("^User should be on home page$")
	public void user_should_be_on_home_page() throws Throwable {
	    Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());
	    
	}
}
