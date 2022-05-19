package hust.soict.globalict.aims.media;
import java.time.LocalDate;

public class Disc extends Media {
    private int length;
    private String director;

    public Disc( String title, String category, String director,int length,float cost) {
        super.id = nbMedia;
        super.title = title;
        super.category = category;
        super.cost = cost;
        nbMedia++;
        dateAdded = LocalDate.now();
    }
    public Disc(String title){
        this.title = title;
        this.id =nbMedia;
        nbMedia++; 
        dateAdded = LocalDate.now();
    }
    public Disc(String title,String category,float cost){
        super.title = title;
        super.category = category;
        super.cost=cost;
        this.id =nbMedia;
        nbMedia++; 
        dateAdded = LocalDate.now();
    }
    public Disc(String title, String category, String director, float cost){
        super.title = title;
        super.category = category;
        super.cost=cost;
        this.director=director;
        this.id =nbMedia;
        nbMedia++; 
        dateAdded = LocalDate.now();
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    public void setTitle(String title) {
        super.title =title;
    }
    public void setCategory(String category) {
        super.category = category;
    }
    public void setCost(float cost) {
        super.cost = cost;
    }

 

}
