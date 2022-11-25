import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Mercedes");
        cars.add("Porsche");

        String myString = "String";

        Car myFirstCar = new Car("BMW", 19000);https://git.rwth-aachen.de/christian.schwenk/mmc-lab.git.
        System.out.println(myFirstCar.name);


        Car mySecondCar = new Car("Mercedes", 20000);
        // Bad practice
        mySecondCar.name = "Porsche";
        System.out.println(mySecondCar.name);

        // Good practice
        mySecondCar.setName("VW");
        System.out.println(mySecondCar.getName());

        System.out.println(mySecondCar.getPriceAsDollar());

        String number = "015177755356";
        String secondNumber = "22222";
        System.out.println(number + secondNumber);

        Phone newPhone = new Phone("iPhone", "silver", "012345");

    }
}