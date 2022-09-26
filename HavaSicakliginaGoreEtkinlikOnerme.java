import java.util.Scanner;
public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int x;

        //Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        //Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        //Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
        //Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

        System.out.print("Sıcaklık değerini giriniz : ");
        x = inp.nextInt();

        if(x<=5){
            System.out.print("Kayak yapabilirsiniz.");
        }
        if(5<x && x<15){
            System.out.println("Sinemaya gidebilirsiniz");
        }
        if(10<x && x<25){
            System.out.print("Pikniğe gidebilirsiniz");
        }
        if(25<=x){
            System.out.println("Yüzmeye gidebilirsiniz");
        }

    }
}
