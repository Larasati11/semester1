import java.util.Scanner;
public class TugasPemilihan416 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int hargaBarangA, hargaBarangB, hargaBarangC, jmlA, jmlB, jmlC, totalA, totalB, totalC;
        double diskon, totalAwal, totalBayar;

        System.out.println("Masukkan Harga Barang A: ");
        hargaBarangA=sc.nextInt();
        System.out.println("Masukkan Jumlah Barang A: ");
        jmlA=sc.nextInt();
        System.out.println("Masukkan Harga Barang B: ");
        hargaBarangB=sc.nextInt();
        System.out.println("Masukkan Jumlah Barang B: ");
        jmlB=sc.nextInt();
        System.out.println("Masukkan Harga Barang C: ");
        hargaBarangC=sc.nextInt();
        System.out.println("Masukkan Jumlah Barang C: ");
        jmlC=sc.nextInt();

        totalA = hargaBarangA * jmlA;
        totalB = hargaBarangB * jmlB;
        totalC = hargaBarangC * jmlC;
        totalAwal = totalA + totalB + totalC; 
        
        if(totalAwal>1000000){
           diskon = totalAwal * 0.1;
        }
        else if(totalAwal>500000){
           diskon = totalAwal * 0.05;
        }
        else if(totalAwal>200000){
           diskon = totalAwal * 0.2;
        }
        else {
           diskon = totalAwal;
        }
        
        totalBayar = totalAwal - diskon;
        
       
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("\t\t\t\tStruk Nota Laras");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Nama Barang \t|\t Harga \t|\t Jumlah \t|\t Total");
        System.out.println("Barang A \t|\t " + hargaBarangA + "\t|\t" + jmlA + "\t\t|\t" + totalA);
        System.out.println("Barang B \t|\t " + hargaBarangB + "\t|\t" + jmlB + "\t\t|\t" + totalB);
        System.out.println("Barang A \t|\t " + hargaBarangC + "\t|\t" + jmlC + "\t\t|\t" + totalC);
        System.out.println("\t\t\t\t\tTotal\t\t\t =" + totalAwal);
        System.out.println("\t\t\t\t\tDiskon\t\t\t =" + diskon);
        System.out.println("\t\t\t\t\tTotal\t\t\t =" + totalBayar);


      
        
    }

}