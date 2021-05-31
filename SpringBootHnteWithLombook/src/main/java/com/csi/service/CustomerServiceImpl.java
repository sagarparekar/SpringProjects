package com.csi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.dao.CustomerDao;
import com.csi.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDao customerDaoImpl;
	@Override
	public List<Customer> getAllCustomerData() {
		// TODO Auto-generated method stub
		return customerDaoImpl.getAllCustomerData();
	}

	@Override
	public Customer getCustomerDataById(int customerId) {
		// TODO Auto-generated method stub
		return customerDaoImpl.getCustomerDataById(customerId);
	}

	@Override
	public void saveCustomerData(Customer customer) {
		// TODO Auto-generated method stub
		customerDaoImpl.saveCustomerData(customer);
	}

	@Override
	public void saveCustomerBulkData(List<Customer> customers) {
		// TODO Auto-generated method stub
		customerDaoImpl.saveCustomerBulkData(customers);
	}

	@Override
	public void updateCustomerData(int customerId, Customer customer) {
		// TODO Auto-generated method stub
		customerDaoImpl.updateCustomerData(customerId, customer);
	}

	@Override
	public void deleteCustomerDataById(int customerId) {
		// TODO Auto-generated method stub
		customerDaoImpl.deleteCustomerDataById(customerId);
	}

	@Override
	public void deleteAllCustomerData() {
		// TODO Auto-generated method stub
		customerDaoImpl.deleteAllCustomerData();
	}

	
	
}
