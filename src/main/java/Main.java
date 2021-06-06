/*
 *  UCF COP3330 Summer 2021 Assignment 14 Solution
 *  Copyright 2021 Sachin Mishra
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double order = input.nextDouble();

        System.out.print("What is the state initials?. ");
        String state = input.nextLine();

        if(state.equalsIgnoreCase("WI")){
            System.out.printf("The subtotal is: %.2f%n", order);
            double tax = order * 0.055;
            System.out.printf("The tax is %.2f%n", tax);
            order += tax;
        }

        System.out.printf("The total is: %.2f", order);

    }
}