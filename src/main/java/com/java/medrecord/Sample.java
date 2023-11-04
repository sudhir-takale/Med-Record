package com.java.medrecord;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Sample {

	@RequestMapping("/test")
	public String firstHandler() {
		return "Hello World!!";
	}
}
