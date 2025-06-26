// https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/install-sam-cli.html#install-sam-cli-instructions

package com.aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<String, String> {

	@Override
	public String handleRequest(String input, Context context) {
		
		context.getLogger().log("Input received: " + input);
		return "Hello " + input;
	}
}
