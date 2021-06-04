package com.csi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csi.model.Product;

@Repository
public interface ProductRepoImpl extends JpaRepository<Product, Integer> {

}
