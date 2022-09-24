import java.util.Scanner;
public class Project2 {
    public static void main(String[] args) {
    /*
       1-)Müşteri fiyatı girecek
       2-)KDV'li fiyat müşteriye gösterilecek
       3-)KDV tutarı müşteriye gösterilecek
       4-)Eğer girilen tutar 0-1000 arasındaysa KDV %18 ,
       tutar 1000 tl den büyükse Kdv %8 al
       Not:Kdv %18 al
        */

        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen Tutarı Giriniz: ");
        double tutar = inp.nextDouble();
        double kdv;
        kdv = (tutar>=1000) ? (tutar*8/100) : (tutar*18/100);
        double toplam = tutar+kdv;
        System.out.println("KDV Tutarınız: "+kdv);
        System.out.println("Kdv'li Tutarınız: "+toplam);

    }
}