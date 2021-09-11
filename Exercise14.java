/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 14
 *  Copyright 2021 Mayank Goyal
 */

import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

        System.out.println("What is the order amount?");
        double order_Amount = Double.parseDouble(scanner.nextLine());

        System.out.println("What is the state? ");
        String eState = scanner.nextLine();
        
        String st = "WI";

        if(!eState.isEmpty() && !st.equals(eState))
        {
          System.out.println("The total is " + String.format("%.2f", order_Amount) + ".");
        }

        if(st.equals(eState))
        {
          double subtotal = order_Amount;
          double state_tax = 5.5/10;
          double total = order_Amount + state_tax;

          System.out.println("The subtotal is " +  "$" + String.format("%.2f", subtotal) + ".\n" + "The tax is " + String.format("%.2f", state_tax) + ".\n" + "The total is " + String.format("%.2f", total) + ".");
        }

        
  }
} 