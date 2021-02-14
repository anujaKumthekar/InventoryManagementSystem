package com.accenture.lkm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.lkm.business.bean.MaterialTypeBean;
import com.accenture.lkm.dao.MaterialTypeDAO;
import com.accenture.lkm.entity.MaterialTypeEntity;

@Service
public class MaterialTypeServiceImpl implements MaterialTypeService {
	
	@Autowired
	MaterialTypeDAO materialTypeDAO;
	
	@Override
	public List<MaterialTypeBean> getMaterialTypes(String typeId) {
		// TODO Auto-generated method stub
		List<MaterialTypeEntity> materialTypeEntityList = materialTypeDAO.findByCategoryId(typeId);
		List<MaterialTypeBean> materialTypeBeanList = new ArrayList<>();
		for(MaterialTypeEntity materialTypeEntity : materialTypeEntityList) {
			MaterialTypeBean materialTypeBean = new MaterialTypeBean();
			materialTypeBean = convertMTEntityToMTBean(materialTypeEntity);
			materialTypeBean.setCategoryId(materialTypeEntity.getCategoryEntity().getCategoryId());
			materialTypeBeanList.add(materialTypeBean);
			
		}
		return materialTypeBeanList ;
	}

	@Override
	public List<MaterialTypeBean> getMaterialTypes() {
		// TODO Auto-generated method stub
		List<MaterialTypeEntity> materialTypeEntityList = materialTypeDAO.findAll();
		List<MaterialTypeBean> materialTypeBeanList = new ArrayList<>();
		
		for(MaterialTypeEntity materialTypeEntity : materialTypeEntityList) {
			MaterialTypeBean materialTypeBean = convertMTEntityToMTBean(materialTypeEntity);
			materialTypeBean.setCategoryId(materialTypeEntity.getCategoryEntity().getCategoryId());
			materialTypeBeanList.add(materialTypeBean);
		}
		return materialTypeBeanList;
	}
	
	public static MaterialTypeEntity convertMTBeanToMTEntity(MaterialTypeBean materialTypeBean) {
		MaterialTypeEntity materialTypeEntity = new MaterialTypeEntity();
		BeanUtils.copyProperties(materialTypeBean, materialTypeEntity);
		return materialTypeEntity;
	}
	
	public static MaterialTypeBean convertMTEntityToMTBean(MaterialTypeEntity materialTypeEntity) {
		MaterialTypeBean materialTypeBean = new MaterialTypeBean();
		BeanUtils.copyProperties(materialTypeEntity, materialTypeBean);
		return materialTypeBean;
	}
}
