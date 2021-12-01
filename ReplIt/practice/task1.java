package practice;

import java.util.Scanner;

public class task1 {



        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int size = input.nextInt();
            int[] nums = new int[size];
            for (int i = 0; i < size; i++) {
                nums[i] = input.nextInt();
            }
            //WRITE CODE HERE
        }
        }
/*
Task 1:

Given an int array nums print a
 new array with double the length
 where its last element is the same as
 the original array, and all the other elements are 0.
 The original array will be length 1 or more.
 Hint: by default, a new int array contains all 0's.

Examples:

input: 4 5 6

output: [0, 0, 0, 0, 0, 6]
input: 4 5 6

output: [0, 0, 0, 0, 0, 6]
input: 0

output: [0, 0]
input: 0

output: [0, 0]
input: 1 2 3 4

output: [0, 0, 0, 0, 0, 0, 0, 4]
input: 1 2 3 4

output: [0, 0, 0, 0, 0, 0, 0, 4]

 */