import java.util.Scanner;
public class ArrayTugas116 {
    public static void main(String [] args) {
        String bulan [] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "Sepetember", 
        "Oktober", "November", "Desember"};
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka 1-12 : " );
        int angka = input.nextInt();

        if (angka<=12) {
            System.out.println("Bulan = " + bulan[angka-1]);
        } else {
            System.out.print("Jumlah Bulan Hanya 12 Brodi!");
        }
        
    }
}
