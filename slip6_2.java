// B) Write a java program to display transpose of a given matrix.
import java.util.*;
public class slip6_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row,col;
        System.out.println("enter row");
        row=sc.nextInt();
        System.out.println("enter column=");
        col=sc.nextInt();
        int a[][]=new int[row][col];
        System.out.println("enter your matrics");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("your transpose matrics is :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(a[j][i]);
            }
            System.out.println();
        }
    }
}
