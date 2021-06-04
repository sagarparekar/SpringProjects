package com.csi.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csi.model.Product;
import com.csi.repo.ProductRepoImpl;

@Component
public class ProductDaoImpl {

	@Autowired
	ProductRepoImpl productRepoImpl;
	
	public List<Product> getAllData(){
		return productRepoImpl.findAll();
		
	}
	
	public Optional<Product> getdataById(int prodId){
		return productRepoImpl.findById(prodId);
		
	}
	
	public void savedata(Product product){
		 productRepoImpl.save(product);
	}
	
	public void updateData(int prodId, Product product){
		productRepoImpl.save(product);
	}
	
	public void deleteData(int prodId){
		productRepoImpl.deleteById(prodId);
	}
}
