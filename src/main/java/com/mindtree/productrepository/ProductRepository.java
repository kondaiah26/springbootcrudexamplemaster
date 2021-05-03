package com.mindtree.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.productentity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}

