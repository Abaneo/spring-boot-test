package pers.yf.spring_boot_stest.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pers.yf.spring_boot_stest.entity.User;
import pers.yf.spring_boot_stest.service.UserService;

/**
 * Hello world!
 *
 */
@Controller
@ResponseBody
public class UserController {
	@Autowired
	UserService service;
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	@RequestMapping("/jdbc")
	public String jdbc() {
		List<Map<String, Object>> users=service.get();
		for(Map<String, Object> e:users){
			System.out.println(e.get("name"));
		}
		return "ok";
	}
	@RequestMapping("/allUser")
	public String allUser() {
		List<User> all=service.getList();
		for(User e:all){
			System.out.println(e.getName());
		}
		return "ok";
	}

	public static void main(String[] args) {
		SpringApplication.run(UserController.class, args);
	}
}
