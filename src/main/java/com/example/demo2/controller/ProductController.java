package com.example.demo2.controller;

import com.example.demo2.entity.Product;
import com.example.demo2.repository.ProductRepository;
import com.example.demo2.service.Productservice;
import jakarta.persistence.Id;
import jakarta.persistence.PostUpdate;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Product")


public class ProductController {


    private final Productservice productservice;

@GetMapping("/{id}")
public Product getProductById(@PathVariable Integer id){
    return productservice.getProductById( id);

}

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return productservice.addProduct(product);
    }

@PutMapping("/update/{id}")
    public Product updateProduct(@PathVariable Integer id ,@RequestBody Product product) {
    return productservice.updateProduct( id , product);
    }


    @DeleteMapping("/delete/{id}")
    public Product deleteProduct(@PathVariable Integer id , Product product){
return productservice.deleteProduct( id , product);
}


}