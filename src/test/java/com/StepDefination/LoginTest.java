package com.StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	 WebDriver driver;

	@Given("user should be open chrome browser")
	public void user_should_be_open_chrome_browser() {
		driver = new ChromeDriver();
		driver.get("https://javabykiran.com/liveproject/pages/examples/logout.html");
	}

	@When("user enter username, password")
	public void user_enter_username_password() {
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
	}

	@And("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	}

	@Then("page should be navigate home page")
	public void page_should_be_navigate_home_page() {
		Assert.assertEquals(driver.getTitle(), "Welcome");
	}

	@And("close the browser")
	public void close_the_browser() {
		driver.close();
	}
	
	@When("user enter wrong username, password")
	public void user_enter_wrong_username_password() {
	   driver.findElement(By.id("email")).sendKeys("ABC@gmail.com");
	   driver.findElement(By.id("password")).sendKeys("654321");
	}

	@Then("error message should be displayed to user")
	public void error_message_should_be_displayed_to_user() {
	  String ActualErrorMassege =  driver.findElement(By.id("email_error")).getText();
	  Assert.assertEquals("Please enter email as kiran@gmail.com", ActualErrorMassege);
	}

}
