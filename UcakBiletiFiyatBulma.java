import java.util.Scanner;
public class UcakBiletiFiyatBulma {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double km , biletfiyati = 1 ;
        int ucustipi,yas;
        boolean isError = false;

        System.out.print("Uçuş mesafesi giriniz : ");
        km = inp.nextDouble();
        System.out.print("Uçuş tipi seçiniz:\n1-Tek Yön / 2-Gidiş Dönüş\nSeçiminiz :");
        ucustipi = inp.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas = inp.nextInt();

        if(km>=0 && yas>=0 && (ucustipi==1 || ucustipi==2)){
            if(yas<12){
                if(ucustipi==1){
                    biletfiyati=km*0.5;
                }else{
                    biletfiyati=km*0.3;
                }
            }


            if(12<=yas && yas<=24){
                if(ucustipi==1){
                    biletfiyati=km*0.9;
                }else{
                    biletfiyati=km*0.7;
                }
            }


            if(24<yas && yas<65){
                if(ucustipi==1){
                    biletfiyati=km*1;
                }else{
                    biletfiyati=km*0.8;
                }
            }


            if(yas>=65){
                if(ucustipi==1){
                    biletfiyati=km*0.7;
                }else{
                    biletfiyati=km*0.5;
                }
            }


        }else{
            isError=true;
        }



        if(isError){
            System.out.println("Hatalı veri girişi!");
        }else{
            System.out.println("Bilet fiyatınız : "+ biletfiyati );
        }



    }
}
