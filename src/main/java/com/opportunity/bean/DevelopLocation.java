package com.opportunity.bean;

/**
 * @author xiongyl
 * カスタマイズオブジェクト開発ロケーション情報
 *
 */
public class DevelopLocation {

	// ロケーション
	private String Location;
	// 作業割合(%)
	private String WorkingRate;
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getWorkingRate() {
		return WorkingRate;
	}
	public void setWorkingRate(String workingRate) {
		WorkingRate = workingRate;
	}
	
	

}
