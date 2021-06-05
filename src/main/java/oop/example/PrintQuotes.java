/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Angelica Palacio
 */
package oop.example;
import java.util.Scanner;

public class PrintQuotes
{
    public static void main( String[] args )
    {
        System.out.print("What is the quote? ");

        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();

        System.out.print("Who said it? ");
        String author = input.nextLine();

        String output = author + " says, \"" + quote + "\"";

        System.out.println(output);
    }
}