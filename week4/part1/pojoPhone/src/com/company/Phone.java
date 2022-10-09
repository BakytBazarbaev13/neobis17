package com.company;

import java.time.LocalDate;

public class Phone {
    private int phone_id;
    private String name;
    private String color;
    private int memory;
    private int ram;
    private LocalDate year_of_issue;
    private double price;
    private int brand_id;

    public Phone(int phone_id){
        this.phone_id = phone_id;
    }
    public Phone(int phone_id, String name){
        this.phone_id = phone_id;
        this.name=name;
    }
    public Phone(int phone_id, String name, String color){
        this(phone_id,name);
        this.color=color;
    }
    public Phone(int phone_id, String name, String color, int memory){
        this(phone_id,name,color);
        this.memory=memory;
    }
    public Phone(int phone_id, String name, String color, int memory, int ram){
        this(phone_id,name,color,memory);
        this.ram=ram;
    }
    public Phone(int phone_id, String name, String color, int memory, int ram, LocalDate year_of_issue){
        this(phone_id,name,color,memory,ram);
        this.year_of_issue=year_of_issue;
    }

    public Phone(int phone_id, String name, String color, int memory, int ram, LocalDate year_of_issue, double price){
        this(phone_id,name,color,memory,ram,year_of_issue);
        this.price=price;
    }
    public Phone(int phone_id, String name, String color, int memory, int ram, LocalDate year_of_issue,double price, int brand_id){
        this(phone_id,name,color,memory,ram,year_of_issue,price);
        this.brand_id = brand_id;
    }

    public void setPhone_id(int phone_id) {
        this.phone_id = phone_id;
    }

    public int getPhone_id() {
        return phone_id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    public void setMemory(int memory){
        this.memory=memory;
    }

    public int getMemory(){
        return memory;
    }

    public void setRam(int ram){
        this.ram=ram;
    }

    public int getRam(){
        return ram;
    }

    public void setYear_of_issue(LocalDate year_of_issue){
        this.year_of_issue=year_of_issue;
    }

    public LocalDate getYear_of_issue(){
        return year_of_issue;
    }

    public void setBrand_id(int brand_id){
        this.brand_id = brand_id;
    }

    public int getBrand_id(){
        return brand_id;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phone_id=" + phone_id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", memory=" + memory +
                ", ram=" + ram +
                ", year_of_issue=" + year_of_issue +
                ", price=" + price +
                ", brand_id=" + brand_id +
                '}';
    }
}
