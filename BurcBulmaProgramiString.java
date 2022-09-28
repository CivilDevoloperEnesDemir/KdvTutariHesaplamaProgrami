import java.util.Scanner;

public class BurcBulmaProgrami {

        public static void main(String[] args){

            Scanner inp = new Scanner(System.in);

            String month;
            int day;

            System.out.print("Doğduğunuz ayı giriniz : ");
            month = inp.nextLine();

            System.out.print("Doğduğunuz günü giriniz : ");
            day = inp.nextInt();

            switch (month){

                case "Ocak":

                    if(1<=day && day<=22){
                        System.out.print("Oğlak burcusunuz");
                    }

                    else if(22<day && day<31){
                        System.out.print("Kova burcusunuz");
                    }

                    else
                        System.out.println("Lütfen doğduğunuz ayı ve günü doğru yazınız !");


                    break;



                case "Şubat":

                    if(1<=day && day<=19){
                        System.out.print("Kova burcusunuz");
                    }

                    else if(19<day && day<=29){
                        System.out.print("Balık burcusunuz");
                    }

                    else
                        System.out.println("Lütfen doğduğunuz ayı ve günü doğru yazınız !");


                    break;



                case "Mart" :

                    if(1<=day && day<=20){
                        System.out.println("Balık burcusunuz");
                    }

                    else if(21<=day && day<=31){
                        System.out.println("Koç Burcu");
                    }

                    else{
                        System.out.println("Lütfen doğduğunuz ayı ve günü doğru yazınız !");
                    }

                    break;



                case "Nisan" :

                    if(1<=day && day<=20){
                        System.out.println("Koç burcusunuz");
                    }

                    else if(20<day && day<=30){
                        System.out.println("Boğa burcusunuz");
                    }

                    else{
                        System.out.println("Lütfen doğduğunuz ayı ve günü doğru yazınız !");
                    }

                    break;



                case "Mayıs" :

                    if(1<=day && day<=21){
                        System.out.println("Boğa burcusunuz");
                    }

                    else if(21<day && day<=31){
                        System.out.println("İkizler burcusunuz");
                    }

                    else{
                        System.out.println("Lütfen doğduğunuz ayı ve günü doğru yazınız !");
                    }

                    break;



                case "Haziran" :

                    if(1<=day && day<=22){
                        System.out.println("İkizler burcusunuz");
                    }

                    else if(22<day && day<=30){
                        System.out.println("Yengeç burcusunuz");
                    }

                    else{
                        System.out.println("Lütfen doğduğunuz ayı ve günü doğru yazınız !");
                    }

                    break;



                case "Temmuz" :

                    if(1<=day && day<=22){
                        System.out.println("Yengeç burcusunuz");
                    }

                    else if(22<day && day<=31){
                        System.out.println("Aslan burcusunuz");
                    }

                    else{
                        System.out.println("Lütfen doğduğunuz ayı ve günü doğru yazınız !");
                    }

                    break;



                case "Ağustos" :

                    if(1<=day && day<=22){
                        System.out.println("Aslan burcusunuz");
                    }

                    else if(23<=day && day<=30){
                        System.out.println("Başak burcusunuz");
                    }

                    else{
                        System.out.println("Lütfen doğduğunuz ayı ve günü doğru yazınız !");
                    }

                    break;



                case "Eylül" :

                    if(1<=day && day<=22){
                        System.out.println("Başak burcusunuz");
                    }

                    else if(23<=day && day<=30){
                        System.out.println("Terazi burcusunuz");
                    }

                    else{
                        System.out.println("Lütfen doğduğunuz ayı ve günü doğru yazınız !");
                    }

                    break;



                case "Ekim" :

                    if(1<=day && day<=22){
                        System.out.println("Terazi burcusunuz");
                    }

                    else if(22<day && day<=31){
                        System.out.println("Akrep burcusunuz");
                    }

                    else{
                        System.out.println("Lütfen doğduğunuz ayı ve günü doğru yazınız !");
                    }

                    break;



                case "Kasım" :

                    if(1<=day && day<=21){
                        System.out.println("Akrep burcusunuz");
                    }

                    else if(22<=day && day<=30){
                        System.out.println("Yay burcusunuz");
                    }

                    else{
                        System.out.println("Lütfen doğduğunuz ayı ve günü doğru yazınız !");
                    }

                    break;



                case "Aralık" :

                    if(1<=day && day<=21){
                        System.out.println("Yay burcusunuz");
                    }

                    else if(21<day && day<=31){
                        System.out.println("Oğlak burcusunuz");
                    }

                    else{
                        System.out.println("Lütfen doğduğunuz ayı ve günü doğru yazınız !");
                    }

                    break;



            }




    }
}
