import java.util.Scanner;
public class LatihanPemilihan2 {
  public static void main (String [] args){
    Scanner scan =  new Scanner(System.in);
    int menu, jmlPesanan ,i = 0;
    double harga, pajak, total;

    System.out.println("Masukkan jumlah pesanan :");
    jmlPesanan = scan.nextInt();

    while ( i<jmlPesanan){
        System.out.println("Masukkan pilihan ke " + (i+1) + "anda (1-3) ");
        menu = scan.nextInt();
        if (menu==1){
            System.out.println();
        }

    }
    
  } 
}
