import java.util.Scanner;
public class ArrayDua2C16 {
    public static void main(String [] args) {
        String [][] pengunjung = new String [4][2];
        Scanner scan = new Scanner(System.in);
        for (int baris = 0; baris < pengunjung.length; baris++) {
            for (int kolom = 0; kolom < pengunjung[0].length; kolom++) {
                System.out.printf("Masukkan pengunjung ke [%s] [%s]: ", baris, kolom);
                pengunjung[baris][kolom] = scan.nextLine();
            }
            System.out.println("-------------");
        }
        for (String array[] : pengunjung) {
            for (String ar : array) {
                System.out.printf("%s ", ar);
            }
            System.out.println("");
        }
    }
}
