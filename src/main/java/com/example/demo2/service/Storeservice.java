package com.example.demo2.service;

import com.example.demo2.entity.Product;
import com.example.demo2.entity.Store;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Storeservice {
    Store CreateStore(Store store);

    Store UpdateStore(Integer id, Store store);

    Store GetStore(Store store);

    Store DeleteStore(Integer id , Store store);



    List<Product> GetProductList(Integer id);
}
