package com.dlithe.bankingapp.controller;

import com.dlithe.bankingapp.dto.ProductDetailsRequest;
import com.dlithe.bankingapp.dto.UserDetailsRequest;
import com.dlithe.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

//    @GetMapping("get-product-details/{productName}")
//    public prod displayProductDetails(@PathVariable String productName){
//        String result= testService.getProductDetails(productName);
//        return result;

//        @GetMapping("get-product-details/{productId}")
//        public ProductDetailsRequest fetchUserDetails(@PathVariable int productName) {
//
//            return testService.getProductDetails(productName);
//        }
//    }

//    @PostMapping("register-student")
//    public String registerProductDetails(@RequestBody ProductDetailsRequest productDetailsRequest) {
//        ProductDetailsRequest ProductDetailsRequest = new ProductDetailsRequest();
//        return testService.getProductDetails(ProductDetailsRequest);
//    }

    @PostMapping("get-product-details")
    public String displayProductDetails(@RequestBody ProductDetailsRequest productDetailsRequest) {
        return testService.registerProduct(productDetailsRequest);
    }

    @GetMapping("fetch-user-details/{userName}")
    public UserDetailsRequest fetchUserDetails(@PathVariable String userName) {
        return testService.fetchUserDetailsByName(userName);
    }



}

