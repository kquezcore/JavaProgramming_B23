package Day43_OOP_Encapsulation.itemsTask;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.ArrayList;
import java.util.Arrays;
import static Day43_OOP_Encapsulation.itemsTask.MyCart.*;
public class CheckOut {

    public static void main(String[] args) {


        ArrayList<Item> items= new ArrayList<>();
        items.addAll(Arrays.asList(
                item1, item2,item3, item4, item5
        ));

      //  for (int i=0; i <= items.size()-1;i++){
      //     Item eachItem= items.get(i);//to get each of the elements

    //}
double totalCost=0;
        for (Item eachItem:items) {
            totalCost += eachItem.calCost()*1.08;
        }

        System.out.println("totalCost = " + totalCost);
    }



}
