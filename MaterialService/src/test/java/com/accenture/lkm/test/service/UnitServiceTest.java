package com.accenture.lkm.test.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.accenture.lkm.service.UnitService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UnitServiceTest {

	@Autowired
	UnitService service;
	
	@Test
	public void notNullUnitServiceTest() {
		Assert.assertNotNull(service);
	}
	
	@Test
	public void getUnitByCategoryIdTest() {
		Assert.assertNotNull(service.getUnits("C001"));
		Assert.assertEquals(2, service.getUnits("C001").size());
	}
	
	@Test
	public void getUnitsTest() {
		Assert.assertNotNull(service.getUnits());
		Assert.assertEquals(5, service.getUnits().size());
	}
}
