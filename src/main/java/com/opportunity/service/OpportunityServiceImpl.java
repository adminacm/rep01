package com.opportunity.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opportunity.bean.DemandDescription;
import com.opportunity.bean.DevelopLocation;
import com.opportunity.bean.Opportunity;
import com.opportunity.dao.OpportunityDao;
import com.opportunity.dao.OpportunityDaoImpl;

@Service
public class OpportunityServiceImpl implements OpportunityService {

	@Autowired
	private OpportunityDao opportunityDao = new OpportunityDaoImpl();

	@Override
	public ArrayList<Opportunity> getOpportunityList() {

		ArrayList<Opportunity> opportunityList = opportunityDao
				.getOpportunityList();

		String strDevelopLocationText = "";
		String strDemandDescriptionText = "";

		for (int i = 0; i < opportunityList.size(); i++) {

			ArrayList<DevelopLocation> developLocationList = opportunityList
					.get(i).getDevelopLocationList();
			ArrayList<DemandDescription> demandDescriptionList = opportunityList
					.get(i).getDemandDescriptionList();

			// 開発ロケーションの設定
			for (int j = 0; j < developLocationList.size(); j++) {

				strDevelopLocationText = "    "
						+ developLocationList.get(j).getLocation() + "　"
						+ developLocationList.get(j).getWorkingRate() + "%";
			}

			// 要求詳細の設定
			String strItem = "@@@@@compareTest@@@@@";
			// 当前のカテゴリー
			String currentItemCategory = "";
			// 当前の要求詳細名
			String currentItemDetailName = "";
			for (int k = 0; k < demandDescriptionList.size(); k++) {

				DemandDescription demandDescriptionItr = demandDescriptionList
						.get(k);
				// データがnullの場合を""になる
				currentItemCategory = demandDescriptionItr.getCategory() != null ? demandDescriptionItr
						.getCategory() : "";
				currentItemDetailName = demandDescriptionItr.getDetailName() != null ? demandDescriptionItr
						.getDetailName() : "";

				// 第１行の場合
				if (k == 0) {

					strDemandDescriptionText = currentItemCategory
							+ currentItemDetailName;

					// 追加するカテゴリーが同じしなの場合
				} else if (strItem != currentItemCategory) {

					strDemandDescriptionText = strDemandDescriptionText
							+ "\r\n" + currentItemCategory + ":"
							+ currentItemDetailName;
					strItem = currentItemCategory;
					// 追加するカテゴリーが同じ場合
				} else if (strItem == currentItemCategory) {
					strDemandDescriptionText = strDemandDescriptionText + ","
							+ currentItemCategory;

				}

			}
			// 開発ロケーション表示内容の設定
			opportunityList.get(i).setOutputDevelopLocationText(
					strDevelopLocationText);
			// 開発ロケーション表示内容の設定
			opportunityList.get(i).setOutputDemandDescriptionText(
					strDemandDescriptionText);

		}
		return opportunityList;
	}

}
