package com.company;

import java.util.Scanner;

public class CommandLineGram {

    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.println("enter your first name");
        String first_name = user_input.nextLine();

        System.out.println("enter your last name");
        String last_name = user_input.nextLine();

        System.out.println("enter your email");
        String email = user_input.nextLine();

        System.out.println("enter your twitter handle");
        String twitter_handle = user_input.nextLine();

        System.out.println("enter your age");
        String age = user_input.nextLine();

        System.out.println("enter your country");
        String country = user_input.nextLine();

        System.out.println("enter your profession");
        String profession = user_input.nextLine();

        System.out.println("enter your favorite operating system");
        String favorite_operating_system = user_input.nextLine();

        System.out.println("enter your favorite programming language");
        String favorite_programming_language = user_input.nextLine();

        System.out.println("enter your favorite computer scientist");
        String favorite_computer_scientist = user_input.nextLine();

        System.out.println("enter your favorite keyboard shortcut");
        String Favorite_keyboard_shortcut = user_input.nextLine();

        System.out.println("have you ever built a computer? answer 'YES' or 'NO'");
        String Have_you_ever_built_your_own_computer = user_input.nextLine();

        System.out.println("If you could be any superhero, who would it be");
        String what_superhero_are_you = user_input.nextLine();

        System.out.println("Fist name: " + first_name);
        System.out.println("Last name: " + last_name);
        System.out.println("Email: " + email);
        System.out.println("Twitter Handle: " + twitter_handle);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
        System.out.println("Profession: " + profession);
        System.out.println("favorite operating system: " + favorite_operating_system);
        System.out.println("favorite programming lanauge: " + favorite_programming_language);
        System.out.println("Favorite computer scientist: " + favorite_computer_scientist);
        System.out.println("Favorite keyboard shortcut: " + Favorite_keyboard_shortcut);
        System.out.println("Have you ever built your own computer?: " + Have_you_ever_built_your_own_computer);
        System.out.println("If you could be any superhero, who would it be?: " + what_superhero_are_you);






    }
}
