package com.mrbartista.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrbartista.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
