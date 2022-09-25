import java.util.Scanner;
public class SwitchHesapMakinesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double n1,n2;
        int select;
        System.out.println("Bu program sırasıyla gireceğiniz iki sayı " +
                "arasında temel dört işlem yapar");
        System.out.print("Birinci sayıyı giriniz : ");
        n1 = inp.nextDouble();
        System.out.print("İkinci sayıyı giriniz : ");
        n2= inp.nextDouble();
        System.out.println("Yapmak istediğiniz işlemi seçiniz : ");
        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nSeçiminiz : ");
        select = inp.nextInt();
        switch (select){
            case 1 :
                System.out.println("Toplama işlemi sonucu (n1+n2) : "+ (n1+n2));
                break;
            case 2 :
                System.out.println("Çıkarma işlemi sonucu (n1-n2) : "+ (n1-n2));
                break;
            case 3 :
                System.out.println("Çarpma işlemi sonucu (n1*n2) : " + (n1*n2));
                break;
            case 4 :
                if (n2 == 0){
                    System.out.println("Bu bölme işlemi yapılamaz");
                }else if (n1 == 0 && n2 == 0){
                    System.out.println("Bu bölme işlemi yapılamaz");
                }else{
                    System.out.println("Bölme işlemi sonucu (n1/n2) : " + (n1/n2));
                }
                break;


        }
    }
}
