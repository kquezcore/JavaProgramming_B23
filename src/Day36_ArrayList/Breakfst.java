package Day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Breakfst {

    //**********************Part I **************************************************
/*  1. write a program that can set the last element of the Integer arraylist to zero
    ex:
    list = [1,2,3,4,5];
    output: [1,2,3,4,0];

 */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        list.set(list.size()-1, 0);
        System.out.println(list);

        System.out.println("-------------------------------------------------------------------------");



    //**********************Part II **************************************************
/*

    2. write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]
 */


    ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        ArrayList<Integer> list2 =new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {

            if (list1.get(i)%2!=0){
                list2.add(i, list1.get(i) * 2);
            }else {
                list2.add(i,list1.get(i));
            }
            System.out.println(list2);
        }

        System.out.println("----------------------------------------------------");

//**********************Part III **************************************************

/*
    3. write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */


        ArrayList<String > arr1 = new ArrayList<>();
        ArrayList<String > arr2 = new ArrayList<>();
        arr1.addAll(Arrays.asList("A","B","C"));
        arr2.addAll(Arrays.asList("D","E","F","G"));

        ArrayList<String > arr3= new ArrayList<>();
        arr3.addAll(arr1);
        arr3.addAll(arr2);

        System.out.println(arr3);

    }
        }