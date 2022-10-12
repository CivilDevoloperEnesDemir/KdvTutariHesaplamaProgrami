import java.util.Scanner;
public class DortVeBesinKuvvetleriGirilenSayiyaKadar {
    public static void main(String[] Args){

        //Java döngüler ile girilen sayıya kadar olan
        //4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

        Scanner inp = new Scanner(System.in);
        int girilensayi;

        System.out.println("Bir sayı giriniz : ");
        girilensayi=inp.nextInt();
        for(int i=1;i<=girilensayi;i=i*20){
            System.out.println(i);
        }

    }
}
