package com.restaurant.dto;

import org.apache.ibatis.type.Alias;

@Alias("inqurey")
public class InqureyDTO {
	private int inqureyNo;
	private String inqureyWriter;
	private String inqureyTitle;
	private String inqureyContent;
	private String inqureyDate;
	private int inqureyCount;
	private char setPW;
	private int inqureyPW;
	private String managerID;
	private String answerName;
	private int answerDate;
	private String answerContent;
	
	public InqureyDTO() {	}

	public InqureyDTO(int inqureyNo, String inqureyWriter, String inqureyTitle, String inqureyContent,
			String inqureyDate, int inqureyCount, char setPW, int inqureyPW, String managerID, String answerName,
			int answerDate, String answerContent) {
		super();
		this.inqureyNo = inqureyNo;
		this.inqureyWriter = inqureyWriter;
		this.inqureyTitle = inqureyTitle;
		this.inqureyContent = inqureyContent;
		this.inqureyDate = inqureyDate;
		this.inqureyCount = inqureyCount;
		this.setPW = setPW;
		this.inqureyPW = inqureyPW;
		this.managerID = managerID;
		this.answerName = answerName;
		this.answerDate = answerDate;
		this.answerContent = answerContent;
	}
	
	

	public InqureyDTO(int inqureyNo, String inqureyWriter, String inqureyTitle, String inqureyContent,
			String inqureyDate, int inqureyCount, char setPW, int inqureyPW) {
		super();
		this.inqureyNo = inqureyNo;
		this.inqureyWriter = inqureyWriter;
		this.inqureyTitle = inqureyTitle;
		this.inqureyContent = inqureyContent;
		this.inqureyDate = inqureyDate;
		this.inqureyCount = inqureyCount;
		this.setPW = setPW;
		this.inqureyPW = inqureyPW;
	}

	public int getInqureyNo() {
		return inqureyNo;
	}

	public void setInqureyNo(int inqureyNo) {
		this.inqureyNo = inqureyNo;
	}

	public String getInqureyWriter() {
		return inqureyWriter;
	}

	public void setInqureyWriter(String inqureyWriter) {
		this.inqureyWriter = inqureyWriter;
	}

	public String getInqureyTitle() {
		return inqureyTitle;
	}

	public void setInqureyTitle(String inqureyTitle) {
		this.inqureyTitle = inqureyTitle;
	}

	public String getInqureyContent() {
		return inqureyContent;
	}

	public void setInqureyContent(String inqureyContent) {
		this.inqureyContent = inqureyContent;
	}

	public String getInqureyDate() {
		return inqureyDate;
	}

	public void setInqureyDate(String inqureyDate) {
		this.inqureyDate = inqureyDate;
	}

	public int getInqureyCount() {
		return inqureyCount;
	}

	public void setInqureyCount(int inqureyCount) {
		this.inqureyCount = inqureyCount;
	}

	public char getSetPW() {
		return setPW;
	}

	public void setSetPW(char setPW) {
		this.setPW = setPW;
	}

	public int getInqureyPW() {
		return inqureyPW;
	}

	public void setInqureyPW(int inqureyPW) {
		this.inqureyPW = inqureyPW;
	}

	public String getManagerID() {
		return managerID;
	}

	public void setManagerID(String managerID) {
		this.managerID = managerID;
	}

	public String getAnswerName() {
		return answerName;
	}

	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}

	public int getAnswerDate() {
		return answerDate;
	}

	public void setAnswerDate(int answerDate) {
		this.answerDate = answerDate;
	}

	public String getAnswerContent() {
		return answerContent;
	}

	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}

	@Override
	public String toString() {
		return "InqureyDTO [inqureyNo=" + inqureyNo + ", inqureyWriter=" + inqureyWriter + ", inqureyTitle="
				+ inqureyTitle + ", inqureyContent=" + inqureyContent + ", inqureyDate=" + inqureyDate
				+ ", inqureyCount=" + inqureyCount + ", setPW=" + setPW + ", inqureyPW=" + inqureyPW + ", managerID="
				+ managerID + ", answerName=" + answerName + ", answerDate=" + answerDate + ", answerContent="
				+ answerContent + "]";
	}
	
	
	
	
	
	
}
