// A) Write a Java program to calculate area of Circle, Triangle & Rectangle.(Use Method
// Overloading)
public class slip18_1 {
    static void area(int r){
        double area=3.14*r*r;
        System.out.println("area of circle is:"+area);
    }
    public static void area(int l,int b){
        double area=l*b;
        System.out.println("area of ractangle is:"+area);
    }
    public static void area(int b,int h,double a){
         double area=a*b*h;
        System.out.println("area of traingle is:"+area);
    }
    public static void main(String[] args) {
     area(6, 8, 0.5);   
    }
}
