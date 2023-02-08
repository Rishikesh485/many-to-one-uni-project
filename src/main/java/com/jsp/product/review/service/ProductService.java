package com.jsp.product.review.service;

import com.jsp.product.review.dao.ProductDao;
import com.jsp.product.review.dto.Product;
import com.jsp.product.review.dto.Review;

public class ProductService {

	ProductDao p1 = new ProductDao();
	
	public Product saveProduct(Product product,Review review) {
		return p1.saveProduct(product, review);
		
	}
}
