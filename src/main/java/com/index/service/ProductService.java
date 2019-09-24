package com.index.service;

import java.util.List;

import com.index.pojo.ProductEntity;

public interface ProductService {

	public String addProduct(ProductEntity product);
	public ProductEntity getProduct(int prodId);
	public List<ProductEntity> getAllProduct();
	public List<ProductEntity> deleteProduct(int ProdId);
	public String updateProduct(ProductEntity prod);
}
