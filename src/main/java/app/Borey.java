package app;

import java.util.Scanner;

public class Borey {
    public static void practice(){
        System.out.println("----------------------------------------------------");
        System.out.println("Exercise1");

        System.out.print("Enter Number=");
        int aa = new Scanner(System.in).nextInt();
        if(aa%2==0){
            System.out.println("Odd is ="+aa);
        }else{
            System.out.println("Even is ="+aa);
        }


        System.out.println("----------------------------------------------------");
        System.out.println("Exercise2");
        System.out.println("Find of the triangle");
        System.out.print("Enter A=");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Enter B=");
        int b = new Scanner(System.in).nextInt();
        System.out.print("Enter C=");
        int c = new Scanner(System.in).nextInt();
        if(a == b && b == c ){
            System.out.println("Equilateral triangle");
        } else if (a == b && b !=c) {
            System.out.println("Isosceles triangle");
        } else if (a !=b && b!=c) {
            System.out.println("Scalene triangle");
        } else {
            System.out.println("invalid");
        }

        System.out.println("----------------------------------------------------");
        System.out.println("Exercise1");
        System.out.print("Enter Score History=");
        int h= new Scanner(System.in).nextInt();
        System.out.print("Enter Score Math=");
        int m= new Scanner(System.in).nextInt();
        System.out.print("Enter Score Science=");
        int s= new Scanner(System.in).nextInt();
        int to = (h+m+s)/3;
        System.out.println(to);
        if(to >0 && to<=100){
            if(to <=100 && to >=90){
                System.out.println("Score A");
            } else if (to <90 && to>=80) {
                System.out.println("Score B");
            } else if (to <80 && to>=70) {
                System.out.println("Score C");
            } else if (to<70 && to>=60) {
                System.out.println("Score D");
            } else if (to<60 && to>0) {
                System.out.println("Score E");
            }else {
                System.out.println("Invalid");
            }
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Month");
        System.out.print("Enter of the month=");
        int n= new Scanner(System.in).nextInt();
        switch (n){
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



        System.out.println("----------------------------------------------------");
        System.out.println("================Color================");
        System.out.print("Enter Color=");
        String color= new Scanner(System.in).next();
        switch (color){
            case "red":
                color ="stop";
                break;
            case "green":
                color ="go";
                break;
            case "yellow":
                color = "flow down";
                break;
        }
        System.out.println("Please you're ="+color);

        System.out.println("=======================================================");
        System.out.print("Enter month =");
        int month = new Scanner(System.in).nextInt();
        switch (month){
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
        System.out.println("Day of the month ="+month);

    }
}
