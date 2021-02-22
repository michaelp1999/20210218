package com.company;

import java.util.Scanner;

public class LuxuryTaxCalculator {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("enter the salary for Player 1:");
        float num1 = user_input.nextFloat();
        System.out.print("enter the salary for Player 2:");
        float num2 = user_input.nextFloat();
        System.out.print("enter the salary for Player 3:");
        float num3 = user_input.nextFloat();

        float sum = num1 + num2 + num3;
        System.out.println("the sum of the salaries for the team is: " + sum);

        int team_budget = 40000000;

        if (sum > team_budget) {
            float lux_tax = (float) ((sum - team_budget) * 0.18);
            System.out.println("the lux tax is: " + lux_tax);
        }

    }
}
