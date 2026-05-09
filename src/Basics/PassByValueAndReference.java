package Basics;

public class PassByValueAndReference {
    public static void change(int x) {
        x=10;
    }
   public static void main() {
       int x = 6;
       System.out.println(x);
        change(6);
       System.out.println(x);
    }
}
