package com.javainuse.WaterBills;

import java.sql.Date;

import org.json.JSONException;
import org.json.JSONObject;

import springfox.documentation.spring.web.json.Json;

public class WaterBills {

	public  String id ; 
	public  Float  total  ; 
	public String Area ; 
	public String address ; 
	public String billDetails ; 
	public String publishDate ; 
	public String payBeforDate ;
	
	public WaterBills ( ){
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBillDetails() {
		return billDetails;
	}
	public void setBillDetails(String billDetails) {
		this.billDetails = billDetails;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getPayBeforDate() {
		return payBeforDate;
	}
	public void setPayBeforDate(String payBeforDate) {
		this.payBeforDate = payBeforDate;
	} 
	 public JSONObject  getWaterBill( String id ) throws JSONException{
		 JSONObject  waterBill = new JSONObject();//{ "id":"John", "age":30, "car":null };

		 waterBill.put("id", id); 
		 waterBill.put("total", 105.6);
		 waterBill.put("address", "ramallah/alnahda Str");
		 waterBill.put("billDetails", "Bill Details.....");
		 waterBill.put("publishDate", new Date(10, 05, 2018));
		 waterBill.put("payBeforDate", new Date(10, 06, 2018));
		
		 return waterBill; 
		 
	 }
	
}
