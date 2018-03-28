package com.qa.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.Assert.assertEquals;

public class myCalc {

    private App myCalc;
    private int additionResult;
    private int multiplicationResult;

    @Given("^I have a calculator$")
    public void initialiseCalculator(){
    myCalc = new App();

    }

    @When("^I add two integers 3 and 4$")
    public void addTwoIntegers(){
        additionResult = myCalc.add(3,4);
    }

    @Then("^I should get 7$")
    public void checkAddResult(){
        assertEquals(7,additionResult);
    }

    @When("^I multiply two integers 5 and 3$")
    public void multiplyTwoIntegers(){
        multiplicationResult = myCalc.multiply(5,3);
    }

    @Then("^I should get 15$")
    public void checkMultiplyResult(){
        assertEquals(15,multiplicationResult);

    }
}
