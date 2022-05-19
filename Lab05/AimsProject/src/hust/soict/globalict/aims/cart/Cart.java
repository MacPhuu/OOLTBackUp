package hust.soict.globalict.aims.cart;
import hust.soict.globalict.aims.disc.*;
import hust.soict.globalict.aims.utils.*;

public class Cart {
    private int qtyOrdered = 0;

  
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemOrdered[]= new DigitalVideoDisc[MAX_NUMBERS_ORDERED];


    public int getQtyOrdered() {
        return this.qtyOrdered;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(this.qtyOrdered >= 18) System.out.println("Cart is almost full");
        if(this.qtyOrdered > 20){
            System.out.println("Cart is full");
            return;
        }
        
        this.itemOrdered[qtyOrdered] = disc;    
        System.out.println("Disc has been added!");
        this.qtyOrdered++;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        for(int i = 0 ; i < dvdList.length; i++){
            if (dvdList[i] == null) return;
            if(this.qtyOrdered >= 18) System.out.println("Cart is almost full");
            if(this.qtyOrdered > 20){
                System.out.println("Cart is full");
                return;
            }
            
            this.itemOrdered[qtyOrdered] = dvdList[i];    
            System.out.println("Disc has been added!");
            this.qtyOrdered++;
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        this.addDigitalVideoDisc(dvd1);
        this.addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        if(this.qtyOrdered == 0) {
            System.out.print("No order in cart");
            return;
        }
        int i = 0;
        for(; i < this.qtyOrdered; i++){ //Find disc
            if(itemOrdered[i] == disc){
                break;
            }
        }
        
        if(i > this.qtyOrdered ){
            System.out.println("order does not exist");
            return;
        }
        System.out.println("Disc " +this.itemOrdered[i].getTitle() + " has been removed");
        for(int j = i; j < this.qtyOrdered;j++){ //remode disc
            this.itemOrdered[j] = this.itemOrdered[j+1];
        }
        
        this.qtyOrdered--; // decrease amout of orders
    }
    public float totalCost(){
        float total = 0.0f;
        for(int i = 0; i < this.qtyOrdered; i++){
            total += this.itemOrdered[i].getCost();
        }
        return total;
    }
    public void listCart(){
        for(int i = 0; i < this.qtyOrdered; i++){
            System.out.println(i+1 +" "+ this.itemOrdered[i].getTitle() +"\t" +this.itemOrdered[i].getLocalDate());
        }
    }
    public void cartSortByCost(){
        DVDUtils.sortByCost(itemOrdered);
    }
    public void cartSortByTitle(){
        DVDUtils.sortByTitle(itemOrdered);
    }
    public void cartSortByGreaterCost(){
        DVDUtils.sortByGreaterCost(itemOrdered);
    }
    public void findByID(int id){
        for(DigitalVideoDisc i : this.itemOrdered){
            if(i == null) return;
            if(i.getId()==id){
                System.out.println(i.getTitle());
            }
        }
    }
    public void searchByTitle(String tittle){
        for(int i = 0 ; i < qtyOrdered; i++){
            if(itemOrdered[i].isMatch(tittle)){
                System.out.println(i+1 +" "+ this.itemOrdered[i].getTitle() +"\t" +this.itemOrdered[i].getLocalDate());
            }
        }
    }
    public DigitalVideoDisc cartSearchByTitle(String tittle){
        for(int i = 0 ; i < qtyOrdered; i++){
            if(itemOrdered[i].isMatch(tittle)){
                return itemOrdered[i];
            }
        }
        return null;
    }
   public void clearCart(){
       this.qtyOrdered = 0;
   }
}
