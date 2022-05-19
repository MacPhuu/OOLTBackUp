package hust.soict.globalict.test.cart;


import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.utils.*;
import hust.soict.globalict.aims.cart.*;




public class CartTest {
    public static void main(String[] args) {
        
    
    Cart anOrder = new Cart();

    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);

//ADD LIST
    DigitalVideoDisc [] dvdList = new DigitalVideoDisc[20];
    dvdList[0] = dvd1;
    dvdList[1] = dvd2;
    dvdList[2] = dvd3;
    anOrder.addMedia(dvdList);
    anOrder.listCart();
    

//ADD TWO DVD
    anOrder.addMedia(dvd1);
    anOrder.addMedia(dvd2);
    anOrder.addMedia(dvd3);
    anOrder.listCart();
//Sort
    DVDUtils.compareCost(dvd1,dvd2);
    DVDUtils.sortByCost(dvdList);
    ;
    

    

   
}
}
