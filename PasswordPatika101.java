import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String kullaniciadi,sifre;
        int value;

        System.out.print("Kullanıcı Adınız : ");
        kullaniciadi = inp.nextLine();
        System.out.print("Şifreniz : ");
        sifre = inp.nextLine();
        // Kullanıcı adı=java , şifre=patika


        if(kullaniciadi.equals("java") && sifre.equals("patika")){
            System.out.println("Bilgileriniz doğru giriş başarılı !");
        }else if(!kullaniciadi.equals("java") && !sifre.equals("patika")){
            System.out.println("Bilgileriniz yanlış.");
            System.out.println("Yeni kullanıcı adı ve şifre oluşturmak ister misiniz?\n1-Evet\n2-Hayır");
            value = inp.nextInt();
            if(value==1){
                Scanner input = new Scanner(System.in);
                System.out.print("Yeni Kullanıcı Adı : ");
                String cvpb = input.nextLine();
                System.out.print("Yeni Şifre : ");
                String cvpc = input.nextLine();

                if(!cvpb.equals("java") && !cvpc.equals("patika")) {
                    System.out.println("İşlem başarılı");
                }

                if(cvpb.equals("java") && cvpc.equals("patika")){
                    System.out.println("Girilen bilgiler eski bilgilerle aynı olamaz !");
                    System.out.println("Lütfen farklı bir kullanıcı adı ve şifre seçin.\nDevam etmek için 1 numaralı İşlemi\nSonlandırmak için 2 numaralı işlemi seçin\n1-Devam et\n2-Sonlandır");
                    value = inp.nextInt();
                    if(value==1) {
                        Scanner as = new Scanner(System.in);
                        System.out.print("Yeni Kullanıcı Adı : ");
                        cvpb = as.nextLine();

                        System.out.print("Yeni Şifre : ");
                        cvpc = as.nextLine();
                        System.out.println("İşlem Başarılı !");

                    }if(value==2){
                        System.out.println("İşleminiz sonlandı");

                    }

                }

            }if(value==2){
                System.out.println("İşleminiz sonlandı");

            }
        }

    }
}