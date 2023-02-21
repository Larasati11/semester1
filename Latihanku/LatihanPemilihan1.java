import java.util.Scanner;
public class LatihanPemilihan1 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int totalAwal, totalBayar;
        double diskon = 0;

        System.out.println("Masukkan total belanja anda : ");
        totalAwal = scan.nextInt();

        if (totalAwal > 1000000){
            System.out.println("anda mendapat potongan 10 %");
            diskon = 0.1 * totalAwal;
        }else if (totalAwal > 500000){
            System.out.println("anda mendapat potongan 5 %");
            diskon = 0.05 * totalAwal;
        }else if (totalAwal > 200000){
            System.out.println("anda mendapat potongan 2 %");
            diskon = 0.02 * totalAwal;
        }else {
            System.out.println("anda tidak mendapat potongan");
        }
        totalBayar = (int) (totalAwal - diskon);
        System.out.println("Total belanja andda : " + totalAwal);
        System.out.println("Potongan diskon : " + diskon);
        System.out.println("Total bayar anda : " + totalBayar);
        
        
    }
}
