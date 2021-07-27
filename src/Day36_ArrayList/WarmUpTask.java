package Day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTask {
    public static void main(String[] args) {
        ArrayList <Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list);
        list.set(list.size()-1, 0);

        System.out.println(list);

        System.out.println("-------------------------------------------------------------------------");


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list2);

        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) %2!=0){
                list2.set(i, list2.get(i)*2);
            }
        }

        System.out.println(list2);


        System.out.println("-------------------------------------------------------------------------");

     String []  arr1 = {"A","B", "C"},
        arr2 = {"D", "E", "F", "G"};

     ArrayList<String> result= new ArrayList<>(Arrays.asList(arr1));
     result.addAll(Arrays.asList(arr2));

        System.out.println(result);
    }

}
/*
Good morning @everyone,  breakfast is ready:
    1. write a program that can set the last element of the Integer arraylist to zero
                ex:
                    list = [1,2,3,4,5];
                    output: [1,2,3,4,0];

    2. write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]

    3. write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */