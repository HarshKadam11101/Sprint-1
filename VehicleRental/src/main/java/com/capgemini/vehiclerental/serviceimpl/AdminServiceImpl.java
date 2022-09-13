package com.capgemini.vehiclerental.serviceimpl;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.vehiclerental.entity.Admin;
import com.capgemini.vehiclerental.exception.AdminNotFoundException;
import com.capgemini.vehiclerental.repository.AdminRepository;
import com.capgemini.vehiclerental.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired 
	AdminRepository adminrepo;

	

	@Override
	public Admin saveAdmin(@Valid Admin admin) {
		return adminrepo.save(admin);
	}

	@Override
	public Admin fetchUserById(Integer id) throws AdminNotFoundException {
		 Optional<Admin> admin = adminrepo.findById(id);

		 if(!admin.isPresent()) {
				throw new AdminNotFoundException("Admin Not Found ");
			}
			return admin.get();
	}

	@Override
	public String deleteAdminbyId(Integer id) {
		adminrepo.deleteById(id);
		return "Deleted Admin Successfully";
	}

	@Override
	public Admin updateAdmin(Admin admin) 	{
		adminrepo.saveAndFlush(admin);
		return adminrepo.getReferenceById(admin.getId());
	}

}
