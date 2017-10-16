package org.std.user_service.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.std.user_service.model.User;
import org.std.user_service.repository.UserRepository;

@RestController
// @RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/register", method=RequestMethod.GET)
	public String register(@RequestParam("username") String username, @RequestParam("pwd") String pwd) {
		System.out.println("UserController register");
		User user = new User();
		user.setUserName(username);
		user.setPwd(pwd);
		user.setSalt("111111");
		user.setStatus(0);
		user.setChannelMember("stdone");
		user.setRegisterTime(new Date());
		user.setRegisterIp(0);
		userRepository.save(user);
		
		return "result ";
	}

	@RequestMapping(value = "/list", method=RequestMethod.GET)
	public Page<User> list(@RequestParam(required = false) Integer page,@RequestParam(required = false) Integer size) {
		System.out.println("UserController list");
		Pageable pageable = new PageRequest(page,size);
		Page<User> users = userRepository.findAll(pageable);
		return users;
	}
}
