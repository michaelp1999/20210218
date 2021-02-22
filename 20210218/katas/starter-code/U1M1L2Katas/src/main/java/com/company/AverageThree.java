package com.company;

import java.util.Scanner;

public class AverageThree {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("please input three numbers... decimals also work!");
        float num1 = user_input.nextFloat();
        float num2 = user_input.nextFloat();
        float num3 = user_input.nextFloat();

        float average_of_numbers = (num1 + num2 + num3) /3;
        System.out.println("The average of the three numbers is: " + average_of_numbers);


    }
}
