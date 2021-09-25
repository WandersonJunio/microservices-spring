package com.productcatalog.productcatolg.domain.product;

import com.productcatalog.productcatolg.infra.util.GenerateId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "uuid")
    private String id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "description", nullable = false, length = 255)
    private String description;

    @Column(name = "categoria", nullable = false)
    private Categoria categoria;

    public Product () {

    }

    public void setId() {
        String uuid = new GenerateId().generateUuid();
        this.id = uuid;
    }
}
