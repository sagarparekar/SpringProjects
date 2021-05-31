package com.csi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csi.model.Customer;
import com.csi.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	CustomerService customerServiceImpl;
	
	
	@GetMapping("/customers")
	List<Customer> getAllCustomerData()
	{
		return customerServiceImpl.getAllCustomerData();
	}
	
	@GetMapping("/customers/{customerId}")
	Customer getCustomerDataById(@PathVariable int cutomerId)
	{
		return customerServiceImpl.getCustomerDataById(cutomerId);
	}
	
	
	@PostMapping("/customer")
	public String saveCustomerData(@RequestBody Customer customer)
	{
		customerServiceImpl.saveCustomerData(customer);
		return " data saved successfully";
	}
	
	
	@PostMapping("/customers")
	
	public String saveCustomerData(@RequestBody List<Customer>customers)
	{
		customerServiceImpl.saveCustomerBulkData(customers);
		return "Bulk data saved succefully";
	}
	
	@PutMapping("/customers/{customerId}")
	public String updateCustomerData(@PathVariable int customerId,@RequestBody Customer customer)
	{
		customerServiceImpl.updateCustomerData(customerId, customer);
		return"Data updated succeffully";
		
	}
	
	@DeleteMapping("/customers/{customerId}")
     public String deleteCustomerDataById(@PathVariable int customerId)
	{
		customerServiceImpl.deleteCustomerDataById(customerId);
		return "data deleted succseffully";
		
	}
	

	@DeleteMapping("/customers")
	public String deleteAllData()
	{
		customerServiceImpl.deleteAllCustomerData();
		return "data deleted successfully";
	}

}
