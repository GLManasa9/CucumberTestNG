package com.stepDefinition;

import cucumber.TestContext;
import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class ServiceHooks {

    public TestContext testContext;

    public ServiceHooks(TestContext testContext){
        this.testContext = testContext;
    }


    @Before
    public void setup(Scenario scenario) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Scenario : " + scenario.getName());
        System.out.println("-----------------------------------------------------------");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("--start-maximized");
//        WebDriverManager.chromedriver().setup();
//        TestContext.driver = new ChromeDriver(options);
        WebDriverManager.edgedriver().setup();
        TestContext.driver = new EdgeDriver();
    }

    @BeforeStep
    public void beforeStep(){
        System.out.println("before step");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("after step");
    }

    @After
    public void tearDown(){
        System.out.println("Quit the driver......................");
        TestContext.driver.quit();
    }
}
