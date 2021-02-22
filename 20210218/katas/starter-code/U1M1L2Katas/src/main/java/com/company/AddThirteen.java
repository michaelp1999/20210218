package com.company;

import java.util.Scanner;

public class AddThirteen {

    public static void main(String[] args) {
        System.out.println("please input a number... decimals also work!");
        Scanner user_input = new Scanner(System.in);
        float num1 = user_input.nextFloat();
        int num2 = 13;

        float sum = num1 + num2;
        System.out.println("the number you inputted plus 13 is: " + sum);

    }
}
