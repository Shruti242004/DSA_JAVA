package Basics;
import java.util.Scanner;
public class patternprinting {
    static void main() {
     Scanner sc= new Scanner(System.in);
//     int row= sc.nextInt();
//     int col= sc.nextInt();
//     for(int i= 1; i<=row; i++){ //kitni line hogi
//         for(int j= 1; j<=col; j++){  // har line m kitna print * hoga
//             System.out.print("* ");
//         }
//         System.out.println();
//     }

        /// SQUARE PATTERN PRINTING
//        int n= sc.nextInt();
//        for (int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        /// NUMBER SQUARE
//        int n= sc.nextInt();
//        for(int i= 1; i<=n; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        /// ALPHABET SQUARE
//        int n = sc.nextInt();
//        for(int i= 1; i<=n; i++){
//            for(int j = 1; j<=n; j++){
//                System.out.print((char)(j+64)+ " "); //Typecasting
//            }
//            System.out.println();
//        }

        /// NUMBER SQUARE 2
//        int row= sc.nextInt();
//        int col= sc.nextInt();
//        for (int i= 1; i<=row; i++){
//            for(int j=1; j<=col; j++){
//                System.out.print(i+ " ");
//            }
//            System.out.println();
//        }

        /// Capital & small alphabet square
//        int n= sc.nextInt();
//        for(int i=1; i<=n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (i % 2 == 0)
//                    System.out.print((char) (i + 64) +" ");
//                else
//                    System.out.print((char) (i+96) + " ");
//            }
//            System.out.println();
//        }

        /// Triangle
//        int n= sc.nextInt();
//        for(int i = 1; i<=n; i ++) {
//            for(int j= 1; j<=i; j++){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }

        /// Alphanumeric triangle
//        int n=sc.nextInt();
//        for(int i= 1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                if (i%2==0)
//                    System.out.print(j + " ");
//                else
//                    System.out.print((char)(j+64)+ " ");
//            }
//            System.out.println();
//        }

        /// Star triangle horizontally flipped
//        int n= sc.nextInt();
//        for(int i = 1; i<=n; i ++) {
//            for(int j= 1; j<=n+1-i; j++){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }

        /// Flipped alphabet triangle
//        int n= sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1;j<=n+1-i;j++){
//                System.out.print((char)(j+64)+ " ");
//            }
//            System.out.println();
//        }

        /// Hollow rectangle
//        int row= sc.nextInt();
//        int col= sc.nextInt();
//         for(int i= 1; i<=row; i++){
//         for(int j= 1; j<=col; j++){
//             if(i==1 || i==row || j == 1 || j==col)
//             System.out.print("* ");
//             else System.out.print("  ");
//         }
//         System.out.println();
//     }

        ///Star Plus
//        int n= sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                if( i== n/2 + 1 || j == n/2+1){
//                System.out.print("* ");}
//                else{
//                    System.out.print("  ");}
//            }
//            System.out.println();
//        }

        /// Star Cross
//        int n= sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                if( i==j || i+j==n+ 1){
//                System.out.print("* ");}
//                else{
//                    System.out.print("  ");}
//            }
//            System.out.println();
//        }

        /// Floyd's Triangle
//        int n= sc.nextInt();
//        int a=1;
//        for(int i= 1; i<=n; i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print(a + " ");
//                a++;
//            }
//            System.out.println();
//        }

        /// Binary Triangle
//        int n= sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                if((i+j) % 2==0){
//                System.out.print(1 + " ");}
//                else{
//                    System.out.print(0 + " ");}
//            }
//            System.out.println();
//        }

         /// Odd Number Triangle
//        int n= sc.nextInt();
//        for(int i= 1; i<=n; i++){
//            int a= 1;
//            for(int j = 1; j<=i; j++){
//                System.out.print(a+ " ");
//                a+=2;
//            }
//            System.out.println();
//        }

        /// Star Triangle Vertically Flipped
//        int n= sc.nextInt();
//        for(int i = 1; i<=n; i++){
//            for(int j = 1; j<=n; j++){
//                if(i+j > n )
//                    System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }

        /// Number Triangle Vertically Flipped: Method 1
//        int n= sc.nextInt();
//        for(int i = 1; i<=n; i++){
//            for(int j = 1; j<=n; j++){
//                if(i+j > n )
//                    System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }

        /// Method 2
//        int n= sc.nextInt();
//        for(int i = 1; i<=n; i++){
//            for(int j = 1; j<=n-i; j++) {
//                System.out.print("  ");
//            }
//            for(int j = 1; j<=i; j++){
//
//                 System.out.print("* ");
//            }
//            System.out.println();
//        }

        /// Vertically Flipped Number Triangle
//        int n= sc.nextInt();
//        for(int i = 1; i<=n; i++){
//            for(int j = 1; j<=n-i; j++) {
//                System.out.print("  ");
//            }
//            for(int j = 1; j<=i; j++){
//
//                System.out.print(j+ " ");
//            }
//            System.out.println();
//        }

        /// Alphabet Triangle Vertically Flipped
//        int n= sc.nextInt();
//        for(int i = 1; i<=n; i++) {
//            for(int j=1; j<=n-i; j++){
//                System.out.print("  ");
//            }
//            char ch= (char)('A' + i-1);
//            for(int j= 1; j<=i; j++){
//                System.out.print(ch+ " ");
//                ch++;
//            }
//            System.out.println();
//        }

        /// Rhombus
//        int n= sc.nextInt();
//        for(int i=1; i<=n; i++) { //lines
//            for(int j = 1; j<=n-i; j++){ //spaces
//                System.out.print(" "+ " ");
//            }
//            for (int j = 1; j <= n; j++) { //stars
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }

