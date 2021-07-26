package Methods_6;

import java.util.Scanner;

public class Methods_Reverse {
    public static String reverse(String input){

        String reverse = "";

        for (int i = input.length()-1; i >= 0; i--){ // i : 2, 1, 0
            reverse += input.charAt(i); //
        }

        return reverse;




    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
    }
}
/*
The **reverse** method will reverse the given String

Example:

```
reverse("foo") ==> "oof"
```

```
reverse("student") ==> "tneduts"
```

 */