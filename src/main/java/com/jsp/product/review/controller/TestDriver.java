package com.jsp.product.review.controller;

import com.jsp.product.review.dto.Product;
import com.jsp.product.review.dto.Review;
import com.jsp.product.review.service.ProductService;

public class TestDriver {
	public static void main(String[] args) {
		Product product = new Product();
		product.setName("maggie");
		product.setPrice(14);
		
		Review r1 = new Review();
		r1.setFeedback("not a good product");
		
		
		Review r2 = new Review();
		r2.setFeedback("its good");
		
		Review r3 = new Review();
		r3.setFeedback("average");
		
		r1.setProduct(product);
		r2.setProduct(product);
		r3.setProduct(product);
		
		ProductService p1 = new ProductService();
		p1.saveProduct(product, r1);
		p1.saveProduct(product, r2);
		p1.saveProduct(product, r3);
		
		System.out.println("All good");
	}
}
