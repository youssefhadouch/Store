package com.example.demo2.controller;

import com.example.demo2.entity.Product;
import com.example.demo2.entity.Store;
import com.example.demo2.repository.StoreRepository;
import com.example.demo2.service.Storeservice;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/store")
public class StoreController {

@Autowired
    private final Storeservice storeservice;


@PostMapping("/create")
    public Store CreateStore(@RequestBody Store store) {
        return storeservice.CreateStore(store);
    }
@PutMapping("/update/{id}")
    public Store UpdateStore(@PathVariable Integer id , @RequestBody Store store) {
    return storeservice.UpdateStore(id,store);
    }

    @GetMapping("/store")
    public Store GetStore(@RequestBody Store store) {
return storeservice.GetStore( store );
    }


    @DeleteMapping("/delete/{id}")
    public Store DeleteStore(@PathVariable Integer id , Store store) {
    return storeservice.DeleteStore(id , store);


    }
@GetMapping("/productlist")
    public List<Product> GetProductList( Integer id){
    return storeservice.GetProductList(id );
    }
}
