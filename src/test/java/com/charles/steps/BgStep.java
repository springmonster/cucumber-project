package com.charles.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BgStep {

    @Given("this is bg given")
    public void this_is_bg_given() {
        System.out.println("this is bg given");
    }

    @When("w1")
    public void w1() {
        System.out.println("w1");
    }

    @Then("t1")
    public void t1() {
        System.out.println("t1");
    }

    @When("w2")
    public void w2() {
        System.out.println("w2");
    }

    @Then("t2")
    public void t2() {
        System.out.println("t2");
    }
}
