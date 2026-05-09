package Basics;
import java.util.Scanner;
public class whileloop {    //Generally used when the condition are more then 1, When we dont know the iterations then use while loop
    static void main() {
///       WHILE LOOP
//     int n= 1;
//     while (n<=10){
//         System.out.println(n);
//         n++;
//     }

///       DO WHILE LOOP
//        int n= 1;
//        do {
//            System.out.print(n+ " ");
//            n++;
//        }while (n<=10);

        /// COUNT DIGITS OF A NUMBER
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int a = sc.nextInt();
//        int b= sc.nextInt();
//        int count= 0;
//        while(i!=0) {
//            i /= 10;
//            count++;
//        }
//        System.out.println(count);

///        PRINT SUM OF DIGITS OF A NUMBER
//        int sum=0;
//        while(i!=0) {
//            sum += i % 10;
//            i /= 10;
//        }
//            System.out.println(sum);

///     REVERSE A NUMBER
//        int rev=0;
//        while(i!=0){
//            rev*=10;
//            rev+=(i%10);
//            i /= 10;
//        }
//        System.out.println(rev);

///   FACTORIAL OF A NUMBER
//        int fact = 1;
//        for (int i = 1; i <= n; i++) {
//            fact *= i;
//        }
//        System.out.println(fact);

///   'A' RAISE TO THE POWER 'B'
//        int p = 1;
//        for(int i= 1; i<=b; i++){
//            p*=a;
//        }
//        System.out.println(p);

///   Print the sum of the number and its reverse
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int i= sc.nextInt();
        int rev= 0;
        int org = i;
        while(i!=0) {
            rev *= 10;
            rev += (i % 10);
            i /= 10;
        }
        System.out.println(rev);
        int sum = org + rev;
        System.out.println("The sum is" + sum);
    }
}