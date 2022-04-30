package com.dlithe.bankingapp.service;


import com.dlithe.bankingapp.dto.ProductDetailsRequest;
import com.dlithe.bankingapp.dto.UserDetailsRequest;
import org.springframework.stereotype.Component;

@Component
public interface TestService {
//    String getProductDetails(int productId);

    //product
    String registerProduct(ProductDetailsRequest productDetailsRequest);
    //user
    UserDetailsRequest fetchUserDetailsByName(String userName);
}
