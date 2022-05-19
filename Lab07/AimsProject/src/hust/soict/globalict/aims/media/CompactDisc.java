package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();
    private String type ="CD";

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }


    public CompactDisc(String title) {
        super(title);
    }
    public CompactDisc(String title,float cost) {
        super(title,title, cost);
    }

    public CompactDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public CompactDisc(String title, String category, String artist, float cost) {
        super(title, category, cost);
        this.artist = artist;
    }

    public void addTrack(Track track){
        int i = -1;
        i = tracks.indexOf(track);
        if(i != -1) {
            System.out.println("Existed");
            return;
        }
        else{
            tracks.add(track);
        }
    }
    public void removeTrack(Track track){
        int i = -1;
        i = tracks.indexOf(track);
        if(i == -1){
            System.out.println("Not exist");
            return ;
        }
        else{
            tracks.remove(i);
        }
    }
    public int getLength(){
        int length = 0;
        for(Track i : tracks){
            length += i.getLength();
        }
        return length;
    }

    @Override
    public void play() {
        for(Track i : tracks){
            i.play();   
        }
        
    }
    @Override
    public String getType(){
        return type;
    }
    
}
