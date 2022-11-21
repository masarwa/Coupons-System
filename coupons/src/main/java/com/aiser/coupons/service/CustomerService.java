package com.aiser.coupons.service;

import org.springframework.stereotype.Service;
import com.aiser.coupons.bean.Customer;
import com.aiser.coupons.repository.CustomerRepository;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CustomerService{
	private final CustomerRepository customerRepository;

	@Autowired
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public List<Customer> getCustomers() {
		List<Customer> result = new ArrayList<Customer>();
    for (Customer str : this.customerRepository.findAll()) {
        result.add(str);
    }
		return result;
	}

	public void save(Customer customer) {
		this.customerRepository.save(customer);
	}
}