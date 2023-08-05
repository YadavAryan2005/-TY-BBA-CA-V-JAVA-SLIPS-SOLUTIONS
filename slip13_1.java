// A) Write a java program to accept ‘n’ integers from the user & store them in an
// ArrayList collection. Display the elements of ArrayList collection in reverse order

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class slip13_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<Integer>();
        System.out.print("enter limit:");
        int limit=sc.nextInt();
        System.out.println("enter arraylist element:");
        for (int i = 0; i < limit; i++) {
            int num=sc.nextInt();
            al.add(num);
        }
        System.out.println("reverse arraylist is :");
        Collections.reverse(al);
        System.out.println(al);
    }
}
