package com.hardwarecashiering.model;

public class Customer {
    private String customerName;
    private String address;

    public Customer(String customerName, String address) {
        this.customerName = customerName;
        this.address = address;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }
}
