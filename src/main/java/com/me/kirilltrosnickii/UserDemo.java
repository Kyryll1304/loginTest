package com.me.kirilltrosnickii;

import java.util.Scanner;

public class UserDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 3) {
            try {
                System.out.print("Enter login: ");
                String login = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                System.out.print("Confirm password: ");
                String confirmPassword = scanner.nextLine();
                User user = new User(login, password, confirmPassword);
                System.out.println("User created successfully!");
                break;
            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println(e.getMessage());
                count++;
            } finally {
                if (count == 3) {
                    System.out.println("Sorry, you have exceeded the maximum number of attempts. Program will exit.");
                } else {
                    System.out.println("Please try again.");
                }
            }
        }
        System.out.println("Thank you for using our service.");
    }
}
