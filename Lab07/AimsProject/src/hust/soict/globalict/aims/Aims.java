package hust.soict.globalict.aims;

import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Track;
import hust.soict.globalict.aims.store.*;
import hust.soict.globalict.aims.daemon.*;
public class Aims{
    public static void main(String[] args) {
        
        MemoryDaemon md = new MemoryDaemon();
        md.start();
        md.setDaemon(true);

       

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);

        Store.addMedia(dvd1);
        Store.addMedia(dvd2);
        Store.addMedia(dvd3);

        CompactDisc cd = new CompactDisc("MTP",34.3f);

        Track track1 = new Track("Em cua ngay hom qua", 3);
        Track track2 = new Track("Nang m xa dan", 2);
        Track track3 = new Track("Dung ve tre", 4);

        cd.addTrack(track1);
        cd.addTrack(track2);
        cd.addTrack(track3);

        Store.addMedia(cd);

        Store.showMenu();
    }
}