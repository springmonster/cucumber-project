package com.charles.steps;

import com.charles.model.Author;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class TransformerStep {

    @DataTableType
    public Author transformerAuthor(Map<String, String> map) {
        return new Author(map.get("firstName"), map.get("lastName"), map.get("birthDate"));
    }

//    @Given("xxx")
//    public void xxx(List<Map<String, String>> list) {
//        System.out.println(list.toString());
//    }

    @Given("xxx")
    public void xxx(List<Author> list) {
        System.out.println(list.toString());
        System.out.println("list size is: " + list.size());
    }

    @When("yyy")
    public void yyy() {
        System.out.println("yyy");
    }

    @Then("zzz")
    public void zzz() {
        System.out.println("zzz");
    }
}
