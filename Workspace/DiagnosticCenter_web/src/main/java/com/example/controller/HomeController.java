package com.example.controller;

import org.json.JSONObject;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.DiagnosticDaoImplementations;
import com.example.entity.Patient;
import com.example.service.DIagnosticServiceImpl;
import com.google.gson.Gson;

@EnableAutoConfiguration
@RestController
@CrossOrigin
public class HomeController {
	DIagnosticServiceImpl obj;

	public HomeController() {
		super();
		obj = new DIagnosticServiceImpl();
	}

	@RequestMapping(value = "/addtestbyemail", method = RequestMethod.POST)
	public String addTestByEmail(@RequestParam("email") String email, @RequestParam("testname") String testName) {
		String result = "";
		System.out.println("In controller " + email + " " + testName);
		boolean inserted = obj.addTestsEmail(email, testName);
		if (inserted) {
			result = "{\"message\":" + inserted + "}";
		}
		System.out.println(result);
		return result;
	}

	@RequestMapping(value = "/addtestbyphone", method = RequestMethod.POST)
	public String addTestbyPhone(@RequestParam("phone") String phone, @RequestParam("testname") String testName) {
		String result="";
		System.out.println("In controller " + phone + " " + testName);
		boolean inserted= obj.addTestsPhone(phone, testName);
		if (inserted) {
			result="{\"message\":" + inserted + "}";
		}
		System.out.println(result);
		return result;
		}
	

	@RequestMapping(value = "/home", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public String display() {
		return "Hello";
	}

	@RequestMapping(value = "/getdata_email", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	public @ResponseBody String addSomeData(@RequestParam("email") String email, @RequestParam("date") String date) {
		String result = "";
		DiagnosticDaoImplementations dao = new DiagnosticDaoImplementations();
		System.out.println("Inside controller : " + email + " " + date);
		Patient patient = dao.fetchByEmail(email);
		Gson gson = new Gson();
		result = gson.toJson(patient);
		return result;
	}

	@RequestMapping(value = "/getdata_phone", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	public @ResponseBody String addData(@RequestParam("phone") String phone) {

		System.out.println("Inside controller : " + phone);
		String result = "{\"message\":\"Hello World!\"}";
		return result;

	}

	/*@RequestMapping(value = "/updatevalues", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	public @ResponseBody String update(@RequestParam("p_name") String p_name, @RequestParam("p_email") String p_email,
			@RequestParam("p_phone") String p_phone, @RequestParam("p_dob") String p_dob) {
		Patient p = new Patient();
		DIagnosticServiceImpl imp = new DIagnosticServiceImpl();
		// imp.updateData(p);
		System.out.println("Inside controller : " + p_name + " " + p_email + " " + p_phone + " " + p_dob);
		String result = "{\"message\":\"Hello World!\"}";
		return result;

	}*/

}
