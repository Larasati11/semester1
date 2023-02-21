import java.util.Scanner;
public class Tugas415Fungsi2 {
    static int Fibonnaci(int n){
        if ((n==0)) {
            return(0);
        } else if(n==1) {
            return(1);
        }else{
            return(Fibonnaci(n-1)+Fibonnaci(n-2));
        }
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bulan: ");
        int bulan = sc.nextInt();
        for (int i = 0; i <= bulan; i++) {
            System.out.print(" " + Fibonnaci(i));
        }
        System.out.println();
        System.out.println("Jumlah pasangan marmut pada bulan ke- " + bulan + " :" + Fibonnaci(bulan));
    }
}
