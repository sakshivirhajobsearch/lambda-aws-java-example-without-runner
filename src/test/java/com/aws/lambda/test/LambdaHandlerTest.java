package com.aws.lambda.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.aws.lambda.LambdaHandler;
import com.aws.lambda.TestContext;

public class LambdaHandlerTest {

	@Test
	public void testHandleRequest() {
		
		LambdaHandler handler = new LambdaHandler();
		TestContext context = new TestContext();

		String input = "World";
		String result = handler.handleRequest(input, context);

		assertEquals("Hello World", result);
	}
}
