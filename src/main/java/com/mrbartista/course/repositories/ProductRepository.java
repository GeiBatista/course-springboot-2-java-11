package com.mrbartista.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrbartista.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
