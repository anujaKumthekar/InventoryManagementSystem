package com.accenture.lkm.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Unit")
public class UnitEntity {

	@Id
	private String unitId;
	
	private String unitName;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="category_id")
	private MaterialCategoryEntity categoryEntity;

	public UnitEntity() {
		// TODO Auto-generated constructor stub
	}
	public String getUnitId() {
		return unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public MaterialCategoryEntity getCategoryEntity() {
		return categoryEntity;
	}
	public void setCategoryEntity(MaterialCategoryEntity categoryEntity) {
		this.categoryEntity = categoryEntity;
	}
	@Override
	public String toString() {
		return "UnitEntity [unitId=" + unitId + ", unitName=" + unitName + ", categoryEntity=" + categoryEntity + "]";
	}
	
}
