package com.javatechie.crud.example.service;
import java.util.ArrayList;
import java.util.List;
import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService <T extends Product> implements ProductServiceInt<T>{
    @Autowired
    private ProductRepository repository;
    @Override
    public List<T> findAll() throws Exception {
        try {
            return (List<T>) repository.findAll();
        } catch (Exception e) {
            throw e;
        }
    }

    public List<T> getAll()
    {
        List<T> product = (List<T>) new ArrayList<Product>();
        repository.findAll().forEach(product1 -> product.add((T) product1));
        return product;
    }
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name) {
        return repository.findByName(name);
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }


}