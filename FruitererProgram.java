import java.util.Scanner;
public class FruitererProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        /*
        Pear: 2.14 €
        Apple : 3.67 €
        Tomatoes: 1.11 €
        Banana: 0.95 €
        Eggplant : 5.00 €
         */

        double  pear=2.14 , apple=3.67 , Tomato=1.11 , Banana=0.95 , Eggplant=5.00 ;
        double p , a , t , b , e , result ;
        System.out.print("How many kg pears did you buy : ");
        p = inp.nextDouble();
        System.out.print("How many kg apples did you buy : ");
        a = inp.nextDouble();
        System.out.print("How many kg tomatoes did you buy : ");
        t = inp.nextDouble();
        System.out.print("How many kg bananas did you buy : ");
        b = inp.nextDouble();
        System.out.print("How many kg eggplants did you buy : ");
        e = inp.nextDouble();

        result = p*pear + a*apple + t*Tomato + b*Banana + e*Eggplant ;

        System.out.println("Your total cost is : " + result +" €") ;


    }
}