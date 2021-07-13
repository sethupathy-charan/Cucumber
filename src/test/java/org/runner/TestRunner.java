package org.runner;

import org.helper.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue="org.stepdefinition", dryRun=false , monochrome=true,
strict=true, plugin= {"pretty","html:src\\test\\resources\\Reports\\HTML",
		"json:src\\test\\resources\\Reports\\Jason\\report.json",
		"junit:src\\test\\resources\\Reports\\Junit\\report.xml",
		"rerun:src\\test\\resources\\Failed\\Failed.txt"})

public class TestRunner {
	
	@AfterClass
	public static void jvmReportGeneration() {
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\Jason\\report.json");

	}
}
