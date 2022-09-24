import java.util.Scanner;
public class TheProgramCalculatingThePerimeterAndAreaOfTheCircle {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);

        // Area Formula = π * r * r  , Perimeter Formula = 2 * π * r

        double r,area,perimeter;

        System.out.print("To calculate the perimeter and the area " +
                "of the circle please enter radius : ");
        r = variable.nextDouble();
        area = Math.PI * Math.pow(r,2);
        perimeter = 2 * Math.PI * r;

        System.out.println("The area of the circle is : "+area);
        System.out.print("The perimeter of the circle is : "+perimeter);




    }
}
