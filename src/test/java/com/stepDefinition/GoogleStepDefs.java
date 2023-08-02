package com.stepDefinition;

import cucumber.Context;
import cucumber.TestContext;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleStepDefs {
    public TestContext testContext;

    public GoogleStepDefs(TestContext testContext){
        this.testContext = testContext;
    }

    @Then("I verify the value is stored")
    public void verifyContextValue(){
        String text = (String) testContext.getScenarioContext().getContext(Context.IDENTIFIER);
        WebDriverWait wait = new WebDriverWait(TestContext.driver, Duration.ofSeconds(30));
        TestContext.driver.navigate().to("http://www.google.com");
        TestContext.driver.switchTo().activeElement().sendKeys(text);
    }
}
