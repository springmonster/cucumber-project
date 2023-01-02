package com.charles.steps;

import io.cucumber.java.en.*;

public class TestAndButStep {
    @Given("one")
    public void one() {
        System.out.println("one thing");
    }

    @And("two")
    public void two() {
        System.out.println("two thing");
    }

    @And("three")
    public void three() {
        System.out.println("three thing");
    }

    @When("b1")
    public void b1() {
        System.out.println("boom");
    }

    @And("b2")
    public void b2() {
        System.out.println("blablabla");
    }

    @Then("h1")
    public void h1() {
        System.out.println("hello world");
    }

    @But("h2")
    public void h2() {
        System.out.println("hello mars");
    }
}
