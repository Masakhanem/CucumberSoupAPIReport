package com.technocenter.sts.CucumberReport;

import cucumber.annotation.en_au.When;

public class Test {

	@When("^Hello world$")
	public void Hello_world() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("Hello world");
	}
}
