package com.aws.lambda;

public class LocalTestRunner {
	
	public static void main(String[] args) {
		
		LambdaHandler handler = new LambdaHandler();
		TestContext context = new TestContext();

		String input = "Local World";
		String output = handler.handleRequest(input, context);

		System.out.println("Response: " + output);
	}
}
