package me.shoppingcartproject;

public class Items {
    protected String itemName;
    private int quantity;
    private double price_per_unit;

    public String getItemName() {
        return itemName;
    }

//    public void setItemName(String itemName) {
//        this.itemName = itemName;
//    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice_per_unit() {
        return price_per_unit;
    }

    public void setPrice_per_unit(double price_per_unit) {
        this.price_per_unit = price_per_unit;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Items(String itemName, int quantity, double price_per_unit){
        this.itemName=itemName;
        this.quantity=quantity;
        this.price_per_unit=price_per_unit;


    }
    public Double total(){
        return quantity*price_per_unit;
    }
    public String toString(){
        return "Name:"+itemName+" Quantity:"+quantity+" Price per Unit:"+price_per_unit+" Total:"+total();
    }
}
