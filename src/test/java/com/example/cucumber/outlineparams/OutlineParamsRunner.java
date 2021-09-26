package com.example.cucumber.outlineparams;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith (Cucumber.class)
@CucumberOptions (features = "src/test/resources/features/OutlineParamsSearchFeature.feature", glue = {
        "com.example.cucumber.outlineparams"})
public class OutlineParamsRunner {
}
