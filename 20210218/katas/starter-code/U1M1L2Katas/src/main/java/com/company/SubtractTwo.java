package com.company;

import java.util.Scanner;

public class SubtractTwo {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("please input two numbers... decimals also work!");
        float num1 = user_input.nextFloat();
        float num2 = user_input.nextFloat();

        float difference = (num1 - num2);
        System.out.println("the second number subtracted from the first number is: " + difference);

    }
}
