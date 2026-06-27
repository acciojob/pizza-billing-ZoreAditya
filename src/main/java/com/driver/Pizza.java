package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private String bill;
    private int total;

    private boolean extraCheeseAdded=false;
    private boolean extraToppingAdded=false;


    private int extraCheesePrice=80;
    private int extraTopping;
    private boolean extraTake=false;
    private int paperBag=20;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
            extraTopping=70;
        }
        else{
            this.price=400;
            extraTopping=120;
        }
        total=price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheeseAdded){
            total=total+extraCheesePrice;
            extraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppingAdded){
            total=total+extraTopping;
            extraToppingAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!extraTake){
            total=total+paperBag;
            extraTake=true;
        }
    }

    public String getBill(){
        // your code goes here
        String bill = "";

        bill += "Base Price Of The Pizza: " + price + "\n";

        if (extraCheeseAdded) {
            bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
        }

        if (extraToppingAdded) {
            bill += "Extra Toppings Added: " + extraToppingAdded + "\n";
        }

        if (extraTake) {
            bill += "Paperbag Added: " + paperBag + "\n";
        }

        bill += "Total Price: " + total;


        return bill;
    }
}
