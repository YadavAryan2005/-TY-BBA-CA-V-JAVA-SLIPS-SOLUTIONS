// A) Write a java program to display alternate character from a given string
import java.util.*;
public class slip4_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string:");
        String s=sc.nextLine();
        System.out.println("alternative charecter are:");
        for(int i=0;i<s.length()-1;i=i+2){
        System.out.print(s.charAt(i));
        } 
    }
}
