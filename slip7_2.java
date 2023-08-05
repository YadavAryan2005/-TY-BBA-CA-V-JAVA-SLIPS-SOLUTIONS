// B) Write a java program to accept details of ‘n’ cricket player (pid, pname, totalRuns,
// InningsPlayed, NotOuttimes). Calculate the average of all the players. Display the
// details of player having maximum average. (Use Array of Object) 
import java.util.*;
public class slip7_2 {
    int pid,totalRuns,Inningsplayed,Notouttimes,avg;
    String pname;
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter player id:");
        pid=sc.nextInt();
        System.out.print("\n enter total runs:");
        totalRuns=sc.nextInt();
        System.out.println("enter total iningsplayed");
        Inningsplayed=sc.nextInt();
        System.out.println("enter not outtimes");
        Notouttimes=sc.nextInt();
        avg=totalRuns/Inningsplayed;
    }
    static void display(slip7_2 ob[],int n)
    {
        int average=ob[0].avg;
        int j=0;
        for(int i=1;i<n;i++)
        {
           if(ob[i].avg>average)
           {
            average=ob[i].avg;
            j=i;
           }
        }
        System.out.println(ob[j].pid);
        System.out.println(ob[j].totalRuns);
        System.out.println(ob[j].Inningsplayed);
        System.out.println(ob[j].Notouttimes);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit :");
        int n=sc.nextInt();
        slip7_2 ob[]=new slip7_2[n];
        for(int i=0;i<n;i++)
        {
            ob[i]=new slip7_2();
            ob[i].accept();
            
        }
        display(ob, n);  
    }
}
