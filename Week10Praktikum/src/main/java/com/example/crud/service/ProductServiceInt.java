package com.example.crud.service;
import java.util.List;
import com.example.crud.entity.Product;

public interface ProductServiceInt <T extends Product> {
    List<T> findAll() throws Exception;
}
