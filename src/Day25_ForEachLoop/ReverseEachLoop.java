package Day25_ForEachLoop;

import java.util.Arrays;

public class ReverseEachLoop {
    public static void main(String[] args) {

    String[]array = {"Java","Python","C#"};

        for (int j = 0;  j< array.length; j++) {// index numbers of the array


            String element= array[j];//java// element of the array
            String reverse= "";//avaj.// to store reversed version of the element

            for (int i = element.length()-1; i >=0 ; i--) {
                reverse += element.charAt(i);// gets the characters
                // from the string elements
            }
            array[j]= reverse;// assigning reversed
            // element to the index of the array
        }

        System.out.println(Arrays.toString(array));

}
}
/*
1. write a program that can  reverse each elements in an array of string
        Ex:
            array = {"Java", "Python", "C#"}

            output:
                ["avaJ", "nohtyP", "#C"]

 2. write a program that can count
                 how many palindromes in an array of string


 */