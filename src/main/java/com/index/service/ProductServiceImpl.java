package com.index.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.index.dao.ProductDaoImpl;
import com.index.pojo.ProductEntity;

@Service
public class ProductServiceImpl  implements ProductService{

	@Autowired
	ProductDaoImpl prodDao;
	
	static{
		System.out.println("Inside Service ");
	}
	
	@Override
	public String addProduct(ProductEntity product) {
		prodDao.saveProduct(product);
		return "Product Saved Successfully";
	}

	@Override
	public ProductEntity getProduct(int prodId) {
		
		return null;
	}

	@Override
	public List<ProductEntity> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductEntity> deleteProduct(int ProdId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateProduct(ProductEntity prod) {
		// TODO Auto-generated method stub
		return null;
	}

}
