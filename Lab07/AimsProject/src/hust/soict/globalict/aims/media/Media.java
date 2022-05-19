package hust.soict.globalict.aims.media;
import java.time.LocalDate;


public abstract class Media extends java.lang.Object{
     int id;
     String title;
     String category;
     float cost;
     static int nbMedia = 1;
     LocalDate dateAdded;
    String type = "";
    
    public String getType(){
        return type;
    }
    public LocalDate getLocalDate(){
        return dateAdded;
    }
    public int getId() {
        return this.id;
    }
    public String getTitle() {
        return this.title;
    }
    public String getCategory() {
        return this.category;
    }
    public float getCost() {
        return this.cost;
    }
    public void play() {
    }
    

  
}
