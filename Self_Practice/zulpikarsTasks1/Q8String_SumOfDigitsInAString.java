package zulpikarsTasks1;

public class Q8String_SumOfDigitsInAString {

    public static void main(String[] args) {
     String s="12 some text 3 7";

        System.out.println(getSumOfNumbers(s));
    }

    public static int getSumOfNumbers(String s) {

    int sum = 0;

    String[] numbers = s.replaceAll("[\\D]+"," ").split(" ");

        for(String each : numbers){
        sum+=Integer.parseInt(each);
    }

        return sum;
}
}
// write a method that can return the sum of the digits in a string
