package com.palette.busi.project.tms.business.delivery.flight.dto;

import com.palette.busi.project.tms.common.base.BaseReqDto;

public class QueryFlightListReqDto extends BaseReqDto {

	private String warehouseCode;
	private String mawbCode;
    private String sectorLabel;
    private String startEtd;
    private String endEtd;
    private String startEta;
    private String endEta;
    private String flyStatus;

	public String getMawbCode() {
		return mawbCode;
	}

	public void setMawbCode(String mawbCode) {
		this.mawbCode = mawbCode;
	}

	public String getSectorLabel() {
		return sectorLabel;
	}

	public void setSectorLabel(String sectorLabel) {
		this.sectorLabel = sectorLabel;
	}

	public String getStartEtd() {
		return startEtd;
	}

	public void setStartEtd(String startEtd) {
		this.startEtd = startEtd;
	}

	public String getEndEtd() {
		return endEtd;
	}

	public void setEndEtd(String endEtd) {
		this.endEtd = endEtd;
	}

	public String getStartEta() {
		return startEta;
	}

	public void setStartEta(String startEta) {
		this.startEta = startEta;
	}

	public String getEndEta() {
		return endEta;
	}

	public void setEndEta(String endEta) {
		this.endEta = endEta;
	}

	public String getFlyStatus() {
		return flyStatus;
	}

	public void setFlyStatus(String flyStatus) {
		this.flyStatus = flyStatus;
	}

	public String getWarehouseCode() {
		return warehouseCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
    
}
