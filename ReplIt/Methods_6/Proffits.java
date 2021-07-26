package Methods_6;

import java.util.Scanner;

public class Proffits {


        public static String profits(int buyPrice,int sellPrice) {
            String profits = "";
            if (buyPrice < sellPrice) {
                profits = "profit";


            } else if (buyPrice > sellPrice) {
                profits = "loss";
            } else if (buyPrice == sellPrice) {
                profits = "no loss";
            }

return  profits;
        }

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println(profits(in.nextInt(), in.nextInt()));
        }


}
