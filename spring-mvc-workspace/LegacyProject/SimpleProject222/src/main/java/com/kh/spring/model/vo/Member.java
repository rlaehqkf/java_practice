package com.kh.spring.model.vo;

import java.util.Date;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Member {
		
		private String userId;
		private String userPwd;
		private String userName;
		private String email;
		private Date enrollDate;
		private Date modifyDate;
		private String status;
		

		
		
		
	}



