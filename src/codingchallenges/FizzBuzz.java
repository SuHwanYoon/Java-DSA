package codingchallenges;

import java.util.Scanner;

public class FizzBuzz {
    //Write a short program that prints each number from 1 to 100 on a new line.
    //
    //For each multiple of 3, print "Fizz" instead of the number.
    //
    //For each multiple of 5, print "Buzz" instead of the number.
    //
    //For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter 0 to exit or 1 to run FizzBuzz: ");

            while (!scanner.hasNextInt()) {
                System.out.println("That's not a number!");
                scanner.next(); // this is important to consume the invalid input
                System.out.print("Enter 0 to exit or1 to run FizzBuzz: ");
            }

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter a number for FizzBuzz: ");
                int n = scanner.nextInt();
                printFizzBuzz(n);
            } else if (choice != 0) {
                System.out.println("Invalid choice. Please enter 0 or 1.");
            }
        } while (choice != 0);

        System.out.println("Exiting program.");
        scanner.close();
    }

    public static void printFizzBuzz(int n){
        for (int i=1; i<=n ; i++ ){
            if ((i%3==0)&&(i%5==0)){
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
