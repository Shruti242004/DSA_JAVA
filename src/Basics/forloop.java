package Basics;
import java.util.Scanner;
public class forloop {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n =sc.nextInt();

//        Print even number from 1 to 100
//        for(int i=1; i<=100; i++){
//            if(i%2==0)
//            System.out.println(i);
//        }

//        Print table of 17
//        for(int i = 1;i<=10; i++){
//            System.out.println(i*17 +" ");
//        }

//        Ques. Print number from n  to 1
//        for(int i=100 ; i>= 1; i--)
//        {
//            System.out.println(i);
//        }
//        Ques. Display this AP - 2,5,8,11.. upto 'n' terms
//            int a=2 , d = 3;
//            for (int i = 1; i<=n; i++){
//            System.out.println(a+ " ");
//            a += d;
//        }

//        Ques. Print this series - 99,95,91,87,.. upto all terms which are positive
//         int a= 99, d= -4;
//         for(int i=a; i>=1; i+=d)
//        System.out.println(i);

//        Display this GP- 1,2,4,8.. upto 'n' terms
//        int a=1, r=2;
//        for(int i=1; i<=n; i ++) {
//            System.out.println(a);
//            a*=r;
//        }

//        Take 'n' as input from user and print the following sequence.. 1,n,2,n-1,3,n-3...
//        int a= 1;
//        int b=n;

//        Print all alphabets with their corresponding ASCII values.
//        for(int i = 65; i<=90; i++){
//            System.out.println((char)i + " " + i);
//        }

//        WAP TO CHECK IF A NUMBER IS COMPOSITE OR NOT
//        for (int i= 2; i<=n-1;i++){
//            if(n%i == 0){
//                System.out.println("Composite number");
//                break;
//            }
//        }

//        WAP TO CHECK IF A NUMBER IS PRIME OR NOT
        boolean flag= true; //true means prime
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
              flag=false; // false means composite number
              break;
            }
        }
        if(n==1) System.out.println("Neither prime nor composite number");
        else if(flag==true) System.out.println("Prime Number");
        else if (flag==false) System.out.println("Composite number");

    }
}
