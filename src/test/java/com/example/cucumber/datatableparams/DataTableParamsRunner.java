package com.example.cucumber.datatableparams;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith (Cucumber.class)
@CucumberOptions (features = "src/test/resources/features/DataTableParamsSearchFeature.feature", glue = {
        "com.example.cucumber.datatableparams"})
public class DataTableParamsRunner {
}
