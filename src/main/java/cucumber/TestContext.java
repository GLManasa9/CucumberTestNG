package cucumber;

import org.openqa.selenium.WebDriver;

public class TestContext {

    public ScenarioContext scenarioContext;
    public static WebDriver driver;

    public TestContext(){
        this.scenarioContext = new ScenarioContext();
    }

    public ScenarioContext getScenarioContext(){
        return scenarioContext;
    }
}
