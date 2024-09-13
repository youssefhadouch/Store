package com.example.demo2.service;

import com.example.demo2.entity.Product;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public interface Productservice  {


    Product addProduct(Product product);
    Product getProductById( Integer Id);
    Product updateProduct( Integer id , Product product);
    Product deleteProduct( Integer id , Product product );
}
