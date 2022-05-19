public class CartTest {
    public static void main(String[] args) {
        
    
    Cart anOrder = new Cart();

    DigitalVideoDisk dvd1 = new DigitalVideoDisk("The Lion King","Animation","Roger Allers",87,19.95f);
    DigitalVideoDisk dvd2 = new DigitalVideoDisk("Star Wars","Science Fiction","George Lucas",87,24.95f);
    DigitalVideoDisk dvd3 = new DigitalVideoDisk("Aladin","Animation",18.99f);

//ADD LIST
    DigitalVideoDisk [] dvdList = new DigitalVideoDisk[20];
    dvdList[0] = dvd1;
    dvdList[1] = dvd2;
    dvdList[2] = dvd3;
     anOrder.addDigitalVideoDisk(dvdList);
     anOrder.listCart();
    

//ADD TWO DVD
     anOrder.addDigitalVideoDisk(dvd1,dvd2);
    anOrder.addDigitalVideoDisk(dvd3);
     anOrder.listCart();
//Sort
    DVDUtils.compareCost(dvd1,dvd2);
    DVDUtils.sortByCost(dvdList);
    anOrder.cartSortByCost();
    anOrder.cartSortByTitle();
    

    

    anOrder.findByID(2);
}
}
