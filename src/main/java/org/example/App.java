package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ross Brinkman
 */

public class App 
{
    public static void main( String[] args )
    {

        DecimalFormat f = new DecimalFormat("##.00");
        Scanner scanner = new Scanner(System.in);
        float totalPrice = 0.00f, tax;
        final int items = 3;
        final float taxRate = .055f;

        for (int i = 1; i <= items; i++)
        {
            int quantity;
            float itemPrice, subTotal;
            System.out.println( "Enter the price of item " + i + ": " );
            itemPrice = scanner.nextFloat();

            System.out.println( "Enter the quantity of item " + i + ": " );
            quantity = scanner.nextInt();

            subTotal = itemPrice * quantity;
            totalPrice += subTotal;
        }

        System.out.println( "Subtotal: $" + f.format(totalPrice));

        tax = totalPrice * taxRate;
        System.out.println( "Tax: $" + f.format(tax));

        totalPrice += tax;
        System.out.println( "Total: $" + f.format(totalPrice));
    }
}
