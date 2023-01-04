package com.charles.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OutlineStep {
    @Given("GO1")
    public void go1() {
        System.out.println("Go1");
    }

    @When("input {string}")
    public void input(String string) {
        System.out.println("input is " + string);
    }

    @Then("display {string}")
    public void display(String string) {
        System.out.println("display is " + string);
    }
}
