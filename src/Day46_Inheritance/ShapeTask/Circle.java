package Day46_Inheritance.ShapeTask;

public class Circle extends Shape {


    private double radius, diameter;
    private final static double PI = 3.14;

    public Circle( double radius) {
        super("Circle");
        setRadius(radius);
        setDiameter(radius * 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <0){
            return;
        }
        this.radius = radius;
        diameter = 2 * radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        if(diameter < 0){
            return;
        }
        this.diameter = diameter;
        radius = diameter/2;
    }


    public double area() {
        return radius * radius * PI;
    }


    public double perimeter() {
        return diameter * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area =" + area()+
                ", perimeter=" + perimeter() +
                '}';
    }
}
