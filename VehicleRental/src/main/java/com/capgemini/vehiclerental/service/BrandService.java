package com.capgemini.vehiclerental.service;

import com.capgemini.vehiclerental.entity.Brand;

public interface BrandService {

	public Brand saveBrand(Brand brand);

	public Brand fetchBrandById(Integer brandId);

}
