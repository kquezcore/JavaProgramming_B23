package Day46_Inheritance.ShapeTask;

public class Shape {

    public final String name;

    public final static boolean isShape, hasArea, hasPerimeter;

    static {
        isShape = true;
        hasArea= true;
        hasPerimeter= true;
    }

    public Shape(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }


    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area='" + area() +
                "perimeter='" + perimeter() +
                '}';
    }
}
