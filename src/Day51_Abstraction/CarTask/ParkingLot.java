package Day51_Abstraction.CarTask;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ParkingLot{
    public static void main(String[] args) {


    Toyota toyota= new Toyota("Avalon","Gray",2018,25000);
    Audi audi = new Audi("A8","Black",2021,90000);
    Tesla tesla = new Tesla("Roadster","Red",2022,180000);
    BMW bmw = new BMW("750","Black",2020,70000);

        System.out.println(toyota);
        System.out.println(audi);
        System.out.println(tesla);
        System.out.println(bmw);



        System.out.println("------------------------------------------");

        toyota.start();
        audi.start();
        tesla.start();
        bmw.start();

        System.out.println("---------------------------------------------");

        Car[] cars ={toyota, audi, bmw, tesla};
        // WebDriver driver = new Chrome();

    }
}
