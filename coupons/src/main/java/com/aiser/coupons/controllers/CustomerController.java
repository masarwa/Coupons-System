package com.aiser.coupons.controllers;

import com.aiser.coupons.bean.Customer;
import com.aiser.coupons.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController{
    public final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

	@GetMapping("/")
	public List<Customer> getCustomers() {
		return this.customerService.getCustomers();
	}


	@PostMapping(consumes="application/json")
    @ResponseStatus(HttpStatus.CREATED)
	public void saveCustomer(@RequestBody Customer customer) {
		this.customerService.save(customer);
	}

}