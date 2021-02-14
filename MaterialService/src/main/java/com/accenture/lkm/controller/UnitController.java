package com.accenture.lkm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.lkm.business.bean.UnitBean;
import com.accenture.lkm.service.UnitService;

@RestController
public class UnitController {
	@Autowired
	UnitService service;
	
	@GetMapping(value="/material/controller/getUnitDetails",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<UnitBean>> getUnits(){
		List<UnitBean> unitBeanList=service.getUnits();
		return new ResponseEntity<List<UnitBean>>(unitBeanList, HttpStatus.OK);
	}
	
	@GetMapping(value="/material/controller/getUnitsByCategoryId/{categoryId}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<UnitBean>> getUnitsByCategoryId(@PathVariable String categoryId){
		List<UnitBean> unitBeanList=service.getUnits(categoryId);
		return new ResponseEntity<List<UnitBean>>(unitBeanList, HttpStatus.OK);
		
	}
}
