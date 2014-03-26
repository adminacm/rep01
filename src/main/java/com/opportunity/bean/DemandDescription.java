package com.opportunity.bean;
/**
 * @author xiongyl
 * カスタマイズオブジェクト要求詳細情報
 *
 */
public class DemandDescription {
	
	// カテゴリー
	private String category;
	// 要求詳細名
	private String detailName;
	// 備考
	private String remarks;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDetailName() {
		return detailName;
	}
	public void setDetailName(String detailName) {
		this.detailName = detailName;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	

}
