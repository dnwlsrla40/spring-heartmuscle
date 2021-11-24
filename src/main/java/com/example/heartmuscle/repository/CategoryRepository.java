package com.example.heartmuscle.repository;

import com.example.heartmuscle.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
