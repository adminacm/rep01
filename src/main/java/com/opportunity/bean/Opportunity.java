package com.opportunity.bean;

import java.util.ArrayList;
import com.opportunity.bean.DemandDescription;
import com.opportunity.bean.DevelopLocation;

/**
 * @author xiongyl
 * 標準オブジェクト案件情報
 *
 */
public class Opportunity {
	
	// 案件Id
	private String opportunityId;
	// 商談名
	private String name;
	// 取引先名
	private String accountName;
	// フェーズ
	private String stageName;
	// 案件確度(%)
	private String accuracy;
	// 契約形態
	private String contractForm;
	// 契約書法務チェック
	private String contratLowChk;
	// 完了予定日
	private String closeDate;
	// 契約予定日
	private String proposalEndDay;
	// プロジェクト開始予定
	private String projectStartDate;
	// プロジェクト終了予定
	private String projectEndDate;
	// 案件発生元
	private String caseOccurPri;
	// エンドユーザ
	private String clientUser;
	// 商流
	private String businessFlow;
	// 説明
	private String description;
	// 業種
	private String industryCategory;
	// 種別
	private String type;
	// 勤務地
	private String location;
	// 金額
	private String amount;
	// 時間精算あり 
	private String timeCompute;
	// 精算条件下限
	private String computeLowestCon;
	// 精算条件上限
	private String computeTopCon;
	// コスト
	private String cost;
	// 粗利
	private String grossProfit;
	// 数量
	private String totalOpportunityQuantity;
	// 検収 
	private String paySight;
	// 営業担当者
	private String ownerName;
	// プロジェクト担当者
	private String projectUndertaker;
	// プロジェクト責任者
	private String projectResPerson;
	// 備考
	private String demand;
	// 想定されるリスク
	private String anticipateRisk;
	// 開発ロケーションリスト	
	private ArrayList<DevelopLocation> developLocationList;
	// 要求詳細リスト
	private ArrayList<DemandDescription> demandDescriptionList;
	// 開発ロケーション(表示用)
	private String outputDevelopLocationText;
	// 要求詳細(表示用)
	private String outputDemandDescriptionText;
	public String getOpportunityId() {
		return opportunityId;
	}
	public void setOpportunityId(String opportunityId) {
		this.opportunityId = opportunityId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getStageName() {
		return stageName;
	}
	public void setStageName(String stageName) {
		this.stageName = stageName;
	}
	public String getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}
	public String getContractForm() {
		return contractForm;
	}
	public void setContractForm(String contractForm) {
		this.contractForm = contractForm;
	}
	public String getContratLowChk() {
		return contratLowChk;
	}
	public void setContratLowChk(String contratLowChk) {
		this.contratLowChk = contratLowChk;
	}
	public String getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}
	public String getProposalEndDay() {
		return proposalEndDay;
	}
	public void setProposalEndDay(String proposalEndDay) {
		this.proposalEndDay = proposalEndDay;
	}
	public String getProjectStartDate() {
		return projectStartDate;
	}
	public void setProjectStartDate(String projectStartDate) {
		this.projectStartDate = projectStartDate;
	}
	public String getProjectEndDate() {
		return projectEndDate;
	}
	public void setProjectEndDate(String projectEndDate) {
		this.projectEndDate = projectEndDate;
	}
	public String getCaseOccurPri() {
		return caseOccurPri;
	}
	public void setCaseOccurPri(String caseOccurPri) {
		this.caseOccurPri = caseOccurPri;
	}
	public String getClientUser() {
		return clientUser;
	}
	public void setClientUser(String clientUser) {
		this.clientUser = clientUser;
	}
	public String getBusinessFlow() {
		return businessFlow;
	}
	public void setBusinessFlow(String businessFlow) {
		this.businessFlow = businessFlow;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIndustryCategory() {
		return industryCategory;
	}
	public void setIndustryCategory(String industryCategory) {
		this.industryCategory = industryCategory;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTimeCompute() {
		return timeCompute;
	}
	public void setTimeCompute(String timeCompute) {
		this.timeCompute = timeCompute;
	}
	public String getComputeLowestCon() {
		return computeLowestCon;
	}
	public void setComputeLowestCon(String computeLowestCon) {
		this.computeLowestCon = computeLowestCon;
	}
	public String getComputeTopCon() {
		return computeTopCon;
	}
	public void setComputeTopCon(String computeTopCon) {
		this.computeTopCon = computeTopCon;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getGrossProfit() {
		return grossProfit;
	}
	public void setGrossProfit(String grossProfit) {
		this.grossProfit = grossProfit;
	}
	public String getTotalOpportunityQuantity() {
		return totalOpportunityQuantity;
	}
	public void setTotalOpportunityQuantity(String totalOpportunityQuantity) {
		this.totalOpportunityQuantity = totalOpportunityQuantity;
	}
	public String getPaySight() {
		return paySight;
	}
	public void setPaySight(String paySight) {
		this.paySight = paySight;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getProjectUndertaker() {
		return projectUndertaker;
	}
	public void setProjectUndertaker(String projectUndertaker) {
		this.projectUndertaker = projectUndertaker;
	}
	public String getProjectResPerson() {
		return projectResPerson;
	}
	public void setProjectResPerson(String projectResPerson) {
		this.projectResPerson = projectResPerson;
	}
	public String getDemand() {
		return demand;
	}
	public void setDemand(String demand) {
		this.demand = demand;
	}
	public String getAnticipateRisk() {
		return anticipateRisk;
	}
	public void setAnticipateRisk(String anticipateRisk) {
		this.anticipateRisk = anticipateRisk;
	}
	public ArrayList<DevelopLocation> getDevelopLocationList() {
		return developLocationList;
	}
	public void setDevelopLocationList(
			ArrayList<DevelopLocation> developLocationList) {
		this.developLocationList = developLocationList;
	}
	public ArrayList<DemandDescription> getDemandDescriptionList() {
		return demandDescriptionList;
	}
	public void setDemandDescriptionList(
			ArrayList<DemandDescription> demandDescriptionList) {
		this.demandDescriptionList = demandDescriptionList;
	}
	public String getOutputDevelopLocationText() {
		return outputDevelopLocationText;
	}
	public void setOutputDevelopLocationText(String outputDevelopLocationText) {
		this.outputDevelopLocationText = outputDevelopLocationText;
	}
	public String getOutputDemandDescriptionText() {
		return outputDemandDescriptionText;
	}
	public void setOutputDemandDescriptionText(String outputDemandDescriptionText) {
		this.outputDemandDescriptionText = outputDemandDescriptionText;
	}
	
}
