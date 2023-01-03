package com.charles.steps;

import com.charles.types.Color;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class ListStep {
    @Given("open somthing list")
    public void openList(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }

    @When("input {string} and {int} list")
    public void inputList(String string, Integer int1) {
        System.out.println("input is " + string + " and " + int1);
    }

    @When("input {color} list")
    public void inputList1(Color color) {
        System.out.println("input is " + color);
    }

    @Then("display {int} and {string} list")
    public void displayList(Integer int1, String string) {
        System.out.println("display is " + int1 + " and " + string);
    }

    @Then("display {color} list")
    public void displayList1(Color color) {
        System.out.println("display is " + color);
    }

//    @ParameterType(value = "red|blue|yellow")
//    public Color color(String color) {
//        return new Color(color);
//    }
}
