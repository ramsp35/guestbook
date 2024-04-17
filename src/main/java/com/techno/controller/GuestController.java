package com.techno.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/guest")
public class GuestController {

	@GetMapping(path= {"", "/"})
	public String greetGuest() {
		return "Welcome New Guest...!!!";
	}

	@GetMapping(path = "/{guestName}")
	public String greetGuest(@PathVariable String guestName) {
		return "Welcome " + guestName + "...!!!";
	}
}
