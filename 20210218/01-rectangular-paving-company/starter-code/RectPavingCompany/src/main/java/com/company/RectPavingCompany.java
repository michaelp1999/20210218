package com.company;

import java.util.Scanner;


public class RectPavingCompany {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("let's calculate the price of paving a rectangular area");
        System.out.println("Please enter the width of the rectangle.");
        int width = Integer.parseInt(user_input.nextLine()); //width:35
        System.out.println("PLease enter the length of the rectangle");
        int length = Integer.parseInt(user_input.nextLine()); //length:40
        int area = length * width;
        System.out.println("The area is " + area + ".");
        int perimeter = (2 * width) + (2*length);
        System.out.println("The perimeter is " + perimeter + ".");

        //now's let's calculate the total cost of the driveway, using the following fixed costs:
        //The cost of the cement for the driveway is $12.50/square foot. Cement is used for the area of the driveway

        // THIS IS VERSION 1 OF THE ASSIGNMENT BELOW
/*
        double  cement_cost_per_square_foot= 12.5;
        double cement_cost = cement_cost_per_square_foot * area;
        System.out.println("the cost of cement for the project is: " + cement_cost);

        //The cost of the framing/footers for the driveway is $8.25/linear foot. Framing is used for the perimeter of the driveway.
        double framming_per_linear_foot= 8.5;
        double framming_cost = framming_per_linear_foot * perimeter;
        System.out.println("the cost of framming for the project is: " + framming_cost);

        double total_cost = cement_cost + framming_cost;
        System.out.println("the total cost of the project is " + total_cost);
*/
        // THIS IS VERSION 2 OF THE ASSIGNMENT BELOW

        System.out.println("please enter the cost of the cement per square foot:");
        float cement_cost_per_square_foot = user_input.nextFloat();
        double cement_cost = cement_cost_per_square_foot * area;
        System.out.println("the cost of cement for the project is: " + round(cement_cost);

        System.out.println("please enter the cost of the framming per linear foot:");
        float framming_per_linear_foot = user_input.nextFloat();
        double framming_cost = framming_per_linear_foot * perimeter;
        System.out.println("the cost of framming for the project is: " + framming_cost);

        double total_cost = cement_cost + framming_cost;
        System.out.println("the total cost of the project is " + total_cost);




    }
}
