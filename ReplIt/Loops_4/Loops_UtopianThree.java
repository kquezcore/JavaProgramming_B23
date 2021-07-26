package Loops_4;

public class Loops_UtopianThree {
    public static void main(String[] args) {

        int growth = 0;
        int count = 1;
        for (int year = 1; year <= 10; year++) {
            if (year <= 3) {
                count = 1;
            } else {
                count = 2;
            }
            growth += count;
            if (year == 3) {
                System.out.println("year " + year + "  - growth " + count + " cm");
                System.out.println("tree size: " + growth + "cm");
            } else {
                System.out.println("year " + year + " - growth " + count + " cm");
                System.out.println("tree size: " + growth + "cm");
            }


        }
    }
}
/*
The Utopian Tree grows exactly 1 cm for the first three years,
 and after that it grows by 2 cm every year. Show 10 years of growth of the Utopian Tree.

Output:

year 1 - growth 1 cm
tree size: 1cm

year 2 - growth 1 cm
tree size: 2cm

year 3  - growth 1 cm
tree size:3cm

year 4 - growth 2 cm
tree size: 5cm

year 5 - growth 2 cm
tree size: 7cm

year 6 - growth 2 cm
tree size: 9cm

... until you reach year 10
 */