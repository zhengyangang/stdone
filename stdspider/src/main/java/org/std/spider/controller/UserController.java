package org.std.spider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.std.spider.CountryProcesser;
import org.std.spider.NewCountryProcesser;
import org.std.spider.repository.CountryRepository;

@RestController
@RequestMapping(value = "/spider")
public class UserController {
	
	@Autowired
	private CountryRepository repository;

	@RequestMapping(value = "/country", method=RequestMethod.GET)
	public void list() {
		NewCountryProcesser.main1(repository);
		CountryProcesser.main1(repository);
	}
}
