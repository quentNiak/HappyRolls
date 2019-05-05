package com.example.quent.happyrolls;

public class Client extends Order{

    // Variables
    private String name;
    private String userName;
    private String phoneNumber;
    private String emailAddress;

    // Contructors
    public Client(){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Client(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setters
    public void setName(String nom){
        name = nom;
    }

    public void setPhoneNumber(String phoneNumb){
        phoneNumber = phoneNumb;
    }

}
