package com.accenture.lkm.test.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.accenture.lkm.dao.VendorDAO;
import com.accenture.lkm.entity.VendorEntity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VendorDAOTest {


	/*
	 * Autowire the VendorDAO object below
	 */
	@Autowired
	VendorDAO vendorDAO;
	
	// Your Code Here

	
	/*
	 * Method - notNullVendorDAOTest()
	 * Assert only that VendorDAO object is Not null
	 */
	
	@Test
	public void notNullVendorDAOTest() {
		// Your Code Here
		Assert.assertNotNull(vendorDAO);
	}

	/*
	 * Method - findByIdVendorDAOTest()
	 * Using VendorDAO fetch an entity by its ID --> "V001" 
	 * Assert that the entity fetch and it is Not null 
	 * Assert that the name of the vendor entity fetch is equal to --> "Only Vimal"
	 */

	@Test
	public void findByIdVendorDAOTest() {
		// Your Code Here
		VendorEntity vendorEntity=vendorDAO.findOne("V001");
		Assert.assertNotNull(vendorEntity);
		Assert.assertEquals("Only Vimal", vendorEntity.getVendorName());
	}
}
