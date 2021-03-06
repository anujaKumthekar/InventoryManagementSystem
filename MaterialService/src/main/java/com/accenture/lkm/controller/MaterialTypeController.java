package com.accenture.lkm.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.lkm.business.bean.MaterialTypeBean;
import com.accenture.lkm.service.MaterialTypeService;

@RestController
public class MaterialTypeController {
	@Autowired
	MaterialTypeService service;
	
	@GetMapping(value="/material/controller/getTypeDetails",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<MaterialTypeBean>> getTypeDetails(){
		
		List<MaterialTypeBean>materialTypeBeanList=service.getMaterialTypes();
		return new ResponseEntity<List<MaterialTypeBean>>(materialTypeBeanList, HttpStatus.OK);
	}
	
	@GetMapping(value="/material/controller/getTypeDetailsByCategoryId/{categoryId}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<MaterialTypeBean>> getTypeBasedOnCategoryId(@PathVariable String categoryId){
		
		List<MaterialTypeBean> materialTypeBeanList=service.getMaterialTypes(categoryId);
		return new ResponseEntity<List<MaterialTypeBean>>(materialTypeBeanList, HttpStatus.OK);
		
	}

}
