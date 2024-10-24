package app;

import java.util.Scanner;

public class Soknem {
    private static Scanner scanner = new Scanner(System.in);
    public static void ifElsePractice1(){
        System.out.println("-----------------------");
        System.out.println("Find odd even number");
        System.out.println("-----------------------");
        System.out.print("Enter number to check: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }

    }

    public static void ifElsePractice2(){

        System.out.print("Enter number1: ");
        int a = scanner.nextInt();
        System.out.print("Enter number2: ");
        int b = scanner.nextInt();
        System.out.print("Enter number3: ");
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }

    }
    public static void legacySwitchCasePractice1(){
        int score = 85;
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            default:
                System.out.println("Grade: D");
        }


    }
    public static void legacySwitchCasePractice2(){
        int month = 4;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
        }


    }
    public static void newSwitchCasePractice1(){
        String color = "red";
        String result = switch (color) {
            case "red" -> "Stop";
            case "green" -> "Go";
            case "yellow" -> "Slow Down";
            default -> "Invalid color";
        };
        System.out.println(result);


    }
    public static void newSwitchCasePractice2(){

        int month = 2, year = 2024;
        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28;
            default -> throw new IllegalArgumentException("Invalid month");
        };
        System.out.println("Days in month: " + days);

    }
    public static void forLoopPractice1(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("3 x " + i + " = " + (3 * i));
        }


    }
    public static void forLoopPractice2(){

        for (int i = 2; i <= 20; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }

    }
    public static void foreachLoopPractice1(){

        int[] arr = {1, 2, 3, 4, 5};
        for (int num : arr) {
            System.out.println(num);
        }


    }
    public static void foreachLoopPractice2(){

        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
        int sum = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                sum += num;
            }
        }
        System.out.println("Sum: " + sum);


    }
    public static void whileLoopPractice1(){

        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }


    }
    public static void whileLoopPractice2(){

        int x = 12345;
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        System.out.println("Reversed: " + reversed);


    }
    public static void doWhileLoopPractice1(){

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 3);


    }
    public static void doWhileLoopPractice2(){

        Scanner sc = new Scanner(System.in);
        String password;
        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();
        } while (!password.equals("java123"));
        System.out.println("Access granted");


    }
    public static void breakKeywordPractice1(){

        int[] arr = {1, 3, 7, 9};
        for (int num : arr) {
            if (num == 7) {
                System.out.println("Found 7, breaking out of loop");
                break;
            }
            System.out.println(num);
        }


    }
    public static void breakKeywordPractice2(){

        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j % 4 == 0) {
                    System.out.println("Breaking out of outer loop");
                    break outerLoop;
                }
            }
        }


    }
    public static void continueKeywordPractice1(){

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }


    }
    public static void continueKeywordPractice2(){

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == j) {
                    continue;
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }


    }
}
