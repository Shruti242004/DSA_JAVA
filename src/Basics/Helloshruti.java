package Basics;
import java.util.Scanner;

public class Helloshruti {
    public static void main(String[] args) {
       //Area of circle pi*r*r
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        double numb = sc.nextDouble();
        double square = numb * numb;
        System.out.print("The Square is: ");
        System.out.println(square);
    }
}

