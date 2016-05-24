package uk.co.bbc.training;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	@ResponseBody
	public String index() {
		String env = System.getenv("HELLO_WORLD");
		String output = "<h1>Michael says Hello World</h1>\n";

		if (env != null) {
			output += "<p>HELLO_WORLD is " + env + "</p>";
		}

		return output;
	}

}