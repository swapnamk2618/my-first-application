package com.dlithe.bankingapp.repository;


import com.dlithe.bankingapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface ProductDAO extends JpaRepository<Product, Integer>{

    }



