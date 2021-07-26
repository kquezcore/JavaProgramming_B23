package Day19_Loops;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String name= new Scanner(System.in).nextLine();
// or
        //String name="Muhtar";

        //index :     012345

        String reverseName="";//rathum

        for (int i =name.length()-1; i >=0 ; i--) {
            reverseName+= name.charAt(i);// getting the characters starting from last index to index 0
        }
        System.out.println(reverseName);
    }

}
