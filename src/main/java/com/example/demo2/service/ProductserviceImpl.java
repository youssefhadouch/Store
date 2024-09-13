package com.example.demo2.service;

import com.example.demo2.entity.Product;
import com.example.demo2.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductserviceImpl implements Productservice {


    private final ProductRepository productRepository;


    @Override
    public Product addProduct(Product product) {
         Product prd = new Product();
           prd.setName(product.getName());
           prd.setPrice(product.getPrice());
           prd.setDescription(product.getDescription());


        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Integer id) {

        return productRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Product not found"));
    }

    @Override
    public Product updateProduct(Integer id ,Product product) {
        Product prd = productRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Product not found "));
prd.setName(product.getName());
prd.setPrice(product.getPrice());
prd.setDescription(product.getDescription());

return productRepository.save(prd);

    }

    @Override
    public Product deleteProduct(Integer id , Product product) {
        Product prd = productRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Product not found "));


productRepository.delete(prd);

        return   prd;
    }

}
