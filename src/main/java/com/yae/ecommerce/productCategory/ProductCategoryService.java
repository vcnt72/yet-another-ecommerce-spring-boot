package com.yae.ecommerce.productCategory;

import com.yae.ecommerce.common.exception.NoRecordFoundException;
import com.yae.ecommerce.productCategory.ProductCategory;

import java.util.UUID;

public interface ProductCategoryService {

    ProductCategory getById(UUID id) throws NoRecordFoundException;

}
