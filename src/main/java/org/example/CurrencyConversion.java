package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Page
 */

import java.util.Scanner;

public class CurrencyConversion
{
    public static void main( String[] args )
    {
        //define variables
        Scanner input = new Scanner(System.in);
        double euro, usd, rate;

        //Gets input for euros exchanged and the exchange rate
        System.out.print("How many euros are you exchanging?");
        euro = input.nextDouble();

        System.out.print("What is the exchange rate?");
        rate = input.nextDouble();

        //Calculate rate
        usd = rate * euro;
        usd = Math.round(usd * 100.0) / 100.0; //round to the nearest penny

        //Display calculations
        System.out.println((int) euro + " euros at an exchange rate of " +rate+ " is\n" +usd+ " U.S. dollars.");
    }
}
