public class DVDtest {
    public static void main(String[] args) {
        
        DigitalVideoDisk dvd1 = new DigitalVideoDisk("AAAA","aaaa","aaaa", 1, 5.6f);
        DigitalVideoDisk dvd2 = new DigitalVideoDisk("BBBB","bbbb","bbbb", 2, 5.3f);
        DigitalVideoDisk dvd3 = new DigitalVideoDisk("CCCC","cccc","cccc", 3, 5f);
        DigitalVideoDisk dvd4 = new DigitalVideoDisk("DDDD","dddd","dddd", 4, 7.1f);
        DigitalVideoDisk dvd5 = new DigitalVideoDisk("EEEE","eeee","eeee", 5, 3.3f);

        System.out.println(DVDUtils.compareCost(dvd1, dvd2).getTitle());
        System.out.println(DVDUtils.compareTitle(dvd5, dvd3).getTitle());

        DigitalVideoDisk [] sorted  =  {dvd1, dvd2, dvd3, dvd4, dvd5};
        DVDUtils.sortByCost(sorted);
        DVDUtils.sortByTitle(sorted);
    }
}