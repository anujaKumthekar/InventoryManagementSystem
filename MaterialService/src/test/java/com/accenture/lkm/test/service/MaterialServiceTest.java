package com.accenture.lkm.test.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.accenture.lkm.business.bean.MaterialCategoryBean;
import com.accenture.lkm.service.MaterialService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MaterialServiceTest {
	
	/*
	 * Autowire the MaterialService object below
	 * 
	 */
	@Autowired
	MaterialService materialService;

	/*
	 * Method - notNullMaterialServiceTest()
	 * Assert only that MaterialService object is Not null
	 * 
	 */	
	
	@Test
	public void notNullMaterialServiceTest() {
		Assert.assertNotNull( materialService);
		
	}
	
		
	/*
	 * Method - getMaterialCategoryByIdTest()
	 * Assert that MaterialCategoryBean object fetch using MaterialService getMaterialCategoryById --> C001 is not null
	 * Assert that object fetch name is equal to --> "Thread"
	 */
	
	@Test
	public void getMaterialCategoryByIdTest() {
		
		MaterialCategoryBean materialCategoryBean=materialService.getMaterialCategoryById("C001");
		Assert.assertNotNull(materialCategoryBean);
		Assert.assertEquals("Thread",materialCategoryBean.getCategoryName());
		
		
		
		
	}
	
	
	/*
	 * Method - getMaterialCategoriesTest()
	 * Assert that MaterialCategoryBean list fetch using MaterialService getMaterialCategories is not null
	 * Assert that list size matches to --> 3
	 */
	
	@Test
	public void getMaterialCategoriesTest() {
		
		
		List<MaterialCategoryBean> materialCategoryBean=materialService.getMaterialCategories();
		Assert.assertNotNull(materialCategoryBean);
		Assert.assertTrue(materialCategoryBean.size()==3);
	}
	
}
