package com.javainuse.controllers;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.javainuse.WaterBills.WaterBills;

import springfox.documentation.spring.web.json.Json;

@Controller
public class TestController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
	public JSONObject getWaterBills(String waterId) {
		WaterBills bill = 	new WaterBills(); 
		try{
		return bill.getWaterBill( waterId ); 
		}catch(JSONException e ){
		}
		return null;
	}

}
