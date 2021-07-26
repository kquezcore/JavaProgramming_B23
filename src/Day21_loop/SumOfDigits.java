package Day21_loop;

public class SumOfDigits {

    public static void main(String[] args) {
        String str= "A1B2C3";
        int sum= 0;

        for (int i = 0; i <= str.length()-1 ; i++) {// if each index number of str
            char each= str.charAt(i);

            if (each >='0'&& each <='9'){
                sum+= each-'0';// in order to convert character digit to integer number

                //'2'-'0'
            }
        }
        System.out.println("sum = " + sum);
    }
}
/*
3. Write a program that can return the sum of digits froma  string
             Ex:
                 input: A1B2C3

                 output:    6
 */