package com.accenture.lkm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.lkm.business.bean.MaterialCategoryBean;
import com.accenture.lkm.dao.MaterialCategoryDAO;
import com.accenture.lkm.entity.MaterialCategoryEntity;

@Service
public class MaterialServiceImpl implements MaterialService {


	
	/*
	 * Autowire MaterialCategoryDAO object
	 * 
	 * */
	
	@Autowired
	MaterialCategoryDAO materialCategoryDAO;
	// Your Code Here
	

	/*
	 * Method - getMaterialCategoryById()
	 * Use MaterialCategoryDAO object findOne method to fetch the entity by --> categoryId
	 * Check if the entity is present
	 * 		initialized the materialCategoryBean object
	 * 		copy the properties value from entity to materialCategoryBean object
	 * */
	
	@Override
	public MaterialCategoryBean getMaterialCategoryById(String categoryId) {
		
		MaterialCategoryBean materialCategoryBean = new MaterialCategoryBean();
		
		MaterialCategoryEntity materialCategoryEntity = materialCategoryDAO.findOne(categoryId);
		if(materialCategoryEntity!=null) {
			 materialCategoryBean = convertMCEntityToBean(materialCategoryEntity);
			 
		}
		
		// Your Code Here
		
		return materialCategoryBean;
	}

	
	/*
	 * Method - getMaterialCategories()
	 * Use MaterialCategoryDAO object findAll method to fetch all the material category entities.
	 * Check if list is not empty then 
	 * 		Initialize the materialCategoryBeans list using ArrayList 
	 * 		Declare a MaterialCategoryBean object with null value
	 * 		Loop through all the material categories
	 * 			Initialize a new MaterialCategoryBean object 
	 * 			Copy each property value of entity object to bean object
	 * 			Add the bean object to the materialCategoryBeans list
	 * */

	
	@Override
	public List<MaterialCategoryBean> getMaterialCategories() {
		
		List<MaterialCategoryBean> materialCategoryBeanList = new ArrayList<MaterialCategoryBean>();
		
		// Your Code Here
		List<MaterialCategoryEntity> materialCategoryEntityList = materialCategoryDAO.findAll();
		for(MaterialCategoryEntity materialCategoryEntity: materialCategoryEntityList) {
			MaterialCategoryBean materialCategoryBean = new MaterialCategoryBean();
			materialCategoryBean = convertMCEntityToBean(materialCategoryEntity);
			materialCategoryBeanList.add(materialCategoryBean);
			
		}
		
		return materialCategoryBeanList;
	}
	
	public static MaterialCategoryEntity convertMCBeanToMCEntity(MaterialCategoryBean materialCategoryBean) {
		MaterialCategoryEntity materialCategoryEntity = new MaterialCategoryEntity();
		BeanUtils.copyProperties(materialCategoryBean, materialCategoryEntity);
		return materialCategoryEntity;
	}
	
	public static MaterialCategoryBean convertMCEntityToBean(MaterialCategoryEntity materialCategoryEntity) {
		MaterialCategoryBean materialCategoryBean = new MaterialCategoryBean();
		BeanUtils.copyProperties(materialCategoryEntity, materialCategoryBean);
		return materialCategoryBean;
	}

}
