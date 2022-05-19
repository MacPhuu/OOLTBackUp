
public class Aims{
    public static void main(String[] args) {

    Cart anOrder = new Cart();

    DigitalVideoDisk dvd1 = new DigitalVideoDisk("The Lion King","Animation","Roger Allers",87,19.95f);
    DigitalVideoDisk dvd2 = new DigitalVideoDisk("Star Wars","Science Fiction","George Lucas",87,24.95f);
    DigitalVideoDisk dvd3 = new DigitalVideoDisk("Aladin","Animation",18.99f);
    anOrder.addDigitalVideoDisk(dvd1);
    anOrder.addDigitalVideoDisk(dvd2);
    anOrder.addDigitalVideoDisk(dvd3);
    System.out.println("Total cost is:");
    System.out.println(anOrder.totalCost());
    //Before remove
    System.out.println("List: ");
    anOrder.listCart();

    //Remode dvd2
    anOrder.removeDigitalVideoDisk(dvd2);

    // after remove
    System.out.println("List: ");
    anOrder.listCart();
    System.out.println("Total cost: " + anOrder.totalCost());

    //remove a not exist item
    anOrder.removeDigitalVideoDisk(dvd2);
    }      
}