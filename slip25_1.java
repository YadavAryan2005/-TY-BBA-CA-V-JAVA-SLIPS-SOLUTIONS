// A) Write a java program to check whether given string is palindrome or not.

import java.util.Scanner;

public class slip25_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s1=sc.next();
        StringBuffer s2=new StringBuffer(s1);
        s2.reverse();
        String s3=new String(s2);
        if(s1.compareTo(s3)==0)
        {
          System.out.println("string is palindrome");
        }
        else
        System.out.println("string is not palindrome");
    }
}
