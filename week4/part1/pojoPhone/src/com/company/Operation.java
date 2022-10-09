package com.company;

import java.time.LocalDateTime;

public class Operation {
    private int operation_id;
    private LocalDateTime date_sale;
    private double cash;
    private double change;
    private int phone_id;
    private int customers_id;
    private int client_id;

    public Operation(int operation_id){
        this.operation_id = operation_id;
    }

    public Operation(int operation_id, LocalDateTime date_sale){
        this.operation_id = operation_id;
        this.date_sale=date_sale;
    }

    public Operation(int operation_id, LocalDateTime date_sale, double cash){
        this(operation_id,date_sale);
        this.cash=cash;
    }

    public Operation(int operation_id, LocalDateTime date_sale, double cash, double change){
        this(operation_id,date_sale,cash);
        this.change=change;
    }

    public Operation(int operation_id, LocalDateTime date_sale, double cash, double change, int phone_id){
        this(operation_id,date_sale,cash,change);
        this.phone_id = phone_id;
    }
    public Operation(int operation_id, LocalDateTime date_sale, double cash, double change, int phone_id, int customers_id){
        this(operation_id,date_sale,cash,change, phone_id);
        this.customers_id = customers_id;
    }

    public Operation(int operation_id, LocalDateTime date_sale, double cash, double change, int phone_id, int customers_id, int client_id){
        this(operation_id,date_sale,cash,change, phone_id, customers_id);
        this.client_id = client_id;
    }

    public void setOperation_id(int operation_id){
        this.operation_id = operation_id;
    }

    public int getOperation_id(){
        return operation_id;
    }

    public void setDate_sale(LocalDateTime date_sale){
        this.date_sale=date_sale;
    }

    public LocalDateTime getDate_sale(){
        return date_sale;
    }

    public void setCash(int cash){
        this.cash=cash;
    }

    public double getCash(){
        return cash;
    }

    public void setChange(double change){
        this.change=change;
    }

    public double getChange(){
        return change;
    }

    public void setPhone_id(int phone_id){
        this.phone_id = phone_id;
    }

    public int getPhone_id(){
        return phone_id;
    }

    public void setEmployees(int customers){
        this.customers_id = customers;
    }

    public int getEmployees(){
        return customers_id;
    }

    public void setClient_id(int client_id){
        this.client_id = client_id;
    }

    public int getClient_id(){
        return client_id;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + operation_id +
                ", date_sale=" + date_sale +
                ", cash=" + cash +
                ", change=" + change +
                ", phone_id=" + phone_id +
                ", customers_id=" + customers_id +
                ", client_id=" + client_id +
                '}';
    }
}
