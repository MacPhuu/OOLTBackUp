package hust.soict.globalict.aims.store;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hust.soict.globalict.aims.cart.*;

import hust.soict.globalict.aims.media.*;

public class Store {
    
    private static  List<Media> iteamsInStore = new ArrayList<Media>();
    public static Cart cart = new Cart();
    public static Media luckyItem;

    public static void addMedia(Media item){
    
        iteamsInStore.add(item);
        
    }

    public static void removeMedia(Media item){
        int i = -1;
        i = iteamsInStore.indexOf(item);
        if(i == -1){
            System.out.println("Not exist!");
            return;
        }
        iteamsInStore.remove(i);
        
    }
    public static void listStore(){
        for(Media i: iteamsInStore){
            System.out.println(i.getId()+"\t" + i.getTitle());
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
                        return;
                    }
                    case 2:{
                        udate();
                        return;
                    }
                    case 3:{
                        cartMenu();
                        return;
                    }
                    case 0:{
                        return;
                    }
                    default: {
                        System.out.println("Invalid!");
                        return;
                    }
                }
            }while(choose != 0);
        }

    }
    public static void storeMenu(){
        int choosen = 100;
        
        try (Scanner sc = new Scanner(System.in)) {
            do{
                System.out.println("Items in store: ");
                listStore();
                System.out.println("Options: ");
                System.out.println("---------------------------");
                System.out.println("1. See a Media's details");
                System.out.println("2. Play media");
                System.out.println("3. Add Media to cart");
                System.out.println("4. See current cart");
                System.out.println("0. Back");
                System.out.println("---------------------------");
                System.out.println("Please choose nunber: 0-1-2-3-4");
                choosen = sc.nextInt();
                sc.nextLine();
                switch(choosen){
                    case 1:{
                        System.out.println("Enter Media's name: ");
                        String s = sc.nextLine();
                        if(findInStore(s)==null){
                            System.out.println("Not match!");
                            break;
                        };
                        Media item = findInStore(s);
                        System.out.println(item.getId() + "\t" + item.getTitle()+ "\t" + item.getCategory()+ "\t" + item.getCost()+ "\t" + item.getLocalDate()+ "\n\n");
                        break;
                    }
                    case 2:{
                        System.out.println("Enter Media's name: ");
                        String s = sc.nextLine();
                        if(findInStore(s)==null){
                            System.out.println("Not match!");
                            break;
                        };
                        Media item = findInStore(s);
                        if(item.getType()=="DVD" || item.getType() == "CD"){
                            item.play();
                        }
                        break;
                    }
                    case 3:{
                        System.out.println("Enter DVD's name: ");
                        String s = sc.nextLine();
                        if(findInStore(s)==null){
                            System.out.println("Not match!");
                            break;
                        };
                        Media item =findInStore(s);
                        cart.addMedia(item);
                        break;
                    }
                    case 4:{
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
    private static Media findInStore(String s) {
        for (Media media : iteamsInStore) {
            if(media.getTitle().equals(s)){
                return media;
            }
        }
        return null;
    }

    public static void cartMenu(){
        int choose = 100;
        try (Scanner sc = new Scanner(System.in)) {
            do{
                cart.listCart();
                System.out.println("Options: ");
                System.out.println("---------------------------");
                System.out.println("1. Filter Medias in cart");
                System.out.println("2. Sort Mediss in cart");
                System.out.println("3. Remove Media from cart");
                System.out.println("4. Get lucky item from cart");
                System.out.println("5. Place order");
                System.out.println("0. Back");
                System.out.println("---------------------------");
                System.out.println("Please choose nunber: 0-1-2-3-4-5");
                choose =sc.nextInt();
                sc.nextLine();
                switch(choose){
                    case 0:{
                        showMenu();
                        return;
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
                        if(cart.searchByTitle(tittle)==null){
                            System.out.println("Not match!");
                            break;
                        };
                        Media dvd = cart.searchByTitle(tittle);
                        cart.removeMedia(dvd);
                        break;
                    }
                    case 5:{
                        System.out.println("Order created successfuly!");
                        if(luckyItem == null) System.out.println("Toatal cost: $" +cart.totalCost());
                        else  System.out.println("Toatal cost: $" +(cart.totalCost() - luckyItem.getCost()));
                        cart.clearCart();
                        break;
                    }
                    case 4:{
                        luckyItem = cart.getALuckyItem();
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
                System.out.println("1. Add Media");
                System.out.println("2. Remove Media");
                System.out.println("0. Return");
                System.out.println("---------------------------");
                System.out.println("Choose : 0 - 1 - 2");
                choose = sc.nextInt();
                sc.nextLine();
                switch(choose){
                    case 1:{
                       
                        System.out.println("Enter type (DVD/CD/Book): ");
                        String type = sc.nextLine();
                        System.out.println("Enter Media's name: ");
                        String name = sc.nextLine();
                        Media item = findInStore(name);
                        if(item!= null && item.getType().equals(type)){
                            System.out.println("Existed");
                            break;
                        }
                        System.out.println("Enter Media's category: ");
                        String category = sc.nextLine();
                        System.out.println("Enter Media's cost: ");
                        float cost = sc.nextFloat();
                        if(type.equals("DVD")){
                            System.out.println("Enter Media's director: ");
                            String director = sc.nextLine();
                            System.out.println("Enter Media's length: ");
                            int length = sc.nextInt();
                            DigitalVideoDisc disc = new DigitalVideoDisc(name, category, director, length, cost);
                            addMedia(disc);
                        }
                        if(type.equals("CD")){
                            System.out.println("Enter Media's artist: ");
                            String artist = sc.nextLine();
                            
                            CompactDisc disc= new CompactDisc(name, category,artist,cost);
                            System.out.println("Number of track: ");
                            int i = sc.nextInt();
                            for(int j = 0; j< i; j++){
                                System.out.println("Enter Track's title: ");
                                String title = sc.nextLine();
                                System.out.println("Enter Track's title: ");
                                int length = sc.nextInt();
                                Track track = new Track(title, length);
                                disc.addTrack(track);
                            }
                            addMedia(disc);
                        }
                        if(type.equals("Book")){
                            Book book = new Book(name, category, cost);
                            addMedia(book);
                        }
                        else{
                            System.out.println("Invalid type");
                        }
                        break;
                    }
                    case 2:{
                        System.out.println("Enter Media's name: ");
                        String s = sc.nextLine();
                        Media disc = findInStore(s);
                        if(disc == null){
                            System.out.println("Not exist");
                            break;
                        }
                        removeMedia(disc);
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
                System.out.println("Choose : 0 - 1 - 2");
                choose = sc.nextInt();
                sc.nextLine();
                switch(choose){
                    case 1:{   
                        cart.sortByTitle();
                        cart.listCart();
                        break;
                    }
                    case 2:{  
                        cart.sortByCost();
                        cart.listCart();
                        break;
                    }
                    case 0:{
                        cartMenu();
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
                System.out.println("Choose : 0 - 1 - 2");
                choose = sc.nextInt();
                sc.nextLine();
                switch(choose){
                    case 1:{
                        
                        cart.findByTitle();
                        break;
                        
                    }
                    case 2:{
                        cart.findByID();
                        break;
                    }
                    case 0:{
                        cartMenu();
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


    
}
