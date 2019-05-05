package com.example.quent.happyrolls;

public class IceCream extends Order {

    // Variables
    private String base;
    private String topping1;
    private String topping2;
    private String extras[];
    private String sauce;

    // Contructors
    public IceCream(){
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.sauce = sauce;
    }

    public IceCream(String base, String topping1, String topping2, String sauce){
        this.base = base;
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.sauce = sauce;
    }

    // Getters
    public String getBase() {
        return base;
    }

    public String getTopping1() {
        return topping1;
    }

    public String getTopping2() {
        return topping2;
    }

    public String getSauce() {
        return sauce;
    }

    // Setters
    public void setBase(String baseGlace){
        base = baseGlace;
    }

    public void setTopping1(String toppingNb1){
        topping1 = toppingNb1;
    }

    public void setTopping2(String toppingNb2){
        topping2 = toppingNb2;
    }

    public void setSauce(String coulis){
        sauce = coulis;
    }



}
