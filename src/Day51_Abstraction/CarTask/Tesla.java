package Day51_Abstraction.CarTask;

public class Tesla extends Car{


    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    // why ()? bc i s a method
    public void autoPilot(){

    }

    @Override
    public void start() {

    }
}
