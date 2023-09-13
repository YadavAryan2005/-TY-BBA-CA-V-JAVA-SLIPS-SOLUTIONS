// A) Write a Java program to calculate power of a number using recursion.
import java.util.Scanner;
class slip14_1 {
    static int cal(int s,int num,int pow)
    {
        if(pow==1)
         return s;
        else
         return s=s*cal(s,num,pow-1);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        System.out.println("enter power");
        int pow=sc.nextInt();
        System.out.println(cal(num,num,pow));
    }
}
