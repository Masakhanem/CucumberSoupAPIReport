package com.technocenter.sts.CucumberReport;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, features = "src/test/java/com/technocenter/sts/CucumberReport", glue = "com.technocenter.sts.CucumberReport.Test", plugin = {
  "pretty" })
public class AppTest 
{
}
