package com.yae.ecommerce.productCategory;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
public class ProductCategory {
    @Id
    @GeneratedValue
    private UUID id;

    @Column
    private String name;

}
