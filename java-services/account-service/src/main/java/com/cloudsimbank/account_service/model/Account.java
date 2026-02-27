package com.cloudsimbank.account_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private double balance;

    public Account() {}

    public Account(String type, double balance) {
        this.type = type;
        this.balance = balance;
    }

    public Long getId() { return id; }
    public String getType() { return type; }
    public double getBalance() { return balance; }
}
