package Day46_Inheritance.CarTask;

public class BMW extends Car{

    public BMW( String model, int year, double price, String color, long miles) {
        super("BMW", model, year, price, color, miles);
    }

    @Override
    public void start() {
        System.out.println("Call mechanic");
        System.out.println("Oil change");
        System.out.println("Jump start");
    }
}
