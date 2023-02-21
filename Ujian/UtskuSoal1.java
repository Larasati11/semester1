import java.util.Scanner;

public class UtskuSoal1 {

public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
     int menu, hargaApel = 20000, hargaMangga = 15000, hargaJeruk =10000, stockApel= 10, stockMangga = 5, stockJeruk = 15, 
     jmlApel, jmlMangga, jmlJeruk, totalBayar;
     boolean ulangi = true;

     
     while(ulangi==true){
        System.out.println("Pilih menu yang anda inginkan (1) barang (2)total pembayaran (3) cetak nota");
        menu = scan.nextInt();
     if (menu == 1){
        System.out.println("Toko Pak Roni");
        System.out.println("Apel = 20000 dengan stock = 10");
        System.out.println("Mangga = 15000 dengan stock = 5");
        System.out.println("Jeruk = 10000 dengan stock = 15");
     }else if(menu == 2){
       System.out.println("Masukkan jumlah Apel yang ingin anda beli = ");
       jmlApel = scan.nextInt();
       System.out.println("Masukkan jumlah Mangga yang ingin anda beli = ");
       jmlMangga = scan.nextInt();
       System.out.println("Masukkan jumlah Jeruk yang ingin anda beli = ");
       jmlJeruk = scan.nextInt();
       totalBayar = ((jmlApel*hargaApel) + (jmlMangga*hargaMangga) + (jmlJeruk*hargaJeruk));
       System.out.println("Total pembayaran = " + totalBayar);
     }else if(menu == 3){
        System.out.println("Masukkan jumlah Apel yang ingin anda beli = ");
       jmlApel = scan.nextInt();
       System.out.println("Masukkan jumlah Mangga yang ingin anda beli = ");
       jmlMangga = scan.nextInt();
       System.out.println("Masukkan jumlah Jeruk yang ingin anda beli = ");
       jmlJeruk = scan.nextInt();
       totalBayar = ((jmlApel*hargaApel) + (jmlMangga*hargaMangga) + (jmlJeruk*hargaJeruk));
        System.out.println("===========STRUK TOKO BUAH PAK RONI============");
        System.out.println(jmlApel + " Apel = " + (jmlApel *hargaApel));
        System.out.println(jmlMangga + " Mangga = " + (jmlMangga *hargaMangga));
        System.out.println(jmlJeruk + " Jeruk = " + (jmlJeruk *hargaJeruk));
        System.out.println("Total pembayaran = " + totalBayar);
     }else{

     }
     System.out.println("Apa anda ingin memilih menu lain ?   [true/false]?" );
     ulangi = scan.nextBoolean();
    }
     
    
   }
}
