package com.restaurant.dto;

import java.sql.Date;

import org.apache.ibatis.type.Alias;

@Alias("userInfo")
public class UserInfoDTO {
	private String userId;
	private String passwd;
	private String userName;
	private String nick;
	private String gender;
	private String adress;
	private String adressDetail;
	private String tel;
	private String birthday;
	private String createUser;
	private String agreementLogin;
	
	public UserInfoDTO() { }

	public UserInfoDTO(String userId, String passwd, String userName, String nick, String gender, String adress,
			String adressDetail, String tel, String birthday, String createUser, String agreementLogin) {
		super();
		this.userId = userId;
		this.passwd = passwd;
		this.userName = userName;
		this.nick = nick;
		this.gender = gender;
		this.adress = adress;
		this.adressDetail = adressDetail;
		this.tel = tel;
		this.birthday = birthday;
		this.createUser = createUser;
		this.agreementLogin = agreementLogin;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getAdressDetail() {
		return adressDetail;
	}

	public void setAdressDetail(String adressDetail) {
		this.adressDetail = adressDetail;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getAgreementLogin() {
		return agreementLogin;
	}

	public void setAgreementLogin(String agreementLogin) {
		this.agreementLogin = agreementLogin;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [userId=" + userId + ", passwd=" + passwd + ", userName=" + userName + ", nick=" + nick
				+ ", gender=" + gender + ", adress=" + adress + ", adressDetail=" + adressDetail + ", tel=" + tel
				+ ", birthday=" + birthday + ", createUser=" + createUser + ", agreementLogin=" + agreementLogin + "]";
	}
	
	
	
	
	

	
	
	

}
