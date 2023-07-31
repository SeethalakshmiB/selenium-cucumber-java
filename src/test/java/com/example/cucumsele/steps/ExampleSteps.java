package com.example.cucumsele.steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;


public class ExampleSteps {

//    @Inject
    private WebDriver webDriver = new FirefoxDriver();

    @Given("^I search for \"([^\"]*)\"$")
    public void i_search_for(String arg1) {
    	this.webDriver.get("https://www.google.com");
    }

    @Then("^I google should show me results!$")
    public void i_google_should_show_me_results() {
    	System.out.println("Success!!!");
    	this.webDriver.close();
    }
}