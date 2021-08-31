package Day51_Abstraction.CarTask;

public final class Audi extends Car{

    public Audi( String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override
    public void start() {
        // will execute whatever implementation we give

        System.out.println("-------------------------------------");

        System.out.println("Press the Break");
        System.out.println("Push the Button to ignition");
        System.out.println("--------------------------------------");


    }
}
