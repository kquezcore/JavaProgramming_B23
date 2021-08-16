package Day45_Inheritance.AnimalTask;


public class Dog extends Animal  { // Dog Is An animal

    public Dog(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
    } // Dog Is An animal
/*
name, breed, gender, size, age, color, sleeps, breath
setInfo(), eat(), drink(), sleep(), toString()
 */

    public void bark(){
        System.out.println(name+" is barking");
    }

}

/*
Attributes:
    name, breed, gender, size, age, color
Actions:
    bark(), sleep(), eat(), drink(), toString()
 */
