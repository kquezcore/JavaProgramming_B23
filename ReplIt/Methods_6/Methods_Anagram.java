package Methods_6;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Methods_Anagram {

    public static boolean isAnagram(String word1, String word2) {

        String [] array1= word1.toLowerCase().split("");
        String [] array2= word2.toLowerCase().split("");

        Arrays.sort(array1); // {a, e, h, r. t}
        Arrays.sort(array2); // {a, e, h, r. t}

        boolean isAnagram= Arrays.equals(array1,array2);
       return isAnagram;




    }

    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
    }

}
/*
**_Anagram_** is a word, phrase, or name formed by rearranging the letters of another, such as _cinema_, formed from _iceman_.



The **isAnagram** method checks if word1 and word2 are anagram to each other then return a boolean.

- each letter in `word1` should appear in `word2` exact number of times
- ignore empty spaces
- make your code case insensitive

Examples:

```
isAnagram("listen", "Silent") ==> true
```

```
isAnagram("earth", "heart") ==> true
```

```
isAnagram("star", "rats") ==> true
```

```
isAnagram("hi", "bye") ==> false
```

```
isAnagram("java", "cava") ==> false
```


 */