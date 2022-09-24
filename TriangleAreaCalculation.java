import java.util.Scanner;
public class TriangleAreaCalculation {
    public static void main(String[] args) {


    double fe,se,te,u,a ;
    Scanner enter = new Scanner(System.in);
    System.out.print("Please enter the First Edge of the Triangle : ");
    fe = enter.nextDouble();
    System.out.print("Please enter the Second Edge of the Triangle : ");
    se = enter.nextDouble();
    System.out.print("Please enter the Third Edge of the Triangle : ");
    te = enter.nextDouble();

        /*
        .....................................
        Circumference of the Triangle = 2u
        u = (a+b+c)/2
        Area*Area = u*(u-a)*(u-b)*(u-c)
        .....................................
        */

      u = (fe+se+te)/2;
      a = Math.sqrt((u*(u-fe)*(u-se)*(u-te)));

      System.out.println("The Circumference of the Triangle is : "+2*u);
      System.out.println("The area of the Triangle is : "+a);


    }
}

