// A) Write a java program to calculate sum of digits of a given number using recursion.
public class slip16_1 {
    public static int sumofdigit(int n,int s)
    {
      if(n==0)
       return s;
      else
       return s+n%10+sumofdigit(n/10, s);
    }
    public static void main(String[] args) {
        System.out.println(sumofdigit(234,0));
    }
}
