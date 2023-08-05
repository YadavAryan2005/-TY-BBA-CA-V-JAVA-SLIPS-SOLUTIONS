// A) Write a java program to display all the vowels from a given string.
import java.util.Scanner;
class slip2_1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s1=sc.nextLine();
        int n=s1.length();
        for(int i=0;i<n-1;i++)
        {
            if(s1.charAt(i)=='a'||s1.charAt(i)=='A'||s1.charAt(i)=='e'||s1.charAt(i)=='E'||s1.charAt(i)=='i'||s1.charAt(i)=='I'||s1.charAt(i)=='o'||s1.charAt(i)=='O'||s1.charAt(i)=='u'||s1.charAt(i)=='U')
            {
                System.out.print(s1.charAt(i)+" ");
            }
        }
    }
}