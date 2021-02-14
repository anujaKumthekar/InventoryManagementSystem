package com.accenture.lkm.test.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.accenture.lkm.dao.MaterialTypeDAO;
import com.accenture.lkm.entity.MaterialTypeEntity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MaterialTypeDAOTest {
	@Autowired
	MaterialTypeDAO materialDAO;
	
	@Test
	public void notNullMaterialTypeDAOTest() {
		Assert.assertNotNull(materialDAO);
	}
	
	@Test
	public void findByIdMaterialTypeTest() {
		
		List<MaterialTypeEntity>typeEntities=materialDAO.findAll();
		Assert.assertNotNull(typeEntities.get(0));
		Assert.assertEquals("Silk-Thread", typeEntities.get(0).getTypeName());
		
	}
	
	@Test
	public void findByCategoryIdTest() {
		
		List<MaterialTypeEntity> typeEntities=materialDAO.findByCategoryId("C001");
		Assert.assertNotNull(typeEntities);
		Assert.assertEquals(2, typeEntities.size());
		
	}

}
