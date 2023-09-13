// A) Write a java Program to accept ‘n’ no’s through command line and store only armstrong no’s into the array and display that array.
public class slip17_1 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 0; i < args.length; i++) {
            int n=Integer.parseInt(args[i]);
            int n1=n;
            int s=0;
            while(n>0){
               int d=n%10;
               s=s+d*d*d;
               n=n/10;
            }
            if(s==n1){
               count++;
            }
        }
        int a[]=new int[count];
        int j=0;
        for (int i = 0; i < args.length; i++) {
            int n=Integer.parseInt(args[i]);
            int n1=n;
            int s=0;
            while(n>0){
               int d=n%10;
               s=s+d*d*d;
               n=n/10;
            }
            if(s==n1){
               a[j++]=s;
            }
        }
        for (int index = 0; index < a.length; index++) {
            System.out.println(a[index]);
        }
    }
}
