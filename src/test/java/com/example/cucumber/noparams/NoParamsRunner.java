package com.example.cucumber.noparams;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith (Cucumber.class)
@CucumberOptions (features = "src/test/resources/features/NoParamsSearchFeature.feature", glue = {"com.example.cucumber.noparams"})
public class NoParamsRunner {
}
