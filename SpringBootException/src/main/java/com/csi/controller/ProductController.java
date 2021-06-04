package com.csi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csi.dao.ProductDaoImpl;
import com.csi.exception.RecordNotFound;
import com.csi.model.Product;
import com.csi.repo.ProductRepoImpl;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductDaoImpl productDaoImpl;
	
	@Autowired
	ProductRepoImpl ProductRepoImpl;

	@GetMapping("/products")
	public List<Product> getdata() {
		return productDaoImpl.getAllData();
	}

	@GetMapping("/products/{prodId}")
	public Optional<Product> getDataById(@PathVariable int prodId) throws RecordNotFound {
		Product pp=ProductRepoImpl.findById(prodId).orElseThrow(()->new RecordNotFound("Record not available with Id : "+prodId));
		return productDaoImpl.getdataById(prodId);

	}

	@PostMapping("/products")
	public String saveData(@RequestBody Product product) {
		productDaoImpl.savedata(product);
		return "saved";
	}

	@PutMapping("/products/{prodId}")
	public String updatedata(@PathVariable int prodId, @RequestBody Product product) throws RecordNotFound {
		Product pp=ProductRepoImpl.findById(prodId).orElseThrow(()->new RecordNotFound("Record not available with Id : "+prodId));
		productDaoImpl.updateData(prodId, product);
		return "updated";
	}

	@DeleteMapping("/products/{prodId}")
	public String deleteDatabyId(@PathVariable int prodId) throws RecordNotFound {
		Product pp=ProductRepoImpl.findById(prodId).orElseThrow(()->new RecordNotFound("Record not available with Id : "+prodId));
		productDaoImpl.deleteData(prodId);
		return "Deleted";
	}

}
