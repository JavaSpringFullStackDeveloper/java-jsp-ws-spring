package com.eara.springtutorial;

import com.eara.springtutorial.bdd.EvenOddBddExample;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class EvenOddStepdef {

    private EvenOddBddExample evenOddBddExample;
    String result;

    @Given( "^Create the even odd check instance$" )
    public void createTheEvenOddCheckInstance() {
        evenOddBddExample = new EvenOddBddExample();
    }

    @When( "^I will pass (\\d+)$" )
    public void iWillPass(int arg0) {
        result = evenOddBddExample.check(arg0);
    }

    @Then( "^output should be \"([^\"]*)\"$" )
    public void outputShouldBe(String arg0) throws Throwable {
        Assert.assertEquals(arg0, result);
    }


}
