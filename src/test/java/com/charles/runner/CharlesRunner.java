package com.charles.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/charles.feature",
        glue = "com.charles.steps", monochrome = true)
public class CharlesRunner extends AbstractTestNGCucumberTests {
}
