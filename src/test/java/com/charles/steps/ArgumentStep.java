package com.charles.steps;

import com.charles.types.Color;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArgumentStep {
    @Given("open somthing")
    public void open() {
        System.out.println("Open something!");
    }

    @When("input {string} and {int}")
    public void input(String string, Integer int1) {
        System.out.println("input is " + string + " and " + int1);
    }

    @When("input {color}")
    public void input1(Color color) {
        System.out.println("input is " + color);
    }

    @Then("display {int} and {string}")
    public void display(Integer int1, String string) {
        System.out.println("display is " + int1 + " and " + string);
    }

    @Then("display {color}")
    public void display1(Color color) {
        System.out.println("display is " + color);
    }

    @ParameterType(value = "red|blue|yellow")
    public Color color(String color) {
        return new Color(color);
    }
}
