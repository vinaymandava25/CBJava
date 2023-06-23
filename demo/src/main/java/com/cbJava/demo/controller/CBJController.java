package com.cbJava.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CBJController {

	@GetMapping("/getData")
	public String getDataFromCB() {
		return "Hey iam IBMer";
	}
}
