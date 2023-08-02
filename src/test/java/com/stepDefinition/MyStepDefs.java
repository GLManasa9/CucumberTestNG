package com.stepDefinition;

import cucumber.Context;
import cucumber.TestContext;
import cucumber.api.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class MyStepDefs {
    public TestContext testContext;

    public MyStepDefs(TestContext testContext){
        this.testContext = testContext;
    }

    @Given("user opens the Google website")
    public void openGoogle(){
        TestContext.driver.navigate().to("http://www.google.com");
    }

    @When("I enter search text {string}")
    public void iEnterSearchText(String text) {
        TestContext.driver.switchTo().activeElement().sendKeys(text);
        TestContext.driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        testContext.scenarioContext.setScenarioContext(Context.IDENTIFIER,text);
    }

    @When("I enter search text")
    public void iEnterSearchText(DataTable table) {
        String searchText = table.raw().get(0).get(0);
        TestContext.driver.switchTo().activeElement().sendKeys(searchText);
        TestContext.driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        testContext.scenarioContext.setScenarioContext(Context.IDENTIFIER,searchText);
    }
}
