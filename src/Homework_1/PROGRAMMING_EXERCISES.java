package Homework_1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PROGRAMMING_EXERCISES {
    public static int fibonacci(int n) {
        if (n < 0) return -1;
        else if (n == 1 || n == 2) {
            return 1;
        } else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void displayFibonacci(int numberOfFibonacci) {
        for (int i = 1; i <= numberOfFibonacci; i++) {
            System.out.println(String.format("Number %s of fibonacci: %s", i, fibonacci(i)));
        }
    }

    public static void averageFibonacci(int numberOfFibonacci) {
        int sum = 0;
        for (int i = 1; i <= numberOfFibonacci; i++) {
            sum = sum + fibonacci(i);
        }
        System.out.println("Average of 20 Fibonacci numbers: " + sum / numberOfFibonacci);
    }

    public static void isOddOrEven(int n) {
        if (n / 2 == 0) {
            System.out.println("Number is even");
        } else System.out.println("Number is Odd");
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }

    public static int multiplyOfTwoNumbers(int a, int b) {
        return a - b;
    }

    public static int subtractOfTwoNumbers(int a, int b) {
        return a * b;
    }

    public static int divideOfTwoNumbers(int a, int b) {
        return a / b;
    }

    public static int remainderOfTwoNumbers(int a, int b) {
        return a % b;
    }

    public static void calculateOfTwoNumber(int a, int b) {
        System.out.println("Sum of a,b: " + sumOfTwoNumbers(a, b));
        System.out.println("Multiply of a,b: " + multiplyOfTwoNumbers(a, b));
        System.out.println("Subtract of a,b: " + subtractOfTwoNumbers(a, b));
        System.out.println("Divide of a,b: " + divideOfTwoNumbers(a, b));
        System.out.println("Remainder of a,b: " + remainderOfTwoNumbers(a, b));
    }

    public static String reserveInputString(String inputString) {
        String reserveString = "";
        char ch;
        for (int i = 0; i < inputString.length(); i++) {
            ch = inputString.charAt(i);
            reserveString = ch + reserveString;
        }
        return reserveString;
    }

    public static String getCurrentTimeStamp() {
        return new SimpleDateFormat("yyyy/MMM/dd - HH:mm:ss").format(new Date());
    }

    public static void showExercise() {
        System.out.println("1. display the first 20 Fibonacci numbers and average of them");
        System.out.println("2. Print the sum (addition), multiply, subtract, divide and remainder of two\n" +
                "user supplied numbers");
        System.out.println("3. Print out the length of an input string");
        System.out.println("4. Check number is odd or even");
        System.out.println("5. Check a number is a prime or not");
        System.out.println("6. Reverse an input string");
        System.out.println("7. Print out the current time with format <full year>/<Short name of month>/<day number> -\n" +
                "<hour>:<minute>:<second>”\n");
        System.out.print("Choose : ");
    }


    public static void main(String[] args) {

        int choose;
        Scanner input = new Scanner(System.in);

        do {
            showExercise();
            choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    displayFibonacci(20);
                    averageFibonacci(20);
                    System.out.println("****************************************************************************");
                    break;
                case 2:
                    System.out.print("Enter number a = ");
                    int a = input.nextInt();
                    System.out.print("Enter number b = ");
                    int b = input.nextInt();
                    calculateOfTwoNumber(a, b);
                    System.out.println("****************************************************************************");
                    break;
                case 3:
                    System.out.print("Enter input string: ");
                    String inputString = input.nextLine();
                    System.out.println(String.format("Length of input string '%s' : %s ", inputString, inputString.length()));
                    System.out.println("****************************************************************************");
                    break;
                case 4:
                    System.out.print("Enter number needs check is Odd or Even = ");
                    int number = Integer.parseInt(input.nextLine());
                    isOddOrEven(number);
                    System.out.println("****************************************************************************");
                    break;
                case 5:
                    System.out.print("Enter number needs check is a prime: ");

                    int numberCheckPrime = Integer.parseInt(input.nextLine());
                    if (isPrime(numberCheckPrime)) System.out.println(numberCheckPrime + " is a prime");
                    else System.out.println(numberCheckPrime + " is not a prime");
                    System.out.println("****************************************************************************");
                    break;
                case 6:
                    System.out.println(". Write a method to reverse an input string.");
                    System.out.print("Enter inputString: ");
                    String inputString2 = input.nextLine();
                    System.out.println(reserveInputString(inputString2));
                    System.out.println("****************************************************************************");
                    break;
                case 7:
                    System.out.println(getCurrentTimeStamp());
                    break;
                default:
                    System.out.println("input fail");
            }
        } while (choose != 7);
    }
}

