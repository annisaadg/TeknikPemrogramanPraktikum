package com.javatechie.crud.example.service;
import java.util.List;
import com.javatechie.crud.example.entity.Product;

public interface ProductServiceInt <T extends Product>{
    List<T> findAll() throws Exception;
}