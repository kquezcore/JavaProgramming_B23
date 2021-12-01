package zulpikarsTasks1;

public class Q14Array_Permutation_Combinations {
    public static void main(String[] args) {
        char[] a = {'a', 'b', 'c'};

        String permutation="";// empty string to reuse later

        for (int i = 0; i <a.length ; i++) {
            permutation += ""+a[0]+a[1]+a[2]+"\n";// to go throught each possible way
            permutation += ""+a[0]+a[2]+a[1]+"\n";

            char tempVar= a[0];// assign a value to the temp variable
            a[0]= a[1]; // switching the order
            a[1]= a[2];
            a[2]= tempVar; // adding the deffinite value of tempVar

        }
        System.out.println(permutation);// wanna make sure you print permutation not tempVar
    }
    }
// given an array of 3 characters print all permutation combinations fom the given characters.
