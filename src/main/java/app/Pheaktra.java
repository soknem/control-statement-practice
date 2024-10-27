package app;
import java.util.Scanner;
public class Pheaktra {
    public static void practice()
  {
        Scanner scanner = new Scanner(System.in);

        // P1
        System.out.print("Enter a number : ");
        int x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println(x + " is even.");
        } else {
            System.out.println(x + " is odd.");
        }
        scanner.close();

        //P2
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a  : ");
        int a = scanner.nextInt();
        System.out.print("Enter b  : ");
        int b = scanner.nextInt();
        System.out.print("Enter c  : ");
        int c = scanner.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("must be positive numbers.");
        } else if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }

        scanner.close();


      //P3
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter the score: ");
      int score = scanner.nextInt();
      char grade;
      switch (score / 10)
      {
          case 10:
          case 9 :
              grade = 'A';
              break;
          case 8 :
              grade = 'B';
              break;
          case 7 :
              grade = 'C';
              break;
          case 6 :
              grade = 'D';
              break;
          case 5:
          case 4:
          case 3:
          case 2:
          case 1:
          case 0:
              grade = 'F';
              break;
          default:
              grade = 'X';
              break;
      }
      if (grade != 'X')
      {
          System.out.println("Score = " + score);
          System.out.println("Grade : " + grade);
      } else
      {
          System.out.println("Invalid score entered.");
      }

      scanner.close();


      //P4
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter a month number (1-12) : ");
      int month = scanner.nextInt();
      String monthName;
      switch (month)
      {
          case 1:
              monthName = "January";
              break;
          case 2:
              monthName = "February";
              break;
          case 3:
              monthName = "March";
              break;
          case 4:
              monthName = "April";
              break;
          case 5:
              monthName = "May";
              break;
          case 6:
              monthName = "June";
              break;
          case 7:
              monthName = "July";
              break;
          case 8:
              monthName = "August";
              break;
          case 9:
              monthName = "September";
              break;
          case 10:
              monthName = "October";
              break;
          case 11:
              monthName = "November";
              break;
          case 12:
              monthName = "December";
              break;
          default:
              monthName = "Invalid month number";
              break;
      }
      System.out.println("Month = " + month);
      System.out.println("Month : " + monthName);

      scanner.close();

      //P5
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a color (red, green, yellow): ");
      String color    = scanner.nextLine().toLowerCase();
      String action   = switch (color)
      {
          case "red"    -> "stop";
          case "green"  -> "go";
          case "yellow" -> "slow down";
          default       -> "invalid color";
      };
      System.out.println("Color = " + color + " : " + action);
      scanner.close();


      //P6
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the month (1-12)  : ");
      int month = scanner.nextInt();
      System.out.print("Enter the year: ");
      int year = scanner.nextInt();
      int days = switch (month)
      {
          case 1, 3, 5, 7, 8, 10, 12 -> 31;
          case 4, 6, 9, 11           -> 30;
          case 2                     -> ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28 );
          default                    -> 0;
      };
      if (days == 0) {
          System.out.println("Invalid month entered.");
      } else {
          System.out.println("Days in month : " + days);
      }
      scanner.close();


      //P6
      int number = 3;
      for (int i = 1; i <= 10; i++)
      {
          int result = number * i;
          System.out.println(number + " x " + i + " = " + result);
      }

      //P7
      System.out.print("Prime numbers between 1 and 20  : ");
      for (int num = 2; num <= 20; num++) {
          boolean isPrime = true;
          for (int i = 2; i <= Math.sqrt(num); i++) {
              if (num % i == 0) {
                  isPrime = false;
                  break;
              }
          }
          if (isPrime) {
              System.out.print(num + (num < 19 ? ", " : ""));
          }
      }

      //P8
      int[] arr = {1, 2, 3, 4, 5};
      for (int element : arr)
      {
          System.out.println(element);
      }

      //P9
      int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
      int sum = 0;
      for (int[] row : matrix)
      {
          for (int element : row)
          {
              sum += element;
          }
      }
      System.out.println("Sum   : " + sum);

      //P10
      int number = 1;
      while (number <= 5)
      {
          System.out.println(number);
          number++;
      }

      //P11
      int x        = 12345;
      int reversed = 0;
      while (x != 0)
      {
          int digit = x % 10;
          reversed  = reversed * 10 + digit;
          x /= 10;
      }
      System.out.println("Reversed  : " + reversed);

      //P12
      int number = 1;
      do
      {
          System.out.println(number);
          number++;
      } while (number <= 3);

      //P13
      Scanner scanner = new Scanner(System.in);
      String password;
      do
      {
          System.out.print("Enter password: ");
          password = scanner.nextLine();
      } while (!password.equals("java123"));
      System.out.println("Access granted");
      scanner.close();

      //P14
      int[] arr = {1, 3, 7, 9};
      for (int i = 0; i < arr.length; i++)
      {
          if (arr[i] == 7)
          {
              System.out.println("Found 7, breaking out of loop");
              break;
          }
          System.out.println(arr[i]);
      }

      //P15
      for (int i = 1; i <= 10; i++)
      {
          for (int j = 1; j <= 5; j++)
          {
              int product = i * j;
              if (product % 4 == 0)
              {
                  System.out.println("Breaking out of outer loop");
                  break;
              }
          }
          if (i * 1 % 4 == 0) {
              break;
          }
      }

      //P16
      for (int i = 1; i <= 5; i++)
      {
          if (i == 3)
          {
              continue;
          }
          System.out.print(i + (i < 5 ? ", " : ""));
      }

      //P17
      for (int i = 1; i <= 3; i++)
      {
          for (int j = 1; j <= 3; j++)
          {
              if (i == j)
              {
                  continue;
              }
              System.out.println("i: " + i + ", j: " + j);
          }
      }
  }
}
