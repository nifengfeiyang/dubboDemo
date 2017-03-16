package com.szm.demo.serviceimpl;

import org.springframework.stereotype.Service;

import com.szm.demo.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	public String sayHello() {
		System.out.println("hello world----------------------------");
		return "hello world";
	}

}
