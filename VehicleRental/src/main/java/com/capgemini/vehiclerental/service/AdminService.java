package com.capgemini.vehiclerental.service;

import javax.validation.Valid;

import com.capgemini.vehiclerental.entity.Admin;
import com.capgemini.vehiclerental.exception.AdminNotFoundException;

public interface AdminService {


	public Admin saveAdmin(@Valid Admin admin);

	public Admin fetchUserById(Integer id) throws AdminNotFoundException;

	public String deleteAdminbyId(Integer id);

	public Admin updateAdmin(Admin admin);
	

}
