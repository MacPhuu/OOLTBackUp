package hust.soict.globalict.aims;

import hust.soict.globalict.aims.disc.*;

import hust.soict.globalict.aims.store.*;

public class Aims{
    public static void main(String[] args) {
        

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);

        Store.addDVD(dvd1);
        Store.addDVD(dvd2);
        Store.addDVD(dvd3);

        Store.showMenu();
    }
    
    
}