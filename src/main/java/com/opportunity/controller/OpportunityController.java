package com.opportunity.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.ryanbrainard.richsobjects.RichSObjectsService;
import com.github.ryanbrainard.richsobjects.RichSObjectsServiceImpl;

@Controller
@RequestMapping("/opportunity")
public class OpportunityController {

	private RichSObjectsService salesforceService = new RichSObjectsServiceImpl();

	@RequestMapping("")
	public String listOpportunity(Map<String, Object> map) {
		map.put("opportunityList",
				salesforceService.query("select Id, Name,AccountName__c,StageName,accuracy__c,contractForm__c,contratLowChk__c,CloseDate,proposalEndDay__c,projectStartDate__c,projectEndDate__c,"
						+ "caseOccurPri__c,clientUser__c,businessFlow__c,Description,industryCategory__c,Type,location__c,Amount,timeCompute__c,computeLowestCon__c,computeTopCon__c,cost__c,"
						+ "grossProfit__c,TotalOpportunityQuantity,paySight__c,ownerName__c,projectUndertaker__c,projectResPerson__c,demand__c,anticipateRisk__c FROM Opportunity"));
		map.put("opportunityListSize",
				salesforceService.query("select COUNT(Id) FROM Opportunity"));
		return "opportunity";
	}
}
