public class Cart {
    private int qtyOrdered = 0;

  
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisk itemOrdered[]= new DigitalVideoDisk[MAX_NUMBERS_ORDERED];

    public int getQtyOrdered() {
        return this.qtyOrdered;
    }
    public void addDigitalVideoDisk(DigitalVideoDisk disc){
        if(this.qtyOrdered >= 18) System.out.println("Cart is almost full");
        if(this.qtyOrdered > 20){
            System.out.println("Cart is full");
            return;
        }
        this.qtyOrdered++;
        this.itemOrdered[qtyOrdered] = disc;    
        System.out.println("Disc has beeb added!");
    }
    public void removeDigitalVideoDisk(DigitalVideoDisk disc){
        if(this.qtyOrdered == 0) {
            System.out.print("No order in cart");
            return;
        }
        int i = 1;
        for(; i <= this.qtyOrdered; i++){ //Find disc
            if(itemOrdered[i] == disc){
                break;
            }
        }
        
        if(i > this.qtyOrdered ){
            System.out.println("order does not exist");
            return;
        }
        System.out.println("Disc " +this.itemOrdered[i].getTitle() + " has been removed");
        for(int j = i; j < this.qtyOrdered;j++){ //remode disc
            this.itemOrdered[j] = this.itemOrdered[j+1];
        }
        
        this.qtyOrdered--; // decrease amout of orders
    }
    public float totalCost(){
        float total = 0.0f;
        for(int i = 1; i <=this.qtyOrdered; i++){
            total += this.itemOrdered[i].getCost();
        }
        return total;
    }
    public void listCart(){
        for(int i = 1; i <=this.qtyOrdered; i++){
            System.out.println(i +" "+ this.itemOrdered[i].getTitle());
        }
    }
}
