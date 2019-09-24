package com.index.dao;

import java.util.List;

import com.index.pojo.ProductEntity;

public interface ProductDao {

	public boolean saveProduct(ProductEntity prod);
	public ProductEntity FetchProduct(int prodId);
	public List<ProductEntity> fetchAllProduct();
	public String removeProduct(int prodId);
	public ProductEntity editProduct(ProductEntity prod);
}
