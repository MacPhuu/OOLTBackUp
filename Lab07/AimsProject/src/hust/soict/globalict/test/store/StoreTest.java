package hust.soict.globalict.test.store;
import hust.soict.globalict.aims.store.*;

import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);

        Store.addMedia(dvd1);
        Store.addMedia(dvd2);
        Store.addMedia(dvd3);
        Store.listStore();

        Store.removeMedia(dvd2);
        Store.listStore();
    }
}
