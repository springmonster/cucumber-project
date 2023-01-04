package com.charles.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {
//        "src/test/resources/charles.feature",
//        "src/test/resources/test.feature",
//        "src/test/resources/testandbut.feature",
//        "src/test/resources/background.feature",
//        "src/test/resources/arguments.feature",
//        "src/test/resources/list.feature",
//        "src/test/resources/transformer.feature",
        "src/test/resources/json.feature",
},
        glue = "com.charles.steps", monochrome = true)
public class CharlesRunner extends AbstractTestNGCucumberTests {
}
