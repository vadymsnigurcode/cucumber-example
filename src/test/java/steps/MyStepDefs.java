package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.assertEquals;

@CucumberContextConfiguration
@ContextConfiguration(classes = {CommonProfileConfiguration.class})
public class MyStepDefs {

    @Value("${test_math_operation}")
    private String testMathOperation;
    private int numA;
    private int numB;
    private int resExpected;
    private int resActual;



    @Given("addition is {int}")
    public void additionIs(int addition) {
        if (numA == 0) numA = addition;
        else numB = addition;
//        throw new cucumber.api.PendingException();
    }

    @When("summarize additions")
    public void summarizeAdditions() {
//        throw new cucumber.api.PendingException();
    }

    @Then("actual result is {int}")
    public void actualResultIs(int expected) {
        resExpected = expected;
        assertEquals(resExpected,resActual);
//        throw new cucumber.api.PendingException();
    }

    @When("get operation from config")
    public void getOperationFromConfig() {
        switch (testMathOperation) {
            case "+" : {
                resActual = numA + numB;
            }
            default: {
                resActual = numA + numB;
                break;
            }
        }
    }
}
