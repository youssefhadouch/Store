package com.example.demo2.service;

import com.example.demo2.entity.Product;
import com.example.demo2.entity.Store;
import com.example.demo2.repository.ProductRepository;
import com.example.demo2.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreserviceImpl implements Storeservice{


    private final StoreRepository storeRepository;

    private final ProductRepository productRepository;

    @Override
    public Store CreateStore(Store store) {
        Store newstore = new Store();
        newstore.setName(store.getName());
        newstore.setAddress(store.getAddress());
        newstore.setPhone(store.getPhone());
        newstore.setEmail(store.getEmail());

        List<Product> products = new ArrayList<>();

        for (Product product : store.getProducts()) {
            products.add(productRepository.findById(product.getId()).orElseThrow(() -> new RuntimeException("Product not found")));
        }

        newstore.setProducts(products);
        return  storeRepository.save(newstore);
    }

    @Override
    public Store UpdateStore(Integer id, Store store) {
        Store newstore = storeRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Store not found"));

        newstore.setName(store.getName());
        newstore.setAddress(store.getAddress());
        newstore.setPhone(store.getPhone());
        newstore.setEmail(store.getEmail());
        newstore.setProducts(store.getProducts());

        return storeRepository.save(newstore);
    }

    @Override
    public Store GetStore(Store store) {
        storeRepository.findAll();
        return store;
    }

    @Override
    public Store DeleteStore(Integer id , Store store) {
        Store newstore = storeRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Store not found"));

        storeRepository.delete(newstore);
        return store;
    }

    @Override
    public List<Product> GetProductList(Integer id) {
        Store newstore = storeRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Store not found with the id"));

        return newstore.getProducts();
    }


}
