package com.company;

public class Customers {
    private int customers_id;
    private String name;
    private String address;
    private String email;
    private String phone_number;

    public Customers(int customers_id){
        this.customers_id = customers_id;
    }

    public Customers(int customers_id, String name){
        this.customers_id = customers_id;
        this.name=name;
    }

    public Customers(int customers_id, String name, String address){
        this(customers_id,name);
        this.address=address;
    }
    public Customers(int customers_id, String name, String address, String email){
        this(customers_id,name,address);
        this.email=email;
    }

    public Customers(int customers_id, String name, String address, String email, String phone_number){
        this(customers_id,name,address,email);
        this.phone_number=phone_number;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setCustomers_id(int customers_id){
        this.customers_id = customers_id;
    }

    public int getCustomers_id(){
        return customers_id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return  name;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public String getAddress(){
        return address;
    }

    public void setPhone_number(String phone_number){
        this.phone_number=phone_number;
    }

    public String getPhone_number(){
        return phone_number;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + customers_id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}
