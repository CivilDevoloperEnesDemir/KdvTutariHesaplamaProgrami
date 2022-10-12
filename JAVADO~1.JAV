import java.util.Scanner;
public class JavaDongulerleTekBirSayiGirileneKadarKullanicidanGirisleriKabulEdenVeGirilenDegerlerdenCiftVe4UnKatlariOlanSayilariToplayipEkranaBasanProgram {
public static void main(String[] Args) {
    //Java döngüler ile tek bir sayı girilene
    //kadar kullanıcıdan girişleri kabul eden ve girilen
    //değerlerden çift ve 4'ün katları olan sayıları toplayıp
    //ekrana basan programı yazıyoruz.

    Scanner inp = new Scanner(System.in);
    int i,toplam=0;
    
    do{
        System.out.println("Bir sayı giriniz : ");
        i=inp.nextInt();
        if(i %2==0 && i %4 ==0){
            toplam=toplam+i;
        }
    }while(i %2==0);
    System.out.println("Sayıların toplamı : "+toplam);


    }
}
