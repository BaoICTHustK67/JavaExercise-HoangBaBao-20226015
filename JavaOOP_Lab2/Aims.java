public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Rogers Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);


        DigitalVideoDisc dvd2 = new DigitalVideoDisc("StarWars", "Science Fiction", "George Lucas"
        , 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        //print total cost of the items in the cart
        System.out.println("Total Cost is: ");
        System.out.printf("%.2f\n", anOrder.totalCost());
        System.out.println("The beginning list is: ");
        anOrder.printCart();
        anOrder.removeDigitalVideoDisc(dvd1);
        System.out.println("The list after deletion is: ");
        anOrder.printCart();

    }
}

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;

    public String getTitle() {
        return this.title;
    }

    public String getCategory() {
        return this.category;
    }

    public String getDirector() {
        return this.director;
    }

    public int getLength() {
        return this.length;
    }

    public double getCost() {
        return this.cost;
    }

    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, double cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc( String title, String category, String director, double cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        this.length = length;
    }

    

}

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[this.MAX_NUMBERS_ORDERED];
    public int qtyOrdered = 0;

    public void printCart(){
        for(int i = 0; i < this.qtyOrdered; i++){
            System.out.println(this.itemsOrdered[i].getTitle());
        } 
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (this.qtyOrdered >= this.MAX_NUMBERS_ORDERED - 1) {
            System.out.println("The cart is almost full");
        }
        else {
            this.itemsOrdered[this.qtyOrdered] = disc;
            ++this.qtyOrdered;
            System.out.println("The disc has been added");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        DigitalVideoDisc[] newArr = new DigitalVideoDisc[this.qtyOrdered - 1];
        int j = 0;
        for(int i = 0; i < this.qtyOrdered; i++){
            if (!disc.equals(this.itemsOrdered[i])) {
                newArr[j++] = this.itemsOrdered[i]; 
            }
        } 
        this.itemsOrdered = newArr;
        --this.qtyOrdered;
    }

    public double totalCost(){
        double sum = 0;
        for(int i=0; i < this.qtyOrdered; i++){
            sum += this.itemsOrdered[i].getCost(); 
        }
        return sum;
    }
}