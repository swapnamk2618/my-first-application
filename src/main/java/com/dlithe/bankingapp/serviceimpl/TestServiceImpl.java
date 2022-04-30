package com.dlithe.bankingapp.serviceimpl;

import com.dlithe.bankingapp.dto.ProductDetailsRequest;
import com.dlithe.bankingapp.dto.UserDetailsRequest;
import com.dlithe.bankingapp.entity.Product;
import com.dlithe.bankingapp.entity.User;
import com.dlithe.bankingapp.repository.ProductDAO;
import com.dlithe.bankingapp.repository.UserDAO;
import com.dlithe.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private ProductDAO productDAO;

//    @Override
//    public java.lang.String getProductDetails(java.lang.String productName) {
//        if (productName != null) {
//            switch (productName) {
//                case "laptop":
//                    return "product available best price";
//                case "mobile":
//                    return "low quality product";
//                default:
//                    return "no product found";
//            }
//        } else {
//            return "product not null";
//        }   }

//    @Override
//    public String getProductDetails(int productId) {
//        Product product=new Product();
//       product.setName(ProductDetailsRequest.getName);
//    }

    @Override
    public String registerProduct(ProductDetailsRequest productDetailsRequest) {
      Product product=new Product();
      product.setName(productDetailsRequest.getName());
      product.setPrice(productDetailsRequest.getPrice());
      product.setType(productDetailsRequest.getType());
      product.setDetails(productDetailsRequest.getDetails());
      productDAO.save(product);
      return "product details save sucessfully";
    }

    @Override
    public UserDetailsRequest fetchUserDetailsByName(String userName) {
        UserDetailsRequest userDetailsRequest=new UserDetailsRequest();
        User user= userDAO.findByName(userName);
        userDetailsRequest.setName(user.getName());
        userDetailsRequest.setId(user.getId());
        userDetailsRequest.setAge(user.getAge());
        userDetailsRequest.setAddress(user.getAddress());
         return userDetailsRequest;
    }

//    @Override
//    public String getProductDetails(ProductDetailsRequest productDetailsRequest) {
//
//        Product product = new Product();
//        product.setName(productDetailsRequest.getName());
//        product.setType(productDetailsRequest.getType());
//        product.setPrice(productDetailsRequest.getPrice());
//        product.setDetails(productDetailsRequest.getDetails());
//           productDAO.save(product);
//
//        return "User saved successfully";
//    }

    }
