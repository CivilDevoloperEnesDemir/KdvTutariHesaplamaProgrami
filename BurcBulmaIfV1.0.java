import java.util.Scanner;
public class BurcBulmaIf {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        String month;
        int day;

        System.out.println("Bu program girdiğiniz ay ve güne göre burcunuzu bulur");

        System.out.print("Hangi ayda doğdunuz : ");
        month = inp.nextLine();
        System.out.print("Hangi günde doğdunuz : ");
        day = inp.nextInt();


        if(((month.equals("Ocak")||(month.equals("ocak")))&&(1<=day && day<22))){
                System.out.println("Oğlak burcusunuz");
        }

        if(((month.equals("Ocak")||(month.equals("ocak")))&&(22<=day && day<=31))){
            System.out.println("Kova burcusunuz");
        }



        if(((month.equals("Şubat")||(month.equals("şubat")))&&(1<=day && day<=19))){
            System.out.println("Kova burcusunuz");
        }
        if(((month.equals("Şubat")||(month.equals("şubat")))&&(20<=day && day<=29))){
            System.out.println("Balık burcusunuz");
        }


        if(((month.equals("Mart")||(month.equals("mart")))&&(1<=day && day<=20))){
            System.out.println("Balık burcusunuz");
        }
        if(((month.equals("Mart")||(month.equals("mart")))&&(21<=day && day<=31))){
            System.out.println("Koç burcusunuz");
        }


        if(((month.equals("Nisan")||(month.equals("nisan")))&&(1<=day && day<=20))){
            System.out.println("Koç burcusunuz");
        }
        if(((month.equals("Nisan")||(month.equals("nisan")))&&(21<=day && day<=30))){
            System.out.println("Boğa burcusunuz");
        }


        if(((month.equals("Mayıs")||(month.equals("mayıs")))&&(1<=day && day<=21))){
            System.out.println("Boğa burcusunuz");
        }
        if(((month.equals("Mayıs")||(month.equals("mayıs")))&&(22<=day && day<=31))){
            System.out.println("İkizler burcusunuz");
        }


        if(((month.equals("Haziran")||(month.equals("haziran")))&&(1<=day && day<=22))){
            System.out.println("İkizler burcusunuz");
        }
        if(((month.equals("Haziran")||(month.equals("haziran")))&&(23<=day && day<=30))){
            System.out.println("Yengeç burcusunuz");
        }


        if(((month.equals("Temmuz")||(month.equals("temmuz")))&&(1<=day && day<=22))){
            System.out.println("Yengeç burcusunuz");
        }
        if(((month.equals("Temmuz")||(month.equals("temmuz")))&&(23<=day && day<=31))){
            System.out.println("Aslan burcusunuz");
        }


        if(((month.equals("Ağustos")||(month.equals("ağustos")))&&(1<=day && day<=22))){
            System.out.println("Aslan burcusunuz");
        }
        if(((month.equals("Ağustos")||(month.equals("ağustos")))&&(23<=day && day<=31))){
            System.out.println("Başak burcusunuz");
        }


        if(((month.equals("Eylül")||(month.equals("eylül")))&&(1<=day && day<=22))){
            System.out.println("Başak burcusunuz");
        }
        if(((month.equals("Eylül")||(month.equals("eylül")))&&(23<=day && day<=30))){
            System.out.println("Terazi burcusunuz");
        }


        if(((month.equals("Ekim")||(month.equals("ekim")))&&(1<=day && day<=22))){
            System.out.println("Terazi burcusunuz");
        }
        if(((month.equals("Ekim")||(month.equals("ekim")))&&(23<=day && day<=31))){
            System.out.println("Akrep burcusunuz");
        }


        if(((month.equals("Kasım")||(month.equals("kasım")))&&(1<=day && day<=21))){
            System.out.println("Akrep burcusunuz");
        }
        if(((month.equals("Kasım")||(month.equals("kasım")))&&(22<=day && day<=30))){
            System.out.println("Yay burcusunuz");


        }
        if(((month.equals("Aralık")||(month.equals("aralık")))&&(1<=day && day<=21))){
            System.out.println("Yay burcusunuz");
        }
        if(((month.equals("Aralık")||(month.equals("aralık")))&&(22<=day && day<=31))){
            System.out.println("Oğlak burcusunuz");
        }





    }

}
