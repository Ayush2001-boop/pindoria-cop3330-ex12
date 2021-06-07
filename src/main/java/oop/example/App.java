package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ayush Pindoria
 */
import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double x,y,z;

        System.out.print("Enter the principal: ");
        x = input.nextDouble();
        System.out.print("Enter the rate of interest: ");
        y = input.nextDouble();
        System.out.print("Enter the number of years: ");
        z = input.nextDouble();

        double si = (x*y*z)/100;
        double sum = x + si;
        double tot = Math.ceil(sum);

        String money = String.format("After %.0f years at %.1f%%, the investment will be worth $%.0f.",z,y,tot);
        System.out.println(money);
    }//end main method
}//end classB