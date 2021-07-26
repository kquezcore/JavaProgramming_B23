package Statements_2;

import java.util.Scanner;

public class GiftCard {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item =  scan.nextLine();
        String result = "";

        int balance= 100;


        if (item.equals("laptop")|| item.equals("smartphone")){
            result = ("Sorry, not enough funds in your giftcard!");
        }else if (item.equals("Blanket")){
            result=("Thank you for your purchase!");
            balance= balance-60;
            System.out.println("Your current balance is: "+balance+"$");
        }else if (item.equals("Charger")){
            result=("Thank you for your purchase!");
            balance= balance-15;
            System.out.println("Your current balance is: "+balance+"$");
        }else if (item.equals("Hat")){
            result=("Thank you for your purchase!");
            balance= balance-25;
            System.out.println("Your current balance is: "+balance+"$");
        }else if (item.equals("Headphones")){
            result=("Thank you for your purchase!");
            balance= balance-30;
            System.out.println("Your current balance is: "+balance+"$");
        }else if (item.equals("Pants")){
            result=("Thank you for your purchase!");
            balance= balance-50;
            System.out.println("Your current balance is: "+balance+"$");
        }else if (item.equals("Pillow")){
            result=("Thank you for your purchase!");
            balance= balance-40;
            System.out.println("Your current balance is: "+balance+"$");
        }else if (item.equals("Socks")){
            result=("Thank you for your purchase!");
            balance= balance-5;
            System.out.println("Your current balance is: "+balance+"$");
        }else if (item.equals("USB cable")){
            result=("Thank you for your purchase!");
            balance= balance-10;
            System.out.println("Your current balance is: "+balance+"$");
        }else{
            result= ("Invalid item!");
        }
        System.out.println(result);
        System.out.println(balance);



    }
}
/*

 Let's say I've got a 100$ gift card and you want to buy something in your online store .
  Write a program that will help me to buy something and display leftover balance after purchase.
 - If item is not in the list, display message: _**"Invalid item!"**_.
 - If price is more than 100$, display message: _**"Sorry, not enough funds on your gift card!".**_



Examples:

```
input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
```

```
input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$
```


```
input: Statements_2.Laptop
Output:
Sorry, not enough funds on your gift card!
```

```
input: Cupcake
output: Invalid item!
```
 */