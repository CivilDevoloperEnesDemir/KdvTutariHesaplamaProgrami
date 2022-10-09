import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int birthday;
        System.out.print("What is your birthday : ");
        birthday = inp.nextInt();

        if(birthday%12==0){
            System.out.println("Maymun");
        }
        if(birthday%12==1){
            System.out.println("Horoz");
        }
        if(birthday%12==2){
            System.out.println("Köpek");
        }
        if(birthday%12==3){
            System.out.println("Domuz");
        }
        if(birthday%12==4){
            System.out.println("Fare");
        }
        if(birthday%12==5){
            System.out.println("Öküz");
        }
        if(birthday%12==6){
            System.out.println("Kaplan");
        }
        if(birthday%12==7){
            System.out.println("Tavşan");
        }
        if(birthday%12==8){
            System.out.println("Ejderha");
        }
        if(birthday%12==9){
            System.out.println("Yılan");
        }
        if(birthday%12==10){
            System.out.println("At");
        }
        if(birthday%12==11){
            System.out.println("Koyun");
        }


    }
}

