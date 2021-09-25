package com.productcatalog.productcatolg.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface ProductPersistenceInterface extends JpaRepository<Product, String> {
    abstract Product save(Product product);
    abstract List<Product> findAll(Product product);
}
