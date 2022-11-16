package com.api.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController

public class ApiControllers {

	@GetMapping(value = "/")
	public String getPage() {

		return "welcome to Items API";
	}

	@GetMapping(value = "/items")
	public String getItems() {

		return "Your items";
	}

	@GetMapping(value = "/items/{id}")
	public String getItem(int ID) {

		return "Your items";
	}

	@PostMapping(value = "/items")
	public String postItem(int ID) {
		return "Item deleted";
	}

	@PutMapping(value = "/items")
	public String putItem(int ID) {
		return "Item deleted";
	}

	@DeleteMapping(value = "/items")
	public String DeleteItem(int ID) {
		return "Item deleted";
	}

}
