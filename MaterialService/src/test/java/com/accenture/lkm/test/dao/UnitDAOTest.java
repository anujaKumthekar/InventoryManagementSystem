package com.accenture.lkm.test.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.accenture.lkm.dao.UnitDAO;
import com.accenture.lkm.entity.UnitEntity;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UnitDAOTest {
	@Autowired
	UnitDAO unitDao;
	@Test
	public void notNullUnitDAOTest() {
		Assert.assertNotNull(unitDao);
	}
	
	@Test
	public void findByIdUnitTest() {
		List<UnitEntity> uEntity=unitDao.findAll();
		Assert.assertNotNull(uEntity.get(0));
		Assert.assertEquals("Metres", uEntity.get(0).getUnitName());
		
	}
	
	@Test
	public void findByCategoryIdTest(){
		List<UnitEntity> unitEntities=unitDao.findByCategoryId("C001");
		Assert.assertNotNull(unitEntities.get(0));
		Assert.assertEquals(2, unitEntities.size());
		
	}

}
