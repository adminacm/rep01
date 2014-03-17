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
<jsp:include page="header.jsp"/>
    <div class="row">
        <div class="span8 offset2">
              <table class="gridtable">
                <caption style="text-align:left;font-size:20px">案件管理一覧情報</caption>
                    <thead>
                   　　　　　　　　　　 <tr>
                       <td>案件名</td>
                       <td>取引先</td>
                       <td>ステージ</td>
                       <td>契約形態</td>
                       <td>契約予定日</td>
                       <td>プロジェクト開始予定日</td>
                       <td>プロジェクト終了予定日</td>
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
                       <td>${opportunity.getField("contractForm__c").value}</td>
                       <td>${opportunity.getField("proposalEndDay__c").value}</td>
                       <td>${opportunity.getField("projectStartDate__c").value}</td>
                       <td>${opportunity.getField("projectEndDate__c").value}</td>
                      </tr>
                      </c:if>
                    </c:forEach>
                    </c:if>                    
                    </tbody>
                  </table>
        </div>
    </div>
<jsp:include page="footer.jsp"/>