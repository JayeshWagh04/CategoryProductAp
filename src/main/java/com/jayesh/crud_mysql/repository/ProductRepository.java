package com.jayesh.crud_mysql.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jayesh.crud_mysql.model.Product;
public interface ProductRepository extends JpaRepository<Product, Long> {
}
