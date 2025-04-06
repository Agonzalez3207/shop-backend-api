package com.shopdemo.springbootstart.costumer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@GetMapping("/customers")
	public List<Customer> getAllCostumers() {
		return customerService.getAllCustomers();
	}
	
	@PostMapping("/customer")
	public void addCostumer(@RequestBody Customer costumer) {
		customerService.addCustomer(costumer);
	}
	
	@GetMapping("/customer/{customerId}")
	public Optional<Customer> getCustomerById(@PathVariable String customerId) {
		return customerService.getCustomerInfo(customerId);
	}
	
	@PutMapping("/customer")
	public void updateCustomer(@RequestBody Customer costumer) {
		customerService.updateCustomer(costumer);
	}
	
}
