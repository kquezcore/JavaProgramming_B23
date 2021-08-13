package Day43_OOP_Encapsulation;

public class Test {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicVariable);//public access modifier is  reachable within the same package

        System.out.println(AccessModifiers.defaultVariable);//Default access modifier is  reachable within the same package

        //System.out.println(AccessModifiers.privatevARIABLE);//private access modifier s not reachable within the same package


        EncapsulationIntro obj= new EncapsulationIntro();

        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());
/*
        obj.username="H";
        obj.password="123";


        System.out.println(obj.username);
        System.out.println(obj.password);



 */
        obj.setUsername("CybertekSchool");
        obj.setPassword("Cybertek123456");

        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());



    }



}
