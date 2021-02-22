package com.company;

import java.util.Scanner;

public class DoubleAndAddFive {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("please input a number... decimals also work!");
        float num1 = user_input.nextFloat();
        int num2 = 5;

        float product =  num1 * 2;
        float sum = product + num2;

        System.out.println("Your inputted number doubled and then added five to it is: " + sum);
    }
}
