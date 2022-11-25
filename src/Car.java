public class Car {

    String name;
    int price;

    // Constructor
    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceAsDollar() {
        int priceInDollars = this.price * 2;
        return  priceInDollars;
    }
}
