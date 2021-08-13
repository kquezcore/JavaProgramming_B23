package Day43_OOP_Encapsulation.itemsTask;

public class MyCart {

    public static Item item1, item2, item3, item4, item5;

    static {
        item1= new Item("Milk",3,2);
        item2= new Item("Eggs",0.5,30);
        item3= new Item("Diaper",48,1);
        item4= new Item("Bread",4,5);
        item5= new Item("Toilet Paper",10,20);
    }




}
/*
 create a class called MyCart
        create 5 static variables of Items
        Add a static block to to set all the static variables

        Create a class named CheckOut

            1. Create an ArrayList of Items
                    2. add all the 5 items from MyCart to the ArrayList items
                    3. calculate the total price of all the items (including the tax)
                    Assume that the sales tax is 8%


 */