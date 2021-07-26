package Day29_ReturnMethods;

import java.util.Arrays;

public class Breakfast {
    public static void main(String[] args) {

        PosNegZero(0);
        combinationOfTwoInt(new int[]{1,2,3,4,5}, new int[]{6,7,8,9});
        fullName("cyBertEK", "SchooL");
        MaxNum(5,7);
        SortArray(new int[]{2,4,5,1,3,4});

    }

    //1. create a function that can check if the given integer is positive, negative or zero
    public static void PosNegZero(int number){
        if (number>0){
            System.out.println("Its a Positive Number");
        }else if (number<0){
            System.out.println("Its a negative Number");
        }else{
            System.out.println("its zero");
        }
        System.out.println("---------------------------------------------------------");
    }


    //2. create a function that can print out the combination of two integer arrays

    public static void combinationOfTwoInt(int[] arr1, int[] arr2){

        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] += arr1[i];
        }

        for (int j = 0; j < arr2.length; j++) {
            arr3[j + arr1.length] += arr2[j];
        }
        System.out.println(Arrays.toString(arr3));

        System.out.println("---------------------------------------------------------");

    }

        /*
        3.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYbErTeK", "SCHOOL");

                output:
                    "Cybertek School"

         */
        public static void fullName(String firstName,String lastName){

            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();// firstName. substring
            // (0,1)specifies that we only want the first character in 0 capitalized, and starting from character 1
            // we don't want int capitalized
            lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
            String fullName = firstName + " " + lastName;

            System.out.println(fullName);

            System.out.println("---------------------------------------------------------");

        }


        //4. create a function that can print out the maximum number between two numbers
        public static void MaxNum(int num1, int num2){

            if(num1>num2){
        System.out.println(num1 + " is greater");
         } else if(num2>num1){
        System.out.println(num2 + " is greater" );
         } else{
        System.out.println("numbers are equal");
       }
            System.out.println("---------------------------------------------------------");


        }


    //5. create a function that can print out the array of integers in descending order


    public static void SortArray(int[]arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    }

    /*




 */

