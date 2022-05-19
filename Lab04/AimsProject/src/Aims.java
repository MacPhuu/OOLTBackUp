
public class Aims{
    public static void main(String[] args) {

    Cart anOrder = new Cart();

    DigitalVideoDisk dvd1 = new DigitalVideoDisk("The Lion King","Animation","Roger Allers",87,19.95f);
    DigitalVideoDisk dvd2 = new DigitalVideoDisk("Star Wars","Science Fiction","George Lucas",87,24.95f);
    DigitalVideoDisk dvd3 = new DigitalVideoDisk("Aladin","Animation",18.99f);

    // anOrder.addDigitalVideoDisk(dvd1);
    // anOrder.addDigitalVideoDisk(dvd2);
    // anOrder.addDigitalVideoDisk(dvd3);
    // System.out.println("Total cost is:");
    // System.out.println(anOrder.totalCost());
    // //Before remove
    // System.out.println("List: ");
    // anOrder.listCart();

    // //Remode dvd2
    // anOrder.removeDigitalVideoDisk(dvd2);

    // // after remove
    // System.out.println("List: ");
    // anOrder.listCart();
    // System.out.println("Total cost: " + anOrder.totalCost());

    // //remove an item which does not exist
    // anOrder.removeDigitalVideoDisk(dvd2);
    // }   
    
    // ADD LIST
    DigitalVideoDisk [] dvdList = new DigitalVideoDisk[20];
    dvdList[0] = dvd1;
    dvdList[1] = dvd2;
    dvdList[2] = dvd3;
     anOrder.addDigitalVideoDisk(dvdList);
    // anOrder.listCart();
    

    //ADD TWO DVD
    // anOrder.addDigitalVideoDisk(dvd1,dvd2);
    // anOrder.addDigitalVideoDisk(dvd3);
    // anOrder.listCart();

    // DVDUtils.compareCost(dvd1,dvd2);
    // DVDUtils.sortByCost(dvdList);

    anOrder.findByID(2);
    }
    
}