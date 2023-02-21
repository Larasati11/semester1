import java.util.Scanner;
public class Riview1 {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        double harga, diskon;

        System.out.println("Masukkan harga barang");
        harga = sc.nextDouble();
        System.out.println("Masukkan diskon barang");
        diskon = sc.nextDouble();
        double T = total(harga,diskon);
        System.out.println("Total = " + T);
    }

    static double total (double hrg, double dsk){
        double hasil = hrg-(hrg * dsk);
        return hasil;
    }
    
}