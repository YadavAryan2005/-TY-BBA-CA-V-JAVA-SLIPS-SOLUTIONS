// A) Write a java program to search given name into the array, if it is found then display
// its index otherwise display appropriate message.
import java.util.*;
public class slip15_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit:");
        int n=sc.nextInt();
        String s1[]=new String[n];   
        for (int i = 0; i < n; i++) {
            s1[i]=sc.next();     
        } 
        System.out.println("enter name for search:");
        String s2=sc.next();
        int j=0;
        for (int i = 0; i < n; i++) {
            if(s2.equals(s1[i]))
            {
                j=i;
            }
        }
        if(j==0)
        System.out.println("name not found in this array");
        else
        System.out.println("name found in position="+j);
    }
}
