package com.spring.member.login.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO {
	private int no;
	private String id;
	private String pw;
	private String email;
	private String phone;
	private String birth;
	private String userType;
	private String userDate;
}
