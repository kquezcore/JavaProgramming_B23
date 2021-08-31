package Day51_Abstraction.CarTask;

public final class Toyota extends Car{


    public Toyota( String model, String color, int year, double price) {
        super("Toyota", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("-------------------------------------");

        System.out.println("Insert the Key");
        System.out.println("Twist the key to ignition");
        System.out.println("--------------------------------------");
    }





}
