package Basics;
import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        //1. Take positive no. and tell its even or odd
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        double a = sc.nextDouble();
//        if ( a%2==0) {
//            System.out.println("Even no.");
//        }
//        else {
//            System.out.println("Odd no.");
//        }

        //2. Divisible by 5
//        if (a%5 == 0) {
//            System.out.println("Divisible by 5");
//        }
//        else
//            System.out.println("Not divisible by 5");
        //3. Take integer input and print the absolute value of that integer
//        if (a >= 0)
//            System.out.println(a);
//        else
//            System.out.println(-a);

        //4. Take real no. input and check if it is an integer or not
//        int b = (int) a;
//        if(a-b == 0)
//            System.out.println("It is an integer");
//        else
//            System.out.println("Not an integer");

        //5. If cost price and selling price of an item is input through the keyboard, write a program to determine whether the seller has made profit or incurred loss or
        //no profit no loss. Also determine how much profit he made or loss he incurred*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the selling price");
//        double sp = sc.nextDouble();
//        System.out.println("Enter the cost price");
//        double cp = sc.nextDouble();
//        if(sp > cp)
//            System.out.println("Profit " + (sp - cp));
//        if(cp > sp)
//            System.out.println("Loss " + (cp - sp));
//        if(sp==cp);
//        System.out.println("No profit No loss");

        //6. Take positive integer input and print some conditions
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the Number");
//        int a = sc.nextInt();
//        if(a % 5 == 0)
//            System.out.println("Divisible by 5");
//        else if (a % 3 == 0)
//            System.out.println("Divisible by 3");
//        else if (a % 5 == 0 && a % 3 == 0)
//            System.out.println("Divisible by 3 and 5");
//        else if (a% 3 != 0 || a % 5 != 0)
//            System.out.println("Not divisible by 3 and 5");

        //7. Take 3 positive integers input and tell if they can be the sides of triangle or not
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter 1st number: ");
//        int a= sc.nextInt();
//        System.out.println("Enter 2nd number: ");
//        int b= sc.nextInt();
//        System.out.println("Enter 3rd number: ");
//        int c= sc.nextInt();
//
//        if(a+b>c && b+c>a && c+a>b)
//            System.out.println("Valid Triangle");
//        else
//            System.out.println("Invalid Triangle");

//        7. Greatest of three number
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a= sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b= sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int c= sc.nextInt();

        if(a > b && a > c)
            System.out.println(a);
        else if (b > a && b > c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}
