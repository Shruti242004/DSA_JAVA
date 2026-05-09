package Basics;
import java.util.Scanner;
public class sumoftwo {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter principle");
       double p = sc.nextDouble();
       System.out.println("Enter rate");
       double r = sc.nextDouble();
       System.out.println("Enter time");
       double t = sc.nextDouble();

       System.out.println(p*r*t/100);

    }
}
