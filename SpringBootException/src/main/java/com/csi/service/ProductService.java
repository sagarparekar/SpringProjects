package com.csi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.dao.ProductDaoImpl;
import com.csi.model.Product;

@Service
public class ProductService {

	@Autowired
	ProductDaoImpl productDaoImpl;

	public List<Product> getAllData() {
		return productDaoImpl.getAllData();

	}

	public Optional<Product> getdataById(int prodId) {
		return productDaoImpl.getdataById(prodId);

	}

	public void savedata(Product product) {
		productDaoImpl.savedata(product);
	}

	public void updateData(int prodId, Product product) {
		productDaoImpl.updateData(prodId, product);
	}

	public void deleteData(int prodId) {
		productDaoImpl.deleteData(prodId);
	}
}
