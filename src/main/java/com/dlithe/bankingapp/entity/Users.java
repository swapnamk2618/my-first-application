package com.dlithe.bankingapp.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@ToString
@Getter
@Setter
@Entity

public class Users {
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Id
    private int id;

    private String accountNumber;
    private String firstName;
    private String lastName;
}
