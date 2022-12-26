// Importing package to code module
package com.nubeera.artifact;

// Importing required classes
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// Annotation
@Controller

// Class[]
public class DemoController {

	@RequestMapping("/")
	@ResponseBody

	// Method
	public String welcomeWorld()
	{
		// Print statement
		return "Welcome World of <h1>Static</h1> Web Application!!!";
	}
}
