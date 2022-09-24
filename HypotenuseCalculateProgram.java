import java.util.Scanner;
public class HypotenuseCalculateProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double FirstEdge , SecondEdge , Hypotenuse;

        System.out.print("Please Enter First Edge Length of Triangle: ");
        FirstEdge = inp.nextDouble();
        System.out.print("Please Enter Second Edge of Triangle : ");
        SecondEdge = inp.nextDouble();

        Double FESquare = Math.pow(FirstEdge,2);
        Double SESquare = Math.pow(SecondEdge,2);
        Hypotenuse = FESquare+SESquare;
        Hypotenuse = Math.pow(Hypotenuse,0.5);



        System.out.print("The Length of Hypotenuse is : " + Hypotenuse);





    }
}
