package Basics;

import java.util.Scanner;

public class Swapno {
    public static void main() {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+ " "+b);
    }
}
