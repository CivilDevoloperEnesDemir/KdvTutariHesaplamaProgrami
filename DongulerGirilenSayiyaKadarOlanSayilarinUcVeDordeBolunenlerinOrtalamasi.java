import java.util.Scanner;
public class DongulerGirilenSayiyaKadarOlanSayilarinUcVeDordeBolunenlerinOrtalamasi {
    public static void main(String[] args){

        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
        // 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

        Scanner inp = new Scanner(System.in);

        int k;
        int toplam=0;
        int sayiadedi=0;
        double ortalama;
        System.out.print("Bir sayı giriniz : ");
        k = inp.nextInt();
        for(int i=0;i<k;i++){
            if(i %3 ==0 & i %4 ==0){
                System.out.println(i);
                toplam=toplam+i;
                sayiadedi++;
            }
        }
        ortalama=toplam/sayiadedi;
        System.out.println("Ortalama : "+ortalama);



    }
}
