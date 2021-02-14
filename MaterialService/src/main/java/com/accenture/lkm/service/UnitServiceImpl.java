package com.accenture.lkm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.lkm.business.bean.UnitBean;
import com.accenture.lkm.dao.UnitDAO;
import com.accenture.lkm.entity.UnitEntity;

@Service
public class UnitServiceImpl implements UnitService {
	
	
	@Autowired
	UnitDAO unitDAO;
	
	@Override
	public List<UnitBean> getUnits(String unitId) {
		List<UnitEntity> unitEntityList=unitDAO.findByCategoryId(unitId);
		List<UnitBean> unitBeanList=new ArrayList<>();
		for(UnitEntity entity:unitEntityList)
		{
			UnitBean unitBean=convertUEntityToUBean(entity);
			unitBean.setCategoryId(entity.getCategoryEntity().getCategoryId());
			unitBeanList.add(unitBean);
			
		}
		return unitBeanList;
	}

	@Override
	public List<UnitBean> getUnits() {
		List<UnitEntity> unitEntityList=unitDAO.findAll();
		List<UnitBean> unitBeanList=new ArrayList<>();
		for(UnitEntity entity:unitEntityList)
		{
			UnitBean unitBean=convertUEntityToUBean(entity);
			unitBean.setCategoryId(entity.getCategoryEntity().getCategoryId());
			
			unitBeanList.add(unitBean);
			
		}
		return unitBeanList;
		
	
	}
	
	public static UnitBean convertUEntityToUBean(UnitEntity unitEntity)
	{
		UnitBean unitBean=new UnitBean();
		BeanUtils.copyProperties(unitEntity, unitBean);
		return unitBean;
		
	}
	
	public static UnitEntity convertUBeanToUEntity(UnitBean unitBean)
	{
		UnitEntity unitEntity=new UnitEntity();
		BeanUtils.copyProperties(unitBean, unitEntity);
		return unitEntity;
	}

}
