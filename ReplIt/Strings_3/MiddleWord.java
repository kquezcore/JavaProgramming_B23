package Strings_3;

import java.util.Scanner;

public class MiddleWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int middle =(word.length()/2);

        if (word.length()%2>0) {
           if (word.length()>=3) {
               System.out.println(word.charAt(middle));
           }else{
               System.out.println(word+word+word);
           }

        } else{
            if (word.length()%2==0) {
                if (word.length() >= 4) {
                    System.out.println(word.substring(middle-1,middle+1));
                }else{
                    System.out.println(word+word);
                }

            }





        }

    }
    }
/*

2. When word has **even number of characters and**:
 -**4 or more characters**, print the middle 2 characters
```
     java ==> av
```
```
     apples ==> pl
```
```
     #$%^&* ==> %^
```
 - **2 characters,** print those 2 characters twice
```
      @@ ==>@@@@
``
```
      $$ ==>$$$$
```
```
      hi ==> hihi
```
 */