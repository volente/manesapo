package com.rocksbook.manesapo.member.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/member", method = RequestMethod.GET)
public class MemberController {

	@RequestMapping("/isOkey")
	public String isOkey() {
		return "okey";
	}
	
}
