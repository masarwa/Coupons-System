package com.aiser.coupons.controllers;

import com.aiser.coupons.bean.Company;
import com.aiser.coupons.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/company")
public class CompanyController{
    public final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService){
        this.companyService = companyService;
    }

	@GetMapping("/")
	public List<Company> getCompanies() {
		return this.companyService.getCompanies();
	}


	@PostMapping(consumes="application/json")
    @ResponseStatus(HttpStatus.CREATED)
	public void saveCompany(@RequestBody Company company) {
		this.companyService.save(company);
	}

}