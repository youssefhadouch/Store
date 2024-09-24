package com.example.demo2.client;

import com.example.demo2.dto.OrderRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "inventory-service",url = "http://localhost:8082")
public interface InventoryServiceClient {


        @PutMapping("/inventory/inStock")
        Boolean InStock(@RequestBody OrderRequest request);

}

