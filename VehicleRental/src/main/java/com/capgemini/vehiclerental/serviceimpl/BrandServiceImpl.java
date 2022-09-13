package com.capgemini.vehiclerental.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.vehiclerental.entity.Brand;
import com.capgemini.vehiclerental.repository.BrandRepository;
import com.capgemini.vehiclerental.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	BrandRepository brandrepo;
	
	@Override
	public Brand saveBrand(Brand brand) {
		return brandrepo.save(brand);
	}
	
	@Override
	public Brand fetchBrandById(Integer brandId) {
		// TODO Auto-generated method stub
		return brandrepo.findById(brandId).get();
	}

}
