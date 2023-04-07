package com.restaurant.dto;

import org.apache.ibatis.type.Alias;

@Alias("manager")
public class ManagerInfoDTO {
	private String managerId;
	private String managerPW;
	private int managerRank;
}
