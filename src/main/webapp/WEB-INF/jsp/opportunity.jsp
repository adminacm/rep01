<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<style type="text/css">
table.gridtable {
	font-family: verdana,arial,sans-serif;
	font-size:11px;
	color:#333333;
	border-width: 1px;
	border-color: #666666;
	border-collapse: collapse;
}
table.gridtable th {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #666666;
	background-color: #dedede;
}
table.gridtable td {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #666666;
	background-color: #ffffff;
}
</style>

</head>
    <div class="row">
        <div class="span8 offset2">
              <table class="gridtable">
                <caption style="text-align:left;font-size:20px">案件管理一覧情報</caption>
                    <thead>
                   　　　　　　　　　　 <tr>
                       <td>案件名</td>
                       <td>取引先</td>
                       <td>ステージ</td>
                       <td>案件確度</td>
                       <td>契約形態</td>
                       <td>契約書法務チェック</td>
                       <td>提案期限日</td>
                       <td>契約予定日</td>
                       <td>プロジェクト開始予定日</td>
                       <td>プロジェクト終了予定日</td>
                       <td>エンドユーザ</td>
                       <td>案件発生元</td>
                       <td>商流</td>
                       <td>案件概要</td>
                       <td>業種</td>
                       <td>種別</td>
                       <td>勤務地</td>
                       <td>売り見込</td>
                       <td>時間精算あり</td>
                       <td>時間条件下限</td>
                       <td>時間条件上限</td>
                       <td>コスト</td>
                       <td>粗利</td>
                       <td>人月</td>
                       <td>検収</td>
                       <td>営業担当者</td>
                       <td>プロジェクト担当者</td>
                       <td>プロジェクト責任者</td>
                       <td>備考</td>
                       <td>想定されるリスク</td>
                      </tr>
                    </thead>
                    <tbody>                     
                      <c:if test="${!empty opportunityList}">
                      <c:forEach var="opportunity" items="${opportunityList}" varStatus="status">
                       <c:if test="${!status.last}">
                      <tr>
                       <td>${opportunity.getField("Name").value}</td>
                       <td>${opportunity.getField("AccountName__c").value}</td>
                       <td>${opportunity.getField("StageName").value}</td>
                       <td>${opportunity.getField("accuracy__c").value}%</td>
                       <td>${opportunity.getField("contractForm__c").value}</td>
                       <td>${opportunity.getField("contratLowChk__c").value}</td>
                       <td>${opportunity.getField("CloseDate").value}</td> 
                       <td>${opportunity.getField("proposalEndDay__c").value}</td>
                       <td>${opportunity.getField("projectStartDate__c").value}</td>
                       <td>${opportunity.getField("projectEndDate__c").value}</td>
                       <td>${opportunity.getField("caseOccurPri__c").value}</td>
                       <td>${opportunity.getField("clientUser__c").value}</td> 
                       <td>${opportunity.getField("businessFlow__c").value}</td>
                       <td>${opportunity.getField("Description").value}</td>
                       <td>${opportunity.getField("industryCategory__c").value}</td>
                       <td>${opportunity.getField("Type").value}</td>
                       <td>${opportunity.getField("location__c").value}</td>
                       <td>￥${opportunity.getField("Amount").value}</td>
                       <c:if test="${opportunity.getField('timeCompute__c').value == 'true'}">
                       <td>あり</td>
                       </c:if>
                       <c:if test="${opportunity.getField('timeCompute__c').value == 'flase'}">
                       <td>なし</td>
                       </c:if>
                       <td>${opportunity.getField("computeLowestCon__c").value}</td>
                       <td>${opportunity.getField("computeTopCon__c").value}</td>
                       <td>${opportunity.getField("cost__c").value}</td>
                       <td>${opportunity.getField("grossProfit__c").value}</td>
                       <td>${opportunity.getField("TotalOpportunityQuantity").value}</td>
                       <td>${opportunity.getField("paySight__c").value}</td>
                       <td>${opportunity.getField("ownerName__c").value}</td>
                       <td>${opportunity.getField("projectUndertaker__c").value}</td>
                       <td>${opportunity.getField("projectResPerson__c").value}</td>
                       <td>${opportunity.getField("demand__c").value}</td>
                       <td>${opportunity.getField("anticipateRisk__c").value}
                      </tr>
                      </c:if>
                    </c:forEach>
                    </c:if>                    
                    </tbody>
                  </table>
                  <br/>
                  <input type="button" value="戻る" onclick="javascript:history.go(-1);">
        </div>
    </div>
