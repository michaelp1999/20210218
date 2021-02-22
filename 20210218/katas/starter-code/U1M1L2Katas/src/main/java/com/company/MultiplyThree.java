package com.company;

import java.util.Scanner;

public class MultiplyThree {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("please input three numbers... decimals also work!");
        float num1 = user_input.nextFloat();
        float num2 = user_input.nextFloat();
        float num3 = user_input.nextFloat();

        float product_of_numbers = (num1 * num2 * num3);
        System.out.println("The product of the three numbers is: " + product_of_numbers);
    }
}