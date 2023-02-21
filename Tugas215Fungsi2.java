import java.util.Scanner;
public class Tugas215Fungsi2 {
    static int penjumlahanRekursif(int n){
        if ((n==0)) {
            return(0);
        } else {
            return (n + penjumlahanRekursif(n-1));
            
        }
    }
    static int penjumlahanIteratif(int n){
        int faktor = 1;
        for (int i = n; i > 1; i--) {
            faktor = faktor + i;
        }
        return faktor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f;
        System.out.print("Masukkan angka: ");
        f = sc.nextInt();
        System.out.println("------Rekursif------");
        System.out.println(penjumlahanRekursif(f));
        System.out.println("------Iteratif------");
        System.out.println(penjumlahanIteratif(f));
    }
}
