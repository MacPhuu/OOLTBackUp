package hust.soict.globalict.aims.media;




public class DigitalVideoDisc extends Disc implements Playable{
    
    private String director ="";
    private int length=0;
    private String type ="DVD";


    public String getType(){
        return type;
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

    
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category,cost);
         this.length = length;
         this.director=director;
    }

    public DigitalVideoDisc(String title) {
        super(title);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category,director, cost);     
    }

    public boolean isMatch(String title){
        if( this.getTitle().contains(title) == true) return true;
        else return false;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + getTitle());
        System.out.println("DVD length: " +getLength());    
    }

}

