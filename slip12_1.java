// A) Write a java program to display each String in reverse order from a String array.
import java.util.Scanner;
public class slip12_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1[]=new String[5];
        System.out.println("enter your string ");
        for (int i = 0; i < 5; i++) {
            s1[i]=sc.next();
        }
        for (int i = 0; i < 5; i++) {
            StringBuffer sb=new StringBuffer(s1[i]);
            System.out.print(sb.reverse()+" ");  
        }
    }
}
