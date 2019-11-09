package com.softtron.pinmaologin.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouterController {
	@RequestMapping(path="index")
	public Map index() {
		System.out.println("index");
		return null;
	}
	
	@RequestMapping(path="login")
	public Map login() {
		System.out.println("login");
		return null;
	}
}
