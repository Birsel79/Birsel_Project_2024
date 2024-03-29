package stepDefinitions;

import io.cucumber.java.*;

public class Hooks {
    @BeforeAll
    public static void initTest() {
        System.out.println("************ Begin Test");
        DriverSource.INSTANCE.getDriver();
    }

    @AfterAll
    public static void endTest() {
        System.out.println("************ End Test");
        DriverSource.INSTANCE.getDriver().quit();
    }

    @Before
    public void beforeScenario(Scenario s) {

        System.out.println("Before Scenario: " + s.getName());
    }
    @After
    public void afterStep(Scenario s) {

        System.out.println("After  Scenario:" + s.getName());
    }
    @BeforeStep
    public void beforeStep(Scenario s) {
        System.out.println("Before Step: " + s.getName());
    }

    @AfterStep
    public void afterScenario(Scenario s) {
        System.out.println("After  Step:" + s.getName());
    }
}
