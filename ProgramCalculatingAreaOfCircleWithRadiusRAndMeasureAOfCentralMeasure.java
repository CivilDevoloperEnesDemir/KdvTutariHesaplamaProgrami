import java.util.Scanner;

public class ProgramCalculatingAreaOfCircleWithRadiusRAndMeasureAOfCentralMeasure {

    public static void main(String[] args) {

        Scanner variable = new Scanner(System.in);

        double r , a , area ;

        System.out.print("Please enter the radius of the circle : ");
        r = variable.nextDouble();
        System.out.print("Enter the central angle measure of the circle segment : ");
        a = variable.nextDouble();

        // Formula : (𝜋 * (r*r) * 𝛼) / 360

        area = ( Math.PI * Math.pow(r,2) * a ) / 360 ;

        System.out.print("The area of the circle segment is : "+area);


    }
}