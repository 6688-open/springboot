package com.example.springboot.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.springboot.service.TestService;

@Service
@Profile("test1")
public class TestServiceImpl01 implements TestService {

	@Override
	public String test() {
		// TODO Auto-generated method stub
		System.out.println("111111111");
		return null;
	}

}
