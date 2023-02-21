import java.util.Scanner;
public class TugasPemilihan116 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int bil1,bil2;

        System.out.println("Masukkan Bilangan 1: ");
        bil1=input.nextInt();
        System.out.println("Masukkan Bilangan 2: ");
        bil2=input.nextInt();

        if(bil1>bil2){
           System.out.println("Bilangan terbesar: " + bil1);
        }
        else{
           System.out.println("Bilangan terbesar: " + bil2);
        }
       
    
    }

}