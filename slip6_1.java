// A) Write a java program to accept a number from user, if it zero then throw user
// defined Exception “Number Is Zero”, otherwise calculate the sum of first and last digit
// of that number. (Use static keyword).
import java.util.*;
class numiszero extends Exception
{
    public String  toString()
    {
        return"number is zero";
    }
}
public class slip6_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int num=sc.nextInt();
        try {
            if(num==0)
            throw new numiszero();
            else{
            int f=num%10;
            int d,s=0;
            while(num>0)
            {
                d=num%10;
                s=s*10+d;
                num=num/10;
            }
            int se=s%10;
            System.out.println("addition of first and last digit of number=");
            System.out.println(f+se);
            }
        } catch (numiszero ne) {
            System.out.print(ne.toString());
        }
    }
}
