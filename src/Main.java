


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String item;
        Double quantity;
        String currency ="$";
        Double price;


        Scanner scanner = new Scanner(System.in);

        System.out.printf("Hallo! What would you like to buy?");
        item = scanner.next();

        System.out.printf("How many!");
        quantity = scanner.nextDouble();

        System.out.printf("How much!");
         price = scanner.nextDouble();

        Double total = price * quantity;

        System.out.printf("Your total amount is :" + item +" " + currency+" " + total );





        System.out.printf("Thank you and welcome again!!!!!");



        scanner.close();


    }
}