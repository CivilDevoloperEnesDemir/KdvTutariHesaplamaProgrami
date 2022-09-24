import java.util.Scanner;
public class NotOrtalamasiHesaplamaGectiKaldi {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

             double matematik,fizik,kimya,tarih,muzik,toplam,ortalama;
             String sonuc;

                System.out.print("Matematik Notunuz: ");
                matematik = inp.nextDouble();
                System.out.print("Fizik Notunuz :");
                fizik = inp.nextDouble();
                System.out.print("Kimya Notunuz :");
                kimya = inp.nextDouble();
                System.out.print("Tarih Notunuz :");
                tarih = inp.nextDouble();
                System.out.print("Müzik Notunuz :");
                muzik =  inp.nextDouble();

                toplam = matematik+fizik+kimya+tarih+muzik;
                ortalama = toplam/5;

                System.out.print("Ortalamanız :"+ortalama);

                sonuc = (ortalama>=60) ? "Geçtiniz" : "Kaldınız";

                System.out.println("\n"+sonuc);








    }
}
