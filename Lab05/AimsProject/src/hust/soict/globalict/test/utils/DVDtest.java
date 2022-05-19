package hust.soict.globalict.test.utils;

import hust.soict.globalict.aims.disc.*;
import hust.soict.globalict.aims.utils.*;

public class DVDtest {
    public static void main(String[] args) {
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("AAAA","aaaa","aaaa", 1, 5.6f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("BBBB","bbbb","bbbb", 2, 5.3f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("CCCC","cccc","cccc", 3, 5f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("DDDD","dddd","dddd", 4, 7.1f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("EEEE","eeee","eeee", 5, 3.3f);

        System.out.println(DVDUtils.compareCost(dvd1, dvd2).getTitle());
        System.out.println(DVDUtils.compareTitle(dvd5, dvd3).getTitle());

        DigitalVideoDisc [] sorted  =  {dvd1, dvd2, dvd3, dvd4, dvd5};
        DVDUtils.sortByCost(sorted);
        DVDUtils.sortByTitle(sorted);
    }
}