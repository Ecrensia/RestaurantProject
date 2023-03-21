package com.restaurant.dto;

import org.apache.ibatis.type.Alias;

@Alias("FAQ")
public class FAQDTO {
	private int FAQno;
	private String FAQTitle;
	private String FAQContent;
	
	public FAQDTO() {	}

	public FAQDTO(int fAQno, String fAQTitle, String fAQContent) {
		super();
		FAQno = fAQno;
		FAQTitle = fAQTitle;
		FAQContent = fAQContent;
	}

	public int getFAQno() {
		return FAQno;
	}

	public void setFAQno(int fAQno) {
		FAQno = fAQno;
	}

	public String getFAQTitle() {
		return FAQTitle;
	}

	public void setFAQTitle(String fAQTitle) {
		FAQTitle = fAQTitle;
	}

	public String getFAQContent() {
		return FAQContent;
	}

	public void setFAQContent(String fAQContent) {
		FAQContent = fAQContent;
	}

	@Override
	public String toString() {
		return "FAQDTO [FAQno=" + FAQno + ", FAQTitle=" + FAQTitle + ", FAQContent=" + FAQContent + "]";
	}
	
	
	
}
