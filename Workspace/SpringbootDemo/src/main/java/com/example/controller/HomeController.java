package com.example.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class HomeController {

	@RequestMapping(value = "/")
	public String serveBase() {
		String result = "Hello World!";

		return result;
	}

	@RequestMapping(value = "/home", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public String serveHome() {

		String result = "";

		result = "{\"message\":\"Hello World!\"}";

		return result;
	}

}
