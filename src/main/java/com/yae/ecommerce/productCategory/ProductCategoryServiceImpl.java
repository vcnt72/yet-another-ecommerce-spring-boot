package com.yae.ecommerce.productCategory;

import com.yae.ecommerce.common.exception.NoRecordFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;
import java.util.UUID;

public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public ProductCategory getById(UUID id) throws NoRecordFoundException {
        return this.productCategoryRepository.findById(id).orElseThrow(() ->new NoRecordFoundException("Product category not found"));
    }
}
