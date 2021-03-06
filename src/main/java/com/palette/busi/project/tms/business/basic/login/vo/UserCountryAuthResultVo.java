package com.palette.busi.project.tms.business.basic.login.vo;

import java.util.List;

import com.palette.busi.project.tms.core.entity.CdCountry;
import com.palette.busi.project.tms.core.entity.CdWarehouse;

public class UserCountryAuthResultVo {

	private List<CdWarehouse> cdWarehouseList;
	private List<CdCountry> cdCountryList;

	public List<CdWarehouse> getCdWarehouseList() {
		return cdWarehouseList;
	}

	public void setCdWarehouseList(List<CdWarehouse> cdWarehouseList) {
		this.cdWarehouseList = cdWarehouseList;
	}

	public List<CdCountry> getCdCountryList() {
		return cdCountryList;
	}

	public void setCdCountryList(List<CdCountry> cdCountryList) {
		this.cdCountryList = cdCountryList;
	}
	
}
