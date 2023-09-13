// A) Write a Java program to calculate factorial of a number using recursion.

import java.util.Scanner;

public class slip22_1 {
    public static int factorial(int n){
      if(n==1)
       return n;
      else
       return n=n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no :");
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
}
