package com.shopdemo.springbootstart.costumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	public List<Customer> getAllCustomers(){
		List<Customer> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);
		return customers;
	}
	
	public Optional<Customer> getCustomerInfo(String customerId) {
		return customerRepository.findById(customerId);
	}

	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
		
	}
	
	
	public void updateCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void deleteCustomer(String customerId) {
		customerRepository.deleteById(customerId);
	}

}
