package com.opportunity.controller;

import java.sql.SQLException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.opportunity.service.OpportunityService;

@Controller
@RequestMapping("/opportunity")
public class OpportunityController {

	@Autowired
	protected OpportunityService opportunityService;

	@RequestMapping("")
	public String listOpportunity(Map<String, Object> map) throws SQLException {

		map.put("opportunityList", opportunityService.getOpportunityList());

		return "opportunity";
	}
}
