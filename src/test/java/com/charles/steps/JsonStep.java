package com.charles.steps;

import com.charles.model.Product;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.DocStringType;
import io.cucumber.java.en.Given;

public class JsonStep {

    private ObjectMapper objectMapper = new ObjectMapper();

    @DocStringType
    public JsonNode json(String docString) throws JsonProcessingException {
        return objectMapper.readTree(docString);
    }

    @Given("g1")
    public void g1(JsonNode jsonNode) {
        Product product = objectMapper.convertValue(jsonNode, Product.class);
        System.out.println(product);
    }
}
