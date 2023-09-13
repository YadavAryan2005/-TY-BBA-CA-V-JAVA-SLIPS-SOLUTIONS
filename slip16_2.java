// B) Write a java program to accept n employee names from user. Sort them in ascending order and Display them.(Use array of object and Static keyword)
import java.util.*;
class employee
{
    String s;
   public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter employee name");
        s=sc.next();
    }
}
public class slip16_2{
    public static void main(String[] args) {
        System.out.println("enter limit");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        employee e1[]=new employee[n];
        for (int i = 0; i < n; i++) {
            e1[i]=new employee();
            e1[i].accept();
        }
        for(int pass=1;pass<n;pass++){
            for (int i = 0; i < n-pass; i++) {
                String s1=e1[i].s;
                if(s1.compareTo(e1[i+1].s)>0){
                   String temp=e1[i+1].s;
                   e1[i+1].s=s1;
                   e1[i].s=temp;
                }
            }
        }
        System.out.println("employee names are arranged in ascending order is......");
        for (int i = 0; i < n; i++) {
            System.out.println(e1[i].s);
        }
    }
}
