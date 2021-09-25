package com.productcatalog.productcatolg.infra.util.repository;

import com.productcatalog.productcatolg.domain.product.Product;
import com.productcatalog.productcatolg.domain.product.ProductPersistenceInterface;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public abstract class ProductDb implements ProductPersistenceInterface {

    @Query(nativeQuery = true, value =
            "SELECT" +
                " id name description categoria" +
            "FROM" +
                "products")
    abstract List<Product> findAllEletronic();
}
