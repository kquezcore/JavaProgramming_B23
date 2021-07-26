package Day34_LocalDateTime_Wrapper;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {
      LocalDate eid= LocalDate.of(2021,7,20);
        System.out.println(eid);


        LocalDate today= LocalDate.now();
        System.out.println(today);


        System.out.println("------------------------------------------");
        // create array of string to store 5 classmates names

        String[] names={"Mousa", "Zorana","Danka", "Dill"};

        LocalDate[] DOB={LocalDate.of(1999,6,21),
        LocalDate.of(1980, 8,1),
        LocalDate.of(2000,3,2),
        LocalDate.of(1991,10,4)
        };
        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]+" Birthday is: "+ DOB[i]);
        }


        System.out.println("-----------------------------------------------");

        LocalDate person1= LocalDate.of(1980, 12, 11);

       LocalDate person2=  LocalDate.of(1980,12,25);

       if (person1.isBefore(person2)){
           System.out.println("Person 1 is older");
       }else {
           System.out.println("Person 2 is older");
       }


       if (person1.isAfter(person2)){
           System.out.println("Person 1 is younger");
       }else{
           System.out.println("Person 2 is younger");
       }

        System.out.println("-----------------------------------------------");

       boolean r1= person1.isLeapYear();
        System.out.println(r1);

    }


}
