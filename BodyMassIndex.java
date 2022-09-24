import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double height , weight , bmi ;
        // Formula = weight / height * height
        System.out.print("What is your body weight as kilogram : ");
        weight = inp.nextDouble();
        System.out.print("What is your height as meter : ");
        height = inp.nextDouble();

        bmi = weight / Math.pow(height,2);

        System.out.print("Your body mass index is : "+bmi);



    }
}
