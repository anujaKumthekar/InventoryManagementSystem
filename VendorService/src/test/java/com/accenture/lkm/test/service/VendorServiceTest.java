package com.accenture.lkm.test.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.accenture.lkm.service.VendorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VendorServiceTest {


	/*
	 * Autowire the VendorService object below
	 * 
	 */
	// Your Code Here
	@Autowired
	VendorService service;
	/*
	 * Method - notNullVendorServiceTest()
	 * Assert only that VendorService object is Not null
	 * 
	 */

	@Test
	public void notNullVendorServiceTest() {
		// Your Code Here
		Assert.assertNotNull(service);
	}

	/*
	 * Method - notNullGetVendorDetailsTest()
	 * Assert only that VendorService getVendorDetails is not returning a null value
	 * 
	 */

	@Test
	public void notNullGetVendorDetailsTest() throws Exception {
		// Your Code Here
		Assert.assertNotNull(service.getVendorDetails());

	}

	/*
	 * Method - countGetVendorDetailsTest()
	 * Assert only that VendorService getVendorDetails list size matches to 5
	 * 
	 */

	@Test
	public void countGetVendorDetailsTest() throws Exception {
		// Your Code Here
		Assert.assertEquals(5, service.getVendorDetails().size());
	}

	/*
	 * Method - recordGetVendorDetailsTest()
	 * Assert only that VendorService getVendorDetails first bean name matches --> "Only Vimal"
	 * 
	 */
		
	@Test
	public void recordGetVendorDetailsTest() throws Exception {
		Assert.assertEquals("Only Vimal", service.getVendorDetails().get(0).getVendorName());
	}

}