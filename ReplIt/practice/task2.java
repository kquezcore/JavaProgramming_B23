package practice;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE


        System.out.println("[" + num[0] + ", " + num[1] + "]");
    }
    }
/*
Given an int array num of any length, print a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.

Examples:

input: 1, 2, 3

output: [1, 2]
input: 1, 2, 3

output: [1, 2]
input: 1

output: [1]
input: 1

output: [1]
input: 4, 5, 4, 3, 8

output: [4, 5]
 */