package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\Failed\\Failed.txt", glue="org.stepdefinition", dryRun=false , monochrome=true,
strict=true)

public class TestRerunner {

}
