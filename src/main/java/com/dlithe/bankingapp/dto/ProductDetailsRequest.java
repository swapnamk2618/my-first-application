package com.dlithe.bankingapp.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class ProductDetailsRequest {

    private String name;
    private String type;
    private String price;
    private String details;
}
