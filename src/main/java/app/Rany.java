package app;

import java.util.Scanner;

public class Rany {
    public static void practice(){
//        1
        int []number={1,2,3,4,5};
        for(int num:number) {
            System.out.println(num);
        }
//        2
        System.out.println("----------------------------------------------------------------");
        int[] numbers=new int [1000];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=(i+1)*7;
        }
        for (int i=0; i<1000;i++){
            System.out.println(numbers[i]+"");
        }
//        3
        System.out.println("----------------------------------------------------------------");
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter your number:");
        int Num=scanner.nextInt();
        if (Num %2==0){
            System.out.println(Num+"number is even");

        }
        else {
            System.out.println(Num+"number is odd");
        }
//        4
        System.out.println("----------------------------------------------------------------");
        int a=3,b=4,c=5;
        if (a==b && b==c){
            System.out.println("Equilateral");
        } else if (a==b || a==c ||b==c) {
            System.out.println("Isosceles");
        }else {
            System.out.println("Scalene triangle");
        }
//        5
        System.out.println("----------------------------------------------------------------");
        Scanner Score1=new Scanner(System.in);
        System.out.print("Enter your score:");
        int score=Score1.nextInt();
        if (score>=95){
            System.out.println("Gread:A");
        } else if (score>=85) {
            System.out.println("Gread:B");
        } else if (score>=75) {
            System.out.println("Gread:C");
        }else if (score>=65) {
            System.out.println("Gread:D");
        }else if (score>=50) {
            System.out.println("Gread:E");
        }else {
            System.out.println("Gread:F");
        }
//        6
        System.out.println("----------------------------------------------------------------");
        Scanner Month=new Scanner(System.in);
        System.out.print("Enter a mounth number (1-12):");
        int Monthnumber=Month.nextInt();
        switch (Monthnumber){
            case 1:
                System.out.println("Month:January");
                break;
            case 2:
                System.out.println("Month:February");
                break;
            case 3:
                System.out.println("Month:march");
                break;
            case 4:
                System.out.println("Month:April");
                break;
            case 5:
                System.out.println("Month:May");
                break;
            case 6:
                System.out.println("Month:June");
                break;
            case 7:
                System.out.println("Month:July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("Month:September");
                break;
            case 10:
                System.out.println("Month:October");
                break;
            case 11:
                System.out.println("Month:November");
                break;
            case 12:
                System.out.println("Month:December");
                break;
        }
        System.out.println("----------------------------------------------------------------");
    }
}
