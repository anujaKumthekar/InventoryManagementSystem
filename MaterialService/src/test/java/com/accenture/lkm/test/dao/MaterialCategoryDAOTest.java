package com.accenture.lkm.test.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.accenture.lkm.dao.MaterialCategoryDAO;
import com.accenture.lkm.entity.MaterialCategoryEntity;



@RunWith(SpringRunner.class)
@SpringBootTest
public class MaterialCategoryDAOTest {
	
	@Autowired
	MaterialCategoryDAO materialCategoryDAO;
	
	/*
	 * Autowire the MaterialCategoryDAO object below
	 */
	
	// Your Code Here
	
	
	/*
	 * Method - notNullMaterialCategoryDAOTest()
	 * Assert only that MaterialCategoryDAO object is Not null
	 */	
	
	@Test
	public void notNullMaterialCategoryDAOTest() {
		
		Assert.assertNotNull(materialCategoryDAO);
		
		
	
	}
	
	
	/*
	 * Method - findByIdMaterialCategoryTest()
	 * Using MaterialCategoryDAO fetch an entity by its ID --> "C001" 
	 * Assert that the entity fetch and it is Not null 
	 * Assert that the name of the material category entity fetch is equal to --> "Thread"
	 */
	
	@Test
	public void findByIdMaterialCategoryTest() {
		
		MaterialCategoryEntity categoryEntity=materialCategoryDAO.findOne("C001");
		Assert.assertNotNull(categoryEntity);
		Assert.assertEquals("Thread",categoryEntity.getCategoryName());
		// Your Code Here

	}

	/*
	 * Method - findAllMaterialCategoryTest()
	 * Using MaterialCategoryDAO to fetch all the entities 
	 * Assert that the list is Not null 
	 * Assert that the count of entities matches to --> 3
	 */
			
	@Test
	public void findAllMaterialCategoryTest() {
		// Your Code Here
		
		List<MaterialCategoryEntity>categoryEntities=materialCategoryDAO.findAll();
		Assert.assertNotNull(categoryEntities);
		Assert.assertEquals(3, categoryEntities.size());
		
		
		

	}
	
}
