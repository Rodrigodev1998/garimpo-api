package com.dev.garimpo.repositories;

import com.dev.garimpo.domain.category.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
}
