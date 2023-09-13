// A) Write a Java program to display Fibonacci series using function.

import java.util.Scanner;

public class slip19_1 {
    public static void fibonacci(int n){
       int f=0;
       int s=1;
       int t;
       while(n>0){
         System.out.println(f);
         t=f+s;
         f=s;
         s=t;
         n--;
       }
          
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit:");
        int n=sc.nextInt();
        fibonacci(n);
    }
}
