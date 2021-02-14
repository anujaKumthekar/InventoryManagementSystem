package com.accenture.lkm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;

import com.accenture.lkm.entity.UnitEntity;

@RepositoryDefinition(domainClass=UnitEntity.class, idClass=String.class)
public interface UnitDAO {
	List<UnitEntity> findAll();
	
	@Query("Select k from UnitEntity k where k.categoryEntity.categoryId= ?1")
	List<UnitEntity> findByCategoryId(String categoryId );
}
