package Day43_OOP_Encapsulation;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side==0){
            System.out.println("can not be negative");
            return;
        }
        this.side = side;
    }
    public Square(double side) {
        setSide(side);
    }
    public double area(){
        return side*side;
    }
    public double perimeter(){
        return 4*side;
    }
    public boolean equals(Square square){
        return side==square.side;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}

/*


SquareTask:
    1. create a class named Square
            private variables:
                side (double)

            Encapsulate All the private fields
                (side can not be set to negative)

            Add a constructor that can set the instances when the object is created
                (avoid any duplicated code fragments)

            Extra methods:
                area(), perimeter(), toString(), equals()
 */
