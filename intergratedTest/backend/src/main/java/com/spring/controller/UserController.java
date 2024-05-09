package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.dto.User;
import com.spring.model.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	//C
	
	@PostMapping("/user")
	public ResponseEntity<Integer> regist(@RequestBody User user){
		int result = userService.addUser(user);
		
		if(result == 0) {
			return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
		}
		else {
			return new ResponseEntity<>(result, HttpStatus.CREATED);
		}
	}
	
	//R
	
	@GetMapping("/user")
	public ResponseEntity<List<User>> viewAllUsers(){
		List<User> list = userService.findAllUsers();
		
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
	}
	
	//R - 1명
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> viewUsersById(@PathVariable("id") String id){
		User user = userService.findUserById(id);
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	//U
	
	@PutMapping("/user/{id}")
	public ResponseEntity<Integer> modifyUser(@PathVariable("id") String id, @RequestBody User user){
		user.setId(id);
		
		int result = userService.updateUser(user);
		
		if(result == 0) {
			return new ResponseEntity<Integer>(result, HttpStatus.BAD_REQUEST);
		}
		else {
			return new ResponseEntity<Integer>(result, HttpStatus.OK);
		}
	}
	
	//D
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<Void> removeUser(@PathVariable("id") String id){
		boolean result = userService.deleteUser(id);
		
		if(result) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
}
