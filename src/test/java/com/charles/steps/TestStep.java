package com.charles.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStep {
    @Given("one thing")
    public void one_thing() {
        System.out.println("one thing");
    }

    @Given("two thing")
    public void two_thing() {
        System.out.println("two thing");
    }

    @Given("three thing")
    public void three_thing() {
        System.out.println("three thing");
    }

    @When("boom")
    public void boom() {
        System.out.println("boom");
    }

    @Then("hello world")
    public void hello_world() {
        System.out.println("hello world");
    }

    @Then("hello mars")
    public void hello_mars() {
        System.out.println("hello mars");
    }
}
