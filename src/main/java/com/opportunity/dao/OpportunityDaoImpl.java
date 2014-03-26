package com.opportunity.dao;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Repository;

import com.github.ryanbrainard.richsobjects.RichSObject;
import com.github.ryanbrainard.richsobjects.RichSObjectsService;
import com.github.ryanbrainard.richsobjects.RichSObjectsServiceImpl;
import com.opportunity.bean.DemandDescription;
import com.opportunity.bean.DevelopLocation;
import com.opportunity.bean.Opportunity;

@Repository
public class OpportunityDaoImpl implements OpportunityDao {

	private RichSObjectsService salesforceService = new RichSObjectsServiceImpl();

	@Override
	public ArrayList<Opportunity> getOpportunityList() {
		ArrayList<Opportunity> opportunityList = new ArrayList<Opportunity>();

		// 案件一覧情報を取得
		String soqlOpportunitySearch = "select Id, Name,AccountName__c,StageName,accuracy__c,contractForm__c,contratLowChk__c,CloseDate,proposalEndDay__c,projectStartDate__c,projectEndDate__c,"
				+ "caseOccurPri__c,clientUser__c,businessFlow__c,Description,industryCategory__c,Type,location__c,Amount,timeCompute__c,computeLowestCon__c,computeTopCon__c,cost__c,"
				+ "grossProfit__c,TotalOpportunityQuantity,paySight__c,ownerName__c,projectUndertaker__c,projectResPerson__c,demand__c,anticipateRisk__c FROM Opportunity";

		Iterator<RichSObject> opportunityQueryResultItr = salesforceService
				.query(soqlOpportunitySearch);

		String soqlLocationSearch;
		String soalDemandDescription;
		String opportunityId;
		Opportunity opportunity;
		while (opportunityQueryResultItr.hasNext()) {

			RichSObject opportunityObj = opportunityQueryResultItr.next();
			opportunity = new Opportunity();
			// 案件の開発ロケーションリストを初期化
			ArrayList<DevelopLocation> developLocationList = new ArrayList<DevelopLocation>();
			// 案件の要求詳細リストを初期化
			ArrayList<DemandDescription> demandDescriptionList = new ArrayList<DemandDescription>();
			DevelopLocation developLocation = null;
			DemandDescription demandDescription = null;
			opportunityId = opportunityObj.getField("Id").asString();
			// 案件の開発ロケーション情報を取得
			soqlLocationSearch = "select Location__c , WorkingRate__c, Opportunity__c FROM DevelopmentLocation__c where Opportunity__c = '"
					+ opportunityId + "'";

			Iterator<RichSObject> locationQueryResultItr = salesforceService
					.query(soqlLocationSearch);

			while (locationQueryResultItr.hasNext()) {

				RichSObject locationObj = locationQueryResultItr.next();

				developLocation = new DevelopLocation();

				developLocation.setLocation(locationObj.getField("Location__c")
						.asString());
				developLocation.setWorkingRate(locationObj.getField(
						"WorkingRate__c").asString());

				developLocationList.add(developLocation);
			}
			opportunity.setDevelopLocationList(developLocationList);

			// 案件の要求詳細を取得
			soalDemandDescription = "select id, DetailName__c, Category__c, Remarks__c, ProjectName__c FROM RequestDetailedList__c where ProjectName__c = '"
					+ opportunityId + "'";

			Iterator<RichSObject> demandDescriptionQueryResultItr = salesforceService
					.query(soalDemandDescription);

			while (demandDescriptionQueryResultItr.hasNext()) {

				RichSObject demandDescriptionObj = demandDescriptionQueryResultItr
						.next();

				demandDescription = new DemandDescription();

				demandDescription.setCategory(demandDescriptionObj.getField(
						"Category__c").asString());
				demandDescription.setDetailName(demandDescriptionObj.getField(
						"DetailName__c").asString());
				demandDescription.setRemarks(demandDescriptionObj.getField(
						"Remarks__c").asString());

				demandDescriptionList.add(demandDescription);

			}
			opportunity.setDemandDescriptionList(demandDescriptionList);
			// 取得した案件情報を設定する
			opportunity.setOpportunityId(opportunityId);
			opportunity.setName(opportunityObj.getField("Name").asString());
			opportunity.setAccountName(opportunityObj
					.getField("AccountName__c").asString());
			opportunity.setStageName(opportunityObj.getField("StageName")
					.asString());
			opportunity.setAccuracy(opportunityObj.getField("accuracy__c")
					.asString());
			opportunity.setContractForm(opportunityObj.getField(
					"contractForm__c").asString());
			opportunity.setContratLowChk(opportunityObj.getField(
					"contratLowChk__c").asString());
			opportunity.setCloseDate(opportunityObj.getField("CloseDate")
					.asString());
			opportunity.setProposalEndDay(opportunityObj.getField(
					"proposalEndDay__c").asString());
			opportunity.setProjectStartDate(opportunityObj.getField(
					"projectStartDate__c").asString());
			opportunity.setProjectEndDate(opportunityObj.getField(
					"projectEndDate__c").asString());
			opportunity.setCaseOccurPri(opportunityObj.getField(
					"caseOccurPri__c").asString());
			opportunity.setClientUser(opportunityObj.getField("clientUser__c")
					.asString());
			opportunity.setBusinessFlow(opportunityObj.getField(
					"businessFlow__c").asString());
			opportunity.setDescription(opportunityObj.getField("Description")
					.asString());
			opportunity.setIndustryCategory(opportunityObj.getField(
					"industryCategory__c").asString());
			opportunity.setType(opportunityObj.getField("Type").asString());
			opportunity.setLocation(opportunityObj.getField("location__c")
					.asString());
			opportunity.setAmount(opportunityObj.getField("Amount").asString());
			opportunity.setTimeCompute(opportunityObj
					.getField("timeCompute__c").asString());
			opportunity.setComputeLowestCon(opportunityObj.getField(
					"computeLowestCon__c").asString());
			opportunity.setComputeTopCon(opportunityObj.getField(
					"computeTopCon__c").asString());
			opportunity.setCost(opportunityObj.getField("cost__c").asString());
			opportunity.setGrossProfit(opportunityObj
					.getField("grossProfit__c").asString());
			opportunity.setTotalOpportunityQuantity(opportunityObj.getField(
					"TotalOpportunityQuantity").asString());
			opportunity.setPaySight(opportunityObj.getField("paySight__c")
					.asString());
			opportunity.setOwnerName(opportunityObj.getField("ownerName__c")
					.asString());
			opportunity.setProjectUndertaker(opportunityObj.getField(
					"projectUndertaker__c").asString());
			opportunity.setProjectResPerson(opportunityObj.getField(
					"projectResPerson__c").asString());
			opportunity.setDemand(opportunityObj.getField("demand__c")
					.asString());
			opportunity.setAnticipateRisk(opportunityObj.getField(
					"anticipateRisk__c").asString());

			opportunityList.add(opportunity);

		}
		return opportunityList;

	}

}
