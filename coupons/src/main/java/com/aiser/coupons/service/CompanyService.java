package com.aiser.coupons.service;

import org.springframework.stereotype.Service;
import com.aiser.coupons.bean.Company;
import com.aiser.coupons.repository.CompanyRepository;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CompanyService{
	private final CompanyRepository companyRepository;

	@Autowired
	public CompanyService(CompanyRepository companyRepository) {
		this.companyRepository = companyRepository;
	}

	public List<Company> getCompanies() {
		return this.companyRepository.findAll();

	}

	public void save(Company company) {
		this.companyRepository.saveAndFlush(company);
	}
}