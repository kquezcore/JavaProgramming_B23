package Day37_CustomClass;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Breakfast {

/*
1. write a program that can swap the first and last elements of an ArrayList
*/

    public static void main(String[] args) {

        String [] names= {"Esraa","Sabir","Raphael","Mousa"};

        ArrayList<String> Students =  new ArrayList<>();

        Students.addAll(Arrays.asList(names));


        System.out.println(Students);

        Collections.swap(Students,0,Students.size()-1);
        System.out.println(Students);


        System.out.println("======================================================");

        //2. write a program that can return the first unique elements of an ArrayList

        ArrayList<Integer> list = new ArrayList<>();
               list.addAll(Arrays.asList(1,1,1,2,2,2,3,4,5,5,6,6,7,8,9,10));

               ArrayList<Integer> uniques = new ArrayList<>(list);
        uniques.removeIf( p -> Collections.frequency(uniques, p) != 1 );
               int firstUnique = uniques.get(0);

               System.out.println(uniques);
               System.out.println("firstUnique = " + firstUnique);

               /*
               int firstUnique = 0;
        for (Integer each : list) {

        System.out.println("====================================================");
/*
3. write a program that can find the frequency of character from a String
                DO NOT use nested loop
                "AABBCCDDEE"  ==> "ABCDE"
                output: A2B2C2D2E2
*/
   String str = "AABBCCDDEE";
   String result="";



   ArrayList<String>List=  new ArrayList<>( Arrays.asList(str.split("")));

        for (String Each: StringUtility.removeDup(str).split("")){
            int frequency= Collections.frequency(List,Each);
            result+= Each+frequency;
        }

        System.out.println(List);
        System.out.println(result);

        System.out.println("=============================================================");
        /*

4. Write a program that can return the nth largest number from an ArrayList of integers
 */

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,1,2,2,3,3,3,4,4,4,5,5,6,6,7,7,8,8,9,9,10,10));

      //Collections.sort(numbers);
      //  Collections.reverse(numbers);

        //System.out.println(numbers);


        int n = 5;

        for (int i = 1; i <n  ; i++) {
           numbers.removeIf(p-> p== Collections.max(numbers));
        }
             int fifthMaxNum= Collections.max(numbers);

        System.out.println("fifthMaxNum = " + fifthMaxNum);

}
}