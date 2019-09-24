package com.index.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.index.pojo.ProductEntity;

@Repository
public class ProductDaoImpl implements ProductDao{

	@Autowired
	SessionFactory sfactory;
	
	Session session=null;
	Transaction tr=null;
	
	
	@Override
	public boolean saveProduct(ProductEntity prod) {
		 session=sfactory.openSession();
		 tr=session.beginTransaction();
		 session.save(prod);
		 session.flush();
		 tr.commit();
		return true;
	}

	@Override
	public ProductEntity FetchProduct(int prodId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductEntity> fetchAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeProduct(int prodId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductEntity editProduct(ProductEntity prod) {
		// TODO Auto-generated method stub
		return null;
	}

}
