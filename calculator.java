
import java.util.Scanner;
class calculator extends geoarea{
    void add(int a,int b){
        System.out.println("Addition "+(a+b));
    }
    void substract(int a,int b){
        System.out.println("Substraction "+(a-b));
    }
    void multi(int a,int b){
        System.out.println("product "+(a*b));
    }
    void division(int a,int b){
        System.out.println("division "+(a/b));
    }
    public static void main(String args[]){
        System.out.println("Enter two numbers");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        calculator c=new calculator();
        c.add(a,b);
        c.substract(a,b);
        c.multi(a,b);
        c.division(a,b);
        System.out.println("area of square is "+c.sq_area(3));
      System.out.println("area of triangle is "+c.tri_area(4,5));
    }
}


