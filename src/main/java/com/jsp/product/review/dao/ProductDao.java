package com.jsp.product.review.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.product.review.dto.Product;
import com.jsp.product.review.dto.Review;

public class ProductDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Product saveProduct(Product product,Review review) {
		entityTransaction.begin();
		entityManager.persist(product);
		entityManager.persist(review);
		entityTransaction.commit();
		
		System.out.println("all good");
		
		return product;
		
	}

}
