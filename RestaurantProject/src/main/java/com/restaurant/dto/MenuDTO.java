package com.restaurant.dto;

import org.apache.ibatis.type.Alias;

@Alias("menu")
public class MenuDTO {
	private char menuCode;
	private String menuName;
	private int price;
	private char mainCategoryCode;
	private char middleCategoryCode;
	private char smallCategoryCode;
	private char option1;
	private char option2;
	
	
	public MenuDTO() {

	}


	public MenuDTO(char menuCode, String menuName, int price, char mainCategoryCode, char middleCategoryCode,
			char smallCategoryCode, char option1, char option2) {
		super();
		this.menuCode = menuCode;
		this.menuName = menuName;
		this.price = price;
		this.mainCategoryCode = mainCategoryCode;
		this.middleCategoryCode = middleCategoryCode;
		this.smallCategoryCode = smallCategoryCode;
		this.option1 = option1;
		this.option2 = option2;
	}


	public char getMenuCode() {
		return menuCode;
	}


	public void setMenuCode(char menuCode) {
		this.menuCode = menuCode;
	}


	public String getMenuName() {
		return menuName;
	}


	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public char getMainCategoryCode() {
		return mainCategoryCode;
	}


	public void setMainCategoryCode(char mainCategoryCode) {
		this.mainCategoryCode = mainCategoryCode;
	}


	public char getMiddleCategoryCode() {
		return middleCategoryCode;
	}


	public void setMiddleCategoryCode(char middleCategoryCode) {
		this.middleCategoryCode = middleCategoryCode;
	}


	public char getSmallCategoryCode() {
		return smallCategoryCode;
	}


	public void setSmallCategoryCode(char smallCategoryCode) {
		this.smallCategoryCode = smallCategoryCode;
	}


	public char getOption1() {
		return option1;
	}


	public void setOption1(char option1) {
		this.option1 = option1;
	}


	public char getOption2() {
		return option2;
	}


	public void setOption2(char option2) {
		this.option2 = option2;
	}


	@Override
	public String toString() {
		return "MenuDTO [menuCode=" + menuCode + ", menuName=" + menuName + ", price=" + price + ", mainCategoryCode="
				+ mainCategoryCode + ", middleCategoryCode=" + middleCategoryCode + ", smallCategoryCode="
				+ smallCategoryCode + ", option1=" + option1 + ", option2=" + option2 + "]";
	}
	
	

		

	
	
	

}
