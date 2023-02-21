import java.util.Scanner;
public class LatihanArray2 {
    public static void main (String [] args) {
        String hari [] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka 1-7 : " );
        int angka = input.nextInt();

        if (angka<=7) {
            System.out.println("Hari = " + hari[angka-1]);
        } else {
            System.out.print("Semoga harimu selalu senin!");
        }

        
    }
}