        /// Double Flipped Triangle **
//        int n= sc.nextInt();
//        for(int i=1; i<=n; i++) { //lines
//
//            for (int j = 1; j <= n; j++) { //stars
//                System.out.print(" " + " ");}
//                for(int j = 1; j<=n-i+1; j++){ //spaces
//                    System.out.print("*"+ " ");
//                }
//
//            System.out.println();
//        }

        /// Pyramid  Method 1
//        int n= sc.nextInt(); //lines
//        for(int i=1; i<=n; i++){  //spaces
//            for (int j=1; j<=n-i;j++){
//                System.out.print(" "+ " ");
//            }
//            for(int j=1; j<=2*i-1; j++){ //stars
//                System.out.print("*"+ " ");
//            }
//            System.out.println();
//        }

        /// Method 2
//      int n= sc.nextInt();
//      int nsp= n-1, nst=1;
//      for(int i=1; i<=n; i++){
//          for(int j=1; j<=nsp; j++){
//              System.out.print("  ");
//          }
//          for(int j= 1; j<=nst; j++){
//              System.out.print("*"+ " ");
//          }
//          nsp--;
//          nst += 2;
//          System.out.println();
//      }

        /// Diamond
//        int n= sc.nextInt();
//        int nsp= n-1, nst=1;
//      for(int i=1; i<=n; i++){
//          for(int j=1; j<=nsp; j++){
//              System.out.print("  ");
//          }
//          for(int j= 1; j<=nst; j++){
//              System.out.print("*"+ " ");
//          }
//          nsp--;
//          nst += 2;
//          System.out.println();
//      }
//        nsp= 1;
//        nst=2*n-3;
//      for(int i=1; i<=n; i++){
//          for(int j=1; j<=nsp; j++){
//              System.out.print("  ");
//          }
//          for(int j= 1; j<=nst; j++){
//              System.out.print("*"+ " ");
//          }
//          nsp++;
//          nst -= 2;
//          System.out.println();
//      }

        /// Bridge
//        int n=sc.nextInt();
//        for(int i= 1;i<=2*n-1; i++){
//            System.out.print("* ");
//        }
//        System.out.println();
//        int nsp= 1;
//        for(int i=1; i<=n-1; i++){ //lines
//          for(int j=1; j<=n-i; j++){  // stars
//              System.out.print("* ");
//          }
//          for(int j= 1; j<=nsp; j++){  //spaces
//              System.out.print(" "+ " ");
//          }
//          for(int j=1; j<=n-i; j++) {  //stars
//              System.out.print("* ");
//          }
//          nsp+=2;
//          System.out.println();
//      }

        /// Number Spiral
//        int n= sc.nextInt();
//        for(int i= 1; i<=2*n-1;i++){
//            for(int j= 1; j<=2*n-1; j++ ){
//                int a= i, b = j;
//                if(i>n) a=2*n-i;
//                if(j>n) b=2*n-j;
//                 System.out.print(Math.min(a,b)+  " ");
//
//            }
//            System.out.println();
//        }


    }
}
