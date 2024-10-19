package com.jayesh.crud_mysql.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jayesh.crud_mysql.model.Category;
public interface CategoryRepository extends JpaRepository<Category, Long> {
}