package me.shoppingcartproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int choice=0;
        Items pr=null;
        boolean c = true;
        ECommerceCart ec=new ECommerceCart();
        //ArrayList<Items> Products=new ArrayList<>(List.of(new Items("SugarNest",5,50),new Items("SweetCart",10,30),new Items("BakeBloom",5,25),new Items("HoneyWhisk",10,35)));
        System.out.println("---Welcome to Shopping Cart---");
        do {
//            System.out.println("Products:");
//            for(Items p:Products){
//                System.out.println(p.itemName);
//            }
            System.out.println(" 1.Add to cart \n 2.Remove Item \n 3.Update Item \n 4.View First and Last Item \n 5.Display Items \n 6.clear cart \n 7.Exit");
            System.out.println("Enter your choice:");
            choice=s.nextInt();
            switch (choice){
                case 1->{
                   // System.out.println("Enter the product:");
                    System.out.println("Enter the ItemName:");
                    String name=s.next();
                    System.out.println("Enter the quantity:");
                    int quantity=s.nextInt();
                    System.out.println("Enter the price:");
                    double price=s.nextDouble();
                    pr=new Items(name,quantity,price);
                    ec.add((pr));
                    System.out.println("Item is successfully added...");

//                    for(Items sc:Products) {
//                        if (sc.equals(pr)) {
//                            ec.add(pr);
//                            isAdded = true;
//                        }
//                        else{
//                            isAdded=false;
//                        }
//                    }
//                    if(!isAdded) {
//                        System.out.println("Product is not in the list");
//                    }

                }
                case 2->{
                    System.out.println("Enter the product:");
                    String p=s.next();


                    if(!ec.list.isEmpty()) {
                        for (Items sc : ec.list) {
                            if(sc.itemName.equalsIgnoreCase(p)){
                                ec.remove(sc);
                                break;
                            }
                        }
                    }else{
                        System.out.println("Product is not in list");
                    }
                }
                case 3->{
                    System.out.println("Enter the Updated product name :");
                    String up= s.next();
                    boolean isUpdated=false;
                    for(Items items:ec.list){
                        if(items.itemName.equalsIgnoreCase(up)){
                            System.out.println("Enter the quantity:");
                            items.setQuantity(s.nextInt());
                            System.out.println("Enter the price:");
                            items.setPrice_per_unit(s.nextDouble());
                            isUpdated=true;
                            break;
                        }
                    }
                    if(!isUpdated){
                        System.out.println("Item is not present..");
                    }
                    break;
                }
                case 4->ec.viewFirstAndLastItem();

                case 5->ec.display();
                case 6->ec.clearCart();
                case 7->{
                    c=ec.exit();
                }
                default -> System.out.println("Invalid choice");
            }





        } while (c);
    }
}
