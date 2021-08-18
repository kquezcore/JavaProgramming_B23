package Day46_Inheritance.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        System.out.println(circle);
    }
}