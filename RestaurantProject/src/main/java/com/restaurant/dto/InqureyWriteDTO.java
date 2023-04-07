package com.restaurant.dto;

import org.apache.ibatis.type.Alias;

@Alias("inqureyWrite")
public class InqureyWriteDTO {
	private int inqureyNo;
	private String inqureyTitle;
	private String inqureyContent;
	private String inqureyWriter;
	private String setPW;
	private String inqureyPW;
	private String inqureyDate;
	
	public InqureyWriteDTO() {	}

	public InqureyWriteDTO(int inqureyNo, String inqureyTitle, String inqureyContent, String inqureyWriter, String setPW,
			String inqureyPW, String inqureyDate) {
		super();
		this.inqureyNo = inqureyNo;
		this.inqureyTitle = inqureyTitle;
		this.inqureyContent = inqureyContent;
		this.inqureyWriter = inqureyWriter;
		this.setPW = setPW;
		this.inqureyPW = inqureyPW;
		this.inqureyDate = inqureyDate;
	}

	public int getInqureyNo() {
		return inqureyNo;
	}

	public void setInqureyNo(int inqureyNo) {
		this.inqureyNo = inqureyNo;
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

	public String getInqureyWriter() {
		return inqureyWriter;
	}

	public void setInqureyWriter(String inqureyWriter) {
		this.inqureyWriter = inqureyWriter;
	}

	public String getSetPW() {
		return setPW;
	}

	public void setSetPW(String setPW) {
		this.setPW = setPW;
	}

	public String getInqureyPW() {
		return inqureyPW;
	}

	public void setInqureyPW(String inqureyPW) {
		this.inqureyPW = inqureyPW;
	}

	public String getInqureyDate() {
		return inqureyDate;
	}

	public void setInqureyDate(String inqureyDate) {
		this.inqureyDate = inqureyDate;
	}

	@Override
	public String toString() {
		return "InqureyWriteDTO [inqureyNo=" + inqureyNo + ", inqureyTitle=" + inqureyTitle + ", inqureyContent="
				+ inqureyContent + ", inqureyWriter=" + inqureyWriter + ", setPW=" + setPW + ", inqureyPW=" + inqureyPW
				+ ", inqureyDate=" + inqureyDate + "]";
	}

	
	
	
	
}
