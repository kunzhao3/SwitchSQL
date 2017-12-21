package com.gome.modle;

import java.util.Date;

public class TmAppCaseInfo {
	private Integer id;
	private String reportId;
	private String incomeId;
	private String reportResult;
	private String reportUserName;
	private String reportUserId;
	private String workOrderCheckStatus;
	private String remark;
	private Date backDate;
	private String reportResource;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public String getIncomeId() {
		return incomeId;
	}
	public void setIncomeId(String incomeId) {
		this.incomeId = incomeId;
	}
	public String getReportResult() {
		return reportResult;
	}
	public void setReportResult(String reportResult) {
		this.reportResult = reportResult;
	}
	public String getReportUserName() {
		return reportUserName;
	}
	public void setReportUserName(String reportUserName) {
		this.reportUserName = reportUserName;
	}
	public String getReportUserId() {
		return reportUserId;
	}
	public void setReportUserId(String reportUserId) {
		this.reportUserId = reportUserId;
	}
	public String getWorkOrderCheckStatus() {
		return workOrderCheckStatus;
	}
	public void setWorkOrderCheckStatus(String workOrderCheckStatus) {
		this.workOrderCheckStatus = workOrderCheckStatus;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getBackDate() {
		return backDate;
	}
	public void setBackDate(Date backDate) {
		this.backDate = backDate;
	}
	public String getReportResource() {
		return reportResource;
	}
	public void setReportResource(String reportResource) {
		this.reportResource = reportResource;
	}
}
