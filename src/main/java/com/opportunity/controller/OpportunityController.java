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
				salesforceService.query("select Id,Name,AccountName__c,StageName,contractForm__c,proposalEndDay__c,projectStartDate__c,projectEndDate__c FROM Opportunity"));
		map.put("opportunityListSize",
				salesforceService.query("select COUNT(Id) FROM Opportunity"));
		return "opportunity";
	}

}
