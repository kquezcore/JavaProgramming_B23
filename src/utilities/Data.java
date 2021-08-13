package utilities;

import Day43_OOP_Encapsulation.AccessModifiers;

public class Data {

    public String str1, str2;

    public void method1() {
    }

    public void method2() {
    }


    public static String str3, str4, str5;

    public static void method3() {
    }

    public static void method4() {
    }


    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicVariable);// public access modifier is reachable outside the package
        //System.out.println(AccessModifiers.defaultVariable);// Default is not recheable within another package
      // System.out.println(AccessModifiers.privateVariable);//not visivle

    }
}


