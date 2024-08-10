package com.edgarjperez;

public class Main {
    public static void main(String[] args) {
        Customer edgar = new Customer("Edgar");
    }

    static void changeName(Customer customer) {
        System.out.println("Hello " + customer);
    }
}



class Customer {
    private String name;


    Customer(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}