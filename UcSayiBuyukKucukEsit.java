import java.util.Scanner;
public class UcSayiBuyukKucukEsit {
    public static void main(String[] args) {

      Scanner inp = new Scanner(System.in);
      double a,b,c;

        System.out.println("Bu program girilen 3 sayıyı küçükten büyüğe sıralar");
        
        System.out.print("a sayısı = ");
        a = inp.nextDouble();
        System.out.print("b sayısı = ");
        b = inp.nextDouble();
        System.out.print("c sayısı = ");
        c = inp.nextDouble();

        if(a<b && a<c){
            if(b<c){
                System.out.print("a<b<c");
            }if(c<b){
                System.out.print("a<c<b");
            }

        }if(b<a && b<c){
            if(a<c){
                System.out.print("b<a<c");
            }if(c<a){
                System.out.print("b<c<a");
            }

        }if(c<a && c<b){
            if(a<b){
                System.out.print("c<a<b");
            }if(b<a){
                System.out.print("c<b<a");
            }

        }if(a==b && a==c){
            System.out.println("a=b=c");

        }if(a==b && a<c){
            System.out.println("a=b<c");

        }if(a==b && c<a){
            System.out.println("c<a=b");

        }if(a==c && a<b){
            System.out.println("a=c<b");

        }if(a==c && b<a){
            System.out.println("b<a=c");

        }if(b==c && b<a){
            System.out.println("b=c<a");
            
        }if(b==c && a<b){
            System.out.println("a<b=c");
        }
        
        System.out.println("\nTeşekkürler !");
        
    }
}
