package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features/home.feature",
        monochrome = true,
        glue = {"com.stepDefinition"},
        tags = "@homeTest",
        plugin = "json:target/cucumber-report-feature-composite.json")

@Test(retryAnalyzer = RerunTests.class)
public class TestRunner extends AbstractTestNGCucumberTests {
}
