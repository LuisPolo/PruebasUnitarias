package com.devopsTest.calculadora.restfulcalculadora;
/*
//tag::imports[]
import static org.junit.platform.engine.discovery.ClassNameFilter.includeClassNamePatterns;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
//import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
//import org.junit.platform.launcher.listeners.TestExecutionSummary;
//end::imports[]
*//**
* @since 5.0
*//*

public class UsingTheLauncherDemo {

	@org.junit.jupiter.api.Test
	@SuppressWarnings("unused")
	void discovery() {
		// @formatter:off
		// tag::discovery[]
		LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
			.selectors(
				selectPackage("com.devops.calculadora.restfulcalculadora"),
				selectClass(CalculadoraTest.class)
			)
			.filters(
				includeClassNamePatterns(".*Tests")
			)
			.build();

		Launcher launcher = LauncherFactory.create();

		TestPlan testPlan = launcher.discover(request);
		
		// end::discovery[]
		// @formatter:on
	}

	@org.junit.jupiter.api.Test
	void execution() {
		// @formatter:off
		// tag::execution[]
		LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
			.selectors(
				selectPackage("com.devops.calculadora.restfulcalculadora"),
				selectClass(CalculadoraTest.class)
			)
			.filters(
				includeClassNamePatterns(".*Tests")
			)
			.build();

		Launcher launcher = LauncherFactory.create();

		// Register a listener of your choice
		//TestExecutionListener listener = new SummaryGeneratingListener();
		SummaryGeneratingListener listener = new SummaryGeneratingListener();
		launcher.registerTestExecutionListeners(listener);

		launcher.execute(request);
		// end::execution[]
		// @formatter:on
		
		//listener.dynamicTestRegistered(testIdentifier);
		
		 TestExecutionSummary summary = summaryGeneratingListener.getSummary();
		  int failures = (int) summary.getTestsFailedCount();
		  if (failures == 0) {
		    long succeeded = summary.getTestsSucceededCount();
		    String moduleName = moduleReference.descriptor().toNameAndVersion();
		    System.out.printf("[tester] Successfully tested %s: %d tests in %d ms%n", moduleName, succeeded, duration);
		  } else {
		    StringWriter stringWriter = new StringWriter();
		    summary.printTo(new PrintWriter(stringWriter));
		    summary.printFailuresTo(new PrintWriter(stringWriter));
		    System.out.println(stringWriter);
		  }
	}
}*/