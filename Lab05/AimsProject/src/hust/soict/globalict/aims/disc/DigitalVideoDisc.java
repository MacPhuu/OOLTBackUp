package hust.soict.globalict.aims.disc;


import java.time.LocalDate;

public class DigitalVideoDisc {
    private String title =" ";
    private String category=" ";
    private String director=" ";
    private int length= 0;
    private float cost = 0.0f;
    private LocalDate dateAdded;
    private static int nbDigitalVideoDiscs = 0;
    private int id;

    public int getId() {
        return this.id;
    }


    public LocalDate getLocalDate() {
        return this.dateAdded;
    }
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return this.cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.dateAdded = java.time.LocalDate.now(); 
        nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
        this.dateAdded = java.time.LocalDate.now();
        nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs; 
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.dateAdded = java.time.LocalDate.now(); 
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.dateAdded = java.time.LocalDate.now(); 
        nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs;
    }

    public boolean isMatch(String tittle){
        if( this.title.contains(tittle) == true) return true;
        else return false;
    }

}

