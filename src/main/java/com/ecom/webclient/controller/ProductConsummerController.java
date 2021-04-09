package com.ecom.webclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ecom.webclient.entity.Product;

@RestController
@RequestMapping("/consumer/")
public class ProductConsummerController {

	// define api url
	String url = "http://localhost:9001/products/";

	@GetMapping("/product/{id}")
	public Product fetchProduct(@PathVariable("id") long id) {

		// use rest template
		RestTemplate restTemplate = new RestTemplate();
		// map response to product
		return restTemplate.getForObject(url + id, Product.class);
	}

	@PutMapping("/product/{id}")
	public String updateProduct(@PathVariable("id") long id,@RequestBody Product product) {
		// use rest template
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.put(url+id, product);
		return "product updated successfully!";
	}
}
