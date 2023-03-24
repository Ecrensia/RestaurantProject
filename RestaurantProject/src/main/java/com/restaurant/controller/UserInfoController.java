package com.restaurant.controller;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.restaurant.dto.UserInfoDTO;
import com.restaurant.service.UserInfoService;

@Controller
public class UserInfoController {
	
	private UserInfoService service;
	
	public UserInfoController(UserInfoService service) {
		this.service = service;
	}
	
	@RequestMapping("/")
	public String loginPage() {
		return "main/login_page";
	}
	
	@RequestMapping("/myPage_1")
	public String myPage() {
		return "my_page/myPage_1";
	}
	
	
	@RequestMapping("/login")
	public String login(String id, String passwd,HttpSession session) {
		
		UserInfoDTO dto = service.login(id,passwd);
		session.setAttribute("dto", dto);
		
		
		if(dto != null)
			return "redirect:/main";
		else
			return "redirect:/";
	}
	
	@RequestMapping("/main")
	public String main() {
		return "main/main";
	}
	
	@RequestMapping("/signup1")
	public String signup1() {
		return "signup/signup_1";
	}
	@RequestMapping("/signup2")
	public String signup2() {
		return "signup/signup_2";
		
	}
	@RequestMapping("/signup3")
	public ModelAndView signup3() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("signup/signup_3");	//경로
		mv.addObject("agree", "T");	//정보 넘겨줌
		
		return mv;
		
	}
	
	@RequestMapping("/id/chk/{idChk}")
	public ResponseEntity<String> idCheck(@PathVariable("idChk") String idVal){
		
		String DBid = service.selectIdCheck(idVal);
		HashMap<String, Object> map = new HashMap<String, Object>();
		if(DBid != null) {
			map.put("msg", "아이디가 중복됩니다.");
		}else{
			map.put("msg", "아이디 생성가능.");
		}
		return new ResponseEntity(map, HttpStatus.OK);
	}
	
	@RequestMapping("/signupSuccess")
	public String signupSuccess(UserInfoDTO dto) {
		LocalDateTime createDate = LocalDateTime.now();
		String date = createDate.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		dto.setBirthday(dto.getBirthday().replaceAll("-", "") );
		dto.setCreateUser(date);
		System.out.println(dto.toString());
		int result = service.insertMemberInfo(dto); // 결과를 받는 변수 = 받은 정보(service.insertMember(dto))를 서비스로 넘겨줌
		return "signup/signup_success";
		
	}
	
	@RequestMapping("/myPageChangeInfo1")
	public String myPageChangeInfo1() {
		return "my_page/myPage_changeInfo_1";
	}
	
	@RequestMapping("/myPagePayInfo")
	public String myPagePayInfo() {
		return "my_page/myPage_payInfo";
	}
	
	@RequestMapping("/myPageReservation")
	public String myPageReservation() {
		return "my_page/myPage_reservation_no";
	}
	

}
