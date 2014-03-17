package argo.cost.opportunity;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import com.opportunity.controller.OpportunityController;

public class OpportunityControllerTest {

	OpportunityController opportunityController = new OpportunityController();

	@Test
	public void testListContacts() {

		assertEquals("opportunity",
				opportunityController
						.listOpportunity(new HashMap<String, Object>()));
	}

}
