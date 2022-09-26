import java.util.Scanner;
public class SinifGecmeKalmav2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int mat,fiz, kim, tar, biyo , TopDersSayisi=0 , NotlarToplami=0 ;

        // 1-)Kullanıcıdan verileri al
        // 2-)Ortalama 55 ye eşit ve küçükse kaldınız
        // 3-)Ortalama 55 den büyük 100 den küçükse geçtiniz
        // 4-)Ortalama yazdır
        // 5-)Girilen veri 0-100 aralığında değilse ortalamaya dahil etme


        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();
        if(0<=mat && mat<=100){
            TopDersSayisi++;
            NotlarToplami = NotlarToplami+mat;
        }else{
            System.out.println("Matematik notunuz aralık dışında olduğu için ortalamanıza dahil edilmeyecektir.");
        }

        System.out.print("Fizik Notunuz : ");
        fiz = inp.nextInt();
        if(0<=fiz && fiz<=100){
            TopDersSayisi++;
            NotlarToplami=NotlarToplami+fiz;
        }else{
            System.out.println("Fizik notunuz aralık dışında olduğu için ortalamanıza dahil edilmeyecektir.");
        }

        System.out.print("Kimya Notunuz : ");
        kim = inp.nextInt();
        if(0<=kim && kim<=100){
            TopDersSayisi++;
            NotlarToplami=NotlarToplami+kim;
        }else{
            System.out.println("Kimya notunuz aralık dışında olduğu için ortalamanıza dahil edilmeyecektir.");
        }

        System.out.print("Tarih Notunuz : ");
        tar = inp.nextInt();
        if(0<=tar && tar<=100){
            TopDersSayisi++;
            NotlarToplami+=tar;
        }else{
            System.out.println("Tarih notunuz aralık dışında olduğu için ortalamanıza dahil edilmeyecektir.");
        }

        System.out.print("Biyoloji Notunuz : ");
        biyo = inp.nextInt();
        if(0<=biyo && biyo<=100){
            TopDersSayisi++;
            NotlarToplami+=biyo;
        }else{
            System.out.println("Biyoloji notunuz aralık dışında olduğu için ortalamanıza dahil edilmeyecektir.");
        }

        double avarage = NotlarToplami/TopDersSayisi;
        if (avarage <= 55) {
            System.out.println("Maalesef kaldınız seneye görüşmek üzere !");
        } else {
            System.out.println("Geçtiniz tebrikler !");
        }
        System.out.println("Ortalamanız :" + avarage);


    }
}

