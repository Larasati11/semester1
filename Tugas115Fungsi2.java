import java.util.Scanner;
public class Tugas115Fungsi2 {
    static void DeretDescendingRekursif(int n){
        if ((n==0)) {
            System.out.print(0);
        } else {
            System.out.print(n);
            DeretDescendingRekursif(n-1);
        }
    }
    static void DeretDescendingIteratif(int n){
            for (int i = n; i >= 0; i--) {
                System.out.print(i);
             }
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Masukkan angka: ");
        N = sc.nextInt();
        System.out.println("------Rekursif------");
        DeretDescendingRekursif(N);
        System.out.println();
        System.out.println("------Iteratif------");
        DeretDescendingIteratif(N);
    }
}
