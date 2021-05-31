package com.csi.dao;

import java.util.List;

import com.csi.model.Customer;

public interface CustomerDao {
	
	
	public List<Customer> getAllCustomerData();
	
	public Customer getCustomerDataById(int customerId);
	
	public void saveCustomerData(Customer customer);
	
	public void saveCustomerBulkData(List<Customer>customers);
	
	public void updateCustomerData(int customerId,Customer customer);
	
	public void deleteCustomerDataById(int customerId);
	
	public void deleteAllCustomerData();
	
	
	
	

}
