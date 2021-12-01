package Day55_PRecap_CollectionIntro;


import Day37_CustomClass.Dog;
import Day51_Abstraction.ShapeTask.Circle;
import Day51_Abstraction.ShapeTask.Rectangle;
import Day51_Abstraction.ShapeTask.Shape;

public class Polymorphism{

    public static void main(String[] args) {

        Object obj =  (Object) new Dog();
        // obj.play();
        (  (Dog) obj ).play(); // down casting

        System.out.println( obj instanceof Dog);

        System.out.println("--------------------------------------");

        Shape obj2 =  new Circle(3);

        System.out.println( obj2.area() );
        System.out.println( ((Circle) obj2).getR() );

        System.out.println(obj2 instanceof Rectangle);


        // System.out.println( ((Rectangle)obj2).getW() );

        Circle c1 = new Circle(5);

        // Rectangle r1 = (Rectangle) c1;



    }

}
