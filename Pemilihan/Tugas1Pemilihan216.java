import java.util.Scanner;

public class Tugas1Pemilihan216{
    public static void main (String[]args) {
        Scanner scan = new Scanner (System.in);
        String kodeBerangkat;
        double  tiketPG = 1250000, tiketSG = 1375000, tiketMG = 2500000,tiketREG = 50000, admin = 50000 ;
        

        
        System.out.print("Masukkan kode keberangkatan [pg/sg/mg/reg]: " );
        kodeBerangkat = scan.nextLine();
        if (kodeBerangkat.equalsIgnoreCase("mg")){
            System.out.println("Kode Berangkat: "+kodeBerangkat);
            System.out.println("Kelas Kereta : Luxury");
            System.out.println("Biaya Tiket: " + tiketMG);
            System.out.println("Total Bayar: " + (tiketMG + admin));

        }else if (kodeBerangkat.equalsIgnoreCase("sg")){
            System.out.println("Kelas Kereta : Bisnis");
            System.out.println("Biaya Tiket: " + tiketSG);
            System.out.print("Total Bayar: " + (tiketSG + admin));

        }else if (kodeBerangkat.equalsIgnoreCase("pg")){
            System.out.println("Kelas Kereta : Eksekutif");
            System.out.println("Biaya Tiket: " + tiketPG);
            System.out.println("Total Bayar: " + (tiketPG + admin));

        }else{
            System.out.println("Kelas Kereta : Regular");
            System.out.println("Biaya Tiket: " + tiketREG);
            System.out.println("Total Bayar: " + tiketREG);
        }
    }       

 }
