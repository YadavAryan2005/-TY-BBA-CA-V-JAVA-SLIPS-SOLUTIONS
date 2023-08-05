// Write a java Program to display following pattern:
// 1
// 0 1
// 0 1 0
// 1 0 1 0 
import java.util.*;
public class slip9_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit");
        int n=sc.nextInt();
        int k=1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(k==1){
                System.out.print(k+" ");
                k=0;
                }
                else{
                System.out.print(k+" ");
                k=1; 
                }
            }
            System.out.println();
        }
    }
    
}
