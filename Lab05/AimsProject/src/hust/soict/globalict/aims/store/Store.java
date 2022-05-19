package hust.soict.globalict.aims.store;
import java.util.Scanner;

import hust.soict.globalict.aims.cart.*;
import hust.soict.globalict.aims.disc.*;

public class Store {
    private static int qtyItems = 0;
    public static final int MAX_NUMBERS_ORDERED = 100;
    private static DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public static Cart cart = new Cart();


    public static void addDVD(DigitalVideoDisc disc){
        Store.itemsInStore[qtyItems] = disc;
        qtyItems += 1;
    }

    public static void removeDVD(DigitalVideoDisc disc){
        int pos = 0;
        for(int i = 0; i < qtyItems;i++){
            if(itemsInStore[i].equals(disc)){
                pos = i;
            }
        }
        for(int i = pos; i< qtyItems; i++){
            itemsInStore[i] =itemsInStore[i+1];
        }
        qtyItems--;
    }
    public static DigitalVideoDisc findInStore(String s){
        for(int i = 0; i< qtyItems; i++){
            if(itemsInStore[i].getTitle().equals(s)){
                
                return itemsInStore[i];
            }
        }
        return null;
    }
    public static void listStore(){
        for(int i = 0; i < qtyItems; i++){
            System.out.println(itemsInStore[i].getId()+" "+itemsInStore[i].getTitle());
        }
    }
    public static void showMenu(){
        int choose = 100;
        try (Scanner sc = new Scanner(System.in)) {
            do{
                
                System.out.println("AIMS: ");
                System.out.println("---------------------------");
                System.out.println("1. View store");
                System.out.println("2. Update store");
                System.out.println("3. See current cart");
                System.out.println("0. Exit");
                System.out.println("---------------------------");
                System.out.println("Please choose nunber: 0-1-2-3");
                choose = sc.nextInt();
                sc.nextLine();
                switch(choose){
                    case 1:{
                        storeMenu();
                        break;
                    }
                    case 2:{
                        udate();
                        break;
                    }
                    case 3:{
                        cartMenu();
                        break;
                    }
                    case 0: break;
                    default: {
                        System.out.println("Invalid!");
                        break;
                    }
                }
            }while(choose != 0);
        }

    }
    public static void storeMenu(){
        int choosen = 100;
        
        try (Scanner sc = new Scanner(System.in)) {
            do{
                
                listStore();
                System.out.println("Options: ");
                System.out.println("---------------------------");
                System.out.println("1. See a DVD's details");
                System.out.println("2. Add DVD to cart");
                System.out.println("3. See current cart");
                System.out.println("0. Back");
                System.out.println("---------------------------");
                System.out.println("Please choose nunber: 0-1-2-3");
                choosen = sc.nextInt();
                sc.nextLine();
                switch(choosen){
                    case 1:{
                        System.out.println("Enter DVD's name: ");
                        String s = sc.nextLine();
                        if(findInStore(s)==null){
                            System.out.println("Not match!");
                            break;
                        };
                        int i;
                        for( i = 0; i< qtyItems; i++){
                            if(itemsInStore[i].getTitle().equals(s)){
                                System.out.println(itemsInStore[i].getId() + " " + itemsInStore[i].getTitle()+ " " + itemsInStore[i].getDirector()+" " + itemsInStore[i].getCategory()+ " " + itemsInStore[i].getLength()+ " " + itemsInStore[i].getCost()+ " " + itemsInStore[i].getLocalDate()+ "\n\n");
                                break;
                            }
                        }
                        if(i == qtyItems && !itemsInStore[i-1].getTitle().equals(s) ) System.out.println("Not match\n\n");
                        break;
                    }
                    case 2:{
                        System.out.println("Enter DVD's name: ");
                        String s = sc.nextLine();
                        if(findInStore(s)==null){
                            System.out.println("Not match!");
                            break;
                        };
                        int i;
                        for( i = 0; i< qtyItems; i++){
                            if(itemsInStore[i].getTitle().equals(s)){
                                cart.addDigitalVideoDisc(itemsInStore[i]);
                            }
                        }
                        if(i == qtyItems && !itemsInStore[i-1].getTitle().equals(s) ) System.out.println("Not match\n\n");
                        break;
                    }
                    case 3:{
                        cartMenu();
                        break;

                    }
                    case 0:{
                        showMenu();
                        return;
                    }
                    default: {
                        System.out.println("Invalid!");
                        break;
                    }
                }
            }while(true);
        }
    }
    public static void cartMenu(){
        int choose = 100;
        try (Scanner sc = new Scanner(System.in)) {
            do{
                cart.listCart();
                System.out.println("Options: ");
                System.out.println("---------------------------");
                System.out.println("1. Filter DVDs in cart");
                System.out.println("2. Sort DVDs in cart");
                System.out.println("3. Remove DVD from cart");
                System.out.println("4. Place order");
                System.out.println("0. Back");
                System.out.println("---------------------------");
                System.out.println("Please choose nunber: 0-1-2-3");
                choose =sc.nextInt();
                sc.nextLine();
                switch(choose){
                    case 0:{
                        showMenu();
                        break;
                    }
                    case 1:{
                        filter();
                        break;
                    }
                    case 2:{
                        sort();
                        break;
                    }
                    case 3:{
                        System.out.println("Enter DVD's name: ");
                        
                        String tittle = sc.nextLine();
                        if(cart.cartSearchByTitle(tittle)==null){
                            System.out.println("Not match!");
                            break;
                        };
                        DigitalVideoDisc dvd = cart.cartSearchByTitle(tittle);
                        cart.removeDigitalVideoDisc(dvd);
                        break;
                    }
                    case 4:
                    {
                        System.out.print("Order created successfuly!");
                        cart.clearCart();
                        break;
                    }
                    default: {
                        System.out.println("Invalid!");
                        break;
                    }
                }
            }while(true);
        }
    }
    public static void udate() {
        int choose= 100;
        try (Scanner sc = new Scanner(System.in)) {
            do{
                System.out.println("\nOption: ");
                System.out.println("---------------------------");
                System.out.println("1. Add DVD");
                System.out.println("2. Remove DVD");
                System.out.println("0. Return");
                System.out.println("---------------------------");
                choose = sc.nextInt();
                sc.nextLine();
                switch(choose){
                    case 1:{
                        System.out.println("Enter DVD's name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter DVD's category: ");
                        String category = sc.nextLine();
                        System.out.println("Enter DVD's director: ");
                        String director = sc.nextLine();
                        System.out.println("Enter DVD's length: ");
                        int length = sc.nextInt();
                        System.out.println("Enter DVD's cost: ");
                        float cost = sc.nextFloat();
                        DigitalVideoDisc disc = new DigitalVideoDisc(name,category,director,length,cost);
                        addDVD(disc);
                        break;
                    }
                    case 2:{
                        System.out.println("Enter DVD's name: ");
                        String s = sc.nextLine();
                        DigitalVideoDisc disc = findInStore(s);
                        removeDVD(disc);
                        break;
                    }
                    case 0:{
                        showMenu();
                        break;
                    }
                    default: {
                        System.out.println("Invalid!");
                        break;
                    }
                }
            }while(true);
            }
    }
    public static void sort() {
        int choose= 100;
        try (Scanner sc = new Scanner(System.in)) {
            do{
                System.out.println("\nOption: ");
                System.out.println("---------------------------");
                System.out.println("1. Sort by tittle");
                System.out.println("2. Sort by cost");
                System.out.println("0. Return");
                System.out.println("---------------------------");
                choose = sc.nextInt();
                sc.nextLine();
                switch(choose){
                    case 1:{   
                        cart.cartSortByTitle();
                        cart.listCart();
                        break;
                    }
                    case 2:{  
                        cart.cartSortByGreaterCost();
                        break;
                    }
                    case 0:{
                        cartMenu();
                        break;
                    }
                    default: {
                        System.out.println("Invalid!");
                        break;
                    }
                }
            }while(true);
            }
    }   
    public static void filter() {
        int choose= 100;
        try (Scanner sc = new Scanner(System.in)) {
            do{
                System.out.println("\nOption: ");
                System.out.println("---------------------------");
                System.out.println("1. Filter by tittle");
                System.out.println("2. Filter by id");
                System.out.println("0. Return");
                System.out.println("---------------------------");
                choose = sc.nextInt();
                sc.nextLine();
                switch(choose){
                    case 1:{
                        String tittle = sc.nextLine();
                        cart.searchByTitle(tittle);
                        break;
                        
                    }
                    case 2:{
                        int id = sc.nextInt();
                        cart.findByID(id);
                        break;
                    }
                    case 0:{
                        cartMenu();
                        break;
                    }
                    default: {
                        System.out.println("Invalid!");
                        break;
                    }
                }
            }while(true);
            }
    }   
    
}
