package org.std.spider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.std.spider.CountryProcesser;

@RestController
@RequestMapping(value = "/spider")
public class UserController {
	
	@RequestMapping(value = "/country", method=RequestMethod.GET)
	public void list() {
		CountryProcesser.main(null);
	}
}
