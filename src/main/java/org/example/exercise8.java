/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Emily Gensch
 */
package org.example;
import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner pizzaPrty = new Scanner(System.in);

        System.out.print("How many people? ");
        int people = pizzaPrty.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizzas = pizzaPrty.nextInt();

        System.out.print("How many slices per pizza? ");
        int slices = pizzaPrty.nextInt();

        int amtSlices = pizzas * slices;
        System.out.printf("%d people with %d pizzas (%d slices)\n",people, pizzas, amtSlices);

        int perPerson = amtSlices / people;
        System.out.printf("Each person gets %d pieces of pizza.\n", perPerson);

        int remainder = amtSlices % people;
        System.out.printf("There are %d leftover pieces.\n", remainder);

    }
}
