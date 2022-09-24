import java.awt.print.Printable;
import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args){
        Scanner veri = new Scanner(System.in);

        // Km başı 2.20₺ alınacak , açılış ücreti 10₺ olacak.
        // Minimum ödeme 20₺ olacak , ücret 20₺ den az tutarsa yine 20₺ alınacak
        double Kmbasi = 2.20 , acilisucreti = 10 , Km , tutar;

        System.out.print("Gidilen Km Giriniz : ");
        Km = veri.nextDouble();
        tutar = acilisucreti+Km*2.20;
        tutar = tutar<20 ? 20:tutar;
        System.out.println("Ödemeniz gereken tutar : "+ tutar);






    }
}
