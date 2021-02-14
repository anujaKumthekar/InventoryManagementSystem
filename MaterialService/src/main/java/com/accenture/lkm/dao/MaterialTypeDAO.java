package com.accenture.lkm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;

import com.accenture.lkm.entity.MaterialTypeEntity;

@RepositoryDefinition(domainClass=MaterialTypeEntity.class, idClass=String.class)
public interface MaterialTypeDAO {
	
	List<MaterialTypeEntity> findAll();
	
	@Query("Select k from MaterialTypeEntity k where k.categoryEntity.categoryId= ?1")
	List<MaterialTypeEntity> findByCategoryId(String categoryId);

}
