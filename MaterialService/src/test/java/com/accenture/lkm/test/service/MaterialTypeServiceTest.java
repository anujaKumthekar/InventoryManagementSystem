package com.accenture.lkm.test.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.accenture.lkm.business.bean.MaterialTypeBean;
import com.accenture.lkm.service.MaterialTypeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MaterialTypeServiceTest {
	
	@Autowired
	MaterialTypeService typeService;
	
	@Test
	public void notNullMaterialTypeServiceTest() {
		Assert.assertNotNull(typeService);
	}
	
	@Test
	public void getMaterialTypeByCategoryIdTest() {
		List<MaterialTypeBean> typeBeanList= typeService.getMaterialTypes("C001");
		Assert.assertNotNull(typeBeanList);
		Assert.assertEquals(2, typeBeanList.size());
	}
	
	@Test
	public void getMaterialTypesTest() {
		List<MaterialTypeBean> typeBeanList= typeService.getMaterialTypes();
		Assert.assertNotNull(typeBeanList);
		Assert.assertEquals(6, typeBeanList.size());

	}

}
