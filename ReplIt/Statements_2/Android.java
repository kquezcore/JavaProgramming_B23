package Statements_2;

import java.util.Scanner;

public class Android {

    public static void main(String[] args) {

            //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
            // Variables are already declared and given
            Scanner input = new Scanner(System.in);
            double version = input.nextDouble();

            //WRITE YOUR CODE HERE:
            if (version == 1.5) {
                System.out.println("Cupcake");
            }else if (version == 1.6) {
                System.out.println("Donut");
            }else if (version==2.1){
                System.out.println("Eclair");
            }else if (version == 2.2){
                System.out.println("Froyo");
            }else if(version ==2.3){
                System.out.println("Gingerbread");
            }else if (version ==3.1){
                System.out.println("Honeycomb");
            }else if (version == 4.0){
                System.out.println("Ice Cream Sandwich");
            }else if (version ==4.1){
                System.out.println("Jelly Bean");
            }else if (version == 4.4){
                System.out.println("KitKat");
            }else if (version ==5.0){
                System.out.println("Lollipop");
            }else if (version== 8.0){
                System.out.println("Oreo");
            }else if (version == 9.0){
                System.out.println("Pie");
            }else{
                System.out.println("Sorry, I don't know this version!");
            }


    }
}
/* 5.0 - Lollipop 8.0 - Oreo 9.0 - Pie

Example:

input: 1.5
output: Cupcake
input: 1.5
output: Cupcake
input: 9.0
output: Pie
input: 9.0
output: Pie
input: 11.0
output: Sorry, I don't know this version!


-----------

No codename	1.0	1	September 23, 2008
No codename	1.1	2	February 9, 2009
Cupcake	1.5	3	April 27, 2009
Donut	1.6	4	September 15, 2009
Eclair	2.0 - 2.1	5 - 7	October 26, 2009
Froyo	2.2 - 2.2.3	8	May 20, 2010
Gingerbread	2.3 - 2.3.7	9 - 10	December 6, 2010
Honeycomb	3.0 - 3.2.6	11 - 13	February 22, 2011
Ice Cream Sandwich	4.0 - 4.0.4	14 - 15	October 18, 2011
Jelly Bean	4.1 - 4.3.1	16 - 18	July 9, 2012
KitKat	4.4 - 4.4.4	19 - 20	October 31, 2013
Lollipop	5.0 - 5.1.1	21- 22	November 12, 2014
Marshmallow	6.0 - 6.0.1	23	October 5, 2015
Nougat	7.0	24	August 22, 2016
Nougat	7.1.0 - 7.1.2	25	October 4, 2016
Oreo	8.0	26	August 21, 2017
Oreo	8.1	27	December 5, 2017
Pie	9.0	28	August 6, 2018
Statements_2.Android 10	10.0	29	September 3, 2019
Statements_2.Android 11	11	30	September 8, 2020

 */