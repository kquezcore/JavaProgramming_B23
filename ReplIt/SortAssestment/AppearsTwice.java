package SortAssestment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AppearsTwice {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Cybertek is helpful it has helped my family and thats why i like Cybertek");
    }

    /**
     *target - string that you need to check.
     * sentence - string where you need to lookup for target.
     *
     */
    public static boolean appearsTwice(String target, String sentence) {
        //write your codes here:

        int frequency =0;

        ArrayList<String> word= new ArrayList<>(Arrays.asList(sentence.replaceAll(",", " ").split(" ")));
        boolean appearsTwice= false;
        for (String each : word) {
            if (each.equals(target) && Collections.frequency(word, each) == 2) {
                appearsTwice = true;
            }
        }
        return appearsTwice;

    }
}

/*
# `Write a a method appearsTwice() that returns true if value
of variable target appears only twice in the string sentence, otherwise return false.`

```
`Examples:`
```

```
`Main.appearsTwice("java", "java is fun!")`
```

```
      `- returns false, because java appears only once.`
```

```
`Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.")`
```

```
      `- returns true, because laptop appears twice.`
```
 */