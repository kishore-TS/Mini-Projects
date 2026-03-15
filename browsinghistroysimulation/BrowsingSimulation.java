package me.browsinghistroysimulation;

//import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class BrowsingSimulation {
    LinkedList<String> pages=new LinkedList<>();


    public static void main(String[] args) {
        BrowsingSimulation br=new BrowsingSimulation();
        //int c=1,d=1;
        Scanner s=new Scanner(System.in);
        ListIterator it = br.pages.listIterator();
        while(true) {
            System.out.println("----BROWSER----");
            System.out.println("1.Visit Page \n2.Go Back \n3.Go Forward \n4.Show Current Page \n5.Exit");
            System.out.println("Enter your choice:");
            int ch = s.nextInt();
            s.nextLine();


            switch (ch) {
                case 1 -> {
                    System.out.println("Enter the url:");
                    String url = s.nextLine();
                    while(it.hasNext()){
                        if(it.hasPrevious()) {
                            it.next();
                            it.remove();
                        }
                        else{
                            it.next();
                        }
                    }


//                    if(br.pages.isEmpty()){
                        it.add(url);

                   // }
                   // System.out.println(it.hasNext());




                }
                case 2 -> {
                    if (!br.pages.isEmpty()) {

                        if (it.hasPrevious()) {
                            if(!it.hasNext()) {
                                it.previous();

                            }
                            if(it.hasPrevious()) {
                                System.out.println(it.previous());

                            }
                            else{
                                System.out.println("You are at the first page.");
                            }
                        } else {
                            System.out.println("You are at the first page there is no previous..");
                        }
                    }
                    else{
                        System.out.println("Nothing visited..");
                    }
                }
                case 3 -> {
                    if(!br.pages.isEmpty()){

                    if (it.hasNext()) {
                        if(!it.hasPrevious()) {
                            it.next();

                        }
                        if(it.hasNext()) {
                            System.out.println(it.next());
                        }
                        else{
                            System.out.println("Yor are at the last page.");
                        }

                    } else {
                        System.out.println("You are at the last page there is no next..");
                    }
                    }else{
                        System.out.println("Nothing visited..");
                    }
                }
                case 4 -> {
                    if(!br.pages.isEmpty()) {
                        if(!it.hasNext()){
                            System.out.println(it.previous());
                            it.next();
                        }
                        else{
                            System.out.println(it.next());
                            it.previous();
                        }
                    }
                    else{
                        System.out.println("Nothing visited..");
                    }
                }
                case 5 -> {
                    return;
                }
                default -> System.out.println("Invalid choice..");
            }
        }

    }
}
