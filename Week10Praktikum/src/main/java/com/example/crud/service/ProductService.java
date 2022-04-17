package com.example.crud.service;

import com.example.crud.entity.Product;
import com.example.crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService <T extends Product> implements ProductServiceInt<T> {

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

    public Product saveProduct(Product product){
        return  repository.save(product);
    }
    public List<Product> saveProducts(List<Product> products){
        return  repository.saveAll(products);
    }

    public List<Product> getProducts(){
        return  repository.findAll();
    }
    public Product getProductById(int id){
        return  repository.findById(id).orElse(null);
    }
    public Product getProductByName(String name){
        return  repository.findByName(name);
    }

    public String deleteProduct(int id){
        repository.deleteById(id);
        return "product removed !! "+id;
    }

    public Product updateProduct(Product product){
        Product existingProduct=repository.findById(Product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }
}
