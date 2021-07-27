package Day20_Loops;

public class catDog {
    public static void main(String[] args) {

        String sentence= "Cat Dog Dog Cat";


        int numberOfCats= 0;//Cat
        int numberOfDogs= 0;


        for (int i = 0; i <=sentence.length()-3 ; i++) {//i: 0,1,2,3,4,5,6,7,8,9,...14
            String each =sentence.substring(i, i+3);// i has three characters
            if (each.equals("Cat")){
                numberOfCats++;
            }
            if (each.equals("Dog")){
                numberOfDogs++;
            }
        }
        System.out.println("numberOfCats = " + numberOfCats);
    }
}
/*
3. write a program to print true if the string
 "cat" and "dog" appear the same number of times in the given sentence

        Ex:
            sentence = "cat dog dog cat"

            output:
                true
 */