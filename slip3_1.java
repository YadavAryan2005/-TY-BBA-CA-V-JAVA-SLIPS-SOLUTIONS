// A) Write a ‘java’ program to check whether given number is Armstrong or not.
// (Use static keyword) 
import java.util.Scanner;
class slip3_1
{
    static int armstrong(int num)
    {
        int d,s=0;
        while(num>0){
            d=num%10;
            s=s*10+d;
            num=num/10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int num,num1;
        num=sc.nextInt();
        num1=armstrong(num);
        if(num==num1){
            System.out.println("number is armstrong");
        }else{
            System.out.println("number is not armstrong");
        }
        
    }
}