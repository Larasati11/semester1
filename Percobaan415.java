import java.util.Scanner;
public class Percobaan415 {
    static int Kali(int C, int D){
        int H;
        H = (C + 10) % (D + 19);
        H = Tambah(C,D);
        return H;
    }

    static int Kurang(int A, int B){
        int X;
        A = A + 7;
        B = B + 4;
        X = Kali(A, B);
        return X;
    }
    static int Tambah(int X, int Y){
        int A,B,Z;
        A = X * Y;
        B = X - Y;
        Z = A + B;
        return Z;
    }
    
    public static void main(String[] args) {
        int nilai1, nilai2;
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Nilai 1:");
        nilai1=input.nextInt();
        System.out.println("Masukkan Nilai 2:");
        nilai2=input.nextInt();
        int hasil = Kurang(nilai1, nilai2);
        System.out.println("Hasil akhir anda adalah " + hasil);
    }
}
