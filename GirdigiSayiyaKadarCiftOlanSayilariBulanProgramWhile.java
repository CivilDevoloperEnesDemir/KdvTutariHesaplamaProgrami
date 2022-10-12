import java.util.Scanner;
public class GirdigiSayiyaKadarCiftOlanSayilariBulanProgramWhile {
    public static void main(String[] args) {
        int k,i=1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        k = inp.nextInt();
        while(i<k){
            i++;
            if(i %2 ==0){
                System.out.println(i);
            }
        }
    }
}