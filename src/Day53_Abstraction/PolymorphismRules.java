package Day53_Abstraction;


import Day45_Inheritance.AnimalTask.Animal;
import Day45_Inheritance.AnimalTask.Dog;
import Day47_Recap.PhoneTask.IPhone;
import Day47_Recap.PhoneTask.Phone;
import Day47_Recap.PhoneTask.Samsung;
import Day53_Abstraction.WebDriverTask.ChromeDriver;
import Day53_Abstraction.WebDriverTask.WebDriver;


public class PolymorphismRules {

    public static void main(String[] args) {

        Phone phone1 = new IPhone("12", "large", "black", 1000);
        phone1.call(123456);
        phone1.text(123456);
        //   phone1.faceTime(123456);


        Phone phone2 = new Samsung("S16", "Medium", "white", 9000);

        /*
       WebDriver driver = new ChromeDriver();
        driver.get()
       ( (TakeScreenShot)driver).takeScreenShot()
        driver.executeScript()
         */


        System.out.println("--------------------------------------------");

        WebDriver driver = new ChromeDriver();

        driver.get("www.amazon.com");

        System.out.println("------------------------------------------");

        Animal animal = new Dog("Lucy", "Husky", 'M', "Large", 10, "White");
        animal.drink("Milk");
        animal.eat("Dog Food");
        animal.sleep();
        //  animal.bark();


    }

}
