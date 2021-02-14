package com.accenture.lkm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.lkm.business.bean.VendorBean;
import com.accenture.lkm.service.VendorService;

@RestController
public class VendorController {

	
	/*
	 * Autowire the VendorService object
	 * 
	 * */
	// Your Code Here
	@Autowired
	private VendorService service;
	
	@GetMapping("/")
	public String index() {
		return "Welcome to Spring Boot Vendor Service API!";
	}

	
	/* 
	 * Method - getVendorDetails()
	 * Fetch all the vendor details using VendorService and store it inside a List
	 * Return a ResponseEntity object passing the list of vendor details
	 * 
	 */
	
	@GetMapping("/vendor/controller/getVendors")
	public ResponseEntity<List<VendorBean>> getVendorDetails() throws Exception {
		List<VendorBean> bean=service.getVendorDetails();
		ResponseEntity<List<VendorBean>> res=new ResponseEntity<List<VendorBean>>(bean,HttpStatus.OK);
		return res;		
	}
}
