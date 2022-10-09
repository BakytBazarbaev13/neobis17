package com.company;

public class Brand {
    private int brand_id;
    private String name;

    public Brand(int id){
        this.brand_id =id;
    }
    public Brand(int id, String name) {
        this.brand_id = id;
        this.name = name;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + brand_id +
                ", name='" + name + '\'' +
                '}';
    }
}
