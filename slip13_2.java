// B) Write a java program that asks the user name, and then greets the user by name.
// Before outputting the user's name, convert it to upper case letters. For example, if
// the user's name is Raj, then the program should respond "Hello, RAJ, nice to meet
// you!".

import java.util.Scanner;

public class slip13_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter user name:");
        String name=sc.next();
        System.out.println("Hellow,"+name.toUpperCase()+", nice to meet you!.");
    }
}
