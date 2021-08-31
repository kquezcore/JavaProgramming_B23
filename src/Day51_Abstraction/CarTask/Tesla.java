package Day51_Abstraction.CarTask;

public class Tesla extends Car{


    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    // why ()? bc i s a method

    public void autoPilot(){
        System.out.println("Tesla "+getModel()+" is self driving");
    }


    @Override
    public void start() {
        System.out.println("------------------------------------");
        System.out.println("Say \"Start\"");
        System.out.println("------------------------------------");
    }

}
