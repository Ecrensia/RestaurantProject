package com.restaurant.dto;

import org.apache.ibatis.type.Alias;

@Alias("orderMenuTab")
public class OrderMenuTabDTO {
	private int menuCode;
	private String menuName;
	private int price;
	private String mainCategoryCode;
	private String middleCategoryCode;	
	private int basicOption1;
	private int basicOption2;
	private int orderCount;
	private String imgPath;
	
	public OrderMenuTabDTO() {

	}

	public OrderMenuTabDTO(int menuCode, String menuName, int price, String mainCategoryCode, String middleCategoryCode, int basicOption1,
			int basicOption2, int orderCount, String imgPath) {
		this.menuCode = menuCode;
		this.menuName = menuName;
		this.price = price;
		this.mainCategoryCode = mainCategoryCode;
		this.middleCategoryCode = middleCategoryCode;
		this.basicOption1 = basicOption1;
		this.basicOption2 = basicOption2;
		this.orderCount = orderCount;
		this.imgPath = imgPath;
	} 
	
	public int getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(int menuCode) {
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

	public String getMainCategoryCode() {
		return mainCategoryCode;
	}

	public void setMainCategoryCode(String mainCategoryCode) {
		this.mainCategoryCode = mainCategoryCode;
	}
	
	public String getMiddleCategoryCode() {
		return middleCategoryCode;
	}

	public void setMiddleCategoryCode(String middleCategoryCode) {
		this.middleCategoryCode = middleCategoryCode;
	}

	public int getBasicOption1() {
		return basicOption1;
	}

	public void setBasicOption1(int basicOption1) {
		this.basicOption1 = basicOption1;
	}

	public int getBasicOption2() {
		return basicOption2;
	}

	public void setBasicOption2(int basicOption2) {
		this.basicOption2 = basicOption2;
	}

	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	@Override
	public String toString() {
		return "OrderMenuTabDTO [menuCode=" + menuCode + ", menuName=" + menuName + ", price=" + price
				+ ", mainCategoryCode=" + mainCategoryCode + ", middleCategoryCode=" + middleCategoryCode
				+ ", basicOption1=" + basicOption1 + ", basicOption2=" + basicOption2 + ", orderCount=" + orderCount
				+ ", imgPath=" + imgPath + "]";
	}



	
}
