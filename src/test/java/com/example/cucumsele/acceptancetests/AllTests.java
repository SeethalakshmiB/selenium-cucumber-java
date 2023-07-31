package com.example.cucumsele.acceptancetests;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.example.cucumsele"},
        features = ".",
//        format = {"pretty", "json:target/cucumber-reports/cucumber.json"},
        tags = "@complete"
)
public class AllTests {
}