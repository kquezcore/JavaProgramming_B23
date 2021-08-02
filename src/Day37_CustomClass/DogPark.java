package Day37_CustomClass;

public class DogPark {
    public static void main(String[] args) {
        Dog dog1= new Dog();

        dog1.name= "kangal";
        dog1.breed= "kangal";
        dog1.gender= "Male";
        dog1.age= 5;
        dog1.size="large";
        dog1.color= "yellowish brown";



        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.age);
        System.out.println(dog1.color);

        Dog dog2= new Dog();
        dog2.setInfo("mylo", "boxer", "Male","black", "medium", 1);
    }
}
