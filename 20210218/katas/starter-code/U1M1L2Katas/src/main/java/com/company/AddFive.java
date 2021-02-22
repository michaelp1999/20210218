package com.company;

import java.util.Scanner;

public class AddFive {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("please input five numbers... decimals also work!");
        float num1 = user_input.nextFloat();
        float num2 = user_input.nextFloat();
        float num3 = user_input.nextFloat();
        float num4 = user_input.nextFloat();
        float num5 = user_input.nextFloat();

        float sum_of_numbers = (num1 + num2 + num3 + num4 + num5);
        System.out.println("The sum of the five numbers is: " + sum_of_numbers);
    }
}
