package app;

import java.util.Scanner;

public class Borey {
    public static Scanner cin = new Scanner(System.in);

    public static void practice() {
        System.out.println("----------------------------------------------------");
        System.out.println("Exercise1");

        System.out.print("Enter Number=");
        int aa = new Scanner(System.in).nextInt();
        if (aa % 2 == 0) {
            System.out.println("Odd is =" + aa);
        } else {
            System.out.println("Even is =" + aa);
        }
    }

    public static void practice1() {
        System.out.println("----------------------------------------------------");
        System.out.println("Exercise2");
        System.out.println("Find of the triangle");
        System.out.print("Enter A=");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Enter B=");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Enter C=");
        int c = new Scanner(System.in).nextInt();
        if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        } else if (a == b && b != c) {
            System.out.println("Isosceles triangle");
        } else if (a != b && b != c) {
            System.out.println("Scalene triangle");
        } else {
            System.out.println("invalid");
        }

    }

    public static void practice2() {
        System.out.println("----------------------------------------------------");
        System.out.println("Exercise1");
        System.out.print("Enter Score History=");
        int h = new Scanner(System.in).nextInt();
        System.out.print("Enter Score Math=");
        int m = new Scanner(System.in).nextInt();
        System.out.print("Enter Score Science=");
        int s = new Scanner(System.in).nextInt();
        int to = (h + m + s) / 3;
        System.out.println(to);
        if (to > 0 && to <= 100) {
            if (to <= 100 && to >= 90) {
                System.out.println("Score A");
            } else if (to < 90 && to >= 80) {
                System.out.println("Score B");
            } else if (to < 80 && to >= 70) {
                System.out.println("Score C");
            } else if (to < 70 && to >= 60) {
                System.out.println("Score D");
            } else if (to < 60 && to > 0) {
                System.out.println("Score E");
            } else {
                System.out.println("Invalid");
            }
        }
    }

    public static void practice3() {
        System.out.println("----------------------------------------------------");
        System.out.println("Month");
        System.out.print("Enter of the month=");
        int n = new Scanner(System.in).nextInt();
        switch (n) {
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
        }
    }

    public static void practice4() {
        System.out.println("----------------------------------------------------");
        System.out.println("================Color================");
        System.out.print("Enter Color=");
        String color = new Scanner(System.in).next();
        switch (color) {
            case "red":
                color = "stop";
                break;
            case "green":
                color = "go";
                break;
            case "yellow":
                color = "flow down";
                break;
        }
        System.out.println("Please you're =" + color);
    }

    public static void practice5() {
        System.out.println("=======================================================");
        System.out.print("Enter month =");
        int month = new Scanner(System.in).nextInt();
        switch (month) {
            case 1:
                month = 31;
            case 2:
                month = 28;
            case 3:
                month = 31;
            case 4:
                month = 30;
            case 5:
                month = 31;
            case 6:
                month = 30;
            case 7:
                month = 31;
            case 8:
                month = 30;
            case 9:
                month = 31;
            case 10:
                month = 30;
            case 11:
                month = 31;
            case 12:
                month = 30;
        }
        System.out.println("Day of the month =" + month);

    }

    public static void practice6() {
        int n = 10;
        int sub;
        for (int i = 1; i <= 10; i++) {
            sub = 3 * i;
            System.out.println("3 * " + i + " = " + sub);
        }

    }

    public static void practice7() {
        int num = 20;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                System.out.print(i + ",\t");
            }
        }
    }

    public static void practice8() {
        System.out.print("Enter 2d array=");
        int first = cin.nextInt();
        int sum = 0;
        int[][] arr = new int[first][first];
        System.out.println("===========================================================");
        for (int i = 0; i < first; i++) {
            for (int j = 0; j < first; j++) {
                System.out.print("Enter element of 2d arrays[" + i + "][" + j + "] =");
                arr[i][j] = cin.nextInt();
                sum += arr[i][j];
            }
        }
        System.out.println("============================================================");
        System.out.println("Sum value of the array 2d =" + sum);

    }

    public static void practice9() {
        System.out.print("Entetr number =");
        int num = cin.nextInt();
        int revers =0;
        while (num !=0){
            int digit = num %10;
            revers = revers * 10+ digit;
            num /=10;
        }
        System.out.println("========================================================");
        System.out.print("Result is ="+revers);
    }

    public static void practice10() {
        int pass;int i=0;
        do {
            ++i;
            System.out.print("Enter password =");
            pass = cin.nextInt();
                if (pass == 123){
                    System.out.println("Successfully");
                    break;
                }
                if(i==3){
                System.out.println("Wrong password");
                break;
            }
        }while (true);


    }

    public static void practice11() {
        int arr[] ={1,2,3,4,5,6,7,8,9,10};
        for (int i=0; i< arr.length; i++){
            if (arr[i] ==7){
                break;
            }
            System.out.println(arr[i]);

        }
    }

    public static void practice12() {

    }

    public static void practice13() {

    }

}
