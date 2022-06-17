package testSuite;

public class Car {

    String carName;
    double tax;

    void drive(){
        System.out.println( carName + " can drive");
    }

    public void speed(){
        System.out.println( carName + " can speed up to " + speedLimit());
    }

    public void stop(){
        System.out.println( carName + " can stop");
    }

    private int speedLimit(){
        return 70;
    }

    public void getPriceTag(int basePrice){

        System.out.println("Total price is: " + totalPrice(basePrice));

    }

    private double totalPrice(int base){
        return base + (base * tax);
    }
}

class BMW {

    public static void main(String[] args){
        Car car = new Car();
        car.carName = "BMW";
        car.tax = .07;
        car.drive();
        car.speed();
        car.stop();
        car.getPriceTag(100);
    }
}

class Volvo {
    public static void main(String[] args){
        Car car = new Car();
        car.carName = "Volvo";
        car.tax = .08;


        car.drive();
        car.speed();
        car.stop();
        car.getPriceTag(10999);
    }
}

