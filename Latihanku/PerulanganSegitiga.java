import java.util.Scanner;

public class PerulanganSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bintang;
        System.out.print("Masukkan Jumlah bintang : ");
        bintang = input.nextInt();

        for (int i = 0; i < bintang; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 0; i < bintang; i++) {
            for (int j = i; j < bintang; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 0; i < bintang; i++) {
            for (int j = 1; j <= bintang-i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 1; i <= bintang ; i++) {
            for (int j = 1 ; j <= bintang-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
            
            
        }
    }
}
