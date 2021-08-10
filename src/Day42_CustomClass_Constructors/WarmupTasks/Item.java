package Day42_CustomClass_Constructors.WarmupTasks;

public class Item {
    public String name;
    public double unitPrice;
    public int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public  double calcCost(){
        return unitPrice * quantity;
    }

    public String toString() {
        return "Item{" +
                "name= '" + name + '\'' +
                ", unitPrice= $" + unitPrice +
                ", quantity= " + quantity +
                ", total price= $" + calcCost() +
                '}';
    }
}

/*
1. Create a class called Item
			Variables:
				name, unitPrice, quantity
			Add a constructor to initialize all the fields
			Methods:
				calcCost(): returns the total price of the Item
				toString()
 */

