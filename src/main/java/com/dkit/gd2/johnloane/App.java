package com.dkit.gd2.johnloane;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exception handling
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Ask the user for two integers
        //Call divide
        int x = getIntEAFP("Please enter the numerator> ");
        int y = getIntEAFP("Please enter the denominator> ");
        while(y==0)
        {
            System.out.println("Not possible to divide by 0. Please enter a valid denominator");
            y = getIntEAFP("Please enter the denominator> ");
        }
        System.out.println(divideLBYL(x, y));
    }

    private static int getInt()
    {
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();
    }

    private static int getIntLBYL(String message)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean isValid = false;
        //regex to check for numbers
        String numberRegex = "^(\\-)?[0-9]+$";
        String input = "";

        while(!isValid)
        {
            System.out.print(message);
            input = keyboard.next();

            if (!input.matches(numberRegex))
            {
                System.out.println(input + " is not valid. Please enter an integer");
                isValid = false;
            }
            else
            {
                break;
            }
        }

        System.out.println("Returning " + Integer.parseInt(input) );
        return Integer.parseInt(input);

        //Loop until you get valid entry
    }

    private static Integer getIntEAFP(String message)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print(message);
        try
        {
            return keyboard.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter an integer");
            getIntEAFP(message);
        }
        return null;
    }

    private static int divide(int x, int y)
    {
        return x/y;
    }

    private static int divideLBYL(int x, int y)
    {
            return x/y;
    }

    private static Integer divideEAFP(int x, int y)
    {
        try
        {
            return x/y;
        }
        catch(ArithmeticException ae)
        {
            //What to do now?
            //Get a non-zero y....
        }
        return null;
    }
}
