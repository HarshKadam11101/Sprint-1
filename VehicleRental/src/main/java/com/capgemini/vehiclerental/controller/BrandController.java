package com.capgemini.vehiclerental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.vehiclerental.entity.Brand;
import com.capgemini.vehiclerental.service.BrandService;

@RestController
@RequestMapping("/brand")
public class BrandController {
	
	@Autowired
	BrandService brandService;
	
	@PostMapping("/save")
	public Brand saveBrand(@RequestBody Brand brand) {
		return brandService.saveBrand(brand);	
	}
	
	@GetMapping("/fetch/{id}")
	public Brand fetchBrandById(@PathVariable("id") Integer brandId) {
		return brandService.fetchBrandById(brandId);

	}
}
