// B) Define a class Product (pid, pname, price, qty). Write a function to accept the product details, display it and calculate total amount. (use array of Objects)

import java.util.Scanner;

class product
{
    int id,price,qty;
    String pname;
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter product id:");
        id=sc.nextInt();
        System.out.println("enter product name");
        pname=sc.next();
        System.out.println("enter price of product");
        price=sc.nextInt();
        System.out.println("enter qty of product");
        qty=sc.nextInt();
    }
    static void display(product p[],int n)
    {
        System.out.print("id\t pname\t price\t qty\t total \n");
        for (int i = 0; i < n; i++) {
            System.out.print(p[i].id+"\t"+p[i].pname+"\t"+p[i].price+"\t"+p[i].qty+"\t"+p[i].price*p[i].qty+"\n");
        }
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit:");
        int n=sc.nextInt();
        product p[]=new product[n];
        product p1=new product();
        for (int i = 0; i < n; i++) {
            p[i]=new product();
            p[i].accept();
        }
       display(p, n);
    }  
}
