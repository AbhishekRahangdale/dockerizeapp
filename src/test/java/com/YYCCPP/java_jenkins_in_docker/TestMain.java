package com.YYCCPP.java_jenkins_in_docker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMain {

	@Test
	public void testInputIsEven() {
		assertTrue(App.checkIfInputIsAnEvenNumber(22)); // Assertion
	}

}
