package com.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVO {

	private int idx;
	private String name;
	private String userid;
	private String pwd;
	private String hp;
	private String post;
	private String addr1, addr2;
	private java.sql.Date indate;
	private int status;
	private String statusStr;
	private String email;
	private String gender;
	private int age;

	public String getAllAddr() {
		return "[" + post + "] " + addr1 + " " + addr2;
	}
	
}
