package hust.soict.globalict.aims.cart;

import java.util.ArrayList;
import java.util.List;

import hust.soict.globalict.aims.media.*;

public class Cart {
    private int  qtyOrdered = 0;
    public static final int MAX_NUMBERS_ORDERED = 20;
    private List<Media> itemsOrdered = new ArrayList<Media>();


    public int getQtyOrdered() {
        return this.qtyOrdered;
    }
    public void addMedia(Media item){
        if(qtyOrdered >=18) System.out.println("Almost full");
        if(qtyOrdered == 20) {System.out.println("Full"); return;};
        int i = -1;
        i = itemsOrdered.indexOf(item);
        if(i != -1){
            System.out.println("Existed!");
            return;
        }
        itemsOrdered.add(item);
        qtyOrdered ++;
    }
    public void addMedia(Book book){
        if(qtyOrdered >=18) System.out.println("Almost full");
        if(qtyOrdered == 20) {System.out.println("Full"); return;};
        int i = -1;
        i = itemsOrdered.indexOf(book);
        if(i != -1){
            System.out.println("Existed!");
            return;
        }
        itemsOrdered.add(book);
        qtyOrdered ++;
    }
    public void addMedia(DigitalVideoDisc [] dvdList){
        for(int i = 0 ; i < dvdList.length; i++){
            if (dvdList[i] == null) return;
            
            
            this.addMedia(dvdList[i]);    
            System.out.println("Disc has been added!");
            this.qtyOrdered++;
        }
    }
    public void addMedia(Book [] bookList){
        for(int i = 0 ; i < bookList.length; i++){
            if (bookList[i] == null) return;
            
            
            this.addMedia(bookList[i]);    
            System.out.println("Disc has been added!");
            this.qtyOrdered++;
        }
    }

    public void removeMedia(Media disc){
        int i = -1;
        i = itemsOrdered.indexOf(disc);
        if(i == -1){
            System.out.println("Not exist");
            return;
        }
        itemsOrdered.remove(i);
        qtyOrdered--;
    }
    public void removeMedia(Book book){
        int i = -1;
        i = itemsOrdered.indexOf(book);
        if(i == -1){
            System.out.println("Not exist");
            return;
        }
        itemsOrdered.remove(i);
        qtyOrdered--;
    }
    public float totalCost(){
        float total = 0.0f;
        for(Media i : itemsOrdered){
            total += i.getCost();
        }
        return total;
    }
    public void listCart(){
        
        for(Media i : itemsOrdered){
            System.out.println(i.getTitle() +"\t" +i.getLocalDate()+"\t"+i.getCost());
        }
    }
    public Media searchByTitle(String title){
        for (Media media : itemsOrdered) {
            if(media.getTitle().equals(title)){
                return media;
            }
        }
        return null;
    }
    public void clearCart(){
        for(int i = 1 ; i<=qtyOrdered;i++){
            itemsOrdered.remove(0);
        }
        qtyOrdered = 0;
    }
    public void sortByCost(){
        itemsOrdered.sort((a ,b) ->{
            float l = a.getCost() - b.getCost();
            if(l>0){
                return 1;
            }
            else if (l < 0){
                return -1;
            }
            int k = a.getTitle().compareTo(b.getTitle());
            return k;
        });
    }
    public void sortByTitle(){
        itemsOrdered.sort((a ,b) ->{

            int k = a.getTitle().compareTo(b.getTitle());
            if(k != 0 ) return k;

            float l = a.getCost() - b.getCost();
            if(l>0){
                return -1;
            }
            else{
                return 1;
            }
            
        });
    }
    public void findByID(){
        for (Media media : itemsOrdered) {
            
                System.out.println(media.getTitle() + "\tID:" +media.getId() );
            
        }
        
    }
    public void findByTitle(){
        for (Media media : itemsOrdered) {
            
            System.out.println(media.getId()+"\t"+ media.getTitle() );
        
    }
    }
    public Media getALuckyItem(){
        if(this.qtyOrdered == 0){
            System.out.println("Nothing in cart");
            return null;
        }
        int lItem = (int)(Math.random()*qtyOrdered);
        System.out.println("Lucky item is: " + itemsOrdered.get(lItem).getTitle() );
        return itemsOrdered.get(lItem);
    }
}
