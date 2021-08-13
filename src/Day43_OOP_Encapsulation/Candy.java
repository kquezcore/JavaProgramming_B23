package Day43_OOP_Encapsulation;

public class Candy {

    //******** CANDY TASK!!!!*********

    //create a custom class named Candy
    // private variables:
    //brand (String), quantity (int), price (double), hasPeanuts (boolean)
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;


    //  Encapsulate All the private fidlds
    //  (price of candy can not be set to negative)
    //  (quantity of candy can not be set to zero or negative)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<=0){
            return;
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            return;
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    //  Add a constructor that can set the instances when the object is created
    //  (avoid any duplicated code fragments)

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
      setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
      setHasPeanuts(hasPeanuts);
    }

   //Extra methods:
   // toString():
   // if the price is zero, print "free" instead of 0
    public String toString() {

        return "Candy{" +
                "brand= '" + brand + '\'' +
                ", quantity= " + quantity +
                ", +hasPeanuts= " + hasPeanuts+
                ", price= $" + ( (price==0)? "Free" : price )+
                '}';
    }
}
