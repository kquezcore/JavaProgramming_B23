package zulpikarsTasks1;

import java.util.Arrays;

public class Q12Array_SortDescending {

    public static void main(String[] args) {
        int[] arr= {10, 20, 7, 8,90};
        descendingSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void descendingSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {// Loop thru each item
            int selected= arr[i];// create a variable to use after
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]){
                    for (int k = i; k >j ; k--) {
                        arr[k]= arr[k-1];
                    }
                    arr[j]= selected;
                }
            }
        }
    }

}
/*
Write a return method that can sort and int array in descending order
 without using the sort method od the arrays class


Ex:
int[] arr= {10, 20, 7, 8,90};
arr= sort (arr);
result should be {90,20,10,8,7};




 */