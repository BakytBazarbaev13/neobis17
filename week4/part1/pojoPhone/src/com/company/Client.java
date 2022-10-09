package com.company;

public class Client {
    private int client_id;
    private String name;
    private String address;
    private String phone_number;

    public Client(int client_id){
        this.client_id = client_id;
    }

    public Client(int client_id, String name){
        this.client_id = client_id;
        this.name=name;
    }

    public Client(int client_id, String name, String address){
        this(client_id,name);
        this.address=address;
    }

    public Client(int client_id, String name, String address, String phone_number){
        this(client_id,name,address);
        this.phone_number=phone_number;
    }

    public void setClient_id(int client_id){
        this.client_id = client_id;
    }

    public int getClient_id(){
        return client_id;
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
        return "Client{" +
                "id=" + client_id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}
