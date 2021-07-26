package Statements_2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class citizen {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int seniorCitizen = scan.nextInt();
        int nonSeniorCitizen = scan.nextInt();
        int age = scan.nextInt();
        String result = "";

        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        seniorCitizen= scan.nextInt();
        nonSeniorCitizen= scan.nextInt();
        System.out.println("What is new citizen's age?");
        age= scan.nextInt();

        if (age>=65){
            seniorCitizen++;
            result= "Senior Citizen";
        }else{
            nonSeniorCitizen++;
            result="Non Senior Citizen";
        }
        System.out.println(result);
        System.out.println("New seniorCitizens count "+ seniorCitizen);
        System.out.println("New nonSeniorCitizen count " + nonSeniorCitizen);

    }
}
/*
5. Last print another message:

  "New seniorCitizens count ValueOfVariable"

  "New nonSeniorCitizens count ValueOfVariable"

Example:
```
Enter current count for seniorCitizens and nonSeniorCitizens:
5
4
What is new citizen's age?
66
Senior Citizen
New seniorCitizens count 6
New nonSeniorCitizens count 4
```

 */