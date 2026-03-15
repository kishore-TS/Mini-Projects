package me.shoppingcartproject;

import java.util.LinkedList;

public class ECommerceCart {
    protected LinkedList<Items> list=new LinkedList<>();


    public void add(Items items){
        try{
            list.add(items);
            System.out.println("Added to cart");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void remove(Items it){
        try{
            for(Items i:list){
                if(i.equals(it)){
                    list.remove(i);
                    System.out.println("Removed");
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void viewFirstAndLastItem(){
        try {
            System.out.println("First :"+list.getFirst());
            System.out.println("Last "+list.getLast());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

//    public void update(Items item,double updatedprice){
//        int index=0;
//        try{
//            for(Items i:list){
//                if(i.equals(item)){
//                    list.set(index,i.setPrice_per_unit(updatedprice));
//                }
//                index++;
//            }
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
    public void display(){
        if(!list.isEmpty()) {
            double totalBill=0;
            for (Items item : list) {

                System.out.println(item);
                totalBill+=item.total();
            }
            System.out.println("Total Bill:"+totalBill);
            return;
        }
        System.out.println("Cart is empty..");
    }

    public void clearCart(){
        try{
            list.clear();
            System.out.println("Cleared");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public boolean exit(){
        return false;
    }
}
