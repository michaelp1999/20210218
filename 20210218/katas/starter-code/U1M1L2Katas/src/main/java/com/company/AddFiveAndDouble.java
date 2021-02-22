package com.company;

import java.util.Scanner;

public class AddFiveAndDouble {

    public static void main(String[] args) {
        System.out.println("Enter a number... decimals also work!");
        Scanner user_input = new Scanner(System.in);
        float num1 = user_input.nextFloat();
        float num2 = 5;

        float product = (num1 + num2) * 2;
        System.out.println("the number you inputted plus 5 times 2 is: " + product);
    }
}
