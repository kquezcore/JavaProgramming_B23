package Methods_6;

import java.util.Scanner;

public class Methods_CleanString {

    public static String clean (String text , String badWord) {

        String word="";
        if (text.contains(badWord)){
            word=badWord+" ";
            text=text.replaceAll(word, "");
            word= ""+badWord;
            text= text.replaceAll(word,"");
        }
        return text;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(clean(in.nextLine(), in.nextLine()));
    }

}

/*
This method accept two strings (text and badWord) and returns a string.

The method will take out all the occurrences of badWord in the text.

Example:

```
clean ("one two three","two")

returns "one three"
```

```
clean ("foo bar","foo")

returns "bar"
```

```
clean ("he said bla bla bla","bla")

returns "he said"
```

 */