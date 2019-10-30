package com.example.springboot.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.springboot.service.TestService;

@Service
@Profile("test2")
public class TestServiceImpl2 implements TestService {

	@Override
	public String test() {
		// TODO Auto-generated method stub
		System.out.println("2222222222222");
		return null;
	}

}
