package com.capgemini.vehiclerental.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.vehiclerental.entity.Admin;
import com.capgemini.vehiclerental.exception.AdminNotFoundException;
import com.capgemini.vehiclerental.service.AdminService;


@CrossOrigin("*")
@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/save")
	public Admin saveAdmin(@Valid @RequestBody Admin admin) {
		return adminService.saveAdmin(admin);	
	}
	
	@GetMapping("/fetch/{id}") 
	public Admin fetchAdminById(@PathVariable("id") Integer id) throws AdminNotFoundException {
		return adminService.fetchUserById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteAdminbyId(@PathVariable("id") Integer id) {
		return adminService.deleteAdminbyId(id);
	}
	
	@PutMapping("/update")
    public Admin updateAdmin(@RequestBody Admin admin) {
        return adminService.updateAdmin(admin);
    }

}
