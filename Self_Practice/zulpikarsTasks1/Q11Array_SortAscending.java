package zulpikarsTasks1;

import java.util.Arrays;

public class Q11Array_SortAscending {

    public static void main(String[] args) {

        int[] arr= {10, 9, 8,7};

        System.out.println(Arrays.toString(sortAscending(arr)));
    }

    public static  int[] sortAscending(int []arr){

        for (int i = 0; i < arr.length ; i++) {
            int min= arr[i];
            int  index= i;

            for (int j = i+1; j < arr.length ; j++) {
                if (min > arr[j]){
                    min= arr[j];
                    index= j;
                }
            }

            int temp= arr[i];
            arr[i]= min;
            arr[index]= temp;


        }
        return arr;

    }
}
/*
Write a return method that can sort and int array in Ascending order
 without using the sort method od the arrays class


Ex:
int[] arr= {10, 9, 8,7};
arr= sort (arr);
result should be {7,8,9,10}


 */